package com.qtummatrix.mapper;

import com.qtummatrix.entity.SysMechanismlevel;

public interface SysMechanismlevelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMechanismlevel record);

    int insertSelective(SysMechanismlevel record);

    SysMechanismlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMechanismlevel record);

    int updateByPrimaryKey(SysMechanismlevel record);
}