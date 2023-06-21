package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class FundAcctInfo implements Serializable {

    @JsonProperty("fundAcct")
    private String fundAcct;
    @JsonProperty("effectFlag")
    private String effectFlag;
    @JsonProperty("acctType")
    private String acctType;
    @JsonProperty("hostFlag")
    private String hostFlag;
    @JsonProperty("acctStatus")
    private String acctStatus;
    @JsonProperty("belongCompanyId")
    private String belongCompanyId;
    @JsonProperty("belongCompanyName")
    private String belongCompanyName;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("belongOrgName")
    private String belongOrgName;
    @JsonProperty("openAcctDt")
    private String openAcctDt;
    @JsonProperty("serviceList")
    private List<EmpRelaInfo> serviceList = new ArrayList<EmpRelaInfo>();

    @JsonIgnore
    public String getFundAcct() {
        return fundAcct;
    }
    @JsonIgnore
    public void setFundAcct(String fundAcct) {
        this.fundAcct = fundAcct;
    }
    @JsonIgnore
    public String getEffectFlag() {
        return effectFlag;
    }
    @JsonIgnore
    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag;
    }
    @JsonIgnore
    public String getAcctType() {
        return acctType;
    }
    @JsonIgnore
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }
    @JsonIgnore
    public String getHostFlag() {
        return hostFlag;
    }
    @JsonIgnore
    public void setHostFlag(String hostFlag) {
        this.hostFlag = hostFlag;
    }
    @JsonIgnore
    public String getAcctStatus() {
        return acctStatus;
    }
    @JsonIgnore
    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }
    @JsonIgnore
    public String getBelongCompanyId() {
        return belongCompanyId;
    }
    @JsonIgnore
    public void setBelongCompanyId(String belongCompanyId) {
        this.belongCompanyId = belongCompanyId;
    }
    @JsonIgnore
    public String getBelongCompanyName() {
        return belongCompanyName;
    }
    @JsonIgnore
    public void setBelongCompanyName(String belongCompanyName) {
        this.belongCompanyName = belongCompanyName;
    }
    @JsonIgnore
    public String getBelongOrgId() {
        return belongOrgId;
    }
    @JsonIgnore
    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }
    @JsonIgnore
    public String getBelongOrgName() {
        return belongOrgName;
    }
    @JsonIgnore
    public void setBelongOrgName(String belongOrgName) {
        this.belongOrgName = belongOrgName;
    }
    @JsonIgnore
    public String getOpenAcctDt() {
        return openAcctDt;
    }
    @JsonIgnore
    public void setOpenAcctDt(String openAcctDt) {
        this.openAcctDt = openAcctDt;
    }
    @JsonIgnore
    public List<EmpRelaInfo> getServiceList() {
        return serviceList;
    }
    @JsonIgnore
    public void setServiceList(List<EmpRelaInfo> serviceList) {
        this.serviceList = serviceList;
    }
}
