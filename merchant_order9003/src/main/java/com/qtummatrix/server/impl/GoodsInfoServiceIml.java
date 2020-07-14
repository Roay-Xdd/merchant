package com.qtummatrix.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qtummatrix.bean.GoodsInfoBean;
import com.qtummatrix.entity.BmCategory;
import com.qtummatrix.mapper.GoodsInfoMapper;

import com.qtummatrix.server.GoodsInfoService;
import com.qtummatrix.util.CacheResult;
import com.qtummatrix.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/13 19:37
 */
@Service
@Transactional
public class GoodsInfoServiceIml implements GoodsInfoService {

    @Autowired(required = false)
    private GoodsInfoMapper goodsInfoMapper;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 方法描述: 得到查询的商品信息(分页)
     * @Author: Shi JiuYue
     * @Date 20:37 2020/7/13
     **/
    @Override
    public PageInfo getSelectGoodsInfo(Integer pageNo, Integer pageNum, String bname, String goodsName) {
        PageHelper.startPage(pageNo,pageNum);
        List<GoodsInfoBean> goodsInfoBeans = goodsInfoMapper.selectGoodsInfo(bname, goodsName);
        PageInfo<GoodsInfoBean> pageInfo = new PageInfo<>(goodsInfoBeans);


        return pageInfo;
    }

    /**
     * 方法描述: 得到所有的父类目名称
     * @Author: Shi JiuYue
     * @Date 20:40 2020/7/13
     **/
    @Override
    public List<BmCategory> getSelectAllPCategoryInfo() {

        //从redis中先查询一下是否存在相应的key
        boolean b = redisUtil.hasKey("GOODS_PARENT_CATEGORY");
        System.out.println(b);

        //当缓存不存在时，
        if(b!=true){
            List<BmCategory> bmCategoryList = goodsInfoMapper.selectAllPCategory();
            //将内容存到redis中
            redisUtil.set("GOODS_PARENT_CATEGORY",bmCategoryList,60 * 60L);
            return bmCategoryList;
        }else {
            CacheResult cacheResult = (CacheResult) redisUtil.get("GOODS_PARENT_CATEGORY");
            List<BmCategory> bmCategoryList = (List<BmCategory>) cacheResult.getData();
            return bmCategoryList;
        }
    }

    /**
     * 方法描述: 得到父id下的所有子类目
     * @Author: Shi JiuYue
     * @Date 21:15 2020/7/13
     **/
    @Override
    public List<BmCategory> getAllChildCategoryByPId(Integer categoryId) {

        boolean b = redisUtil.hasKey("GOODS_CHILD_CATEGORY" + categoryId);
        if(b==false){
            List<BmCategory>categoryList = goodsInfoMapper.selectChildCategory(categoryId);
            //添加到redis中
            redisUtil.set("GOODS_CHILD_CATEGORY"+categoryId,categoryList,60*60L);
            return categoryList;
        }
        else{
            CacheResult cacheResult = (CacheResult) redisUtil.get("GOODS_CHILD_CATEGORY"+categoryId);
                List<BmCategory>list  = (List<BmCategory>) cacheResult.getData();
                return list;
        }
    }


    /**
     * 方法描述: 得到父类目所对应的商品
     * @Author: Shi JiuYue
     * @Date 2020/7/14
     **/
    @Override
    public PageInfo getSelectGoodsInfoByCateId(Integer pageNo, Integer pageNum, Integer id) {

        PageHelper.startPage(pageNo,pageNum);

        List<GoodsInfoBean> goodsInfoBeanList = goodsInfoMapper.selectGoodsInfoByCateParentId(id);
        PageInfo<GoodsInfoBean>info = new PageInfo<>(goodsInfoBeanList);

        return info;

    }


    /**
     * 方法描述: 根据商品id得到商品信息
     * @Author: Shi JiuYue
     * @Date 9:26 2020/7/14
     **/
    @Override
    public GoodsInfoBean getSelectGoodsInfoBySid(Integer sid) {

        //查询redis缓存
        boolean b = redisUtil.hasKey("GOODS_DETAILS" + sid);
        if(b==false){
            GoodsInfoBean goodsInfoBean = goodsInfoMapper.selectGoodsInfoBySid(sid);
            //将内容放入缓存
            redisUtil.set("GOODS_DETAILS"+sid,goodsInfoBean,60*60L);

            return goodsInfoBean;
        }else {
            CacheResult cacheResult = (CacheResult) redisUtil.get("GOODS_DETAILS" + sid);
            GoodsInfoBean goodsInfoBean = (GoodsInfoBean) cacheResult.getData();
            return goodsInfoBean;
        }

    }


    /**
     * 方法描述: 综合、销量、价格 （测试）
     * @Author: Shi JiuYue
     * @Date 9:30 2020/7/14
     **/
    @Override
    public PageInfo getSelectGoodsInfoByCateIds(Integer pageNo, Integer pageNum, Integer id, Integer zonghe, Integer jiage, Integer xiaoliang) {

        PageHelper.startPage(pageNo,pageNum);
        List<GoodsInfoBean>list = goodsInfoMapper.selectGoodsInfoByCateParentIds(id,zonghe,jiage,xiaoliang);
        PageInfo<GoodsInfoBean> info = new PageInfo<>(list);

        return info;
    }

    /**
     * 方法描述: 测试
     * @Author: Shi JiuYue
     * @Date 9:32 2020/7/14
     **/
    @Override
    public PageInfo getSelectGoodsInfoByCateIdss(Integer pageNo, Integer pageNum, Integer id, Integer zonghe, Integer jiage, Integer xiaoliang) {
        PageHelper.startPage(pageNo,pageNum);
        List<GoodsInfoBean>list = goodsInfoMapper.selectGoodsInfoByCateParentIdss(id,zonghe,jiage,xiaoliang);
        PageInfo<GoodsInfoBean> info = new PageInfo<>(list);

        return info;
    }
}
