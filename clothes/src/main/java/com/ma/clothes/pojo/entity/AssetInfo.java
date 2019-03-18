package com.ma.clothes.pojo.entity;

public class AssetInfo {
    private String id;

    private String assetName;

    private String assetCategoryId;

    private Boolean isSystem;

    private String description;

    private Boolean isConsumables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getAssetCategoryId() {
        return assetCategoryId;
    }

    public void setAssetCategoryId(String assetCategoryId) {
        this.assetCategoryId = assetCategoryId == null ? null : assetCategoryId.trim();
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIsConsumables() {
        return isConsumables;
    }

    public void setIsConsumables(Boolean isConsumables) {
        this.isConsumables = isConsumables;
    }
}