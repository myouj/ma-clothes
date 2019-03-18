package com.ma.clothes.pojo.entity;

public class UserBusiness {
    private String id;

    private String type;

    private String keyId;

    private String value;

    private String buttonAuthorith;

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

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId == null ? null : keyId.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getButtonAuthorith() {
        return buttonAuthorith;
    }

    public void setButtonAuthorith(String buttonAuthorith) {
        this.buttonAuthorith = buttonAuthorith == null ? null : buttonAuthorith.trim();
    }
}