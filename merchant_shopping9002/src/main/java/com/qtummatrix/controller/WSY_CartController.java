package com.qtummatrix.controller;

import com.qtummatrix.bean.WSY_CartItemBean;
import com.qtummatrix.bean.WSY_CheckOutBean;
import com.qtummatrix.server.SendBuy;
import com.qtummatrix.server.SendOrder;
import com.qtummatrix.server.WSY_CartService;
import com.qtummatrix.util.CacheResult;
import com.qtummatrix.util.ExceptionUtil;
import com.qtummatrix.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("cart")
public class WSY_CartController {
    @Autowired
    private WSY_CartService cartService;
    private static final String MEMBER_TOKEN = "MEMBER_TOKEN:";

    @Autowired
    private SendOrder sendOrder;
    @Autowired
    private SendBuy sendBuy;

    /**
     * 添加商品到购物车
     *
     * @param goodsId 商品规格id
     * @param num     商品数量
     * @return
     */
    @RequestMapping("/add")
    public CacheResult addToCart(@RequestParam("token")String token,
                                 @RequestParam("goodsId") Integer goodsId,
                                 @RequestParam(defaultValue = "1") Integer num) {
        CacheResult result = null;
        try {
            result = cartService.aadToCart(MEMBER_TOKEN + token, goodsId, num);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 得到购物车商品集合
     *
     * @return
     */
    @RequestMapping("/map")
    public CacheResult getCartItem(String token) {
        CacheResult result = null;
        try {
            System.out.println(token);
            result = cartService.getAllCartItem(MEMBER_TOKEN + token);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 从购物车中删除
     *
     * @param goodsId
     * @return
     */
    @RequestMapping("/delete")
    public CacheResult deleteFromCart(@RequestParam("token") String token,
                                      @RequestParam("goodsId") Integer goodsId) {
        System.out.println(goodsId);
        CacheResult result = null;
        try {
            result = cartService.deleteFromCart(MEMBER_TOKEN + token,goodsId);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 修改购物车中的商品数量
     *
     * @param goodsId 商品id
     * @param num     商品数量
     * @return
     */
    @RequestMapping("/update")
    public CacheResult updateCartItemNum(@RequestParam("token") String token,Integer goodsId, Integer num) {
        CacheResult result = null;
        try {
            result = cartService.updateCartItemNum(MEMBER_TOKEN + token, goodsId, num);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }

    /**
     * 前往结算
     *
     * @param cartItemIds 购物车商品项id
     * @return
     */
    @RequestMapping(value = "/goCheckOut")
    public CacheResult goCheckOut(@RequestParam("token") String token, String cartItemIds) {

        String[] split = cartItemIds.split(",");
        List<String> ids = Arrays.asList(split);
        CacheResult result = null;
        try {
            result = cartService.checkOut(MEMBER_TOKEN + token, ids);
        } catch (Exception e) {
            e.printStackTrace();
            result = CacheResult.build(400, ExceptionUtil.getStackTrace(e));
        }
        return result;
    }


    @RequestMapping("/creatOrder")
    public String creatOrder(String token,String addressId,String mark , String checkOut){
        System.out.println("进入Contrller层");
        System.out.println(checkOut);

        sendOrder.send(token, addressId, mark,checkOut);
//        String orderId = cartService.createOrder(token, addressId, mark,checkOut);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String orderId = cartService.getOrderId();
        return orderId;
    }

    @RequestMapping("/toPay")
    public Map<String ,String >  pay(String token,String orderId,String payType,String money){

        sendBuy.send(token, orderId, Integer.parseInt(payType),Integer.parseInt(money));

//      String pay = cartService.toPay(token, orderId, Integer.parseInt(payType),Integer.parseInt(money));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cartService.getCheck();

    }

    @RequestMapping("/validatePayPwd")
    public Map<String,String> validatePayPwd(String token,String payPsd){

        Map<String,String> map = new HashMap<>();
        System.out.println("验证支付密码");

        if (payPsd.equals("528528")){
            map.put("message","200");
        }else {
            map.put("message","400");
        }

        return map;
    }

}
