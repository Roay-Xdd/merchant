package com.qtummatrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@FeignClient(value = "merchant-order" ,fallback = PWL_UserKeepAListServerApplication.class)
public interface PWL_UserKeepAListServer {
    //  获取所有订单
    @RequestMapping("api/keepAList/getOrderList")
    public Map getOrderList(@RequestParam("tel") String tel);
    //  获取待支付订单列表
    @RequestMapping("api/keepAList/getNoPayList")
    public Map getNoPayList(@RequestParam("tel") String tel);
    //  获取待发货订单列表
    @RequestMapping("api/keepAList/getNoInspectionList")
    public Map getNoInspectionList(@RequestParam("tel") String tel);
    //  获取待收货订单列表
    @RequestMapping("api/keepAList/getNoSureList")
    public Map getNoSureList(@RequestParam("tel") String tel);
    //  获取已完成订单列表
    @RequestMapping("api/keepAList/getCompletedList")
    public Map getCompletedList(@RequestParam("tel") String tel);
    //  获取订单详情
    @RequestMapping("api/keepAList/getOrderDetail")
    public Map getOrderDetail(@RequestParam("orderId") String orderId);
    //    取消订单
    @RequestMapping("api/keepAList/cancelMyInOrder")
    public Map cancelMyInOrder(@RequestParam("orderId") String orderId);
}
