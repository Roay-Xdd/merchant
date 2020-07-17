package com.qtummatrix.bean;

import com.qtummatrix.entity.BmInordergoodslist;

import java.util.Set;

/**
 * @ClassName PWL_OrderDetails
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 10:50
 * @Version 1.0
 */
public class PWL_OrderDetails {
//  订单ID
    private  String orderId;
//  总数量
    private  String totalQuantity;
//  总金额
    private  String aggregateAmount;
//  支付状态
    private  String payType;
//  订单时间
    private  String createTime;
//  订单步骤
    private  String orderStep;
//  订单状态
    private  String orderState;
//  收货人姓名
    private  String contacter;
//  收货人电话
    private  String tel;
//  收货人地址
    private  String address;
//  订单备注
    private  String mark;
//  配送费
    private  String deliveryFee;
//  商品信息
    private Set<BmInordergoodslist> bmInordergoodslists;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(String totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getAggregateAmount() {
        return aggregateAmount;
    }

    public void setAggregateAmount(String aggregateAmount) {
        this.aggregateAmount = aggregateAmount;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrderStep() {
        return orderStep;
    }

    public void setOrderStep(String orderStep) {
        this.orderStep = orderStep;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Set<BmInordergoodslist> getBmInordergoodslists() {
        return bmInordergoodslists;
    }

    public void setBmInordergoodslists(Set<BmInordergoodslist> bmInordergoodslists) {
        this.bmInordergoodslists = bmInordergoodslists;
    }

    @Override
    public String toString() {
        return "PWL_OrderDetails{" +
                "orderId='" + orderId + '\'' +
                ", totalQuantity='" + totalQuantity + '\'' +
                ", aggregateAmount='" + aggregateAmount + '\'' +
                ", payType='" + payType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", orderStep='" + orderStep + '\'' +
                ", orderState='" + orderState + '\'' +
                ", contacter='" + contacter + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", mark='" + mark + '\'' +
                ", deliveryFee='" + deliveryFee + '\'' +
                ", bmInordergoodslists=" + bmInordergoodslists +
                '}';
    }
}
