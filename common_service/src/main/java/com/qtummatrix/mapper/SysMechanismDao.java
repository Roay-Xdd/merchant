package com.qtummatrix.mapper;

import com.qtummatrix.entity.SysMechanism;

public interface SysMechanismDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMechanism record);

    int insertSelective(SysMechanism record);

    SysMechanism selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMechanism record);

    int updateByPrimaryKey(SysMechanism record);
}