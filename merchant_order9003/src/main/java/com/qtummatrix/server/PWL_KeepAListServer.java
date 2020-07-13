package com.qtummatrix.server;

import com.qtummatrix.bean.PWL_OrderDetails;
import com.qtummatrix.bean.PWL_OrderList;

import java.util.List;

public interface PWL_KeepAListServer {

    //  获取所有订单
    public List<PWL_OrderList> getOrderList(String tel);
    //  获取待支付订单列表
    public List<PWL_OrderList> getNoPayList(String tel);
    //  获取待发货订单列表
    public List<PWL_OrderList> getNoInspectionList(String tel);
    //  获取待收货订单列表
    public List<PWL_OrderList> getNoSureList(String tel);
    //  获取已完成订单列表
    public List<PWL_OrderList> getCompletedList(String tel);
    //  获取订单详情
    public List<PWL_OrderDetails> getOrderDetail(String orderId);

}
