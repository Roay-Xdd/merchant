package com.qtummatrix.controller;

import com.qtummatrix.service.WSY_CartService;
import com.qtummatrix.util.CacheResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cart")
public class WSY_CartController {

    @Resource
    private WSY_CartService cartService;

    @ResponseBody
    @RequestMapping("add")
    public CacheResult aadToCart(@RequestParam("token")String token,
                                 @RequestParam("goodsId")Integer goodsId,
                                 @RequestParam("num")Integer num){
        CacheResult result = cartService.aadToCart(token, goodsId, num);

        return result;
    }


    @ResponseBody
    @RequestMapping("delete")
    public CacheResult deleteFromCart(@RequestParam("token")String token,
                                      @RequestParam("goodsId")Integer goodsId){
        CacheResult cacheResult = cartService.deleteFromCart(token, goodsId);

        return cacheResult;
    }

    @ResponseBody
    @RequestMapping("update")
    public CacheResult updateCartItemNum(@RequestParam("token")String token,
                                         @RequestParam("goodsId")Integer goodsId,
                                         @RequestParam("num")Integer num){
        CacheResult cacheResult = cartService.updateCartItemNum(token, goodsId, num);

        return cacheResult;

    }

    @ResponseBody
    @RequestMapping("map")
    public CacheResult getAllCartItem(@RequestParam("token")String token){

        CacheResult allCartItem = cartService.getAllCartItem(token);

        return allCartItem;
    }


    @ResponseBody
    @RequestMapping("goCheckOut")
    public CacheResult checkOut(@RequestParam("token")String token,
                                @RequestParam("cartItemIds") String cartItemIds){

        CacheResult cacheResult = cartService.checkOut(token, cartItemIds);

        return cacheResult;

    }

    @ResponseBody
    @RequestMapping("creatOrder")
    public String createOrder(@RequestParam("token")String token,
                              @RequestParam("addressId")String addressId ,
                              @RequestParam("mark")String mark ,
                              @RequestParam("checkOut")String checkOut){

        System.out.println("进入9999Controller层");

        String orderId = cartService.createOrder(token, addressId, mark, checkOut);

        return orderId;

    }

    @ResponseBody
    @RequestMapping("toPay")
    public Map toPay(@RequestParam("token")String token,
                        @RequestParam("orderId")String orderId,
                        @RequestParam("payType")Integer payType){

        Map map = cartService.toPay(token, orderId, payType);

        return map;
    }

    @ResponseBody
    @RequestMapping("validatePayPwd")
    public Map<String,String> validatePayPwd(@RequestParam("token")String token,
                                             @RequestParam("payPsd")String payPsd){
        Map<String, String> map = cartService.validatePayPwd(token, payPsd);

        return map;
    }
}
