package com.ma.clothes.pojo.entity;

public class Application {
    private String id;

    private String number;

    private String name;

    private String type;

    private String icon;

    private String url;

    private String width;

    private String height;

    private Boolean resize;

    private Boolean openMax;

    private Boolean flash;

    private String category;

    private String sort;

    private String remark;

    private Boolean enabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width == null ? null : width.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public Boolean getResize() {
        return resize;
    }

    public void setResize(Boolean resize) {
        this.resize = resize;
    }

    public Boolean getOpenMax() {
        return openMax;
    }

    public void setOpenMax(Boolean openMax) {
        this.openMax = openMax;
    }

    public Boolean getFlash() {
        return flash;
    }

    public void setFlash(Boolean flash) {
        this.flash = flash;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}