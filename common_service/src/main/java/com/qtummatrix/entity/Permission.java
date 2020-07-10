package com.qtummatrix.entity;

import java.io.Serializable;

/**
 * permission
 * @author 
 */
public class Permission implements Serializable {
    /**
     * Ȩ��ID
     */
    private Integer id;

    /**
     * Ȩ������
     */
    private Integer permissionname;

    /**
     * ģ��ID
     */
    private Integer modelid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(Integer permissionname) {
        this.permissionname = permissionname;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
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
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPermissionname() == null ? other.getPermissionname() == null : this.getPermissionname().equals(other.getPermissionname()))
            && (this.getModelid() == null ? other.getModelid() == null : this.getModelid().equals(other.getModelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPermissionname() == null) ? 0 : getPermissionname().hashCode());
        result = prime * result + ((getModelid() == null) ? 0 : getModelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionname=").append(permissionname);
        sb.append(", modelid=").append(modelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}