package com.qtummatrix.mapper;

import com.qtummatrix.bean.F_NewGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface F_NewGoodsMapper {
    List<F_NewGoods> selectnewgoods();
}
