package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class ESOPAssetAccountInfoBean {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("dataLabel")
    private String dataLabel;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("acctType")
    private String acctType;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("secuAcct")
    private String secuAcct;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("certId")
    private String certId;
    @JsonProperty("depoBankId")
    private String depoBankId;
    @JsonProperty("currCd")
    private String currCd;
    @JsonProperty("depoBankName")
    private String depoBankName;
    @JsonProperty("acctLimit")
    private String acctLimit;

    @JsonIgnore
    public String getBizDt() {
        return bizDt;
    }

    @JsonIgnore
    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    @JsonIgnore
    public String getDataLabel() {
        return dataLabel;
    }

    @JsonIgnore
    public void setDataLabel(String dataLabel) {
        this.dataLabel = dataLabel;
    }

    @JsonIgnore
    public String getAssetAcct() {
        return assetAcct;
    }

    @JsonIgnore
    public void setAssetAcct(String assetAcct) {
        this.assetAcct = assetAcct;
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
    public String getBelongOrgId() {
        return belongOrgId;
    }

    @JsonIgnore
    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    @JsonIgnore
    public String getSecuAcct() {
        return secuAcct;
    }

    @JsonIgnore
    public void setSecuAcct(String secuAcct) {
        this.secuAcct = secuAcct;
    }

    @JsonIgnore
    public String getTradeMrkt() {
        return tradeMrkt;
    }

    @JsonIgnore
    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }

    @JsonIgnore
    public String getCertId() {
        return certId;
    }

    @JsonIgnore
    public void setCertId(String certId) {
        this.certId = certId;
    }

    @JsonIgnore
    public String getDepoBankId() {
        return depoBankId;
    }

    @JsonIgnore
    public void setDepoBankId(String depoBankId) {
        this.depoBankId = depoBankId;
    }

    @JsonIgnore
    public String getCurrCd() {
        return currCd;
    }

    @JsonIgnore
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    @JsonIgnore
    public String getDepoBankName() {
        return depoBankName;
    }

    @JsonIgnore
    public void setDepoBankName(String depoBankName) {
        this.depoBankName = depoBankName;
    }

    @JsonIgnore
    public String getAcctLimit() {
        return acctLimit;
    }

    @JsonIgnore
    public void setAcctLimit(String acctLimit) {
        this.acctLimit = acctLimit;
    }
}
