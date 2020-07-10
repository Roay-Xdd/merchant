package com.qtummatrix.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * bm_brand
 * @author 
 */
public class BmBrand implements Serializable {
    private Integer id;

    /**
     * ����
     */
    private Integer sort;

    /**
     * Ʒ������
     */
    private String bname;

    /**
     * Ʒ��ͼƬ
     */
    private String brandimg;

    /**
     * ��ע
     */
    private String mark;

    private Date createtime;

    /**
     * �Ƿ��Ƽ� 0.���Ƽ� 1.�Ƽ�
     */
    private Integer isrecom;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBrandimg() {
        return brandimg;
    }

    public void setBrandimg(String brandimg) {
        this.brandimg = brandimg;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsrecom() {
        return isrecom;
    }

    public void setIsrecom(Integer isrecom) {
        this.isrecom = isrecom;
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
        BmBrand other = (BmBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getBname() == null ? other.getBname() == null : this.getBname().equals(other.getBname()))
            && (this.getBrandimg() == null ? other.getBrandimg() == null : this.getBrandimg().equals(other.getBrandimg()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getIsrecom() == null ? other.getIsrecom() == null : this.getIsrecom().equals(other.getIsrecom()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getBname() == null) ? 0 : getBname().hashCode());
        result = prime * result + ((getBrandimg() == null) ? 0 : getBrandimg().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getIsrecom() == null) ? 0 : getIsrecom().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sort=").append(sort);
        sb.append(", bname=").append(bname);
        sb.append(", brandimg=").append(brandimg);
        sb.append(", mark=").append(mark);
        sb.append(", createtime=").append(createtime);
        sb.append(", isrecom=").append(isrecom);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}