package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class ChildticketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChildticketExample() {
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

        public Criteria andChildIdIsNull() {
            addCriterion("child_id is null");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNotNull() {
            addCriterion("child_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildIdEqualTo(Integer value) {
            addCriterion("child_id =", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotEqualTo(Integer value) {
            addCriterion("child_id <>", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThan(Integer value) {
            addCriterion("child_id >", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_id >=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThan(Integer value) {
            addCriterion("child_id <", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_id <=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdIn(List<Integer> values) {
            addCriterion("child_id in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotIn(List<Integer> values) {
            addCriterion("child_id not in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdBetween(Integer value1, Integer value2) {
            addCriterion("child_id between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_id not between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameIsNull() {
            addCriterion("child_category_name is null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameIsNotNull() {
            addCriterion("child_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameEqualTo(String value) {
            addCriterion("child_category_name =", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotEqualTo(String value) {
            addCriterion("child_category_name <>", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameGreaterThan(String value) {
            addCriterion("child_category_name >", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("child_category_name >=", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameLessThan(String value) {
            addCriterion("child_category_name <", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("child_category_name <=", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameLike(String value) {
            addCriterion("child_category_name like", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotLike(String value) {
            addCriterion("child_category_name not like", value, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameIn(List<String> values) {
            addCriterion("child_category_name in", values, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotIn(List<String> values) {
            addCriterion("child_category_name not in", values, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameBetween(String value1, String value2) {
            addCriterion("child_category_name between", value1, value2, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildCategoryNameNotBetween(String value1, String value2) {
            addCriterion("child_category_name not between", value1, value2, "childCategoryName");
            return (Criteria) this;
        }

        public Criteria andChildPriceIsNull() {
            addCriterion("child_price is null");
            return (Criteria) this;
        }

        public Criteria andChildPriceIsNotNull() {
            addCriterion("child_price is not null");
            return (Criteria) this;
        }

        public Criteria andChildPriceEqualTo(Integer value) {
            addCriterion("child_price =", value, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceNotEqualTo(Integer value) {
            addCriterion("child_price <>", value, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceGreaterThan(Integer value) {
            addCriterion("child_price >", value, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_price >=", value, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceLessThan(Integer value) {
            addCriterion("child_price <", value, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceLessThanOrEqualTo(Integer value) {
            addCriterion("child_price <=", value, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceIn(List<Integer> values) {
            addCriterion("child_price in", values, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceNotIn(List<Integer> values) {
            addCriterion("child_price not in", values, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceBetween(Integer value1, Integer value2) {
            addCriterion("child_price between", value1, value2, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("child_price not between", value1, value2, "childPrice");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumIsNull() {
            addCriterion("child_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumIsNotNull() {
            addCriterion("child_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumEqualTo(Integer value) {
            addCriterion("child_sale_num =", value, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumNotEqualTo(Integer value) {
            addCriterion("child_sale_num <>", value, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumGreaterThan(Integer value) {
            addCriterion("child_sale_num >", value, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_sale_num >=", value, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumLessThan(Integer value) {
            addCriterion("child_sale_num <", value, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("child_sale_num <=", value, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumIn(List<Integer> values) {
            addCriterion("child_sale_num in", values, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumNotIn(List<Integer> values) {
            addCriterion("child_sale_num not in", values, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("child_sale_num between", value1, value2, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("child_sale_num not between", value1, value2, "childSaleNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumIsNull() {
            addCriterion("child_ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumIsNotNull() {
            addCriterion("child_ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumEqualTo(Integer value) {
            addCriterion("child_ticket_num =", value, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumNotEqualTo(Integer value) {
            addCriterion("child_ticket_num <>", value, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumGreaterThan(Integer value) {
            addCriterion("child_ticket_num >", value, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_ticket_num >=", value, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumLessThan(Integer value) {
            addCriterion("child_ticket_num <", value, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("child_ticket_num <=", value, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumIn(List<Integer> values) {
            addCriterion("child_ticket_num in", values, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumNotIn(List<Integer> values) {
            addCriterion("child_ticket_num not in", values, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("child_ticket_num between", value1, value2, "childTicketNum");
            return (Criteria) this;
        }

        public Criteria andChildTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("child_ticket_num not between", value1, value2, "childTicketNum");
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