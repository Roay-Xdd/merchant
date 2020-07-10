package com.qtummatrix.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * bm_member
 * @author 
 */
public class BmMember implements Serializable {
    private Integer id;

    /**
     * ��������
     */
    private String businessname;

    /**
     * ���ͽ��
     */
    private BigDecimal deliveryfee;

    /**
     * ���;���
     */
    private BigDecimal deliveryradius;

    /**
     * ���̵�ַ
     */
    private String address;

    /**
     * ����ͼƬ
     */
    private String backimg;

    /**
     * ��ַ����
     */
    private String mapcode;

    /**
     * ���״̬ 0.δ��� 1.�����
     */
    private Integer state;

    /**
     * Ӫҵ״̬ 0.Ъҵ 1.Ӫҵ
     */
    private Integer workstate;

    /**
     * �绰����
     */
    private String tel;

    /**
     * ��½����
     */
    private String password;

    /**
     * �ϰ�����
     */
    private String truename;

    /**
     * ��������
     */
    private String shoptype;

    /**
     * ���̵�½��ʶ
     */
    private String token;

    /**
     * �˻����
     */
    private BigDecimal amount;

    private Date addtime;

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

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public BigDecimal getDeliveryfee() {
        return deliveryfee;
    }

    public void setDeliveryfee(BigDecimal deliveryfee) {
        this.deliveryfee = deliveryfee;
    }

    public BigDecimal getDeliveryradius() {
        return deliveryradius;
    }

    public void setDeliveryradius(BigDecimal deliveryradius) {
        this.deliveryradius = deliveryradius;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBackimg() {
        return backimg;
    }

    public void setBackimg(String backimg) {
        this.backimg = backimg;
    }

    public String getMapcode() {
        return mapcode;
    }

    public void setMapcode(String mapcode) {
        this.mapcode = mapcode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getWorkstate() {
        return workstate;
    }

    public void setWorkstate(Integer workstate) {
        this.workstate = workstate;
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

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
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
        BmMember other = (BmMember) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBusinessname() == null ? other.getBusinessname() == null : this.getBusinessname().equals(other.getBusinessname()))
            && (this.getDeliveryfee() == null ? other.getDeliveryfee() == null : this.getDeliveryfee().equals(other.getDeliveryfee()))
            && (this.getDeliveryradius() == null ? other.getDeliveryradius() == null : this.getDeliveryradius().equals(other.getDeliveryradius()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBackimg() == null ? other.getBackimg() == null : this.getBackimg().equals(other.getBackimg()))
            && (this.getMapcode() == null ? other.getMapcode() == null : this.getMapcode().equals(other.getMapcode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getWorkstate() == null ? other.getWorkstate() == null : this.getWorkstate().equals(other.getWorkstate()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTruename() == null ? other.getTruename() == null : this.getTruename().equals(other.getTruename()))
            && (this.getShoptype() == null ? other.getShoptype() == null : this.getShoptype().equals(other.getShoptype()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBusinessname() == null) ? 0 : getBusinessname().hashCode());
        result = prime * result + ((getDeliveryfee() == null) ? 0 : getDeliveryfee().hashCode());
        result = prime * result + ((getDeliveryradius() == null) ? 0 : getDeliveryradius().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBackimg() == null) ? 0 : getBackimg().hashCode());
        result = prime * result + ((getMapcode() == null) ? 0 : getMapcode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getWorkstate() == null) ? 0 : getWorkstate().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTruename() == null) ? 0 : getTruename().hashCode());
        result = prime * result + ((getShoptype() == null) ? 0 : getShoptype().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
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
        sb.append(", businessname=").append(businessname);
        sb.append(", deliveryfee=").append(deliveryfee);
        sb.append(", deliveryradius=").append(deliveryradius);
        sb.append(", address=").append(address);
        sb.append(", backimg=").append(backimg);
        sb.append(", mapcode=").append(mapcode);
        sb.append(", state=").append(state);
        sb.append(", workstate=").append(workstate);
        sb.append(", tel=").append(tel);
        sb.append(", password=").append(password);
        sb.append(", truename=").append(truename);
        sb.append(", shoptype=").append(shoptype);
        sb.append(", token=").append(token);
        sb.append(", amount=").append(amount);
        sb.append(", addtime=").append(addtime);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}