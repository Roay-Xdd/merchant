package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmInorderlist;

public interface BmInorderlistDao {
    int deleteByPrimaryKey(String orderid);

    int insert(BmInorderlist record);

    int insertSelective(BmInorderlist record);

    BmInorderlist selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(BmInorderlist record);

    int updateByPrimaryKeyWithBLOBs(BmInorderlist record);

    int updateByPrimaryKey(BmInorderlist record);
}