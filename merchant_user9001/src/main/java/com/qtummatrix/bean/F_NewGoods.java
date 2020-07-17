package com.qtummatrix.bean;

import java.math.BigDecimal;
import java.util.Date;

public class F_NewGoods {
    private Integer id;
    private String goodsName;//商品名称
    private Date createTime;//创建时间
    private Integer goodsId;//所属商品id
    private BigDecimal price;//现价
    private String goodsImgUrl;//商品图片

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    @Override
    public String toString() {
        return "F_NewGoods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", createTime=" + createTime +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", goodsImgUrl='" + goodsImgUrl + '\'' +
                '}';
    }
}
