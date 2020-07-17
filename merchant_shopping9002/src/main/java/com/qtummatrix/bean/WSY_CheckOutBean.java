package com.qtummatrix.bean;

import java.math.BigDecimal;
import java.util.List;

public class WSY_CheckOutBean {
    private BigDecimal totalDeliveryFee; //配送费总额
    private BigDecimal totalPrice;  //总金额
    private List<WSY_CartItemBean> cartItemList; //购买的商品集合

    public WSY_CheckOutBean(BigDecimal totalDeliveryFee, BigDecimal totalPrice, List<WSY_CartItemBean> cartItemList) {
        this.totalDeliveryFee = totalDeliveryFee;
        this.totalPrice = totalPrice;
        this.cartItemList = cartItemList;
    }

    public WSY_CheckOutBean() {
    }

    public BigDecimal getTotalDeliveryFee() {
        return totalDeliveryFee;
    }

    public void setTotalDeliveryFee(BigDecimal totalDeliveryFee) {
        this.totalDeliveryFee = totalDeliveryFee;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<WSY_CartItemBean> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<WSY_CartItemBean> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @Override
    public String toString() {
        return "WSY_CheckOutBean{" +
                "totalDeliveryFee=" + totalDeliveryFee +
                ", totalPrice=" + totalPrice +
                ", cartItemList=" + cartItemList +
                '}';
    }
}
