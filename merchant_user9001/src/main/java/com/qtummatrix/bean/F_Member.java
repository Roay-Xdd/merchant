package com.qtummatrix.bean;

import java.math.BigDecimal;
import java.util.Date;

public class F_Member {
    private Integer id;
    private String tel;//电话号码
    private String password;//登陆密码
    private String payPassword;//支付密码
    private String backImg;//店铺图片
    private String businessName;//店铺名称
    private String trueName;//老板姓名
    private String address ;//店铺地址
    private BigDecimal amount;//账户余额

    private BigDecimal deliveryFee;//配送金额
    private BigDecimal deliveryRadius;//配送距离
    private String mapCode;//地址坐标
    private Integer state;//审核状态 0.未审核 1.已审核
    private String shopType;//店铺类型
    private String token;//店铺登陆标识
    private Date addTime;
    private Integer isDeleted;//删除标记 0.未删除 1.已删除

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getBackimg() {
        return backImg;
    }

    public void setBackimg(String backimg) {
        this.backImg = backimg;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getDeliveryRadius() {
        return deliveryRadius;
    }

    public void setDeliveryRadius(BigDecimal deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    public String getMapCode() {
        return mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }



    @Override
    public String toString() {
        return "F_Member{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", payPassword='" + payPassword + '\'' +
                ", backImg='" + backImg + '\'' +
                ", businessName='" + businessName + '\'' +
                ", trueName='" + trueName + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                ", deliveryFee=" + deliveryFee +
                ", deliveryRadius=" + deliveryRadius +
                ", mapCode='" + mapCode + '\'' +
                ", state=" + state +
                ", shopType='" + shopType + '\'' +
                ", token='" + token + '\'' +
                ", addTime=" + addTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
