package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmSellermechanism;

public interface BmSellermechanismDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmSellermechanism record);

    int insertSelective(BmSellermechanism record);

    BmSellermechanism selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmSellermechanism record);

    int updateByPrimaryKey(BmSellermechanism record);
}