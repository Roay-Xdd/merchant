package com.qtummatrix.mapper;

import com.qtummatrix.bean.GoodsInfoBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.qtummatrix.entity.BmCategory;

import java.util.List;


/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/13 19:48
 */
@Mapper
public interface GoodsInfoMapper {

    /**
     * 查询商品信息
     * @param bname     商品品牌名称
     * @param goodsName 商品名称
     * @return
     */
    List<GoodsInfoBean> selectGoodsInfo(@Param("bname") String bname, @Param("goodsName") String goodsName);

    /**
     * 查询所有的父类目
     * @return
     */
    List<BmCategory> selectAllPCategory();

    /**
     * 根据parentId查询子类目
     * @param parentId
     * @return
     */
    List<BmCategory> selectChildCategory(Integer parentId);

    /**
     * 查询父类目所对应的商品信息
     * @param id
     * @return
     */
    List<GoodsInfoBean> selectGoodsInfoByCateParentId(Integer id);


    List<GoodsInfoBean> selectGoodsInfoByCateParentIds(@Param("id") Integer id, @Param("zonghe") Integer zonghe, @Param("jiage") Integer jiage, @Param("xiaoliang") Integer xiaoliang);


    List<GoodsInfoBean> selectGoodsInfoByCateParentIdss(@Param("id") Integer id, @Param("zonghe") Integer zonghe, @Param("jiage") Integer jiage, @Param("xiaoliang") Integer xiaoliang);


    /**
     * 根据商品详情id查询商品详情
     * @param sid
     * @return
     */
    GoodsInfoBean selectGoodsInfoBySid(Integer sid);
}
