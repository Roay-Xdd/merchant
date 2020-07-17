package com.qtummatrix.controller;

import com.qtummatrix.bean.PWL_OrderDetails;
import com.qtummatrix.bean.PWL_OrderList;
import com.qtummatrix.server.PWL_KeepAListServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PWL_KeepAListController
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/11 10:05
 * @Version 1.0
 */
@Controller
@RequestMapping("api/keepAList")
public class PWL_KeepAListController {

    @Resource
    private PWL_KeepAListServer pwl_keepAListServer;

    /**
     * @方法描述: 获取所有订单
     * @Author panwenlong
     * @Date 14:16 2020/7/11
    **/
    @RequestMapping("getOrderList")
    @ResponseBody
    public Map getOrderList(@RequestParam("tel") String tel){
        Map map = new HashMap();
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListServer.getOrderList(tel);
        map.put("pwl_orderLists",pwl_orderLists);
        return map;
    }

    /**
     * @方法描述: 获取所有待支付的订单
     * @Author panwenlong
     * @Date 14:17 2020/7/11
    **/
    @RequestMapping("getNoPayList")
    @ResponseBody
    public Map getNoPayList(@RequestParam("tel") String tel){
        Map map = new HashMap();
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListServer.getNoPayList(tel);
        map.put("pwl_orderLists",pwl_orderLists);
        return map;
    }

    /**
     * @方法描述: 获取所有待发货的订单
     * @Author panwenlong
     * @Date 14:17 2020/7/11
    **/
    @RequestMapping("getNoInspectionList")
    @ResponseBody
    public Map getNoInspectionList(@RequestParam("tel") String tel){
        Map map = new HashMap();
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListServer.getNoInspectionList(tel);
        map.put("pwl_orderLists",pwl_orderLists);
        return map;
    }

    /**
     * @方法描述: 获取所有待收货的订单
     * @Author panwenlong
     * @Date 14:17 2020/7/11
    **/
    @RequestMapping("getNoSureList")
    @ResponseBody
    public Map getNoSureList(@RequestParam("tel") String tel){
        Map map = new HashMap();
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListServer.getNoSureList(tel);
        map.put("pwl_orderLists",pwl_orderLists);
        return map;
    }

    /**
     * @方法描述: 获取所有已完成的订单
     * @Author panwenlong
     * @Date 14:17 2020/7/11
    **/
    @RequestMapping("getCompletedList")
    @ResponseBody
    public Map getCompletedList(@RequestParam("tel") String tel){
        Map map = new HashMap();
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListServer.getCompletedList(tel);
        map.put("pwl_orderLists",pwl_orderLists);
        return map;
    }

    /**
     * @方法描述: 获取订单详情
     * @Author panwenlong
     * @Date 11:06 2020/7/13
    **/
    @RequestMapping("getOrderDetail")
    @ResponseBody
    public Map getOrderDetail(@RequestParam("orderId") String orderId) {
        Map map = new HashMap();
        List<PWL_OrderDetails> orderDetails = pwl_keepAListServer.getOrderDetail(orderId);
        map.put("orderDetails",orderDetails);
        return  map;
    }

    /**
     * @方法描述: 取消订单
     * @Author panwenlong
     * @Date 19:25 2020/7/14
    **/
    @ResponseBody
    @RequestMapping("cancelMyInOrder")
    public Map cancelMyInOrder(@RequestParam("orderId") String orderId){
        Map map = new HashMap();
        Integer number = pwl_keepAListServer.cancelMyInOrder(orderId);
        if (number == 1) {
            map.put("message","操作已提交，请等待商家确认");
        }else {
            map.put("message","操作失败");
        }
        return map;
    }

}
