package com.ma.clothes.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountHeadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountHeadExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("organization_id like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("organization_id not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIsNull() {
            addCriterion("handler_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIsNotNull() {
            addCriterion("handler_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerIdEqualTo(String value) {
            addCriterion("handler_id =", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotEqualTo(String value) {
            addCriterion("handler_id <>", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdGreaterThan(String value) {
            addCriterion("handler_id >", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdGreaterThanOrEqualTo(String value) {
            addCriterion("handler_id >=", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLessThan(String value) {
            addCriterion("handler_id <", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLessThanOrEqualTo(String value) {
            addCriterion("handler_id <=", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLike(String value) {
            addCriterion("handler_id like", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotLike(String value) {
            addCriterion("handler_id not like", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIn(List<String> values) {
            addCriterion("handler_id in", values, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotIn(List<String> values) {
            addCriterion("handler_id not in", values, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdBetween(String value1, String value2) {
            addCriterion("handler_id between", value1, value2, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotBetween(String value1, String value2) {
            addCriterion("handler_id not between", value1, value2, "handlerId");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNull() {
            addCriterion("change_amount is null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNotNull() {
            addCriterion("change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountEqualTo(Long value) {
            addCriterion("change_amount =", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotEqualTo(Long value) {
            addCriterion("change_amount <>", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThan(Long value) {
            addCriterion("change_amount >", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("change_amount >=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThan(Long value) {
            addCriterion("change_amount <", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThanOrEqualTo(Long value) {
            addCriterion("change_amount <=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIn(List<Long> values) {
            addCriterion("change_amount in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotIn(List<Long> values) {
            addCriterion("change_amount not in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountBetween(Long value1, Long value2) {
            addCriterion("change_amount between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotBetween(Long value1, Long value2) {
            addCriterion("change_amount not between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Long value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Long value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Long value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Long value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Long> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Long> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Long value1, Long value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
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

        public Criteria andBillNoIsNull() {
            addCriterion("bill_no is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("bill_no =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("bill_no <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("bill_no >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_no >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("bill_no <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("bill_no <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("bill_no like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("bill_no not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("bill_no in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("bill_no not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("bill_no between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("bill_no not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillTimeIsNull() {
            addCriterion("bill_time is null");
            return (Criteria) this;
        }

        public Criteria andBillTimeIsNotNull() {
            addCriterion("bill_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillTimeEqualTo(Date value) {
            addCriterion("bill_time =", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeNotEqualTo(Date value) {
            addCriterion("bill_time <>", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeGreaterThan(Date value) {
            addCriterion("bill_time >", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_time >=", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeLessThan(Date value) {
            addCriterion("bill_time <", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_time <=", value, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeIn(List<Date> values) {
            addCriterion("bill_time in", values, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeNotIn(List<Date> values) {
            addCriterion("bill_time not in", values, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeBetween(Date value1, Date value2) {
            addCriterion("bill_time between", value1, value2, "billTime");
            return (Criteria) this;
        }

        public Criteria andBillTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_time not between", value1, value2, "billTime");
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