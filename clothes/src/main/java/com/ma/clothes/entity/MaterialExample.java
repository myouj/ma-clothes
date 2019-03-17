package entity;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andPackingIsNull() {
            addCriterion("packing is null");
            return (Criteria) this;
        }

        public Criteria andPackingIsNotNull() {
            addCriterion("packing is not null");
            return (Criteria) this;
        }

        public Criteria andPackingEqualTo(Integer value) {
            addCriterion("packing =", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotEqualTo(Integer value) {
            addCriterion("packing <>", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingGreaterThan(Integer value) {
            addCriterion("packing >", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingGreaterThanOrEqualTo(Integer value) {
            addCriterion("packing >=", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLessThan(Integer value) {
            addCriterion("packing <", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLessThanOrEqualTo(Integer value) {
            addCriterion("packing <=", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingIn(List<Integer> values) {
            addCriterion("packing in", values, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotIn(List<Integer> values) {
            addCriterion("packing not in", values, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingBetween(Integer value1, Integer value2) {
            addCriterion("packing between", value1, value2, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotBetween(Integer value1, Integer value2) {
            addCriterion("packing not between", value1, value2, "packing");
            return (Criteria) this;
        }

        public Criteria andSafetyStockIsNull() {
            addCriterion("safety_stock is null");
            return (Criteria) this;
        }

        public Criteria andSafetyStockIsNotNull() {
            addCriterion("safety_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyStockEqualTo(Integer value) {
            addCriterion("safety_stock =", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockNotEqualTo(Integer value) {
            addCriterion("safety_stock <>", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockGreaterThan(Integer value) {
            addCriterion("safety_stock >", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("safety_stock >=", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockLessThan(Integer value) {
            addCriterion("safety_stock <", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockLessThanOrEqualTo(Integer value) {
            addCriterion("safety_stock <=", value, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockIn(List<Integer> values) {
            addCriterion("safety_stock in", values, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockNotIn(List<Integer> values) {
            addCriterion("safety_stock not in", values, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockBetween(Integer value1, Integer value2) {
            addCriterion("safety_stock between", value1, value2, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andSafetyStockNotBetween(Integer value1, Integer value2) {
            addCriterion("safety_stock not between", value1, value2, "safetyStock");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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

        public Criteria andRetailRriceIsNull() {
            addCriterion("retail_rrice is null");
            return (Criteria) this;
        }

        public Criteria andRetailRriceIsNotNull() {
            addCriterion("retail_rrice is not null");
            return (Criteria) this;
        }

        public Criteria andRetailRriceEqualTo(Integer value) {
            addCriterion("retail_rrice =", value, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceNotEqualTo(Integer value) {
            addCriterion("retail_rrice <>", value, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceGreaterThan(Integer value) {
            addCriterion("retail_rrice >", value, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_rrice >=", value, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceLessThan(Integer value) {
            addCriterion("retail_rrice <", value, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceLessThanOrEqualTo(Integer value) {
            addCriterion("retail_rrice <=", value, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceIn(List<Integer> values) {
            addCriterion("retail_rrice in", values, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceNotIn(List<Integer> values) {
            addCriterion("retail_rrice not in", values, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceBetween(Integer value1, Integer value2) {
            addCriterion("retail_rrice between", value1, value2, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andRetailRriceNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_rrice not between", value1, value2, "retailRrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceIsNull() {
            addCriterion("low_price is null");
            return (Criteria) this;
        }

        public Criteria andLowPriceIsNotNull() {
            addCriterion("low_price is not null");
            return (Criteria) this;
        }

        public Criteria andLowPriceEqualTo(Integer value) {
            addCriterion("low_price =", value, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceNotEqualTo(Integer value) {
            addCriterion("low_price <>", value, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceGreaterThan(Integer value) {
            addCriterion("low_price >", value, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("low_price >=", value, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceLessThan(Integer value) {
            addCriterion("low_price <", value, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceLessThanOrEqualTo(Integer value) {
            addCriterion("low_price <=", value, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceIn(List<Integer> values) {
            addCriterion("low_price in", values, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceNotIn(List<Integer> values) {
            addCriterion("low_price not in", values, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceBetween(Integer value1, Integer value2) {
            addCriterion("low_price between", value1, value2, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andLowPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("low_price not between", value1, value2, "lowPrice");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneIsNull() {
            addCriterion("preset_price_one is null");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneIsNotNull() {
            addCriterion("preset_price_one is not null");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneEqualTo(Integer value) {
            addCriterion("preset_price_one =", value, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneNotEqualTo(Integer value) {
            addCriterion("preset_price_one <>", value, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneGreaterThan(Integer value) {
            addCriterion("preset_price_one >", value, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("preset_price_one >=", value, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneLessThan(Integer value) {
            addCriterion("preset_price_one <", value, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneLessThanOrEqualTo(Integer value) {
            addCriterion("preset_price_one <=", value, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneIn(List<Integer> values) {
            addCriterion("preset_price_one in", values, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneNotIn(List<Integer> values) {
            addCriterion("preset_price_one not in", values, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneBetween(Integer value1, Integer value2) {
            addCriterion("preset_price_one between", value1, value2, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceOneNotBetween(Integer value1, Integer value2) {
            addCriterion("preset_price_one not between", value1, value2, "presetPriceOne");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoIsNull() {
            addCriterion("preset_price_two is null");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoIsNotNull() {
            addCriterion("preset_price_two is not null");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoEqualTo(Integer value) {
            addCriterion("preset_price_two =", value, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoNotEqualTo(Integer value) {
            addCriterion("preset_price_two <>", value, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoGreaterThan(Integer value) {
            addCriterion("preset_price_two >", value, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("preset_price_two >=", value, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoLessThan(Integer value) {
            addCriterion("preset_price_two <", value, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoLessThanOrEqualTo(Integer value) {
            addCriterion("preset_price_two <=", value, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoIn(List<Integer> values) {
            addCriterion("preset_price_two in", values, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoNotIn(List<Integer> values) {
            addCriterion("preset_price_two not in", values, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoBetween(Integer value1, Integer value2) {
            addCriterion("preset_price_two between", value1, value2, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andPresetPriceTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("preset_price_two not between", value1, value2, "presetPriceTwo");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("unit_id like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("unit_id not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitIsNull() {
            addCriterion("first_out_unit is null");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitIsNotNull() {
            addCriterion("first_out_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitEqualTo(String value) {
            addCriterion("first_out_unit =", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitNotEqualTo(String value) {
            addCriterion("first_out_unit <>", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitGreaterThan(String value) {
            addCriterion("first_out_unit >", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitGreaterThanOrEqualTo(String value) {
            addCriterion("first_out_unit >=", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitLessThan(String value) {
            addCriterion("first_out_unit <", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitLessThanOrEqualTo(String value) {
            addCriterion("first_out_unit <=", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitLike(String value) {
            addCriterion("first_out_unit like", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitNotLike(String value) {
            addCriterion("first_out_unit not like", value, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitIn(List<String> values) {
            addCriterion("first_out_unit in", values, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitNotIn(List<String> values) {
            addCriterion("first_out_unit not in", values, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitBetween(String value1, String value2) {
            addCriterion("first_out_unit between", value1, value2, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstOutUnitNotBetween(String value1, String value2) {
            addCriterion("first_out_unit not between", value1, value2, "firstOutUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitIsNull() {
            addCriterion("first_in_unit is null");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitIsNotNull() {
            addCriterion("first_in_unit is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitEqualTo(String value) {
            addCriterion("first_in_unit =", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitNotEqualTo(String value) {
            addCriterion("first_in_unit <>", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitGreaterThan(String value) {
            addCriterion("first_in_unit >", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitGreaterThanOrEqualTo(String value) {
            addCriterion("first_in_unit >=", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitLessThan(String value) {
            addCriterion("first_in_unit <", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitLessThanOrEqualTo(String value) {
            addCriterion("first_in_unit <=", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitLike(String value) {
            addCriterion("first_in_unit like", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitNotLike(String value) {
            addCriterion("first_in_unit not like", value, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitIn(List<String> values) {
            addCriterion("first_in_unit in", values, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitNotIn(List<String> values) {
            addCriterion("first_in_unit not in", values, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitBetween(String value1, String value2) {
            addCriterion("first_in_unit between", value1, value2, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andFirstInUnitNotBetween(String value1, String value2) {
            addCriterion("first_in_unit not between", value1, value2, "firstInUnit");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyIsNull() {
            addCriterion("price_strategy is null");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyIsNotNull() {
            addCriterion("price_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyEqualTo(String value) {
            addCriterion("price_strategy =", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyNotEqualTo(String value) {
            addCriterion("price_strategy <>", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyGreaterThan(String value) {
            addCriterion("price_strategy >", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyGreaterThanOrEqualTo(String value) {
            addCriterion("price_strategy >=", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyLessThan(String value) {
            addCriterion("price_strategy <", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyLessThanOrEqualTo(String value) {
            addCriterion("price_strategy <=", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyLike(String value) {
            addCriterion("price_strategy like", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyNotLike(String value) {
            addCriterion("price_strategy not like", value, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyIn(List<String> values) {
            addCriterion("price_strategy in", values, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyNotIn(List<String> values) {
            addCriterion("price_strategy not in", values, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyBetween(String value1, String value2) {
            addCriterion("price_strategy between", value1, value2, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andPriceStrategyNotBetween(String value1, String value2) {
            addCriterion("price_strategy not between", value1, value2, "priceStrategy");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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

        public Criteria andEnabledSerialNumberIsNull() {
            addCriterion("enabled_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberIsNotNull() {
            addCriterion("enabled_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberEqualTo(Boolean value) {
            addCriterion("enabled_serial_number =", value, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberNotEqualTo(Boolean value) {
            addCriterion("enabled_serial_number <>", value, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberGreaterThan(Boolean value) {
            addCriterion("enabled_serial_number >", value, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled_serial_number >=", value, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberLessThan(Boolean value) {
            addCriterion("enabled_serial_number <", value, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled_serial_number <=", value, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberIn(List<Boolean> values) {
            addCriterion("enabled_serial_number in", values, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberNotIn(List<Boolean> values) {
            addCriterion("enabled_serial_number not in", values, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled_serial_number between", value1, value2, "enabledSerialNumber");
            return (Criteria) this;
        }

        public Criteria andEnabledSerialNumberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled_serial_number not between", value1, value2, "enabledSerialNumber");
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