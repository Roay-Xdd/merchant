package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmAddress;

public interface BmAddressDao {
    int deleteByPrimaryKey(Integer addid);

    int insert(BmAddress record);

    int insertSelective(BmAddress record);

    BmAddress selectByPrimaryKey(Integer addid);

    int updateByPrimaryKeySelective(BmAddress record);

    int updateByPrimaryKey(BmAddress record);
}