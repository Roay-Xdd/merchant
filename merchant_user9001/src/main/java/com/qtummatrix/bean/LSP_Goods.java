package com.qtummatrix.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class LSP_Goods implements Serializable {
    private Integer id;
//     '机构名称',
    private String mechanismname;
//     '品牌id',
        private Integer brandid;
//    '商品分类id',
        private Integer categoryid;
//    '分类名称',
        private String cname;
//     '品牌名称',
        private String bname;
//     '商品详情',
        private String goodsdetails ;
//      '现价',
        private BigDecimal price;
//        '保质期',
        private String qualityperiod;
//     '商品图片',
        private String goodsimgurl;
//     '机构id',
    private Integer mechanismid;
//     '商品名称',
    private String goodsname;

    @Override
    public String toString() {
        return "LSP_Goods{" +
                "id=" + id +
                ", mechanismname='" + mechanismname + '\'' +
                ", brandid=" + brandid +
                ", categoryid=" + categoryid +
                ", cname='" + cname + '\'' +
                ", bname='" + bname + '\'' +
                ", goodsdetails='" + goodsdetails + '\'' +
                ", price=" + price +
                ", qualityperiod='" + qualityperiod + '\'' +
                ", goodsimgurl='" + goodsimgurl + '\'' +
                ", mechanismid=" + mechanismid +
                ", goodsname='" + goodsname + '\'' +
                ", buynum=" + buynum +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMechanismname() {
        return mechanismname;
    }

    public void setMechanismname(String mechanismname) {
        this.mechanismname = mechanismname;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getGoodsdetails() {
        return goodsdetails;
    }

    public void setGoodsdetails(String goodsdetails) {
        this.goodsdetails = goodsdetails;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getQualityperiod() {
        return qualityperiod;
    }

    public void setQualityperiod(String qualityperiod) {
        this.qualityperiod = qualityperiod;
    }

    public String getGoodsimgurl() {
        return goodsimgurl;
    }

    public void setGoodsimgurl(String goodsimgurl) {
        this.goodsimgurl = goodsimgurl;
    }

    public Integer getMechanismid() {
        return mechanismid;
    }

    public void setMechanismid(Integer mechanismid) {
        this.mechanismid = mechanismid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    //    buyNum int(11) DEFAULT NULL COMMENT '购买数量',
    private Integer buynum;

}
