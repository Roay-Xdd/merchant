package com.qtummatrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qtummatrix.entity.BmMember;
import com.qtummatrix.service.PWL_RedisServer;
import com.qtummatrix.service.PWL_UserKeepAListServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@DefaultProperties(defaultFallback = "defaultFallbackMethod")
@RequestMapping("api/userKeepAList")
public class PWL_UserKeepAListController {

    @Resource
    private  PWL_UserKeepAListServer pwl_userKeepAListServer;

    @Resource
    private PWL_RedisServer pwl_redisServer;

    /**
     * @方法描述: 获取所有订单
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getOrderList")
    public Map getOrderList(String tel){
        Map map = new HashMap();
//        String token = "";
//        BmMember bmMember = (BmMember) pwl_redisServer.getFromRedis(token);
//        tel = bmMember.getTel();
        map = pwl_userKeepAListServer.getOrderList(tel);
        return map;
    }

    /**
     * @方法描述: 获取待支付订单列表
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getNoPayList")
    public Map getNoPayList(String tel){
        Map map = new HashMap();
//        String token = "";
//        BmMember bmMember = (BmMember) pwl_redisServer.getFromRedis(token);
//        tel = bmMember.getTel();
        map = pwl_userKeepAListServer.getNoPayList(tel);
        return map;
    }

    /**
     * @方法描述: 获取待发货订单列表
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getNoInspectionList")
    public Map getNoInspectionList(String tel){
        Map map = new HashMap();
//        String token = "";
//        BmMember bmMember = (BmMember) pwl_redisServer.getFromRedis(token);
//        tel = bmMember.getTel();
        map = pwl_userKeepAListServer.getNoInspectionList(tel);
        return map;
    }

    /**
     * @方法描述: 获取待收货订单列表
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getNoSureList")
    public Map getNoSureList(String tel){
        Map map = new HashMap();
//        String token = "";
//        BmMember bmMember = (BmMember) pwl_redisServer.getFromRedis(token);
//        tel = bmMember.getTel();
        map = pwl_userKeepAListServer.getNoSureList(tel);
        return map;
    }

    /**
     * @方法描述: 查看已完成的订单
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getCompletedList")
    public Map getCompletedList(String tel){
        Map map = new HashMap();
//        String token = "";
//        BmMember bmMember = (BmMember) pwl_redisServer.getFromRedis(token);
//        tel = bmMember.getTel();
        map = pwl_userKeepAListServer.getCompletedList(tel);
        return map;
    }

    /**
     * @方法描述: 查看订单详情
     * @Author panwenlong
     * @Date 20:08 2020/7/13
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getOrderDetail")
    public Map getOrderDetail(String token,String orderId){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.getOrderDetail(orderId);
        return map;
    }

    @ResponseBody
    @HystrixCommand
    @RequestMapping("cancelMyInOrder")
    public Map cancelMyInOrder(String token,String orderId){
        Map map = new HashMap();
        map = pwl_userKeepAListServer.cancelMyInOrder(orderId);
        return map;
    }

    /**
     * @方法描述: 全局异常处理
     * @Author panwenlong
     * @Date 10:20 2020/7/14
    **/
    public Map defaultFallbackMethod(){
        Map map = new HashMap();
        map.put("404","网络异常，请稍后再试");
        return map;
    }

}
