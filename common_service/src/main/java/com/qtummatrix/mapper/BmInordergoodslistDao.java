package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmInordergoodslist;

public interface BmInordergoodslistDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmInordergoodslist record);

    int insertSelective(BmInordergoodslist record);

    BmInordergoodslist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmInordergoodslist record);

    int updateByPrimaryKey(BmInordergoodslist record);
}