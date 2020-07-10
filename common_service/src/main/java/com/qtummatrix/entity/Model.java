package com.qtummatrix.entity;

import java.io.Serializable;

/**
 * model
 * @author 
 */
public class Model implements Serializable {
    /**
     * ģ��ID
     */
    private Integer id;

    /**
     * ��ģ��id
     */
    private Integer parentid;

    /**
     * ģ������
     */
    private String modelname;

    /**
     * ��תҳ��·��
     */
    private String modelurl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelurl() {
        return modelurl;
    }

    public void setModelurl(String modelurl) {
        this.modelurl = modelurl;
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
        Model other = (Model) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getModelname() == null ? other.getModelname() == null : this.getModelname().equals(other.getModelname()))
            && (this.getModelurl() == null ? other.getModelurl() == null : this.getModelurl().equals(other.getModelurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getModelname() == null) ? 0 : getModelname().hashCode());
        result = prime * result + ((getModelurl() == null) ? 0 : getModelurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentid=").append(parentid);
        sb.append(", modelname=").append(modelname);
        sb.append(", modelurl=").append(modelurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}