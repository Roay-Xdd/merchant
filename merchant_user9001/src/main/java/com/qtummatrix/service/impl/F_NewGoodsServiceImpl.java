package com.qtummatrix.service.impl;

import com.qtummatrix.bean.F_NewGoods;
import com.qtummatrix.mapper.F_NewGoodsMapper;
import com.qtummatrix.service.F_NewGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class F_NewGoodsServiceImpl implements F_NewGoodsService {

    @Resource
    private F_NewGoodsMapper f_newGoodsMapper;

    @Override
    public List<F_NewGoods> selectnewgoods() {
        return f_newGoodsMapper.selectnewgoods();
    }
}
