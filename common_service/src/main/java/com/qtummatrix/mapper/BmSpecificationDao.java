package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmSpecification;

public interface BmSpecificationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmSpecification record);

    int insertSelective(BmSpecification record);

    BmSpecification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmSpecification record);

    int updateByPrimaryKeyWithBLOBs(BmSpecification record);

    int updateByPrimaryKey(BmSpecification record);
}