package com.atguigu.crud.bean;

public class Comment {
    private Integer commentId;

    private Integer scenicId;

    private String userName;

    private Integer userId;

    private Integer flag;

    private String visitorContent;

    private String adminContent;

    private String commentTime;

    private String wheelImgOne;

    private String scenicName;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getVisitorContent() {
        return visitorContent;
    }

    public void setVisitorContent(String visitorContent) {
        this.visitorContent = visitorContent == null ? null : visitorContent.trim();
    }

    public String getAdminContent() {
        return adminContent;
    }

    public void setAdminContent(String adminContent) {
        this.adminContent = adminContent == null ? null : adminContent.trim();
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public String getWheelImgOne() {
        return wheelImgOne;
    }

    public void setWheelImgOne(String wheelImgOne) {
        this.wheelImgOne = wheelImgOne == null ? null : wheelImgOne.trim();
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }
}