package com.atguigu.crud.bean;

public class Orderinfo {
    private Integer orderId;

    private Integer userId;

    private Integer commentId;

    private String scenicName;

    private String scenicImg;

    private Integer ticketNum;

    private Integer ticketPrice;

    private String ticketCategory;

    private Boolean orderComment;

    private Boolean orderUsed;

    private String orderbuildTime;

    private String orderuseTime;

    private String visitorName;

    private String visitorPhone;

    private String code;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getScenicImg() {
        return scenicImg;
    }

    public void setScenicImg(String scenicImg) {
        this.scenicImg = scenicImg == null ? null : scenicImg.trim();
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(String ticketCategory) {
        this.ticketCategory = ticketCategory == null ? null : ticketCategory.trim();
    }

    public Boolean getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(Boolean orderComment) {
        this.orderComment = orderComment;
    }

    public Boolean getOrderUsed() {
        return orderUsed;
    }

    public void setOrderUsed(Boolean orderUsed) {
        this.orderUsed = orderUsed;
    }

    public String getOrderbuildTime() {
        return orderbuildTime;
    }

    public void setOrderbuildTime(String orderbuildTime) {
        this.orderbuildTime = orderbuildTime == null ? null : orderbuildTime.trim();
    }

    public String getOrderuseTime() {
        return orderuseTime;
    }

    public void setOrderuseTime(String orderuseTime) {
        this.orderuseTime = orderuseTime == null ? null : orderuseTime.trim();
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName == null ? null : visitorName.trim();
    }

    public String getVisitorPhone() {
        return visitorPhone;
    }

    public void setVisitorPhone(String visitorPhone) {
        this.visitorPhone = visitorPhone == null ? null : visitorPhone.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}