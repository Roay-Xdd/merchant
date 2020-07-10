package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmWarehouse;

public interface BmWarehouseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmWarehouse record);

    int insertSelective(BmWarehouse record);

    BmWarehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmWarehouse record);

    int updateByPrimaryKey(BmWarehouse record);
}