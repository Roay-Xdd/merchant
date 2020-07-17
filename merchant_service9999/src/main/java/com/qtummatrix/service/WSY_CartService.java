package com.qtummatrix.service;

import com.qtummatrix.util.CacheResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "merchant-shopping")
public interface WSY_CartService {

    @RequestMapping("cart/add")
    public CacheResult aadToCart(@RequestParam("token")String token, @RequestParam("goodsId")Integer goodsId, @RequestParam("num")Integer num);

    @RequestMapping("cart/delete")
    public CacheResult deleteFromCart(@RequestParam("token")String token,@RequestParam("goodsId")Integer goodsId);

    @RequestMapping("cart/update")
    public CacheResult updateCartItemNum(@RequestParam("token")String token,@RequestParam("goodsId")Integer goodsId,@RequestParam("num")Integer num);

    @RequestMapping("cart/map")
    public CacheResult getAllCartItem(@RequestParam("token")String token);

    @RequestMapping("cart/goCheckOut")
    public CacheResult checkOut(@RequestParam("token")String token, @RequestParam("cartItemIds")String cartItemIds);

    @RequestMapping("cart/creatOrder")
    public String createOrder(@RequestParam("token")String token, @RequestParam("addressId")String addressId , @RequestParam("mark")String mark , @RequestParam("checkOut")String checkOut);

    @RequestMapping("cart/toPay")
    public Map toPay(@RequestParam("token")String token, @RequestParam("orderId")String orderId, @RequestParam("payType")Integer payType);

    @RequestMapping("cart/validatePayPwd")
    public Map<String,String> validatePayPwd(@RequestParam("token")String token, @RequestParam("payPsd")String payPsd);
}
