package com.qtummatrix.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * 购物车
 * @create 2020-07-08 16:06
 */
public class WSY_CartBean implements Serializable {

    /*
       cartmap: 商品map集合
       String: 商品id
       CartItem: 商品项
    */
    private Map<String,WSY_CartItemBean> CartMap;

    public WSY_CartBean(){
        this.CartMap = new HashMap<>();
    }

    /**
     * 添加商品到购物车
     * @param cartItem
     */
    @JsonIgnore
    public void addToCart(WSY_CartItemBean cartItem, Integer num) {
        /*
            1.判断当前CartMap中是否存在cartItem, 存在就追加数量，不存在就加入购物车
         */
        boolean b = this.CartMap.containsKey(cartItem.getId().toString());
        if (b){ //存在，追加数量
            WSY_CartItemBean item = this.CartMap.get(cartItem.getId().toString());
            item.setGoodsNum(item.getGoodsNum()+num);
            cartItem.setTotalPrice(cartItem.getPrice().multiply(new BigDecimal(item.getGoodsNum())));
            this.CartMap.put(cartItem.getId().toString(), item);
        }else { //不存在，添加进map
            cartItem.setGoodsNum(num);
            cartItem.setTotalPrice(cartItem.getPrice().multiply(new BigDecimal(num)));
            this.CartMap.put(cartItem.getId().toString(), cartItem);
        }
    }

    /**
     * 从购物车删除商品
     * @param goodsId
     */
    @JsonIgnore
    public void deleteFromCart(Integer goodsId) {
        boolean b = this.CartMap.containsKey(goodsId.toString());
        if (b){
            this.CartMap.remove(goodsId.toString());
        }
    }

    /**
     * 修改购物车中指定商品数量
     * @param goodsId 商品id
     * @param num 新数量
     */
    public void updateGoodsNum(Integer goodsId, Integer num){
        boolean b = this.CartMap.containsKey(goodsId.toString());
        if (b) {
            WSY_CartItemBean item = this.CartMap.get(goodsId.toString());
            item.setGoodsNum(num);
            item.setTotalPrice(item.getPrice().multiply(new BigDecimal(num)));
            this.CartMap.put(goodsId.toString(), item);
        }
    }

    public Map<String, WSY_CartItemBean> getCartMap() {
        return CartMap;
    }

    public void setCartMap(Map<String, WSY_CartItemBean> cartMap) {
        CartMap = cartMap;
    }
}

