package com.qtummatrix.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_mechanism
 * @author 
 */
public class SysMechanism implements Serializable {
    private Integer id;

    /**
     * �������
     */
    private String mechanismcode;

    /**
     * ��������
     */
    private String mechanismname;

    /**
     * ����id
     */
    private Integer levelid;

    /**
     * ������������
     */
    private String addvcd;

    /**
     * ��½����
     */
    private String password;

    /**
     * ������ϵ�绰
     */
    private String tel;

    /**
     * �ϼ�����id
     */
    private Integer parentid;

    /**
     * ����ʱ��
     */
    private Date createtime;

    /**
     * ɾ����� 0.δɾ�� 1.��ɾ��
     */
    private Integer isdeleted;

    private String city;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMechanismcode() {
        return mechanismcode;
    }

    public void setMechanismcode(String mechanismcode) {
        this.mechanismcode = mechanismcode;
    }

    public String getMechanismname() {
        return mechanismname;
    }

    public void setMechanismname(String mechanismname) {
        this.mechanismname = mechanismname;
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getAddvcd() {
        return addvcd;
    }

    public void setAddvcd(String addvcd) {
        this.addvcd = addvcd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        SysMechanism other = (SysMechanism) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMechanismcode() == null ? other.getMechanismcode() == null : this.getMechanismcode().equals(other.getMechanismcode()))
            && (this.getMechanismname() == null ? other.getMechanismname() == null : this.getMechanismname().equals(other.getMechanismname()))
            && (this.getLevelid() == null ? other.getLevelid() == null : this.getLevelid().equals(other.getLevelid()))
            && (this.getAddvcd() == null ? other.getAddvcd() == null : this.getAddvcd().equals(other.getAddvcd()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMechanismcode() == null) ? 0 : getMechanismcode().hashCode());
        result = prime * result + ((getMechanismname() == null) ? 0 : getMechanismname().hashCode());
        result = prime * result + ((getLevelid() == null) ? 0 : getLevelid().hashCode());
        result = prime * result + ((getAddvcd() == null) ? 0 : getAddvcd().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mechanismcode=").append(mechanismcode);
        sb.append(", mechanismname=").append(mechanismname);
        sb.append(", levelid=").append(levelid);
        sb.append(", addvcd=").append(addvcd);
        sb.append(", password=").append(password);
        sb.append(", tel=").append(tel);
        sb.append(", parentid=").append(parentid);
        sb.append(", createtime=").append(createtime);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", city=").append(city);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}