package com.ma.clothes.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentHeadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentHeadExample() {
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

        public Criteria andSubTypeIsNull() {
            addCriterion("sub_type is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion("sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(String value) {
            addCriterion("sub_type =", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(String value) {
            addCriterion("sub_type <>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(String value) {
            addCriterion("sub_type >", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_type >=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(String value) {
            addCriterion("sub_type <", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(String value) {
            addCriterion("sub_type <=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLike(String value) {
            addCriterion("sub_type like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotLike(String value) {
            addCriterion("sub_type not like", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<String> values) {
            addCriterion("sub_type in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<String> values) {
            addCriterion("sub_type not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(String value1, String value2) {
            addCriterion("sub_type between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(String value1, String value2) {
            addCriterion("sub_type not between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andInitalNumberIsNull() {
            addCriterion("inital_number is null");
            return (Criteria) this;
        }

        public Criteria andInitalNumberIsNotNull() {
            addCriterion("inital_number is not null");
            return (Criteria) this;
        }

        public Criteria andInitalNumberEqualTo(String value) {
            addCriterion("inital_number =", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberNotEqualTo(String value) {
            addCriterion("inital_number <>", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberGreaterThan(String value) {
            addCriterion("inital_number >", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("inital_number >=", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberLessThan(String value) {
            addCriterion("inital_number <", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberLessThanOrEqualTo(String value) {
            addCriterion("inital_number <=", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberLike(String value) {
            addCriterion("inital_number like", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberNotLike(String value) {
            addCriterion("inital_number not like", value, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberIn(List<String> values) {
            addCriterion("inital_number in", values, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberNotIn(List<String> values) {
            addCriterion("inital_number not in", values, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberBetween(String value1, String value2) {
            addCriterion("inital_number between", value1, value2, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andInitalNumberNotBetween(String value1, String value2) {
            addCriterion("inital_number not between", value1, value2, "initalNumber");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNull() {
            addCriterion("operator_time is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("operator_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterion("operator_time =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterion("operator_time <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterion("operator_time >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operator_time >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterion("operator_time <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("operator_time <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterion("operator_time in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterion("operator_time not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterion("operator_time between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("operator_time not between", value1, value2, "operatorTime");
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

        public Criteria andHandleIdIsNull() {
            addCriterion("handle_id is null");
            return (Criteria) this;
        }

        public Criteria andHandleIdIsNotNull() {
            addCriterion("handle_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandleIdEqualTo(String value) {
            addCriterion("handle_id =", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotEqualTo(String value) {
            addCriterion("handle_id <>", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdGreaterThan(String value) {
            addCriterion("handle_id >", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdGreaterThanOrEqualTo(String value) {
            addCriterion("handle_id >=", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdLessThan(String value) {
            addCriterion("handle_id <", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdLessThanOrEqualTo(String value) {
            addCriterion("handle_id <=", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdLike(String value) {
            addCriterion("handle_id like", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotLike(String value) {
            addCriterion("handle_id not like", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdIn(List<String> values) {
            addCriterion("handle_id in", values, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotIn(List<String> values) {
            addCriterion("handle_id not in", values, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdBetween(String value1, String value2) {
            addCriterion("handle_id between", value1, value2, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotBetween(String value1, String value2) {
            addCriterion("handle_id not between", value1, value2, "handleId");
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

        public Criteria andAllocationProjectIdIsNull() {
            addCriterion("allocation_project_id is null");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdIsNotNull() {
            addCriterion("allocation_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdEqualTo(String value) {
            addCriterion("allocation_project_id =", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdNotEqualTo(String value) {
            addCriterion("allocation_project_id <>", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdGreaterThan(String value) {
            addCriterion("allocation_project_id >", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("allocation_project_id >=", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdLessThan(String value) {
            addCriterion("allocation_project_id <", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdLessThanOrEqualTo(String value) {
            addCriterion("allocation_project_id <=", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdLike(String value) {
            addCriterion("allocation_project_id like", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdNotLike(String value) {
            addCriterion("allocation_project_id not like", value, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdIn(List<String> values) {
            addCriterion("allocation_project_id in", values, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdNotIn(List<String> values) {
            addCriterion("allocation_project_id not in", values, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdBetween(String value1, String value2) {
            addCriterion("allocation_project_id between", value1, value2, "allocationProjectId");
            return (Criteria) this;
        }

        public Criteria andAllocationProjectIdNotBetween(String value1, String value2) {
            addCriterion("allocation_project_id not between", value1, value2, "allocationProjectId");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
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

        public Criteria andSalesmanIsNull() {
            addCriterion("salesman is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("salesman is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("salesman =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("salesman <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("salesman >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("salesman >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("salesman <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("salesman <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("salesman like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("salesman not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("salesman in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("salesman not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("salesman between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("salesman not between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andAccountIdListIsNull() {
            addCriterion("account_id_list is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdListIsNotNull() {
            addCriterion("account_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdListEqualTo(String value) {
            addCriterion("account_id_list =", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListNotEqualTo(String value) {
            addCriterion("account_id_list <>", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListGreaterThan(String value) {
            addCriterion("account_id_list >", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListGreaterThanOrEqualTo(String value) {
            addCriterion("account_id_list >=", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListLessThan(String value) {
            addCriterion("account_id_list <", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListLessThanOrEqualTo(String value) {
            addCriterion("account_id_list <=", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListLike(String value) {
            addCriterion("account_id_list like", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListNotLike(String value) {
            addCriterion("account_id_list not like", value, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListIn(List<String> values) {
            addCriterion("account_id_list in", values, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListNotIn(List<String> values) {
            addCriterion("account_id_list not in", values, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListBetween(String value1, String value2) {
            addCriterion("account_id_list between", value1, value2, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountIdListNotBetween(String value1, String value2) {
            addCriterion("account_id_list not between", value1, value2, "accountIdList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListIsNull() {
            addCriterion("account_money_list is null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListIsNotNull() {
            addCriterion("account_money_list is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListEqualTo(String value) {
            addCriterion("account_money_list =", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListNotEqualTo(String value) {
            addCriterion("account_money_list <>", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListGreaterThan(String value) {
            addCriterion("account_money_list >", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListGreaterThanOrEqualTo(String value) {
            addCriterion("account_money_list >=", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListLessThan(String value) {
            addCriterion("account_money_list <", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListLessThanOrEqualTo(String value) {
            addCriterion("account_money_list <=", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListLike(String value) {
            addCriterion("account_money_list like", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListNotLike(String value) {
            addCriterion("account_money_list not like", value, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListIn(List<String> values) {
            addCriterion("account_money_list in", values, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListNotIn(List<String> values) {
            addCriterion("account_money_list not in", values, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListBetween(String value1, String value2) {
            addCriterion("account_money_list between", value1, value2, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyListNotBetween(String value1, String value2) {
            addCriterion("account_money_list not between", value1, value2, "accountMoneyList");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNull() {
            addCriterion("discount_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNotNull() {
            addCriterion("discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyEqualTo(Long value) {
            addCriterion("discount_money =", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotEqualTo(Long value) {
            addCriterion("discount_money <>", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThan(Long value) {
            addCriterion("discount_money >", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_money >=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThan(Long value) {
            addCriterion("discount_money <", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThanOrEqualTo(Long value) {
            addCriterion("discount_money <=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIn(List<Long> values) {
            addCriterion("discount_money in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotIn(List<Long> values) {
            addCriterion("discount_money not in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyBetween(Long value1, Long value2) {
            addCriterion("discount_money between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotBetween(Long value1, Long value2) {
            addCriterion("discount_money not between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyIsNull() {
            addCriterion("discount_last_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyIsNotNull() {
            addCriterion("discount_last_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyEqualTo(Long value) {
            addCriterion("discount_last_money =", value, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyNotEqualTo(Long value) {
            addCriterion("discount_last_money <>", value, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyGreaterThan(Long value) {
            addCriterion("discount_last_money >", value, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_last_money >=", value, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyLessThan(Long value) {
            addCriterion("discount_last_money <", value, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyLessThanOrEqualTo(Long value) {
            addCriterion("discount_last_money <=", value, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyIn(List<Long> values) {
            addCriterion("discount_last_money in", values, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyNotIn(List<Long> values) {
            addCriterion("discount_last_money not in", values, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyBetween(Long value1, Long value2) {
            addCriterion("discount_last_money between", value1, value2, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountLastMoneyNotBetween(Long value1, Long value2) {
            addCriterion("discount_last_money not between", value1, value2, "discountLastMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyIsNull() {
            addCriterion("other_money is null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyIsNotNull() {
            addCriterion("other_money is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyEqualTo(Long value) {
            addCriterion("other_money =", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyNotEqualTo(Long value) {
            addCriterion("other_money <>", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyGreaterThan(Long value) {
            addCriterion("other_money >", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("other_money >=", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyLessThan(Long value) {
            addCriterion("other_money <", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyLessThanOrEqualTo(Long value) {
            addCriterion("other_money <=", value, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyIn(List<Long> values) {
            addCriterion("other_money in", values, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyNotIn(List<Long> values) {
            addCriterion("other_money not in", values, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyBetween(Long value1, Long value2) {
            addCriterion("other_money between", value1, value2, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyNotBetween(Long value1, Long value2) {
            addCriterion("other_money not between", value1, value2, "otherMoney");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListIsNull() {
            addCriterion("other_money_list is null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListIsNotNull() {
            addCriterion("other_money_list is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListEqualTo(String value) {
            addCriterion("other_money_list =", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListNotEqualTo(String value) {
            addCriterion("other_money_list <>", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListGreaterThan(String value) {
            addCriterion("other_money_list >", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListGreaterThanOrEqualTo(String value) {
            addCriterion("other_money_list >=", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListLessThan(String value) {
            addCriterion("other_money_list <", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListLessThanOrEqualTo(String value) {
            addCriterion("other_money_list <=", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListLike(String value) {
            addCriterion("other_money_list like", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListNotLike(String value) {
            addCriterion("other_money_list not like", value, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListIn(List<String> values) {
            addCriterion("other_money_list in", values, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListNotIn(List<String> values) {
            addCriterion("other_money_list not in", values, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListBetween(String value1, String value2) {
            addCriterion("other_money_list between", value1, value2, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyListNotBetween(String value1, String value2) {
            addCriterion("other_money_list not between", value1, value2, "otherMoneyList");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemIsNull() {
            addCriterion("other_money_item is null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemIsNotNull() {
            addCriterion("other_money_item is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemEqualTo(String value) {
            addCriterion("other_money_item =", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemNotEqualTo(String value) {
            addCriterion("other_money_item <>", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemGreaterThan(String value) {
            addCriterion("other_money_item >", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemGreaterThanOrEqualTo(String value) {
            addCriterion("other_money_item >=", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemLessThan(String value) {
            addCriterion("other_money_item <", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemLessThanOrEqualTo(String value) {
            addCriterion("other_money_item <=", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemLike(String value) {
            addCriterion("other_money_item like", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemNotLike(String value) {
            addCriterion("other_money_item not like", value, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemIn(List<String> values) {
            addCriterion("other_money_item in", values, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemNotIn(List<String> values) {
            addCriterion("other_money_item not in", values, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemBetween(String value1, String value2) {
            addCriterion("other_money_item between", value1, value2, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andOtherMoneyItemNotBetween(String value1, String value2) {
            addCriterion("other_money_item not between", value1, value2, "otherMoneyItem");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNull() {
            addCriterion("account_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNotNull() {
            addCriterion("account_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDateEqualTo(Integer value) {
            addCriterion("account_date =", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotEqualTo(Integer value) {
            addCriterion("account_date <>", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThan(Integer value) {
            addCriterion("account_date >", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_date >=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThan(Integer value) {
            addCriterion("account_date <", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThanOrEqualTo(Integer value) {
            addCriterion("account_date <=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateIn(List<Integer> values) {
            addCriterion("account_date in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotIn(List<Integer> values) {
            addCriterion("account_date not in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateBetween(Integer value1, Integer value2) {
            addCriterion("account_date between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotBetween(Integer value1, Integer value2) {
            addCriterion("account_date not between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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