package com.atguigu.crud.bean;

public class Address {
    private Integer addressIdd;

    private Integer worldId;

    private String addressName;

    public Integer getAddressIdd() {
        return addressIdd;
    }

    public void setAddressIdd(Integer addressIdd) {
        this.addressIdd = addressIdd;
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }
}