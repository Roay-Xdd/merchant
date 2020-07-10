package com.qtummatrix.mapper;

import com.qtummatrix.entity.TArea;

public interface TAreaDao {
    int deleteByPrimaryKey(Integer areaId);

    int insert(TArea record);

    int insertSelective(TArea record);

    TArea selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
}