package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmCategory;

public interface BmCategoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmCategory record);

    int insertSelective(BmCategory record);

    BmCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmCategory record);

    int updateByPrimaryKey(BmCategory record);
}