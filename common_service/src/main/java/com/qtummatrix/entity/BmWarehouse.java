package com.qtummatrix.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * bm_warehouse
 * @author 
 */
public class BmWarehouse implements Serializable {
    private Integer id;

    /**
     * �ֿ���
     */
    private String warehousecode;

    /**
     * ����id
     */
    private Integer mechanismid;

    /**
     * �ֿ����� 1.���� 2.����
     */
    private Integer warehousetype;

    /**
     * �ֿ��ַ
     */
    private String address;

    /**
     * ������ÿ����
     */
    private BigDecimal deliveryfeeaverykm;

    /**
     * ��ʼӪҵʱ��
     */
    private String starttime;

    /**
     * ����Ӫҵʱ��
     */
    private String endtime;

    /**
     * ���ͷ�Χ
     */
    private BigDecimal deliveryradius;

    /**
     * �ֿ⾭γ������ �磺113.781181,34.720848
     */
    private String mapcode;

    /**
     * ��ϵ�绰
     */
    private String tel;

    /**
     * ��������
     */
    private Integer startsendnum;

    /**
     * ɾ����� 0.δɾ�� 1.��ɾ��
     */
    private Integer isdeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehousecode() {
        return warehousecode;
    }

    public void setWarehousecode(String warehousecode) {
        this.warehousecode = warehousecode;
    }

    public Integer getMechanismid() {
        return mechanismid;
    }

    public void setMechanismid(Integer mechanismid) {
        this.mechanismid = mechanismid;
    }

    public Integer getWarehousetype() {
        return warehousetype;
    }

    public void setWarehousetype(Integer warehousetype) {
        this.warehousetype = warehousetype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getDeliveryfeeaverykm() {
        return deliveryfeeaverykm;
    }

    public void setDeliveryfeeaverykm(BigDecimal deliveryfeeaverykm) {
        this.deliveryfeeaverykm = deliveryfeeaverykm;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getDeliveryradius() {
        return deliveryradius;
    }

    public void setDeliveryradius(BigDecimal deliveryradius) {
        this.deliveryradius = deliveryradius;
    }

    public String getMapcode() {
        return mapcode;
    }

    public void setMapcode(String mapcode) {
        this.mapcode = mapcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getStartsendnum() {
        return startsendnum;
    }

    public void setStartsendnum(Integer startsendnum) {
        this.startsendnum = startsendnum;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
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
        BmWarehouse other = (BmWarehouse) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWarehousecode() == null ? other.getWarehousecode() == null : this.getWarehousecode().equals(other.getWarehousecode()))
            && (this.getMechanismid() == null ? other.getMechanismid() == null : this.getMechanismid().equals(other.getMechanismid()))
            && (this.getWarehousetype() == null ? other.getWarehousetype() == null : this.getWarehousetype().equals(other.getWarehousetype()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDeliveryfeeaverykm() == null ? other.getDeliveryfeeaverykm() == null : this.getDeliveryfeeaverykm().equals(other.getDeliveryfeeaverykm()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getDeliveryradius() == null ? other.getDeliveryradius() == null : this.getDeliveryradius().equals(other.getDeliveryradius()))
            && (this.getMapcode() == null ? other.getMapcode() == null : this.getMapcode().equals(other.getMapcode()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getStartsendnum() == null ? other.getStartsendnum() == null : this.getStartsendnum().equals(other.getStartsendnum()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWarehousecode() == null) ? 0 : getWarehousecode().hashCode());
        result = prime * result + ((getMechanismid() == null) ? 0 : getMechanismid().hashCode());
        result = prime * result + ((getWarehousetype() == null) ? 0 : getWarehousetype().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDeliveryfeeaverykm() == null) ? 0 : getDeliveryfeeaverykm().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getDeliveryradius() == null) ? 0 : getDeliveryradius().hashCode());
        result = prime * result + ((getMapcode() == null) ? 0 : getMapcode().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getStartsendnum() == null) ? 0 : getStartsendnum().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", warehousecode=").append(warehousecode);
        sb.append(", mechanismid=").append(mechanismid);
        sb.append(", warehousetype=").append(warehousetype);
        sb.append(", address=").append(address);
        sb.append(", deliveryfeeaverykm=").append(deliveryfeeaverykm);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", deliveryradius=").append(deliveryradius);
        sb.append(", mapcode=").append(mapcode);
        sb.append(", tel=").append(tel);
        sb.append(", startsendnum=").append(startsendnum);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}