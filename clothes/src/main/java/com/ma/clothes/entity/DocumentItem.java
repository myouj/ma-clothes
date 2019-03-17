package entity;

public class DocumentItem {
    private String id;

    private String headerId;

    private String materialId;

    private String measuringUnit;

    private Integer count;

    private Integer basicNumber;

    private Integer unitPrice;

    private Integer taxUnitPrice;

    private Long allPrice;

    private String remark;

    private String icon;

    private Long incidentals;

    private String depotId;

    private String anotherDepotId;

    private Double taxRate;

    private Long taxMoney;

    private Long taxLastMoney;

    private String otherField1;

    private String otherField2;

    private String otherField3;

    private String otherField4;

    private String otherField5;

    private String materialType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHeaderId() {
        return headerId;
    }

    public void setHeaderId(String headerId) {
        this.headerId = headerId == null ? null : headerId.trim();
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit == null ? null : measuringUnit.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBasicNumber() {
        return basicNumber;
    }

    public void setBasicNumber(Integer basicNumber) {
        this.basicNumber = basicNumber;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getTaxUnitPrice() {
        return taxUnitPrice;
    }

    public void setTaxUnitPrice(Integer taxUnitPrice) {
        this.taxUnitPrice = taxUnitPrice;
    }

    public Long getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(Long allPrice) {
        this.allPrice = allPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Long getIncidentals() {
        return incidentals;
    }

    public void setIncidentals(Long incidentals) {
        this.incidentals = incidentals;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId == null ? null : depotId.trim();
    }

    public String getAnotherDepotId() {
        return anotherDepotId;
    }

    public void setAnotherDepotId(String anotherDepotId) {
        this.anotherDepotId = anotherDepotId == null ? null : anotherDepotId.trim();
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Long getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(Long taxMoney) {
        this.taxMoney = taxMoney;
    }

    public Long getTaxLastMoney() {
        return taxLastMoney;
    }

    public void setTaxLastMoney(Long taxLastMoney) {
        this.taxLastMoney = taxLastMoney;
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

    public String getOtherField4() {
        return otherField4;
    }

    public void setOtherField4(String otherField4) {
        this.otherField4 = otherField4 == null ? null : otherField4.trim();
    }

    public String getOtherField5() {
        return otherField5;
    }

    public void setOtherField5(String otherField5) {
        this.otherField5 = otherField5 == null ? null : otherField5.trim();
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }
}