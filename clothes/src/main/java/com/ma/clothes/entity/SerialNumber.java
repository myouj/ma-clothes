package entity;

import java.util.Date;

public class SerialNumber {
    private String id;

    private String materialId;

    private String serialNumber;

    private Boolean isSell;

    private String remark;

    private Boolean delectFlag;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updator;

    private String documentHeadId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Boolean getIsSell() {
        return isSell;
    }

    public void setIsSell(Boolean isSell) {
        this.isSell = isSell;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDelectFlag() {
        return delectFlag;
    }

    public void setDelectFlag(Boolean delectFlag) {
        this.delectFlag = delectFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public String getDocumentHeadId() {
        return documentHeadId;
    }

    public void setDocumentHeadId(String documentHeadId) {
        this.documentHeadId = documentHeadId == null ? null : documentHeadId.trim();
    }
}