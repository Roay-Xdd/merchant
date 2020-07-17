package com.qtummatrix.server;

import com.qtummatrix.bean.WSY_CartItemBean;
import com.qtummatrix.bean.WSY_CheckOutBean;
import com.qtummatrix.util.CacheResult;
import io.swagger.models.auth.In;

import java.util.List;
import java.util.Map;

public interface WSY_CartService {

    /**
     * 将商品添加到购物车
     * @param token
     * @param sid 商品规格ID
     * @param num 添加数量
     * @return
     */
    public CacheResult aadToCart(String token, Integer sid, Integer num);

    /**
     * 根据规格ID获取商品
     * @param goodsId 规格ID
     * @return
     */
    public WSY_CartItemBean getCartItemById(Integer goodsId);

    /**
     * 从购物车中删除商品
     * @return
     */
    public CacheResult deleteFromCart(String token,Integer goodsId);

    /**
     * 修改购物车商品数量
     * @param token
     * @param goodsId 商品ID
     * @param num 要修改的数量
     * @return
     */
    public CacheResult updateCartItemNum(String token,Integer goodsId,Integer num);

    /**
     * 查询购物车商品
     * @param token
     * @return
     */
    public CacheResult getAllCartItem(String token);

    /**
     * 商品结算
     * @param token
     * @param cartItemIds
     * @return
     */
    public CacheResult checkOut(String token, List<String> cartItemIds);

    String getOrderId();

    /**
     * 创建订单
     * @return
     */
    public String createOrder(String token, String addressId , String mark , String checkOut);


    Map<String,String> getCheck();

    /**
     * 支付
     * @param orderId
     * @param payType
     * @return
     */
    public Map toPay(String token, String orderId, Integer payType, Integer money);

}
