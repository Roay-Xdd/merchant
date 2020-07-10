package com.qtummatrix.mapper;

import com.qtummatrix.entity.SysShoptype;

public interface SysShoptypeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysShoptype record);

    int insertSelective(SysShoptype record);

    SysShoptype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysShoptype record);

    int updateByPrimaryKey(SysShoptype record);
}