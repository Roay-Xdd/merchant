package com.qtummatrix.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * bm_inorderlist
 * @author 
 */
public class BmInorderlist implements Serializable {
    /**
     * ����id
     */
    private String orderid;

    /**
     * ����id
     */
    private Integer sellerid;

    /**
     * ���ͷ�
     */
    private BigDecimal deliveryfee;

    /**
     * �������
     */
    private BigDecimal amount;

    /**
     * ֧����ʽ 1.�������� 2.����֧��
     */
    private Integer paytype;

    /**
     * �������� ��֧��=1 ��֧���������=2 ������������=3 ���������װ��=4 ��װ����������=5���ѷ�����������=6 �ѽ���=7
     */
    private Integer orderstep;

    /**
     * ���͵�ַid
     */
    private String deliveryaddid;

    /**
     * ��������ʱ��
     */
    private Date createtime;

    /**
     * ֧��ʱ��
     */
    private Date paytime;

    /**
     * ����״̬ ��ȡ��=0 ��������=1 �Ѿ����=2 ȡ����=3 ��ʱ=4
     */
    private Integer orderstate;

    /**
     * �ֿ������Աid
     */
    private Integer warehouserid;

    /**
     * ������Աid
     */
    private Integer logisticsid;

    /**
     * ������ע
     */
    private String mark;

    /**
     * �������Ͳ����¼
     */
    private String ordersteprecord;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public BigDecimal getDeliveryfee() {
        return deliveryfee;
    }

    public void setDeliveryfee(BigDecimal deliveryfee) {
        this.deliveryfee = deliveryfee;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getOrderstep() {
        return orderstep;
    }

    public void setOrderstep(Integer orderstep) {
        this.orderstep = orderstep;
    }

    public String getDeliveryaddid() {
        return deliveryaddid;
    }

    public void setDeliveryaddid(String deliveryaddid) {
        this.deliveryaddid = deliveryaddid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getWarehouserid() {
        return warehouserid;
    }

    public void setWarehouserid(Integer warehouserid) {
        this.warehouserid = warehouserid;
    }

    public Integer getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(Integer logisticsid) {
        this.logisticsid = logisticsid;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrdersteprecord() {
        return ordersteprecord;
    }

    public void setOrdersteprecord(String ordersteprecord) {
        this.ordersteprecord = ordersteprecord;
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
        BmInorderlist other = (BmInorderlist) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getSellerid() == null ? other.getSellerid() == null : this.getSellerid().equals(other.getSellerid()))
            && (this.getDeliveryfee() == null ? other.getDeliveryfee() == null : this.getDeliveryfee().equals(other.getDeliveryfee()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getOrderstep() == null ? other.getOrderstep() == null : this.getOrderstep().equals(other.getOrderstep()))
            && (this.getDeliveryaddid() == null ? other.getDeliveryaddid() == null : this.getDeliveryaddid().equals(other.getDeliveryaddid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getOrderstate() == null ? other.getOrderstate() == null : this.getOrderstate().equals(other.getOrderstate()))
            && (this.getWarehouserid() == null ? other.getWarehouserid() == null : this.getWarehouserid().equals(other.getWarehouserid()))
            && (this.getLogisticsid() == null ? other.getLogisticsid() == null : this.getLogisticsid().equals(other.getLogisticsid()))
            && (this.getMark() == null ? other.getMark() == null : this.getMark().equals(other.getMark()))
            && (this.getOrdersteprecord() == null ? other.getOrdersteprecord() == null : this.getOrdersteprecord().equals(other.getOrdersteprecord()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getSellerid() == null) ? 0 : getSellerid().hashCode());
        result = prime * result + ((getDeliveryfee() == null) ? 0 : getDeliveryfee().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getOrderstep() == null) ? 0 : getOrderstep().hashCode());
        result = prime * result + ((getDeliveryaddid() == null) ? 0 : getDeliveryaddid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getOrderstate() == null) ? 0 : getOrderstate().hashCode());
        result = prime * result + ((getWarehouserid() == null) ? 0 : getWarehouserid().hashCode());
        result = prime * result + ((getLogisticsid() == null) ? 0 : getLogisticsid().hashCode());
        result = prime * result + ((getMark() == null) ? 0 : getMark().hashCode());
        result = prime * result + ((getOrdersteprecord() == null) ? 0 : getOrdersteprecord().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", sellerid=").append(sellerid);
        sb.append(", deliveryfee=").append(deliveryfee);
        sb.append(", amount=").append(amount);
        sb.append(", paytype=").append(paytype);
        sb.append(", orderstep=").append(orderstep);
        sb.append(", deliveryaddid=").append(deliveryaddid);
        sb.append(", createtime=").append(createtime);
        sb.append(", paytime=").append(paytime);
        sb.append(", orderstate=").append(orderstate);
        sb.append(", warehouserid=").append(warehouserid);
        sb.append(", logisticsid=").append(logisticsid);
        sb.append(", mark=").append(mark);
        sb.append(", ordersteprecord=").append(ordersteprecord);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}