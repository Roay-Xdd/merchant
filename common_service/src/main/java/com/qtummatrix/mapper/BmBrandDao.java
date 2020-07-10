package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmBrand;

public interface BmBrandDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmBrand record);

    int insertSelective(BmBrand record);

    BmBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmBrand record);

    int updateByPrimaryKey(BmBrand record);
}