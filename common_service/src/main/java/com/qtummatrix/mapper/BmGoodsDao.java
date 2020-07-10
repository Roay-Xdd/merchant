package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmGoods;

public interface BmGoodsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmGoods record);

    int insertSelective(BmGoods record);

    BmGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmGoods record);

    int updateByPrimaryKeyWithBLOBs(BmGoods record);

    int updateByPrimaryKey(BmGoods record);
}