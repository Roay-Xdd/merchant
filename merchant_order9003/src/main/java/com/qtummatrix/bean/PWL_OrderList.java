package com.qtummatrix.bean;

import java.util.Date;

/**
 * @ClassName PWL_OrderList
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/11 11:22
 * @Version 1.0
 */
public class PWL_OrderList {
//  订单ID
    private String orderId;
//  总金额
    private Integer  aggregateAmount;
//  订单时间
    private String createTime;
//  订单步骤
    private Integer orderStep;
//  订单状态
    private Integer orderState;
//  总数量
    private Integer totalQuantity;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getAggregateAmount() {
        return aggregateAmount;
    }

    public void setAggregateAmount(Integer aggregateAmount) {
        this.aggregateAmount = aggregateAmount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderStep() {
        return orderStep;
    }

    public void setOrderStep(Integer orderStep) {
        this.orderStep = orderStep;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "PWL_OrderList{" +
                "orderId='" + orderId + '\'' +
                ", aggregateAmount=" + aggregateAmount +
                ", createTime='" + createTime + '\'' +
                ", orderStep=" + orderStep +
                ", orderState=" + orderState +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}
