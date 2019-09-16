package com.atguigu.crud.bean;

public class Childticket {
    private Integer childId;

    private String childCategoryName;

    private Integer childPrice;

    private Integer childSaleNum;

    private Integer childTicketNum;

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getChildCategoryName() {
        return childCategoryName;
    }

    public void setChildCategoryName(String childCategoryName) {
        this.childCategoryName = childCategoryName == null ? null : childCategoryName.trim();
    }

    public Integer getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(Integer childPrice) {
        this.childPrice = childPrice;
    }

    public Integer getChildSaleNum() {
        return childSaleNum;
    }

    public void setChildSaleNum(Integer childSaleNum) {
        this.childSaleNum = childSaleNum;
    }

    public Integer getChildTicketNum() {
        return childTicketNum;
    }

    public void setChildTicketNum(Integer childTicketNum) {
        this.childTicketNum = childTicketNum;
    }
}