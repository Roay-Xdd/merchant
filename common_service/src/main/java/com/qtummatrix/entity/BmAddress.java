package com.qtummatrix.entity;

import java.io.Serializable;

/**
 * bm_address
 * @author 
 */
public class BmAddress implements Serializable {
    private Integer addid;

    /**
     * ����id
     */
    private Integer sellerid;

    /**
     * ��ϵ��
     */
    private String contacter;

    /**
     * ��ϵ�绰
     */
    private String tel;

    /**
     * ��ŵ�ַ
     */
    private String mainaddress;

    /**
     * ��ϸ��ַ
     */
    private String address;

    /**
     * �Ƿ�Ĭ�ϵ�ַ 0.���� 1.��
     */
    private Integer isdefault;

    /**
     * ɾ����� 0.δɾ�� 1.��ɾ��
     */
    private Integer isdeleted;

    /**
     * ����
     */
    private String lng;

    /**
     * γ��
     */
    private String lat;

    private static final long serialVersionUID = 1L;

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMainaddress() {
        return mainaddress;
    }

    public void setMainaddress(String mainaddress) {
        this.mainaddress = mainaddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
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
        BmAddress other = (BmAddress) that;
        return (this.getAddid() == null ? other.getAddid() == null : this.getAddid().equals(other.getAddid()))
            && (this.getSellerid() == null ? other.getSellerid() == null : this.getSellerid().equals(other.getSellerid()))
            && (this.getContacter() == null ? other.getContacter() == null : this.getContacter().equals(other.getContacter()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getMainaddress() == null ? other.getMainaddress() == null : this.getMainaddress().equals(other.getMainaddress()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getIsdefault() == null ? other.getIsdefault() == null : this.getIsdefault().equals(other.getIsdefault()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getLng() == null ? other.getLng() == null : this.getLng().equals(other.getLng()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddid() == null) ? 0 : getAddid().hashCode());
        result = prime * result + ((getSellerid() == null) ? 0 : getSellerid().hashCode());
        result = prime * result + ((getContacter() == null) ? 0 : getContacter().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getMainaddress() == null) ? 0 : getMainaddress().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getIsdefault() == null) ? 0 : getIsdefault().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getLng() == null) ? 0 : getLng().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addid=").append(addid);
        sb.append(", sellerid=").append(sellerid);
        sb.append(", contacter=").append(contacter);
        sb.append(", tel=").append(tel);
        sb.append(", mainaddress=").append(mainaddress);
        sb.append(", address=").append(address);
        sb.append(", isdefault=").append(isdefault);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}