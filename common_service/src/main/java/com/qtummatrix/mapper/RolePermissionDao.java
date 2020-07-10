package com.qtummatrix.mapper;

import com.qtummatrix.entity.RolePermission;

public interface RolePermissionDao {
    int deleteByPrimaryKey(Integer levelid);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer levelid);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}