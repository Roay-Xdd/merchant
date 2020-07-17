package com.qtummatrix.server.impl;

import com.qtummatrix.bean.WSY_CartBean;
import com.qtummatrix.bean.WSY_CartItemBean;
import com.qtummatrix.bean.WSY_CheckOutBean;
import com.qtummatrix.entity.BmInordergoodslist;
import com.qtummatrix.entity.BmInorderlist;
import com.qtummatrix.entity.BmMember;
import com.qtummatrix.entity.BmSpecification;
import com.qtummatrix.feign.WSY_RedisFeignService;
import com.qtummatrix.mapper.WSY_CartBeanMapper;
import com.qtummatrix.server.WSY_CartService;
import com.qtummatrix.util.CacheResult;
import com.qtummatrix.util.JsonUtils;
import com.qtummatrix.util.SnowflakeIdWorker;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class WSY_CartServiceImpl implements WSY_CartService {

    @Autowired(required = false)
    private WSY_CartBeanMapper cartBeanMapper;

    @Resource
    private WSY_RedisFeignService redisFeignService;

    @Autowired(required = false)
    private SnowflakeIdWorker snowflakeIdWorker ;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private WSY_CartService cartService;

    //redis中购物车对应的key的前缀
    private String REDIS_CART_KEY = "CART_KEY";

    //redis中购物车中的商品对应的key的前缀
    private String REDIS_CARTITEM_KEY = "CARTITEM_KEY";

    @Override
    public CacheResult aadToCart(String token, Integer goodsId, Integer num) {

        WSY_CartItemBean cartItem = getCartItemById(goodsId);

        BmMember bmMember = (BmMember) CacheResult
                .linkedHashMapToObject(redisFeignService.getFromRedis(token).getData(), BmMember.class);

        if (bmMember == null){
            bmMember = new BmMember();
            bmMember.setId(111);
        }

        String cartkey = REDIS_CART_KEY +":"+bmMember.getId();

        WSY_CartBean cart = (WSY_CartBean) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(cartkey).getData(), WSY_CartBean.class);
        if (cart==null){
            cart = new WSY_CartBean();
        }

        cart.addToCart(cartItem,num);
        redisFeignService.setToRedis(cartkey,cart,new Long(365*60*60*24));//购物车缓存时间为1年

        return CacheResult.ok("添加购物车成功");
    }

    @Override
    public WSY_CartItemBean getCartItemById(Integer goodsId) {

        String key = REDIS_CARTITEM_KEY +":"+goodsId;

        WSY_CartItemBean cartItem = (WSY_CartItemBean) CacheResult.linkedHashMapToObject(redisFeignService.getFromRedis(key).getData(), WSY_CartItemBean.class);

        if (cartItem == null){
            cartItem = cartBeanMapper.selectCartItemBySpecificationId(goodsId);
            redisFeignService.setToRedis(key,cartItem,24*60*60l);
        }
        return cartItem;
    }

    @Override
    public CacheResult deleteFromCart(String token, Integer goodsId) {

        BmMember member = (BmMember) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(token).getData(), BmMember.class);

        if (member == null){
            member = new BmMember();
            member.setId(111);
        }

        String cartkey = REDIS_CART_KEY +":"+member.getId();

        WSY_CartBean cartBean = (WSY_CartBean) CacheResult.linkedHashMapToObject(redisFeignService.getFromRedis(cartkey).getData(), WSY_CartBean.class);

        if (cartBean != null){
            cartBean.deleteFromCart(goodsId);
            redisFeignService.setToRedis(cartkey,cartBean,24*60*60*365l);
        }

        return CacheResult.ok("删除商品成功");
    }

    @Override
    public CacheResult updateCartItemNum(String token, Integer goodsId, Integer num) {

        BmMember member = (BmMember) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(token).getData(),BmMember.class);

        if (member == null ){
            member = new BmMember();
            member.setId(111);
        }

        String cartkey = REDIS_CART_KEY+":"+member.getId();

        WSY_CartBean cartBean = (WSY_CartBean) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(cartkey).getData(),WSY_CartBean.class);

        if (cartBean != null){
            cartBean.updateGoodsNum(goodsId, num);
            redisFeignService.setToRedis(cartkey,cartBean,365*24*60*60l);
        }

        return CacheResult.ok("商品数量修改成功");
    }

    @Override
    public CacheResult getAllCartItem(String token) {

        BmMember member = (BmMember) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(token).getData(),BmMember.class);

        if (member == null ){
            member = new BmMember();
            member.setId(111);
        }

        String cartkey = REDIS_CART_KEY+":"+member.getId();

        WSY_CartBean cartBean = (WSY_CartBean) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(cartkey).getData(),WSY_CartBean.class);

        Map<String, WSY_CartItemBean> cartMap = cartBean.getCartMap();
        for (String s : cartMap.keySet()) {
            System.out.println(cartMap.get(s));
        }

        return CacheResult.ok(cartMap);
    }

    @Override
    public CacheResult checkOut(String token, List<String> cartItemIds) {

        BmMember member = (BmMember) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(token).getData(),BmMember.class);

        WSY_CheckOutBean checkOutBean = new WSY_CheckOutBean();

        if (member == null){
            member = new BmMember();
            member.setId(111);
        }

        String cartkey = REDIS_CART_KEY+":"+member.getId();

        WSY_CartBean cartBean = (WSY_CartBean) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(cartkey).getData(),WSY_CartBean.class);

        if (cartBean != null){
            Map<String,WSY_CartItemBean> cartMap = cartBean.getCartMap();
            BigDecimal totalPrice = new BigDecimal(0);
            BigDecimal totalDeliveryFee = new BigDecimal(0);

            List<WSY_CartItemBean> cartItemBeans = new ArrayList<>();
            for (String cid : cartItemIds) {
                WSY_CartItemBean cartItemBean = cartMap.get(cid.toString());
                if (cartItemBean == null){
                    throw new RuntimeException("购物车中未找到ID为"+cid+"的商品");
                }
                cartItemBeans.add(cartItemBean);
                BigDecimal price = cartItemBean.getPrice();
                price = price.multiply(new BigDecimal(cartItemBean.getGoodsNum()));

                if (member.getDeliveryfee() != null){
                    totalDeliveryFee = totalDeliveryFee.add(member.getDeliveryfee());
                }

                totalPrice = totalPrice.add(totalDeliveryFee);
                totalPrice = totalPrice.add(price);
            }

            checkOutBean.setTotalPrice(totalPrice);
            checkOutBean.setTotalDeliveryFee(totalDeliveryFee);
            checkOutBean.setCartItemList(cartItemBeans);
        }
        return CacheResult.ok(checkOutBean);
    }

    String myOrderId;
     @Override
     public  String getOrderId(){
        return myOrderId;
    }
    @RabbitListener(queuesToDeclare = @Queue("order"))
    @RabbitHandler
    public void useOrder(String message){

        try {
             String[] split = message.split("_");
             System.out.println(split.length+"w为 数组产犊----------");
             String token = split[0];
             String addressId = split[1];
             String mark = split[2];
             String check="";
             if (split.length==4) check = split[3];
             System.out.println("调用creatOrder");
                System.out.println(split[3]);
             createOrder(token, addressId, mark, check);
        } catch (Exception e) {
            System.out.println("调用失败");
        }
    }

    @Transactional
    public String createOrder(String token, String addressId, String mark, String checkOut) {

        Set<WSY_CartItemBean> set = JsonUtils.jsonToSet(checkOut,WSY_CartItemBean.class);

        BmMember member = (BmMember) CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(token).getData(),BmMember.class);

        if (member == null){
            member = new BmMember();
            member.setId(111);
        }

        String key =REDIS_CART_KEY+":"+member.getId();
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        String orderId = df.format(date)+(new Random().nextInt(899999)+100000);
        myOrderId = orderId;
        BmInorderlist bmInorderlist = new BmInorderlist();
        bmInorderlist.setOrderid(orderId);
        bmInorderlist.setOrderstate(1);
        bmInorderlist.setOrderstep(1);
        bmInorderlist.setDeliveryaddid(addressId);
        bmInorderlist.setMark(mark);
        bmInorderlist.setSellerid(member.getId());

        redisFeignService.setToRedis("ORDER:"+orderId,bmInorderlist,24*60*60L);

        WSY_CartBean cart = null;
        for (WSY_CartItemBean cartItem : set) {
            //减少缓存中商品的库存数量
            String ItemKey=REDIS_CARTITEM_KEY+":"+ cartItem.getId();
            WSY_CartItemBean cartItem1 = (WSY_CartItemBean) CacheResult.
                    linkedHashMapToObject(redisFeignService.getFromRedis(ItemKey).getData(), WSY_CartItemBean.class);
            if (cartItem1==null){
                cartItem1= cartBeanMapper.selectCartItemBySpecificationId(cartItem.getId());
                redisFeignService.setToRedis(ItemKey,cartItem1,24*60*60L);
            }
            //解决超卖问题
            if(cartItem1.getStock()<=0){
                return "当前商品已售罄!";
            }
            if (cartItem.getGoodsNum() >= cartItem1.getStock()){
//                throw new RuntimeException("商品："+cartItem.getGoodsName()+"库存不足,订单生成失败");
                return "当前商品已售罄";
            }

            BmSpecification bmSpecification= new BmSpecification();

            Integer newStock= cartItem1.getStock()-cartItem.getGoodsNum();
            cartItem1.setStock(newStock);
            redisFeignService.setToRedis(ItemKey,cartItem1,365*24*60*60L);
            bmSpecification.setId(cartItem1.getId());
            bmSpecification.setStock(newStock);

//            rabbitTemplate.convertAndSend("order.direct","order.commit",bmSpecification);


            //生成订单商品
            BmInordergoodslist orderGoods = new BmInordergoodslist();
            //规格id
            orderGoods.setSpid(cartItem.getId());
            //商品id
            orderGoods.setGoodsid(cartItem.getGoodsId());
            //订单id
            orderGoods.setOrderid(orderId);
            //规格名称
            orderGoods.setSname(cartItem.getGoodsName());
            //商品名称
            orderGoods.setGoodsname(cartItem.getGoodsName());
            //商品图片
            orderGoods.setGoodsimg(cartItem.getGoodsImgUrl());
            //购买数量
            orderGoods.setBuynum(cartItem.getGoodsNum());
            //商品价格
            orderGoods.setPrice(cartItem.getPrice());
//            redisFeignClient.setByTime("ORDERGOODS_"+cartItem.getId(),orderGoods,30);
            cartBeanMapper.insertOrderGoods(orderGoods);

            cart = (WSY_CartBean)CacheResult.
                    linkedHashMapToObject(redisFeignService.getFromRedis(key).getData(), WSY_CartBean.class);
            cart.deleteFromCart(cartItem.getId());

        }
        redisFeignService.setToRedis(key,cart,24*60*60L);
