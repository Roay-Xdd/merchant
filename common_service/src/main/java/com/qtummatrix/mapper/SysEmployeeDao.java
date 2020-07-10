package com.qtummatrix.mapper;

import com.qtummatrix.entity.SysEmployee;

public interface SysEmployeeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);
}