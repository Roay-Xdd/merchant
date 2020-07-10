package com.qtummatrix.mapper;

import com.qtummatrix.entity.SysPosition;

public interface SysPositionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPosition record);

    int insertSelective(SysPosition record);

    SysPosition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPosition record);

    int updateByPrimaryKey(SysPosition record);
}