//        rabbitTemplate.convertAndSend("order.direct","order.commit","aaaaaa");
        return orderId;
    }


    Map<String ,String > check = new HashMap<>();
    @Override
    public Map<String,String> getCheck(){
        return check;
    }
    @RabbitListener(queuesToDeclare = @Queue("buy"))
    public void useToPay(String message){
        try {
            System.out.println("消费buy方法");
            String[] split = message.split("_");
            String token = split[0];
            String orderId = split[1];
            int payType = Integer.parseInt(split[2]);
            int money = Integer.parseInt(split[3]);
            toPay( token, orderId,payType,money);
        }catch (Exception e){
            System.out.println("消费方法出错");
        }

    }

    @Transactional
    @Override
    public Map<String, String> toPay(String token, String orderId, Integer payType, Integer money){
        BmMember member = (BmMember)CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis(token), BmMember.class);

        if (member==null){
            member = new BmMember();
            member.setId(111);

        }

        BmInorderlist order = (BmInorderlist)CacheResult.
                linkedHashMapToObject(redisFeignService.getFromRedis("ORDER:" + orderId), BmInorderlist.class);
//        CacheUtil.linkedHashMapToObject(redisFeignClient.get("ORDERGOODS_" + orderId), BmInorderlist.class);
        if (order==null){

            throw new RuntimeException("订单支付已超时,订单已取消");

        }

        order.setOrderstep(2);
        order.setPaytype(payType);
        order.setPaytime(new Date());

        cartBeanMapper.insertOrder(order);
//        rabbitTemplate.convertAndSend(orderId);
//        BmMember member1 = cartBeanMapper.selectMemberById(member.getId());
        int amount = member.getAmount().intValue();

        Map<String,String> map = new HashMap<>();
        if (amount>money){
            amount = amount - money;
            member.setAmount(new BigDecimal(amount));
            cartBeanMapper.updateMember(member);
            map.put("message","200");
        }else {
            map.put("message","400");
        }
        check = map;
        return map;
    }


}
