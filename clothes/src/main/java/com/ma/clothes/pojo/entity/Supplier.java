package com.ma.clothes.pojo.entity;

public class Supplier {
    private String id;

    private String supplier;

    private String contacts;

    private String phoneNumber;

    private String email;

    private String remark;

    private Boolean isSystem;

    private String type;

    private Byte enabled;

    private Long advanceIn;

    private Long beginNeedGet;

    private Long beginNeedPay;

    private Long allNeedGet;

    private Long allNeedPay;

    private String fax;

    private String telephone;

    private String address;

    private String taxNumber;

    private String bankName;

    private String accountNumber;

    private Double taxRate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Long getAdvanceIn() {
        return advanceIn;
    }

    public void setAdvanceIn(Long advanceIn) {
        this.advanceIn = advanceIn;
    }

    public Long getBeginNeedGet() {
        return beginNeedGet;
    }

    public void setBeginNeedGet(Long beginNeedGet) {
        this.beginNeedGet = beginNeedGet;
    }

    public Long getBeginNeedPay() {
        return beginNeedPay;
    }

    public void setBeginNeedPay(Long beginNeedPay) {
        this.beginNeedPay = beginNeedPay;
    }

    public Long getAllNeedGet() {
        return allNeedGet;
    }

    public void setAllNeedGet(Long allNeedGet) {
        this.allNeedGet = allNeedGet;
    }

    public Long getAllNeedPay() {
        return allNeedPay;
    }

    public void setAllNeedPay(Long allNeedPay) {
        this.allNeedPay = allNeedPay;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}