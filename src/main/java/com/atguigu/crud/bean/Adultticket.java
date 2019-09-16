package com.atguigu.crud.bean;

public class Adultticket {
    private Integer adultId;

    private String categoryName;

    private Integer price;

    private Integer saleNum;

    private Integer ticketNum;

    public Integer getAdultId() {
        return adultId;
    }

    public void setAdultId(Integer adultId) {
        this.adultId = adultId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }
}