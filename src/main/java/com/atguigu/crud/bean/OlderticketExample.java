package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class OlderticketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderticketExample() {
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

        public Criteria andOlderIdIsNull() {
            addCriterion("older_id is null");
            return (Criteria) this;
        }

        public Criteria andOlderIdIsNotNull() {
            addCriterion("older_id is not null");
            return (Criteria) this;
        }

        public Criteria andOlderIdEqualTo(Integer value) {
            addCriterion("older_id =", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotEqualTo(Integer value) {
            addCriterion("older_id <>", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdGreaterThan(Integer value) {
            addCriterion("older_id >", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_id >=", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdLessThan(Integer value) {
            addCriterion("older_id <", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdLessThanOrEqualTo(Integer value) {
            addCriterion("older_id <=", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdIn(List<Integer> values) {
            addCriterion("older_id in", values, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotIn(List<Integer> values) {
            addCriterion("older_id not in", values, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdBetween(Integer value1, Integer value2) {
            addCriterion("older_id between", value1, value2, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("older_id not between", value1, value2, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameIsNull() {
            addCriterion("older_category_name is null");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameIsNotNull() {
            addCriterion("older_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameEqualTo(String value) {
            addCriterion("older_category_name =", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameNotEqualTo(String value) {
            addCriterion("older_category_name <>", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameGreaterThan(String value) {
            addCriterion("older_category_name >", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("older_category_name >=", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameLessThan(String value) {
            addCriterion("older_category_name <", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("older_category_name <=", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameLike(String value) {
            addCriterion("older_category_name like", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameNotLike(String value) {
            addCriterion("older_category_name not like", value, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameIn(List<String> values) {
            addCriterion("older_category_name in", values, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameNotIn(List<String> values) {
            addCriterion("older_category_name not in", values, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameBetween(String value1, String value2) {
            addCriterion("older_category_name between", value1, value2, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderCategoryNameNotBetween(String value1, String value2) {
            addCriterion("older_category_name not between", value1, value2, "olderCategoryName");
            return (Criteria) this;
        }

        public Criteria andOlderPriceIsNull() {
            addCriterion("older_price is null");
            return (Criteria) this;
        }

        public Criteria andOlderPriceIsNotNull() {
            addCriterion("older_price is not null");
            return (Criteria) this;
        }

        public Criteria andOlderPriceEqualTo(Integer value) {
            addCriterion("older_price =", value, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceNotEqualTo(Integer value) {
            addCriterion("older_price <>", value, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceGreaterThan(Integer value) {
            addCriterion("older_price >", value, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_price >=", value, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceLessThan(Integer value) {
            addCriterion("older_price <", value, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("older_price <=", value, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceIn(List<Integer> values) {
            addCriterion("older_price in", values, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceNotIn(List<Integer> values) {
            addCriterion("older_price not in", values, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceBetween(Integer value1, Integer value2) {
            addCriterion("older_price between", value1, value2, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("older_price not between", value1, value2, "olderPrice");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumIsNull() {
            addCriterion("older_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumIsNotNull() {
            addCriterion("older_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumEqualTo(Integer value) {
            addCriterion("older_sale_num =", value, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumNotEqualTo(Integer value) {
            addCriterion("older_sale_num <>", value, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumGreaterThan(Integer value) {
            addCriterion("older_sale_num >", value, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_sale_num >=", value, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumLessThan(Integer value) {
            addCriterion("older_sale_num <", value, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("older_sale_num <=", value, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumIn(List<Integer> values) {
            addCriterion("older_sale_num in", values, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumNotIn(List<Integer> values) {
            addCriterion("older_sale_num not in", values, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("older_sale_num between", value1, value2, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("older_sale_num not between", value1, value2, "olderSaleNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumIsNull() {
            addCriterion("older_ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumIsNotNull() {
            addCriterion("older_ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumEqualTo(Integer value) {
            addCriterion("older_ticket_num =", value, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumNotEqualTo(Integer value) {
            addCriterion("older_ticket_num <>", value, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumGreaterThan(Integer value) {
            addCriterion("older_ticket_num >", value, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("older_ticket_num >=", value, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumLessThan(Integer value) {
            addCriterion("older_ticket_num <", value, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("older_ticket_num <=", value, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumIn(List<Integer> values) {
            addCriterion("older_ticket_num in", values, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumNotIn(List<Integer> values) {
            addCriterion("older_ticket_num not in", values, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("older_ticket_num between", value1, value2, "olderTicketNum");
            return (Criteria) this;
        }

        public Criteria andOlderTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("older_ticket_num not between", value1, value2, "olderTicketNum");
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