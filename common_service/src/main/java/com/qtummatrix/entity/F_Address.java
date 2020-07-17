package com.qtummatrix.entity;

public class F_Address {
    private Integer addId;
    private Integer sellerId;//店铺id
    private String contacter;//联系人
    private String tel;//联系电话
    private String mainAddress;//大概地址

    private String address;//详细地址

    private Integer isDefault;//是否默认地址 0.不是 1.是

    private Integer isDeleted;//删除标记 0.未删除 1.已删除
    private String lng;//经度

    private String lat;//纬度

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "F_Address{" +
                "addId=" + addId +
                ", sellerId=" + sellerId +
                ", contacter='" + contacter + '\'' +
                ", tel='" + tel + '\'' +
                ", mainAddress='" + mainAddress + '\'' +
                ", address='" + address + '\'' +
                ", isDefault=" + isDefault +
                ", isDeleted=" + isDeleted +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
