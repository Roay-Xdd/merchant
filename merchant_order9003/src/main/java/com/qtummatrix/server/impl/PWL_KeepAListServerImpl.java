package com.qtummatrix.server.impl;

import com.qtummatrix.bean.PWL_OrderDetails;
import com.qtummatrix.bean.PWL_OrderList;
import com.qtummatrix.mapper.PWL_KeepAListMapper;
import com.qtummatrix.server.PWL_KeepAListServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PWL_KeepAListServerImpl
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/11 10:06
 * @Version 1.0
 */
@Service("pwl_keepAListServer")
public class PWL_KeepAListServerImpl implements PWL_KeepAListServer {

    @Resource
    private PWL_KeepAListMapper pwl_keepAListMapper;

/**
 * @方法描述: 获取所有订单
 * @Author panwenlong
 * @Date 11:19 2020/7/11
**/
    @Override
    public List<PWL_OrderList> getOrderList(String tel) {
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListMapper.getOrderList(tel);
        for (PWL_OrderList pwl_orderList : pwl_orderLists) {
            String time = pwl_orderList.getCreateTime();
            time = time.substring(0,10);
            pwl_orderList.setCreateTime(time);
        }
        return pwl_orderLists;
    }

    /**
     * @方法描述: 获取待支付订单列表
     * @Author panwenlong
     * @Date 11:19 2020/7/11
    **/
    @Override
    public List<PWL_OrderList> getNoPayList(String tel) {
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListMapper.getNoPayList(tel);
        for (PWL_OrderList pwl_orderList : pwl_orderLists) {
            String time = pwl_orderList.getCreateTime();
            time = time.substring(0,10);
            pwl_orderList.setCreateTime(time);
        }
        return pwl_orderLists;
    }

    /**
     * @方法描述: 获取待发货订单列表
     * @Author panwenlong
     * @Date 11:19 2020/7/11
    **/
    @Override
    public List<PWL_OrderList> getNoInspectionList(String tel) {
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListMapper.getNoInspectionList(tel);
        for (PWL_OrderList pwl_orderList : pwl_orderLists) {
            String time = pwl_orderList.getCreateTime();
            time = time.substring(0,10);
            pwl_orderList.setCreateTime(time);
        }
        return pwl_orderLists;
    }

    /**
     * @方法描述: 获取待收货订单列表
     * @Author panwenlong
     * @Date 11:19 2020/7/11
    **/
    @Override
    public List<PWL_OrderList> getNoSureList(String tel) {
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListMapper.getNoSureList(tel);
        for (PWL_OrderList pwl_orderList : pwl_orderLists) {
            String time = pwl_orderList.getCreateTime();
            time = time.substring(0,10);
            pwl_orderList.setCreateTime(time);
        }
        return pwl_orderLists;
    }

    /**
     * @方法描述: 获取已完成订单列表
     * @Author panwenlong
     * @Date 11:19 2020/7/11
    **/
    @Override
    public List<PWL_OrderList> getCompletedList(String tel) {
        List<PWL_OrderList> pwl_orderLists = pwl_keepAListMapper.getCompletedList(tel);
        for (PWL_OrderList pwl_orderList : pwl_orderLists) {
            String time = pwl_orderList.getCreateTime();
            time = time.substring(0,10);
            pwl_orderList.setCreateTime(time);
        }
        return pwl_orderLists;
    }

    /**
     * @方法描述: 获取订单详情
     * @Author panwenlong
     * @Date 11:03 2020/7/13
    **/
    @Override
    public List<PWL_OrderDetails> getOrderDetail(String orderId) {
        List<PWL_OrderDetails> orderDetails = pwl_keepAListMapper.getOrderDetail(orderId);
        for (PWL_OrderDetails orderDetail : orderDetails) {
            String time = orderDetail.getCreateTime();
            time = time.substring(0,10);
            orderDetail.setCreateTime(time);
        }
        return orderDetails;
    }


}
