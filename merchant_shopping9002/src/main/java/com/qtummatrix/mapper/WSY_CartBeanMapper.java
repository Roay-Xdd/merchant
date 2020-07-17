package com.qtummatrix.mapper;

import com.qtummatrix.bean.WSY_CartItemBean;
import com.qtummatrix.entity.BmInordergoodslist;
import com.qtummatrix.entity.BmInorderlist;
import com.qtummatrix.entity.BmMember;
import com.qtummatrix.entity.BmSpecification;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WSY_CartBeanMapper {

    //通过规格ID查询商品
    WSY_CartItemBean selectCartItemBySpecificationId(Integer id);

    //添加订单商品信息
    int insertOrderGoods(BmInordergoodslist record);

    //生成订单
    int insertOrder(BmInorderlist record);

//    //根据订单ID查询订单
//    BmInorderlist selectByOrderId(String orderId);

    //根据
//    int updateByPrimaryKeySelective(BmInorderlist record);

    //
    int updateByPrimaryKeySelective(BmSpecification record);

    BmMember selectMemberById(Integer id);

    int updateMember(BmMember member);


}
