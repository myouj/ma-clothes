package com.ma.clothes.pojo.entity;

public class Material {
    private String id;

    private String categoryId;

    private String name;

    private String manufacturer;

    private Integer packing;

    private Integer safetyStock;

    private String model;

    private String standard;

    private String color;

    private String unit;

    private String remark;

    private Integer retailRrice;

    private Integer lowPrice;

    private Integer presetPriceOne;

    private Integer presetPriceTwo;

    private String unitId;

    private String firstOutUnit;

    private String firstInUnit;

    private String priceStrategy;

    private Boolean enabled;

    private String otherField1;

    private String otherField2;

    private String otherField3;

    private Boolean enabledSerialNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Integer getPacking() {
        return packing;
    }

    public void setPacking(Integer packing) {
        this.packing = packing;
    }

    public Integer getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(Integer safetyStock) {
        this.safetyStock = safetyStock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRetailRrice() {
        return retailRrice;
    }

    public void setRetailRrice(Integer retailRrice) {
        this.retailRrice = retailRrice;
    }

    public Integer getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Integer lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Integer getPresetPriceOne() {
        return presetPriceOne;
    }

    public void setPresetPriceOne(Integer presetPriceOne) {
        this.presetPriceOne = presetPriceOne;
    }

    public Integer getPresetPriceTwo() {
        return presetPriceTwo;
    }

    public void setPresetPriceTwo(Integer presetPriceTwo) {
        this.presetPriceTwo = presetPriceTwo;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getFirstOutUnit() {
        return firstOutUnit;
    }

    public void setFirstOutUnit(String firstOutUnit) {
        this.firstOutUnit = firstOutUnit == null ? null : firstOutUnit.trim();
    }

    public String getFirstInUnit() {
        return firstInUnit;
    }

    public void setFirstInUnit(String firstInUnit) {
        this.firstInUnit = firstInUnit == null ? null : firstInUnit.trim();
    }

    public String getPriceStrategy() {
        return priceStrategy;
    }

    public void setPriceStrategy(String priceStrategy) {
        this.priceStrategy = priceStrategy == null ? null : priceStrategy.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getOtherField1() {
        return otherField1;
    }

    public void setOtherField1(String otherField1) {
        this.otherField1 = otherField1 == null ? null : otherField1.trim();
    }

    public String getOtherField2() {
        return otherField2;
    }

    public void setOtherField2(String otherField2) {
        this.otherField2 = otherField2 == null ? null : otherField2.trim();
    }

    public String getOtherField3() {
        return otherField3;
    }

    public void setOtherField3(String otherField3) {
        this.otherField3 = otherField3 == null ? null : otherField3.trim();
    }

    public Boolean getEnabledSerialNumber() {
        return enabledSerialNumber;
    }

    public void setEnabledSerialNumber(Boolean enabledSerialNumber) {
        this.enabledSerialNumber = enabledSerialNumber;
    }
}