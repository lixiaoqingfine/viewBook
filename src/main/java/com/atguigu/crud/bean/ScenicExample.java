package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
            return (Criteria) this;
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

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andThemeIdIsNull() {
            addCriterion("theme_id is null");
            return (Criteria) this;
        }

        public Criteria andThemeIdIsNotNull() {
            addCriterion("theme_id is not null");
            return (Criteria) this;
        }

        public Criteria andThemeIdEqualTo(Integer value) {
            addCriterion("theme_id =", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotEqualTo(Integer value) {
            addCriterion("theme_id <>", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThan(Integer value) {
            addCriterion("theme_id >", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("theme_id >=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThan(Integer value) {
            addCriterion("theme_id <", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("theme_id <=", value, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdIn(List<Integer> values) {
            addCriterion("theme_id in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotIn(List<Integer> values) {
            addCriterion("theme_id not in", values, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdBetween(Integer value1, Integer value2) {
            addCriterion("theme_id between", value1, value2, "themeId");
            return (Criteria) this;
        }

        public Criteria andThemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("theme_id not between", value1, value2, "themeId");
            return (Criteria) this;
        }

        public Criteria andIsCheapIsNull() {
            addCriterion("is_cheap is null");
            return (Criteria) this;
        }

        public Criteria andIsCheapIsNotNull() {
            addCriterion("is_cheap is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheapEqualTo(Boolean value) {
            addCriterion("is_cheap =", value, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapNotEqualTo(Boolean value) {
            addCriterion("is_cheap <>", value, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapGreaterThan(Boolean value) {
            addCriterion("is_cheap >", value, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cheap >=", value, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapLessThan(Boolean value) {
            addCriterion("is_cheap <", value, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cheap <=", value, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapIn(List<Boolean> values) {
            addCriterion("is_cheap in", values, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapNotIn(List<Boolean> values) {
            addCriterion("is_cheap not in", values, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cheap between", value1, value2, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsCheapNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cheap not between", value1, value2, "isCheap");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("Is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("Is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Boolean value) {
            addCriterion("Is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Boolean value) {
            addCriterion("Is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Boolean value) {
            addCriterion("Is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Boolean value) {
            addCriterion("Is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Boolean> values) {
            addCriterion("Is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Boolean> values) {
            addCriterion("Is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andSearchNumIsNull() {
            addCriterion("search_num is null");
            return (Criteria) this;
        }

        public Criteria andSearchNumIsNotNull() {
            addCriterion("search_num is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNumEqualTo(Integer value) {
            addCriterion("search_num =", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotEqualTo(Integer value) {
            addCriterion("search_num <>", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumGreaterThan(Integer value) {
            addCriterion("search_num >", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_num >=", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumLessThan(Integer value) {
            addCriterion("search_num <", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumLessThanOrEqualTo(Integer value) {
            addCriterion("search_num <=", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumIn(List<Integer> values) {
            addCriterion("search_num in", values, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotIn(List<Integer> values) {
            addCriterion("search_num not in", values, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumBetween(Integer value1, Integer value2) {
            addCriterion("search_num between", value1, value2, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("search_num not between", value1, value2, "searchNum");
            return (Criteria) this;
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

        public Criteria andAdultIdIsNull() {
            addCriterion("adult_id is null");
            return (Criteria) this;
        }

        public Criteria andAdultIdIsNotNull() {
            addCriterion("adult_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdultIdEqualTo(Integer value) {
            addCriterion("adult_id =", value, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdNotEqualTo(Integer value) {
            addCriterion("adult_id <>", value, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdGreaterThan(Integer value) {
            addCriterion("adult_id >", value, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adult_id >=", value, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdLessThan(Integer value) {
            addCriterion("adult_id <", value, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdLessThanOrEqualTo(Integer value) {
            addCriterion("adult_id <=", value, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdIn(List<Integer> values) {
            addCriterion("adult_id in", values, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdNotIn(List<Integer> values) {
            addCriterion("adult_id not in", values, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdBetween(Integer value1, Integer value2) {
            addCriterion("adult_id between", value1, value2, "adultId");
            return (Criteria) this;
        }

        public Criteria andAdultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adult_id not between", value1, value2, "adultId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTypeOneIsNull() {
            addCriterion("type_one is null");
            return (Criteria) this;
        }

        public Criteria andTypeOneIsNotNull() {
            addCriterion("type_one is not null");
            return (Criteria) this;
        }

        public Criteria andTypeOneEqualTo(String value) {
            addCriterion("type_one =", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotEqualTo(String value) {
            addCriterion("type_one <>", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneGreaterThan(String value) {
            addCriterion("type_one >", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneGreaterThanOrEqualTo(String value) {
            addCriterion("type_one >=", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneLessThan(String value) {
            addCriterion("type_one <", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneLessThanOrEqualTo(String value) {
            addCriterion("type_one <=", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneLike(String value) {
            addCriterion("type_one like", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotLike(String value) {
            addCriterion("type_one not like", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneIn(List<String> values) {
            addCriterion("type_one in", values, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotIn(List<String> values) {
            addCriterion("type_one not in", values, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneBetween(String value1, String value2) {
            addCriterion("type_one between", value1, value2, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotBetween(String value1, String value2) {
            addCriterion("type_one not between", value1, value2, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeTwoIsNull() {
            addCriterion("type_two is null");
            return (Criteria) this;
        }

        public Criteria andTypeTwoIsNotNull() {
            addCriterion("type_two is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTwoEqualTo(String value) {
            addCriterion("type_two =", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotEqualTo(String value) {
            addCriterion("type_two <>", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoGreaterThan(String value) {
            addCriterion("type_two >", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoGreaterThanOrEqualTo(String value) {
            addCriterion("type_two >=", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoLessThan(String value) {
            addCriterion("type_two <", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoLessThanOrEqualTo(String value) {
            addCriterion("type_two <=", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoLike(String value) {
            addCriterion("type_two like", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotLike(String value) {
            addCriterion("type_two not like", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoIn(List<String> values) {
            addCriterion("type_two in", values, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotIn(List<String> values) {
            addCriterion("type_two not in", values, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoBetween(String value1, String value2) {
            addCriterion("type_two between", value1, value2, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotBetween(String value1, String value2) {
            addCriterion("type_two not between", value1, value2, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeThreeIsNull() {
            addCriterion("type_three is null");
            return (Criteria) this;
        }

        public Criteria andTypeThreeIsNotNull() {
            addCriterion("type_three is not null");
            return (Criteria) this;
        }

        public Criteria andTypeThreeEqualTo(String value) {
            addCriterion("type_three =", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeNotEqualTo(String value) {
            addCriterion("type_three <>", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeGreaterThan(String value) {
            addCriterion("type_three >", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeGreaterThanOrEqualTo(String value) {
            addCriterion("type_three >=", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeLessThan(String value) {
            addCriterion("type_three <", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeLessThanOrEqualTo(String value) {
            addCriterion("type_three <=", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeLike(String value) {
            addCriterion("type_three like", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeNotLike(String value) {
            addCriterion("type_three not like", value, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeIn(List<String> values) {
            addCriterion("type_three in", values, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeNotIn(List<String> values) {
            addCriterion("type_three not in", values, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeBetween(String value1, String value2) {
            addCriterion("type_three between", value1, value2, "typeThree");
            return (Criteria) this;
        }

        public Criteria andTypeThreeNotBetween(String value1, String value2) {
            addCriterion("type_three not between", value1, value2, "typeThree");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneIsNull() {
            addCriterion("wheel_img_one is null");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneIsNotNull() {
            addCriterion("wheel_img_one is not null");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneEqualTo(String value) {
            addCriterion("wheel_img_one =", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneNotEqualTo(String value) {
            addCriterion("wheel_img_one <>", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneGreaterThan(String value) {
            addCriterion("wheel_img_one >", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneGreaterThanOrEqualTo(String value) {
            addCriterion("wheel_img_one >=", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneLessThan(String value) {
            addCriterion("wheel_img_one <", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneLessThanOrEqualTo(String value) {
            addCriterion("wheel_img_one <=", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneLike(String value) {
            addCriterion("wheel_img_one like", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneNotLike(String value) {
            addCriterion("wheel_img_one not like", value, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneIn(List<String> values) {
            addCriterion("wheel_img_one in", values, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneNotIn(List<String> values) {
            addCriterion("wheel_img_one not in", values, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneBetween(String value1, String value2) {
            addCriterion("wheel_img_one between", value1, value2, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgOneNotBetween(String value1, String value2) {
            addCriterion("wheel_img_one not between", value1, value2, "wheelImgOne");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoIsNull() {
            addCriterion("wheel_img_two is null");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoIsNotNull() {
            addCriterion("wheel_img_two is not null");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoEqualTo(String value) {
            addCriterion("wheel_img_two =", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoNotEqualTo(String value) {
            addCriterion("wheel_img_two <>", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoGreaterThan(String value) {
            addCriterion("wheel_img_two >", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoGreaterThanOrEqualTo(String value) {
            addCriterion("wheel_img_two >=", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoLessThan(String value) {
            addCriterion("wheel_img_two <", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoLessThanOrEqualTo(String value) {
            addCriterion("wheel_img_two <=", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoLike(String value) {
            addCriterion("wheel_img_two like", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoNotLike(String value) {
            addCriterion("wheel_img_two not like", value, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoIn(List<String> values) {
            addCriterion("wheel_img_two in", values, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoNotIn(List<String> values) {
            addCriterion("wheel_img_two not in", values, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoBetween(String value1, String value2) {
            addCriterion("wheel_img_two between", value1, value2, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgTwoNotBetween(String value1, String value2) {
            addCriterion("wheel_img_two not between", value1, value2, "wheelImgTwo");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeIsNull() {
            addCriterion("wheel_img_three is null");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeIsNotNull() {
            addCriterion("wheel_img_three is not null");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeEqualTo(String value) {
            addCriterion("wheel_img_three =", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeNotEqualTo(String value) {
            addCriterion("wheel_img_three <>", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeGreaterThan(String value) {
            addCriterion("wheel_img_three >", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeGreaterThanOrEqualTo(String value) {
            addCriterion("wheel_img_three >=", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeLessThan(String value) {
            addCriterion("wheel_img_three <", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeLessThanOrEqualTo(String value) {
            addCriterion("wheel_img_three <=", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeLike(String value) {
            addCriterion("wheel_img_three like", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeNotLike(String value) {
            addCriterion("wheel_img_three not like", value, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeIn(List<String> values) {
            addCriterion("wheel_img_three in", values, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeNotIn(List<String> values) {
            addCriterion("wheel_img_three not in", values, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeBetween(String value1, String value2) {
            addCriterion("wheel_img_three between", value1, value2, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgThreeNotBetween(String value1, String value2) {
            addCriterion("wheel_img_three not between", value1, value2, "wheelImgThree");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourIsNull() {
            addCriterion("wheel_img_four is null");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourIsNotNull() {
            addCriterion("wheel_img_four is not null");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourEqualTo(String value) {
            addCriterion("wheel_img_four =", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourNotEqualTo(String value) {
            addCriterion("wheel_img_four <>", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourGreaterThan(String value) {
            addCriterion("wheel_img_four >", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourGreaterThanOrEqualTo(String value) {
            addCriterion("wheel_img_four >=", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourLessThan(String value) {
            addCriterion("wheel_img_four <", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourLessThanOrEqualTo(String value) {
            addCriterion("wheel_img_four <=", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourLike(String value) {
            addCriterion("wheel_img_four like", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourNotLike(String value) {
            addCriterion("wheel_img_four not like", value, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourIn(List<String> values) {
            addCriterion("wheel_img_four in", values, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourNotIn(List<String> values) {
            addCriterion("wheel_img_four not in", values, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourBetween(String value1, String value2) {
            addCriterion("wheel_img_four between", value1, value2, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFourNotBetween(String value1, String value2) {
            addCriterion("wheel_img_four not between", value1, value2, "wheelImgFour");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveIsNull() {
            addCriterion("wheel_img_five is null");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveIsNotNull() {
            addCriterion("wheel_img_five is not null");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveEqualTo(String value) {
            addCriterion("wheel_img_five =", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveNotEqualTo(String value) {
            addCriterion("wheel_img_five <>", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveGreaterThan(String value) {
            addCriterion("wheel_img_five >", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveGreaterThanOrEqualTo(String value) {
            addCriterion("wheel_img_five >=", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveLessThan(String value) {
            addCriterion("wheel_img_five <", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveLessThanOrEqualTo(String value) {
            addCriterion("wheel_img_five <=", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveLike(String value) {
            addCriterion("wheel_img_five like", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveNotLike(String value) {
            addCriterion("wheel_img_five not like", value, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveIn(List<String> values) {
            addCriterion("wheel_img_five in", values, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveNotIn(List<String> values) {
            addCriterion("wheel_img_five not in", values, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveBetween(String value1, String value2) {
            addCriterion("wheel_img_five between", value1, value2, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andWheelImgFiveNotBetween(String value1, String value2) {
            addCriterion("wheel_img_five not between", value1, value2, "wheelImgFive");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneIsNull() {
            addCriterion("scenicpresent_one is null");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneIsNotNull() {
            addCriterion("scenicpresent_one is not null");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneEqualTo(String value) {
            addCriterion("scenicpresent_one =", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneNotEqualTo(String value) {
            addCriterion("scenicpresent_one <>", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneGreaterThan(String value) {
            addCriterion("scenicpresent_one >", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneGreaterThanOrEqualTo(String value) {
            addCriterion("scenicpresent_one >=", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneLessThan(String value) {
            addCriterion("scenicpresent_one <", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneLessThanOrEqualTo(String value) {
            addCriterion("scenicpresent_one <=", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneLike(String value) {
            addCriterion("scenicpresent_one like", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneNotLike(String value) {
            addCriterion("scenicpresent_one not like", value, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneIn(List<String> values) {
            addCriterion("scenicpresent_one in", values, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneNotIn(List<String> values) {
            addCriterion("scenicpresent_one not in", values, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneBetween(String value1, String value2) {
            addCriterion("scenicpresent_one between", value1, value2, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentOneNotBetween(String value1, String value2) {
            addCriterion("scenicpresent_one not between", value1, value2, "scenicpresentOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneIsNull() {
            addCriterion("photo_one is null");
            return (Criteria) this;
        }

        public Criteria andPhotoOneIsNotNull() {
            addCriterion("photo_one is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoOneEqualTo(String value) {
            addCriterion("photo_one =", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneNotEqualTo(String value) {
            addCriterion("photo_one <>", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneGreaterThan(String value) {
            addCriterion("photo_one >", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneGreaterThanOrEqualTo(String value) {
            addCriterion("photo_one >=", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneLessThan(String value) {
            addCriterion("photo_one <", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneLessThanOrEqualTo(String value) {
            addCriterion("photo_one <=", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneLike(String value) {
            addCriterion("photo_one like", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneNotLike(String value) {
            addCriterion("photo_one not like", value, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneIn(List<String> values) {
            addCriterion("photo_one in", values, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneNotIn(List<String> values) {
            addCriterion("photo_one not in", values, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneBetween(String value1, String value2) {
            addCriterion("photo_one between", value1, value2, "photoOne");
            return (Criteria) this;
        }

        public Criteria andPhotoOneNotBetween(String value1, String value2) {
            addCriterion("photo_one not between", value1, value2, "photoOne");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoIsNull() {
            addCriterion("scenicpresent_two is null");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoIsNotNull() {
            addCriterion("scenicpresent_two is not null");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoEqualTo(String value) {
            addCriterion("scenicpresent_two =", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoNotEqualTo(String value) {
            addCriterion("scenicpresent_two <>", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoGreaterThan(String value) {
            addCriterion("scenicpresent_two >", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoGreaterThanOrEqualTo(String value) {
            addCriterion("scenicpresent_two >=", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoLessThan(String value) {
            addCriterion("scenicpresent_two <", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoLessThanOrEqualTo(String value) {
            addCriterion("scenicpresent_two <=", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoLike(String value) {
            addCriterion("scenicpresent_two like", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoNotLike(String value) {
            addCriterion("scenicpresent_two not like", value, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoIn(List<String> values) {
            addCriterion("scenicpresent_two in", values, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoNotIn(List<String> values) {
            addCriterion("scenicpresent_two not in", values, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoBetween(String value1, String value2) {
            addCriterion("scenicpresent_two between", value1, value2, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andScenicpresentTwoNotBetween(String value1, String value2) {
            addCriterion("scenicpresent_two not between", value1, value2, "scenicpresentTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoIsNull() {
            addCriterion("photo_two is null");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoIsNotNull() {
            addCriterion("photo_two is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoEqualTo(String value) {
            addCriterion("photo_two =", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoNotEqualTo(String value) {
            addCriterion("photo_two <>", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoGreaterThan(String value) {
            addCriterion("photo_two >", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoGreaterThanOrEqualTo(String value) {
            addCriterion("photo_two >=", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoLessThan(String value) {
            addCriterion("photo_two <", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoLessThanOrEqualTo(String value) {
            addCriterion("photo_two <=", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoLike(String value) {
            addCriterion("photo_two like", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoNotLike(String value) {
            addCriterion("photo_two not like", value, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoIn(List<String> values) {
            addCriterion("photo_two in", values, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoNotIn(List<String> values) {
            addCriterion("photo_two not in", values, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoBetween(String value1, String value2) {
            addCriterion("photo_two between", value1, value2, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoTwoNotBetween(String value1, String value2) {
            addCriterion("photo_two not between", value1, value2, "photoTwo");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeIsNull() {
            addCriterion("photo_three is null");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeIsNotNull() {
            addCriterion("photo_three is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeEqualTo(String value) {
            addCriterion("photo_three =", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeNotEqualTo(String value) {
            addCriterion("photo_three <>", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeGreaterThan(String value) {
            addCriterion("photo_three >", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeGreaterThanOrEqualTo(String value) {
            addCriterion("photo_three >=", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeLessThan(String value) {
            addCriterion("photo_three <", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeLessThanOrEqualTo(String value) {
            addCriterion("photo_three <=", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeLike(String value) {
            addCriterion("photo_three like", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeNotLike(String value) {
            addCriterion("photo_three not like", value, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeIn(List<String> values) {
            addCriterion("photo_three in", values, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeNotIn(List<String> values) {
            addCriterion("photo_three not in", values, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeBetween(String value1, String value2) {
            addCriterion("photo_three between", value1, value2, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoThreeNotBetween(String value1, String value2) {
            addCriterion("photo_three not between", value1, value2, "photoThree");
            return (Criteria) this;
        }

        public Criteria andPhotoFourIsNull() {
            addCriterion("photo_four is null");
            return (Criteria) this;
        }

        public Criteria andPhotoFourIsNotNull() {
            addCriterion("photo_four is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoFourEqualTo(String value) {
            addCriterion("photo_four =", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourNotEqualTo(String value) {
            addCriterion("photo_four <>", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourGreaterThan(String value) {
            addCriterion("photo_four >", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourGreaterThanOrEqualTo(String value) {
            addCriterion("photo_four >=", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourLessThan(String value) {
            addCriterion("photo_four <", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourLessThanOrEqualTo(String value) {
            addCriterion("photo_four <=", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourLike(String value) {
            addCriterion("photo_four like", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourNotLike(String value) {
            addCriterion("photo_four not like", value, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourIn(List<String> values) {
            addCriterion("photo_four in", values, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourNotIn(List<String> values) {
            addCriterion("photo_four not in", values, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourBetween(String value1, String value2) {
            addCriterion("photo_four between", value1, value2, "photoFour");
            return (Criteria) this;
        }

        public Criteria andPhotoFourNotBetween(String value1, String value2) {
            addCriterion("photo_four not between", value1, value2, "photoFour");
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