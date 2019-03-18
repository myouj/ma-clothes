package com.ma.clothes.pojo.entity;

public class Depot {
    private String id;

    private String name;

    private String address;

    private Long storageCharge;

    private Long truckage;

    private Byte type;

    private String principal;

    private String sort;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getStorageCharge() {
        return storageCharge;
    }

    public void setStorageCharge(Long storageCharge) {
        this.storageCharge = storageCharge;
    }

    public Long getTruckage() {
        return truckage;
    }

    public void setTruckage(Long truckage) {
        this.truckage = truckage;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}