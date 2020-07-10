package com.qtummatrix.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * bm_specification
 * @author 
 */
public class BmSpecification implements Serializable {
    private Integer id;

    /**
     * 所属商品id
     */
    private Integer goodsid;

    /**
     * 规格名称
     */
    private String sname;

    /**
     * 原价
     */
    private BigDecimal oldprice;

    /**
     * 现价
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 警戒库存
     */
    private Integer warnstock;

    /**
     * 总销量
     */
    private Integer allsaled;

    /**
     * 月销量
     */
    private String currentmonth;

    /**
     * 是否上架 0.未上架 1.上架
     */
    private Integer isshelves;

    /**
     * 是否推荐 0.不推荐 1.推荐
     */
    private Integer isrecom;

    /**
     * 商品图片
     */
    private String goodsimgurl;

    /**
     * 保质期
     */
    private String qualityperiod;

    /**
     * 生产日期
     */
    private Date productiondate;

    /**
     * 二维码
     */
    private byte[] barcode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public BigDecimal getOldprice() {
        return oldprice;
    }

    public void setOldprice(BigDecimal oldprice) {
        this.oldprice = oldprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getWarnstock() {
        return warnstock;
    }

    public void setWarnstock(Integer warnstock) {
        this.warnstock = warnstock;
    }

    public Integer getAllsaled() {
        return allsaled;
    }

    public void setAllsaled(Integer allsaled) {
        this.allsaled = allsaled;
    }

    public String getCurrentmonth() {
        return currentmonth;
    }

    public void setCurrentmonth(String currentmonth) {
        this.currentmonth = currentmonth;
    }

    public Integer getIsshelves() {
        return isshelves;
    }

    public void setIsshelves(Integer isshelves) {
        this.isshelves = isshelves;
    }

    public Integer getIsrecom() {
        return isrecom;
    }

    public void setIsrecom(Integer isrecom) {
        this.isrecom = isrecom;
    }

    public String getGoodsimgurl() {
        return goodsimgurl;
    }

    public void setGoodsimgurl(String goodsimgurl) {
        this.goodsimgurl = goodsimgurl;
    }

    public String getQualityperiod() {
        return qualityperiod;
    }

    public void setQualityperiod(String qualityperiod) {
        this.qualityperiod = qualityperiod;
    }

    public Date getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(Date productiondate) {
        this.productiondate = productiondate;
    }

    public byte[] getBarcode() {
        return barcode;
    }

    public void setBarcode(byte[] barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BmSpecification other = (BmSpecification) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getOldprice() == null ? other.getOldprice() == null : this.getOldprice().equals(other.getOldprice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getWarnstock() == null ? other.getWarnstock() == null : this.getWarnstock().equals(other.getWarnstock()))
            && (this.getAllsaled() == null ? other.getAllsaled() == null : this.getAllsaled().equals(other.getAllsaled()))
            && (this.getCurrentmonth() == null ? other.getCurrentmonth() == null : this.getCurrentmonth().equals(other.getCurrentmonth()))
            && (this.getIsshelves() == null ? other.getIsshelves() == null : this.getIsshelves().equals(other.getIsshelves()))
            && (this.getIsrecom() == null ? other.getIsrecom() == null : this.getIsrecom().equals(other.getIsrecom()))
            && (this.getGoodsimgurl() == null ? other.getGoodsimgurl() == null : this.getGoodsimgurl().equals(other.getGoodsimgurl()))
            && (this.getQualityperiod() == null ? other.getQualityperiod() == null : this.getQualityperiod().equals(other.getQualityperiod()))
            && (this.getProductiondate() == null ? other.getProductiondate() == null : this.getProductiondate().equals(other.getProductiondate()))
            && (Arrays.equals(this.getBarcode(), other.getBarcode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getOldprice() == null) ? 0 : getOldprice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getWarnstock() == null) ? 0 : getWarnstock().hashCode());
        result = prime * result + ((getAllsaled() == null) ? 0 : getAllsaled().hashCode());
        result = prime * result + ((getCurrentmonth() == null) ? 0 : getCurrentmonth().hashCode());
        result = prime * result + ((getIsshelves() == null) ? 0 : getIsshelves().hashCode());
        result = prime * result + ((getIsrecom() == null) ? 0 : getIsrecom().hashCode());
        result = prime * result + ((getGoodsimgurl() == null) ? 0 : getGoodsimgurl().hashCode());
        result = prime * result + ((getQualityperiod() == null) ? 0 : getQualityperiod().hashCode());
        result = prime * result + ((getProductiondate() == null) ? 0 : getProductiondate().hashCode());
        result = prime * result + (Arrays.hashCode(getBarcode()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", sname=").append(sname);
        sb.append(", oldprice=").append(oldprice);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", warnstock=").append(warnstock);
        sb.append(", allsaled=").append(allsaled);
        sb.append(", currentmonth=").append(currentmonth);
        sb.append(", isshelves=").append(isshelves);
        sb.append(", isrecom=").append(isrecom);
        sb.append(", goodsimgurl=").append(goodsimgurl);
        sb.append(", qualityperiod=").append(qualityperiod);
        sb.append(", productiondate=").append(productiondate);
        sb.append(", barcode=").append(barcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}