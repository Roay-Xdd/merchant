package com.qtummatrix.controller;

import com.qtummatrix.service.PWL_UserKeepAListServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PWL_UserKeepAListController
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 19:19
 * @Version 1.0
 */
@Controller
@RequestMapping("api/userKeepAList")
public class PWL_UserKeepAListController {

    @Resource
    private  PWL_UserKeepAListServer pwl_userKeepAListServer;

    /**
     * @方法描述: 获取所有订单
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getOrderList")
    public Map getOrderList(String tel){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getOrderList(tel);
        return map;
    }

    /**
     * @方法描述: 获取待支付订单列表
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getNoPayList")
    public Map getNoPayList(String tel){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getNoPayList(tel);
        return map;
    }

    /**
     * @方法描述: 获取待发货订单列表
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getNoInspectionList")
    public Map getNoInspectionList(String tel){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getNoInspectionList(tel);
        return map;
    }

    /**
     * @方法描述: 获取待收货订单列表
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getNoSureList")
    public Map getNoSureList(String tel){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getNoSureList(tel);
        return map;
    }

    /**
     * @方法描述: 查看已完成的订单
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getCompletedList")
    public Map getCompletedList(String tel){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getCompletedList(tel);
        return map;
    }

    /**
     * @方法描述: 查看订单详情
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @RequestMapping("getOrderDetail")
    public Map getOrderDetail(String orderId){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getOrderDetail(orderId);
        return map;
    }

}
