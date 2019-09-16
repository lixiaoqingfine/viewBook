package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class WorldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorldExample() {
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

        public Criteria andWorldIdIsNull() {
            addCriterion("world_id is null");
            return (Criteria) this;
        }

        public Criteria andWorldIdIsNotNull() {
            addCriterion("world_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorldIdEqualTo(Integer value) {
            addCriterion("world_id =", value, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdNotEqualTo(Integer value) {
            addCriterion("world_id <>", value, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdGreaterThan(Integer value) {
            addCriterion("world_id >", value, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("world_id >=", value, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdLessThan(Integer value) {
            addCriterion("world_id <", value, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdLessThanOrEqualTo(Integer value) {
            addCriterion("world_id <=", value, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdIn(List<Integer> values) {
            addCriterion("world_id in", values, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdNotIn(List<Integer> values) {
            addCriterion("world_id not in", values, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdBetween(Integer value1, Integer value2) {
            addCriterion("world_id between", value1, value2, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldIdNotBetween(Integer value1, Integer value2) {
            addCriterion("world_id not between", value1, value2, "worldId");
            return (Criteria) this;
        }

        public Criteria andWorldNameIsNull() {
            addCriterion("world_name is null");
            return (Criteria) this;
        }

        public Criteria andWorldNameIsNotNull() {
            addCriterion("world_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorldNameEqualTo(String value) {
            addCriterion("world_name =", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameNotEqualTo(String value) {
            addCriterion("world_name <>", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameGreaterThan(String value) {
            addCriterion("world_name >", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameGreaterThanOrEqualTo(String value) {
            addCriterion("world_name >=", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameLessThan(String value) {
            addCriterion("world_name <", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameLessThanOrEqualTo(String value) {
            addCriterion("world_name <=", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameLike(String value) {
            addCriterion("world_name like", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameNotLike(String value) {
            addCriterion("world_name not like", value, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameIn(List<String> values) {
            addCriterion("world_name in", values, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameNotIn(List<String> values) {
            addCriterion("world_name not in", values, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameBetween(String value1, String value2) {
            addCriterion("world_name between", value1, value2, "worldName");
            return (Criteria) this;
        }

        public Criteria andWorldNameNotBetween(String value1, String value2) {
            addCriterion("world_name not between", value1, value2, "worldName");
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