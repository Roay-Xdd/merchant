package com.qtummatrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qtummatrix.service.PWL_RedisServer;
import com.qtummatrix.service.PWL_UserOfenSalesListServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PWL_UserOfenSalesListController
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/14 10:17
 * @Version 1.0
 */
@Controller
@DefaultProperties(defaultFallback = "defaultFallbackMethod")
@RequestMapping("api/userOfenSalesList")
public class PWL_UserOfenSalesListController {

    @Resource
    private PWL_RedisServer pwl_redisServer;

    @Resource
    private PWL_UserOfenSalesListServer pwl_userOfenSalesListServer;

    /**
     * @方法描述: 查看常购清单
     * @Author panwenlong
     * @Date 10:22 2020/7/14
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getOfenSalesList")
    public List getOfenSalesList(String tel){
//        String token = "";
//        BmMember bmMember = (BmMember) pwl_redisServer.getFromRedis(token);
//        tel = bmMember.getTel();
        List list = pwl_userOfenSalesListServer.getOfenSalesList(tel);
        return list;
    }

    /**
     * @方法描述: 查看商品详情
     * @Author panwenlong
     * @Date 10:22 2020/7/14
    **/
    @ResponseBody
    @HystrixCommand
    @RequestMapping("getGoodsDetails")
    public List getGoodsDetails(String token,Integer goodsId){
        List list = pwl_userOfenSalesListServer.getGoodsDetails(goodsId);
        return list;
    }

    /**
     * @方法描述: 全局异常处理
     * @Author panwenlong
     * @Date 10:21 2020/7/14
    **/
    public List defaultFallbackMethod(){
        List list = new ArrayList();
        list.add("网络异常，请稍后再试");
        return list;
    }

}
