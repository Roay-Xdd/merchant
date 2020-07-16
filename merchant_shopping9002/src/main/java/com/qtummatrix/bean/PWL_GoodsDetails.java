package com.qtummatrix.bean;

/**
 * @ClassName PWL_GoodsDetails
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 16:10
 * @Version 1.0
 */
public class PWL_GoodsDetails {
//  商品图片
    private String goodsImgUrl;
//  商品名称
    private String goodsName;
//  商品单价
    private String price;
//  商品分类
    private String cname;
//  品牌
    private String bname;
//  供应商
    private String mechanismName;
//  保质期
    private String qualityPeriod;

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getMechanismName() {
        return mechanismName;
    }

    public void setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
    }

    public String getQualityPeriod() {
        return qualityPeriod;
    }

    public void setQualityPeriod(String qualityPeriod) {
        this.qualityPeriod = qualityPeriod;
    }

    @Override
    public String toString() {
        return "PWL_GoodsDetails{" +
                "goodsImgUrl='" + goodsImgUrl + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price='" + price + '\'' +
                ", cname='" + cname + '\'' +
                ", bname='" + bname + '\'' +
                ", mechanismName='" + mechanismName + '\'' +
                ", qualityPeriod='" + qualityPeriod + '\'' +
                '}';
    }
}
