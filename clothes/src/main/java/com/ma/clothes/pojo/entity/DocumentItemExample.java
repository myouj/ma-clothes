package com.ma.clothes.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class DocumentItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentItemExample() {
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

        public Criteria andMaterialIdIsNull() {
            addCriterion("material_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("material_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(String value) {
            addCriterion("material_id =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(String value) {
            addCriterion("material_id <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(String value) {
            addCriterion("material_id >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(String value) {
            addCriterion("material_id >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(String value) {
            addCriterion("material_id <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(String value) {
            addCriterion("material_id <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLike(String value) {
            addCriterion("material_id like", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotLike(String value) {
            addCriterion("material_id not like", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<String> values) {
            addCriterion("material_id in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<String> values) {
            addCriterion("material_id not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(String value1, String value2) {
            addCriterion("material_id between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(String value1, String value2) {
            addCriterion("material_id not between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitIsNull() {
            addCriterion("measuring_unit is null");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitIsNotNull() {
            addCriterion("measuring_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitEqualTo(String value) {
            addCriterion("measuring_unit =", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitNotEqualTo(String value) {
            addCriterion("measuring_unit <>", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitGreaterThan(String value) {
            addCriterion("measuring_unit >", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitGreaterThanOrEqualTo(String value) {
            addCriterion("measuring_unit >=", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitLessThan(String value) {
            addCriterion("measuring_unit <", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitLessThanOrEqualTo(String value) {
            addCriterion("measuring_unit <=", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitLike(String value) {
            addCriterion("measuring_unit like", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitNotLike(String value) {
            addCriterion("measuring_unit not like", value, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitIn(List<String> values) {
            addCriterion("measuring_unit in", values, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitNotIn(List<String> values) {
            addCriterion("measuring_unit not in", values, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitBetween(String value1, String value2) {
            addCriterion("measuring_unit between", value1, value2, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andMeasuringUnitNotBetween(String value1, String value2) {
            addCriterion("measuring_unit not between", value1, value2, "measuringUnit");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andBasicNumberIsNull() {
            addCriterion("basic_number is null");
            return (Criteria) this;
        }

        public Criteria andBasicNumberIsNotNull() {
            addCriterion("basic_number is not null");
            return (Criteria) this;
        }

        public Criteria andBasicNumberEqualTo(Integer value) {
            addCriterion("basic_number =", value, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberNotEqualTo(Integer value) {
            addCriterion("basic_number <>", value, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberGreaterThan(Integer value) {
            addCriterion("basic_number >", value, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_number >=", value, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberLessThan(Integer value) {
            addCriterion("basic_number <", value, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberLessThanOrEqualTo(Integer value) {
            addCriterion("basic_number <=", value, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberIn(List<Integer> values) {
            addCriterion("basic_number in", values, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberNotIn(List<Integer> values) {
            addCriterion("basic_number not in", values, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberBetween(Integer value1, Integer value2) {
            addCriterion("basic_number between", value1, value2, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andBasicNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_number not between", value1, value2, "basicNumber");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Integer value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Integer value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Integer value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Integer value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Integer> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Integer> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Integer value1, Integer value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceIsNull() {
            addCriterion("tax_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceIsNotNull() {
            addCriterion("tax_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceEqualTo(Integer value) {
            addCriterion("tax_unit_price =", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceNotEqualTo(Integer value) {
            addCriterion("tax_unit_price <>", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceGreaterThan(Integer value) {
            addCriterion("tax_unit_price >", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("tax_unit_price >=", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceLessThan(Integer value) {
            addCriterion("tax_unit_price <", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("tax_unit_price <=", value, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceIn(List<Integer> values) {
            addCriterion("tax_unit_price in", values, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceNotIn(List<Integer> values) {
            addCriterion("tax_unit_price not in", values, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceBetween(Integer value1, Integer value2) {
            addCriterion("tax_unit_price between", value1, value2, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andTaxUnitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("tax_unit_price not between", value1, value2, "taxUnitPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceIsNull() {
            addCriterion("all_price is null");
            return (Criteria) this;
        }

        public Criteria andAllPriceIsNotNull() {
            addCriterion("all_price is not null");
            return (Criteria) this;
        }

        public Criteria andAllPriceEqualTo(Long value) {
            addCriterion("all_price =", value, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceNotEqualTo(Long value) {
            addCriterion("all_price <>", value, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceGreaterThan(Long value) {
            addCriterion("all_price >", value, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("all_price >=", value, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceLessThan(Long value) {
            addCriterion("all_price <", value, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceLessThanOrEqualTo(Long value) {
            addCriterion("all_price <=", value, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceIn(List<Long> values) {
            addCriterion("all_price in", values, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceNotIn(List<Long> values) {
            addCriterion("all_price not in", values, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceBetween(Long value1, Long value2) {
            addCriterion("all_price between", value1, value2, "allPrice");
            return (Criteria) this;
        }

        public Criteria andAllPriceNotBetween(Long value1, Long value2) {
            addCriterion("all_price not between", value1, value2, "allPrice");
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

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIncidentalsIsNull() {
            addCriterion("incidentals is null");
            return (Criteria) this;
        }

        public Criteria andIncidentalsIsNotNull() {
            addCriterion("incidentals is not null");
            return (Criteria) this;
        }

        public Criteria andIncidentalsEqualTo(Long value) {
            addCriterion("incidentals =", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsNotEqualTo(Long value) {
            addCriterion("incidentals <>", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsGreaterThan(Long value) {
            addCriterion("incidentals >", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsGreaterThanOrEqualTo(Long value) {
            addCriterion("incidentals >=", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsLessThan(Long value) {
            addCriterion("incidentals <", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsLessThanOrEqualTo(Long value) {
            addCriterion("incidentals <=", value, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsIn(List<Long> values) {
            addCriterion("incidentals in", values, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsNotIn(List<Long> values) {
            addCriterion("incidentals not in", values, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsBetween(Long value1, Long value2) {
            addCriterion("incidentals between", value1, value2, "incidentals");
            return (Criteria) this;
        }

        public Criteria andIncidentalsNotBetween(Long value1, Long value2) {
            addCriterion("incidentals not between", value1, value2, "incidentals");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNull() {
            addCriterion("depot_id is null");
            return (Criteria) this;
        }

        public Criteria andDepotIdIsNotNull() {
            addCriterion("depot_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepotIdEqualTo(String value) {
            addCriterion("depot_id =", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotEqualTo(String value) {
            addCriterion("depot_id <>", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThan(String value) {
            addCriterion("depot_id >", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdGreaterThanOrEqualTo(String value) {
            addCriterion("depot_id >=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThan(String value) {
            addCriterion("depot_id <", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLessThanOrEqualTo(String value) {
            addCriterion("depot_id <=", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdLike(String value) {
            addCriterion("depot_id like", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotLike(String value) {
            addCriterion("depot_id not like", value, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdIn(List<String> values) {
            addCriterion("depot_id in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotIn(List<String> values) {
            addCriterion("depot_id not in", values, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdBetween(String value1, String value2) {
            addCriterion("depot_id between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andDepotIdNotBetween(String value1, String value2) {
            addCriterion("depot_id not between", value1, value2, "depotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdIsNull() {
            addCriterion("another_depot_id is null");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdIsNotNull() {
            addCriterion("another_depot_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdEqualTo(String value) {
            addCriterion("another_depot_id =", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdNotEqualTo(String value) {
            addCriterion("another_depot_id <>", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdGreaterThan(String value) {
            addCriterion("another_depot_id >", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdGreaterThanOrEqualTo(String value) {
            addCriterion("another_depot_id >=", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdLessThan(String value) {
            addCriterion("another_depot_id <", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdLessThanOrEqualTo(String value) {
            addCriterion("another_depot_id <=", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdLike(String value) {
            addCriterion("another_depot_id like", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdNotLike(String value) {
            addCriterion("another_depot_id not like", value, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdIn(List<String> values) {
            addCriterion("another_depot_id in", values, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdNotIn(List<String> values) {
            addCriterion("another_depot_id not in", values, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdBetween(String value1, String value2) {
            addCriterion("another_depot_id between", value1, value2, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andAnotherDepotIdNotBetween(String value1, String value2) {
            addCriterion("another_depot_id not between", value1, value2, "anotherDepotId");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(Double value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(Double value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(Double value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(Double value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(Double value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(Double value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<Double> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<Double> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(Double value1, Double value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(Double value1, Double value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIsNull() {
            addCriterion("tax_money is null");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIsNotNull() {
            addCriterion("tax_money is not null");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyEqualTo(Long value) {
            addCriterion("tax_money =", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotEqualTo(Long value) {
            addCriterion("tax_money <>", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyGreaterThan(Long value) {
            addCriterion("tax_money >", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("tax_money >=", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyLessThan(Long value) {
            addCriterion("tax_money <", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyLessThanOrEqualTo(Long value) {
            addCriterion("tax_money <=", value, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyIn(List<Long> values) {
            addCriterion("tax_money in", values, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotIn(List<Long> values) {
            addCriterion("tax_money not in", values, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyBetween(Long value1, Long value2) {
            addCriterion("tax_money between", value1, value2, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxMoneyNotBetween(Long value1, Long value2) {
            addCriterion("tax_money not between", value1, value2, "taxMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyIsNull() {
            addCriterion("tax_last_money is null");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyIsNotNull() {
            addCriterion("tax_last_money is not null");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyEqualTo(Long value) {
            addCriterion("tax_last_money =", value, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyNotEqualTo(Long value) {
            addCriterion("tax_last_money <>", value, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyGreaterThan(Long value) {
            addCriterion("tax_last_money >", value, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("tax_last_money >=", value, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyLessThan(Long value) {
            addCriterion("tax_last_money <", value, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyLessThanOrEqualTo(Long value) {
            addCriterion("tax_last_money <=", value, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyIn(List<Long> values) {
            addCriterion("tax_last_money in", values, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyNotIn(List<Long> values) {
            addCriterion("tax_last_money not in", values, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyBetween(Long value1, Long value2) {
            addCriterion("tax_last_money between", value1, value2, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andTaxLastMoneyNotBetween(Long value1, Long value2) {
            addCriterion("tax_last_money not between", value1, value2, "taxLastMoney");
            return (Criteria) this;
        }

        public Criteria andOtherField1IsNull() {
            addCriterion("other_field1 is null");
            return (Criteria) this;
        }

        public Criteria andOtherField1IsNotNull() {
            addCriterion("other_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherField1EqualTo(String value) {
            addCriterion("other_field1 =", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1NotEqualTo(String value) {
            addCriterion("other_field1 <>", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1GreaterThan(String value) {
            addCriterion("other_field1 >", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1GreaterThanOrEqualTo(String value) {
            addCriterion("other_field1 >=", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1LessThan(String value) {
            addCriterion("other_field1 <", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1LessThanOrEqualTo(String value) {
            addCriterion("other_field1 <=", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1Like(String value) {
            addCriterion("other_field1 like", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1NotLike(String value) {
            addCriterion("other_field1 not like", value, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1In(List<String> values) {
            addCriterion("other_field1 in", values, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1NotIn(List<String> values) {
            addCriterion("other_field1 not in", values, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1Between(String value1, String value2) {
            addCriterion("other_field1 between", value1, value2, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField1NotBetween(String value1, String value2) {
            addCriterion("other_field1 not between", value1, value2, "otherField1");
            return (Criteria) this;
        }

        public Criteria andOtherField2IsNull() {
            addCriterion("other_field2 is null");
            return (Criteria) this;
        }

        public Criteria andOtherField2IsNotNull() {
            addCriterion("other_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherField2EqualTo(String value) {
            addCriterion("other_field2 =", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2NotEqualTo(String value) {
            addCriterion("other_field2 <>", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2GreaterThan(String value) {
            addCriterion("other_field2 >", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2GreaterThanOrEqualTo(String value) {
            addCriterion("other_field2 >=", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2LessThan(String value) {
            addCriterion("other_field2 <", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2LessThanOrEqualTo(String value) {
            addCriterion("other_field2 <=", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2Like(String value) {
            addCriterion("other_field2 like", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2NotLike(String value) {
            addCriterion("other_field2 not like", value, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2In(List<String> values) {
            addCriterion("other_field2 in", values, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2NotIn(List<String> values) {
            addCriterion("other_field2 not in", values, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2Between(String value1, String value2) {
            addCriterion("other_field2 between", value1, value2, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField2NotBetween(String value1, String value2) {
            addCriterion("other_field2 not between", value1, value2, "otherField2");
            return (Criteria) this;
        }

        public Criteria andOtherField3IsNull() {
            addCriterion("other_field3 is null");
            return (Criteria) this;
        }

        public Criteria andOtherField3IsNotNull() {
            addCriterion("other_field3 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherField3EqualTo(String value) {
            addCriterion("other_field3 =", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3NotEqualTo(String value) {
            addCriterion("other_field3 <>", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3GreaterThan(String value) {
            addCriterion("other_field3 >", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3GreaterThanOrEqualTo(String value) {
            addCriterion("other_field3 >=", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3LessThan(String value) {
            addCriterion("other_field3 <", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3LessThanOrEqualTo(String value) {
            addCriterion("other_field3 <=", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3Like(String value) {
            addCriterion("other_field3 like", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3NotLike(String value) {
            addCriterion("other_field3 not like", value, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3In(List<String> values) {
            addCriterion("other_field3 in", values, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3NotIn(List<String> values) {
            addCriterion("other_field3 not in", values, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3Between(String value1, String value2) {
            addCriterion("other_field3 between", value1, value2, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField3NotBetween(String value1, String value2) {
            addCriterion("other_field3 not between", value1, value2, "otherField3");
            return (Criteria) this;
        }

        public Criteria andOtherField4IsNull() {
            addCriterion("other_field4 is null");
            return (Criteria) this;
        }

        public Criteria andOtherField4IsNotNull() {
            addCriterion("other_field4 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherField4EqualTo(String value) {
            addCriterion("other_field4 =", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4NotEqualTo(String value) {
            addCriterion("other_field4 <>", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4GreaterThan(String value) {
            addCriterion("other_field4 >", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4GreaterThanOrEqualTo(String value) {
            addCriterion("other_field4 >=", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4LessThan(String value) {
            addCriterion("other_field4 <", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4LessThanOrEqualTo(String value) {
            addCriterion("other_field4 <=", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4Like(String value) {
            addCriterion("other_field4 like", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4NotLike(String value) {
            addCriterion("other_field4 not like", value, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4In(List<String> values) {
            addCriterion("other_field4 in", values, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4NotIn(List<String> values) {
            addCriterion("other_field4 not in", values, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4Between(String value1, String value2) {
            addCriterion("other_field4 between", value1, value2, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField4NotBetween(String value1, String value2) {
            addCriterion("other_field4 not between", value1, value2, "otherField4");
            return (Criteria) this;
        }

        public Criteria andOtherField5IsNull() {
            addCriterion("other_field5 is null");
            return (Criteria) this;
        }

        public Criteria andOtherField5IsNotNull() {
            addCriterion("other_field5 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherField5EqualTo(String value) {
            addCriterion("other_field5 =", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5NotEqualTo(String value) {
            addCriterion("other_field5 <>", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5GreaterThan(String value) {
            addCriterion("other_field5 >", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5GreaterThanOrEqualTo(String value) {
            addCriterion("other_field5 >=", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5LessThan(String value) {
            addCriterion("other_field5 <", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5LessThanOrEqualTo(String value) {
            addCriterion("other_field5 <=", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5Like(String value) {
            addCriterion("other_field5 like", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5NotLike(String value) {
            addCriterion("other_field5 not like", value, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5In(List<String> values) {
            addCriterion("other_field5 in", values, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5NotIn(List<String> values) {
            addCriterion("other_field5 not in", values, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5Between(String value1, String value2) {
            addCriterion("other_field5 between", value1, value2, "otherField5");
            return (Criteria) this;
        }

        public Criteria andOtherField5NotBetween(String value1, String value2) {
            addCriterion("other_field5 not between", value1, value2, "otherField5");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
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