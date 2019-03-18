package com.ma.clothes.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class AccountItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountItemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHeaderIdIsNull() {
            addCriterion("header_id is null");
            return (Criteria) this;
        }

        public Criteria andHeaderIdIsNotNull() {
            addCriterion("header_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderIdEqualTo(String value) {
            addCriterion("header_id =", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdNotEqualTo(String value) {
            addCriterion("header_id <>", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdGreaterThan(String value) {
            addCriterion("header_id >", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("header_id >=", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdLessThan(String value) {
            addCriterion("header_id <", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdLessThanOrEqualTo(String value) {
            addCriterion("header_id <=", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdLike(String value) {
            addCriterion("header_id like", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdNotLike(String value) {
            addCriterion("header_id not like", value, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdIn(List<String> values) {
            addCriterion("header_id in", values, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdNotIn(List<String> values) {
            addCriterion("header_id not in", values, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdBetween(String value1, String value2) {
            addCriterion("header_id between", value1, value2, "headerId");
            return (Criteria) this;
        }

        public Criteria andHeaderIdNotBetween(String value1, String value2) {
            addCriterion("header_id not between", value1, value2, "headerId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdIsNull() {
            addCriterion("ioitem_id is null");
            return (Criteria) this;
        }

        public Criteria andIoitemIdIsNotNull() {
            addCriterion("ioitem_id is not null");
            return (Criteria) this;
        }

        public Criteria andIoitemIdEqualTo(String value) {
            addCriterion("ioitem_id =", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdNotEqualTo(String value) {
            addCriterion("ioitem_id <>", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdGreaterThan(String value) {
            addCriterion("ioitem_id >", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ioitem_id >=", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdLessThan(String value) {
            addCriterion("ioitem_id <", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdLessThanOrEqualTo(String value) {
            addCriterion("ioitem_id <=", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdLike(String value) {
            addCriterion("ioitem_id like", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdNotLike(String value) {
            addCriterion("ioitem_id not like", value, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdIn(List<String> values) {
            addCriterion("ioitem_id in", values, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdNotIn(List<String> values) {
            addCriterion("ioitem_id not in", values, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdBetween(String value1, String value2) {
            addCriterion("ioitem_id between", value1, value2, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andIoitemIdNotBetween(String value1, String value2) {
            addCriterion("ioitem_id not between", value1, value2, "ioitemId");
            return (Criteria) this;
        }

        public Criteria andEachAmountIsNull() {
            addCriterion("each_amount is null");
            return (Criteria) this;
        }

        public Criteria andEachAmountIsNotNull() {
            addCriterion("each_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEachAmountEqualTo(Long value) {
            addCriterion("each_amount =", value, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountNotEqualTo(Long value) {
            addCriterion("each_amount <>", value, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountGreaterThan(Long value) {
            addCriterion("each_amount >", value, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("each_amount >=", value, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountLessThan(Long value) {
            addCriterion("each_amount <", value, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountLessThanOrEqualTo(Long value) {
            addCriterion("each_amount <=", value, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountIn(List<Long> values) {
            addCriterion("each_amount in", values, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountNotIn(List<Long> values) {
            addCriterion("each_amount not in", values, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountBetween(Long value1, Long value2) {
            addCriterion("each_amount between", value1, value2, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andEachAmountNotBetween(Long value1, Long value2) {
            addCriterion("each_amount not between", value1, value2, "eachAmount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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