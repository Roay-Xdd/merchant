package com.qtummatrix.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * bm_goods
 * @author 
 */
public class BmGoods implements Serializable {
    private Integer id;

    /**
     * ��Ʒ���
     */
    private String goodscode;

    /**
     * ��Ʒ����
     */
    private String goodsname;

    /**
     * �ֿ���
     */
    private String warehousecode;

    /**
     * ��Ʒ����id
     */
    private Integer categoryid;

    /**
     * Ʒ��id
     */
    private Integer brandid;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ��Ʒ����
     */
    private String goodsdetails;

    private Date createtime;

    /**
     * ɾ����� 0.δɾ�� 1.��ɾ��
     */
    private Integer isdeleted;

    /**
     * ��Ʒ����
     */
    private String goodsmark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getWarehousecode() {
        return warehousecode;
    }

    public void setWarehousecode(String warehousecode) {
        this.warehousecode = warehousecode;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getGoodsdetails() {
        return goodsdetails;
    }

    public void setGoodsdetails(String goodsdetails) {
        this.goodsdetails = goodsdetails;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getGoodsmark() {
        return goodsmark;
    }

    public void setGoodsmark(String goodsmark) {
        this.goodsmark = goodsmark;
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
        BmGoods other = (BmGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodscode() == null ? other.getGoodscode() == null : this.getGoodscode().equals(other.getGoodscode()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getWarehousecode() == null ? other.getWarehousecode() == null : this.getWarehousecode().equals(other.getWarehousecode()))
            && (this.getCategoryid() == null ? other.getCategoryid() == null : this.getCategoryid().equals(other.getCategoryid()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getGoodsdetails() == null ? other.getGoodsdetails() == null : this.getGoodsdetails().equals(other.getGoodsdetails()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getGoodsmark() == null ? other.getGoodsmark() == null : this.getGoodsmark().equals(other.getGoodsmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodscode() == null) ? 0 : getGoodscode().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getWarehousecode() == null) ? 0 : getWarehousecode().hashCode());
        result = prime * result + ((getCategoryid() == null) ? 0 : getCategoryid().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getGoodsdetails() == null) ? 0 : getGoodsdetails().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getGoodsmark() == null) ? 0 : getGoodsmark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodscode=").append(goodscode);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", warehousecode=").append(warehousecode);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", brandid=").append(brandid);
        sb.append(", sort=").append(sort);
        sb.append(", goodsdetails=").append(goodsdetails);
        sb.append(", createtime=").append(createtime);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", goodsmark=").append(goodsmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}