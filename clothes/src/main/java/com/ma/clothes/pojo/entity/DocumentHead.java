package com.ma.clothes.pojo.entity;

import java.util.Date;

public class DocumentHead {
    private String id;

    private String type;

    private String subType;

    private String projectId;

    private String initalNumber;

    private String number;

    private String operatorName;

    private Date createTime;

    private Date operatorTime;

    private String organizationId;

    private String handleId;

    private String accountId;

    private Long changeAmount;

    private String allocationProjectId;

    private Long totalPrice;

    private String payType;

    private String remark;

    private String salesman;

    private String accountIdList;

    private String accountMoneyList;

    private Double discount;

    private Long discountMoney;

    private Long discountLastMoney;

    private Long otherMoney;

    private String otherMoneyList;

    private String otherMoneyItem;

    private Integer accountDate;

    private Boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getInitalNumber() {
        return initalNumber;
    }

    public void setInitalNumber(String initalNumber) {
        this.initalNumber = initalNumber == null ? null : initalNumber.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getHandleId() {
        return handleId;
    }

    public void setHandleId(String handleId) {
        this.handleId = handleId == null ? null : handleId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public Long getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Long changeAmount) {
        this.changeAmount = changeAmount;
    }

    public String getAllocationProjectId() {
        return allocationProjectId;
    }

    public void setAllocationProjectId(String allocationProjectId) {
        this.allocationProjectId = allocationProjectId == null ? null : allocationProjectId.trim();
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
    }

    public String getAccountIdList() {
        return accountIdList;
    }

    public void setAccountIdList(String accountIdList) {
        this.accountIdList = accountIdList == null ? null : accountIdList.trim();
    }

    public String getAccountMoneyList() {
        return accountMoneyList;
    }

    public void setAccountMoneyList(String accountMoneyList) {
        this.accountMoneyList = accountMoneyList == null ? null : accountMoneyList.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Long getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Long discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Long getDiscountLastMoney() {
        return discountLastMoney;
    }

    public void setDiscountLastMoney(Long discountLastMoney) {
        this.discountLastMoney = discountLastMoney;
    }

    public Long getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(Long otherMoney) {
        this.otherMoney = otherMoney;
    }

    public String getOtherMoneyList() {
        return otherMoneyList;
    }

    public void setOtherMoneyList(String otherMoneyList) {
        this.otherMoneyList = otherMoneyList == null ? null : otherMoneyList.trim();
    }

    public String getOtherMoneyItem() {
        return otherMoneyItem;
    }

    public void setOtherMoneyItem(String otherMoneyItem) {
        this.otherMoneyItem = otherMoneyItem == null ? null : otherMoneyItem.trim();
    }

    public Integer getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Integer accountDate) {
        this.accountDate = accountDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}