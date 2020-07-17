package com.qtummatrix.bean;

/**
 * @ClassName PWL_OftenBuyList
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/13 14:33
 * @Version 1.0
 */
public class PWL_OfenSalesList {
//  商品id
    private Integer id;
//  已买总数
    private String totalQuantity;
//  商品名字
    private String goodsName;
//  商品数量
    private  String price;
//  商品图片
    private String goodsImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(String totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    @Override
    public String toString() {
        return "PWL_OfenSalesList{" +
                "id=" + id +
                ", totalQuantity='" + totalQuantity + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price='" + price + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                '}';
    }
}
