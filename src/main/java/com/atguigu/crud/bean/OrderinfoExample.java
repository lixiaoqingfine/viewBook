package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNull() {
            addCriterion("scenic_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("scenic_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("scenic_name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("scenic_name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("scenic_name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("scenic_name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("scenic_name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("scenic_name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("scenic_name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("scenic_name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("scenic_name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("scenic_name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicImgIsNull() {
            addCriterion("scenic_img is null");
            return (Criteria) this;
        }

        public Criteria andScenicImgIsNotNull() {
            addCriterion("scenic_img is not null");
            return (Criteria) this;
        }

        public Criteria andScenicImgEqualTo(String value) {
            addCriterion("scenic_img =", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotEqualTo(String value) {
            addCriterion("scenic_img <>", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgGreaterThan(String value) {
            addCriterion("scenic_img >", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_img >=", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgLessThan(String value) {
            addCriterion("scenic_img <", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgLessThanOrEqualTo(String value) {
            addCriterion("scenic_img <=", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgLike(String value) {
            addCriterion("scenic_img like", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotLike(String value) {
            addCriterion("scenic_img not like", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgIn(List<String> values) {
            addCriterion("scenic_img in", values, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotIn(List<String> values) {
            addCriterion("scenic_img not in", values, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgBetween(String value1, String value2) {
            addCriterion("scenic_img between", value1, value2, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotBetween(String value1, String value2) {
            addCriterion("scenic_img not between", value1, value2, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNull() {
            addCriterion("ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNotNull() {
            addCriterion("ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumEqualTo(Integer value) {
            addCriterion("ticket_num =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(Integer value) {
            addCriterion("ticket_num <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(Integer value) {
            addCriterion("ticket_num >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_num >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(Integer value) {
            addCriterion("ticket_num <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_num <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<Integer> values) {
            addCriterion("ticket_num in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<Integer> values) {
            addCriterion("ticket_num not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num not between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(Integer value) {
            addCriterion("ticket_price =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(Integer value) {
            addCriterion("ticket_price <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(Integer value) {
            addCriterion("ticket_price >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_price >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(Integer value) {
            addCriterion("ticket_price <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_price <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<Integer> values) {
            addCriterion("ticket_price in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<Integer> values) {
            addCriterion("ticket_price not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(Integer value1, Integer value2) {
            addCriterion("ticket_price between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_price not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryIsNull() {
            addCriterion("ticket_category is null");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryIsNotNull() {
            addCriterion("ticket_category is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryEqualTo(String value) {
            addCriterion("ticket_category =", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotEqualTo(String value) {
            addCriterion("ticket_category <>", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryGreaterThan(String value) {
            addCriterion("ticket_category >", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_category >=", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLessThan(String value) {
            addCriterion("ticket_category <", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLessThanOrEqualTo(String value) {
            addCriterion("ticket_category <=", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryLike(String value) {
            addCriterion("ticket_category like", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotLike(String value) {
            addCriterion("ticket_category not like", value, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryIn(List<String> values) {
            addCriterion("ticket_category in", values, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotIn(List<String> values) {
            addCriterion("ticket_category not in", values, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryBetween(String value1, String value2) {
            addCriterion("ticket_category between", value1, value2, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andTicketCategoryNotBetween(String value1, String value2) {
            addCriterion("ticket_category not between", value1, value2, "ticketCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIsNull() {
            addCriterion("order_comment is null");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIsNotNull() {
            addCriterion("order_comment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCommentEqualTo(Boolean value) {
            addCriterion("order_comment =", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotEqualTo(Boolean value) {
            addCriterion("order_comment <>", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentGreaterThan(Boolean value) {
            addCriterion("order_comment >", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_comment >=", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLessThan(Boolean value) {
            addCriterion("order_comment <", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("order_comment <=", value, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentIn(List<Boolean> values) {
            addCriterion("order_comment in", values, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotIn(List<Boolean> values) {
            addCriterion("order_comment not in", values, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("order_comment between", value1, value2, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_comment not between", value1, value2, "orderComment");
            return (Criteria) this;
        }

        public Criteria andOrderUsedIsNull() {
            addCriterion("order_used is null");
            return (Criteria) this;
        }

        public Criteria andOrderUsedIsNotNull() {
            addCriterion("order_used is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUsedEqualTo(Boolean value) {
            addCriterion("order_used =", value, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedNotEqualTo(Boolean value) {
            addCriterion("order_used <>", value, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedGreaterThan(Boolean value) {
            addCriterion("order_used >", value, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_used >=", value, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedLessThan(Boolean value) {
            addCriterion("order_used <", value, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedLessThanOrEqualTo(Boolean value) {
            addCriterion("order_used <=", value, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedIn(List<Boolean> values) {
            addCriterion("order_used in", values, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedNotIn(List<Boolean> values) {
            addCriterion("order_used not in", values, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedBetween(Boolean value1, Boolean value2) {
            addCriterion("order_used between", value1, value2, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderUsedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_used not between", value1, value2, "orderUsed");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeIsNull() {
            addCriterion("orderbuild_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeIsNotNull() {
            addCriterion("orderbuild_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeEqualTo(String value) {
            addCriterion("orderbuild_time =", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeNotEqualTo(String value) {
            addCriterion("orderbuild_time <>", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeGreaterThan(String value) {
            addCriterion("orderbuild_time >", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderbuild_time >=", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeLessThan(String value) {
            addCriterion("orderbuild_time <", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeLessThanOrEqualTo(String value) {
            addCriterion("orderbuild_time <=", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeLike(String value) {
            addCriterion("orderbuild_time like", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeNotLike(String value) {
            addCriterion("orderbuild_time not like", value, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeIn(List<String> values) {
            addCriterion("orderbuild_time in", values, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeNotIn(List<String> values) {
            addCriterion("orderbuild_time not in", values, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeBetween(String value1, String value2) {
            addCriterion("orderbuild_time between", value1, value2, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderbuildTimeNotBetween(String value1, String value2) {
            addCriterion("orderbuild_time not between", value1, value2, "orderbuildTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeIsNull() {
            addCriterion("orderuse_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeIsNotNull() {
            addCriterion("orderuse_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeEqualTo(String value) {
            addCriterion("orderuse_time =", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeNotEqualTo(String value) {
            addCriterion("orderuse_time <>", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeGreaterThan(String value) {
            addCriterion("orderuse_time >", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderuse_time >=", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeLessThan(String value) {
            addCriterion("orderuse_time <", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeLessThanOrEqualTo(String value) {
            addCriterion("orderuse_time <=", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeLike(String value) {
            addCriterion("orderuse_time like", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeNotLike(String value) {
            addCriterion("orderuse_time not like", value, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeIn(List<String> values) {
            addCriterion("orderuse_time in", values, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeNotIn(List<String> values) {
            addCriterion("orderuse_time not in", values, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeBetween(String value1, String value2) {
            addCriterion("orderuse_time between", value1, value2, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andOrderuseTimeNotBetween(String value1, String value2) {
            addCriterion("orderuse_time not between", value1, value2, "orderuseTime");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIsNull() {
            addCriterion("visitor_name is null");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIsNotNull() {
            addCriterion("visitor_name is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorNameEqualTo(String value) {
            addCriterion("visitor_name =", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotEqualTo(String value) {
            addCriterion("visitor_name <>", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameGreaterThan(String value) {
            addCriterion("visitor_name >", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_name >=", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLessThan(String value) {
            addCriterion("visitor_name <", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLessThanOrEqualTo(String value) {
            addCriterion("visitor_name <=", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameLike(String value) {
            addCriterion("visitor_name like", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotLike(String value) {
            addCriterion("visitor_name not like", value, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameIn(List<String> values) {
            addCriterion("visitor_name in", values, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotIn(List<String> values) {
            addCriterion("visitor_name not in", values, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameBetween(String value1, String value2) {
            addCriterion("visitor_name between", value1, value2, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorNameNotBetween(String value1, String value2) {
            addCriterion("visitor_name not between", value1, value2, "visitorName");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIsNull() {
            addCriterion("visitor_phone is null");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIsNotNull() {
            addCriterion("visitor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneEqualTo(String value) {
            addCriterion("visitor_phone =", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotEqualTo(String value) {
            addCriterion("visitor_phone <>", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneGreaterThan(String value) {
            addCriterion("visitor_phone >", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_phone >=", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLessThan(String value) {
            addCriterion("visitor_phone <", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLessThanOrEqualTo(String value) {
            addCriterion("visitor_phone <=", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLike(String value) {
            addCriterion("visitor_phone like", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotLike(String value) {
            addCriterion("visitor_phone not like", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIn(List<String> values) {
            addCriterion("visitor_phone in", values, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotIn(List<String> values) {
            addCriterion("visitor_phone not in", values, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneBetween(String value1, String value2) {
            addCriterion("visitor_phone between", value1, value2, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotBetween(String value1, String value2) {
            addCriterion("visitor_phone not between", value1, value2, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}