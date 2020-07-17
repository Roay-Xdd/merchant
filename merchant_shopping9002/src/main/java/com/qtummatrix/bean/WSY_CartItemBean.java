package com.qtummatrix.bean;

import java.math.BigDecimal;
import java.util.Objects;

public class WSY_CartItemBean {
    /**
     * 商品规格id
     */
    private Integer id;
    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 机构名称
     */
    private String mechanismName;
    /**
     * 机构编号
     */
    private String mechanismCode;
    /**
     * 商品价格
     */
    private BigDecimal price;
    /**
     * 商品总价格
     */
    private BigDecimal totalPrice;
    /**
     * 商品图片
     */
    private String goodsImgUrl;
    /**
     * 商品数量
     */
    private Integer goodsNum;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 商品选中标记
     */
    private boolean flog;
    /**
     * 商品规格名称
     */
    private String sname;

    public boolean getFlog() {
        return flog;
    }

    public void setFlog(boolean flog) {
        this.flog = flog;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    private String warehouseCode;

    public Integer getId() {
        return id;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMechanismName() {
        return mechanismName;
    }

    public void setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
    }

    public String getMechanismCode() {
        return mechanismCode;
    }

    public void setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", mechanismName='" + mechanismName + '\'' +
                ", mechanismCode='" + mechanismCode + '\'' +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", goodsImgUrl='" + goodsImgUrl + '\'' +
                ", goodsNum=" + goodsNum +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WSY_CartItemBean cartItem = (WSY_CartItemBean) o;
        return Objects.equals(id, cartItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
