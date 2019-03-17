package entity;

public class AccountItem {
    private String id;

    private String headerId;

    private String accountId;

    private String ioitemId;

    private Long eachAmount;

    private String remark;

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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getIoitemId() {
        return ioitemId;
    }

    public void setIoitemId(String ioitemId) {
        this.ioitemId = ioitemId == null ? null : ioitemId.trim();
    }

    public Long getEachAmount() {
        return eachAmount;
    }

    public void setEachAmount(Long eachAmount) {
        this.eachAmount = eachAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}