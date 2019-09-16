package com.atguigu.crud.bean;

public class Olderticket {
    private Integer olderId;

    private String olderCategoryName;

    private Integer olderPrice;

    private Integer olderSaleNum;

    private Integer olderTicketNum;

    public Integer getOlderId() {
        return olderId;
    }

    public void setOlderId(Integer olderId) {
        this.olderId = olderId;
    }

    public String getOlderCategoryName() {
        return olderCategoryName;
    }

    public void setOlderCategoryName(String olderCategoryName) {
        this.olderCategoryName = olderCategoryName == null ? null : olderCategoryName.trim();
    }

    public Integer getOlderPrice() {
        return olderPrice;
    }

    public void setOlderPrice(Integer olderPrice) {
        this.olderPrice = olderPrice;
    }

    public Integer getOlderSaleNum() {
        return olderSaleNum;
    }

    public void setOlderSaleNum(Integer olderSaleNum) {
        this.olderSaleNum = olderSaleNum;
    }

    public Integer getOlderTicketNum() {
        return olderTicketNum;
    }

    public void setOlderTicketNum(Integer olderTicketNum) {
        this.olderTicketNum = olderTicketNum;
    }
}