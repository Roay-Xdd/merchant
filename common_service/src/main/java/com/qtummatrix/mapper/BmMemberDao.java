package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmMember;

public interface BmMemberDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BmMember record);

    int insertSelective(BmMember record);

    BmMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BmMember record);

    int updateByPrimaryKey(BmMember record);
}