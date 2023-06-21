package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class AssetInformationInTransit {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("secuAcct")
    private String secuAcct;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("secuCode")
    private String secuCode;
    @JsonProperty("secuName")
    private String secuName;
    @JsonProperty("secuUnit")
    private String secuUnit;
    @JsonProperty("assetTypeCd")
    private String assetTypeCd;
    @JsonProperty("assetTypeDesc")
    private String assetTypeDesc;
    @JsonProperty("assetDir")
    private String assetDir;
    @JsonProperty("currCd")
    private String currCd;
    @JsonProperty("secuQtty")
    private BigDecimal secuQtty;
    @JsonProperty("inTranAmt")
    private BigDecimal inTranAmt;
    @JsonProperty("expectBillDate")
    private String expectBillDate;
    @JsonProperty("crdtAcctFlag")
    private String crdtAcctFlag;
    @JsonProperty("issuePrice")
    private BigDecimal issuePrice;
    @JsonProperty("xrPrice")
    private BigDecimal xrPrice;
    @JsonProperty("closingPrice")
    private BigDecimal closingPrice;

    public String getBizDt() {
        return bizDt;
    }

    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    public String getAssetAcct() {
        return assetAcct;
    }

    public void setAssetAcct(String assetAcct) {
        this.assetAcct = assetAcct;
    }

    public String getSecuAcct() {
        return secuAcct;
    }

    public void setSecuAcct(String secuAcct) {
        this.secuAcct = secuAcct;
    }

    public String getBelongOrgId() {
        return belongOrgId;
    }

    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }

    public String getSecuCode() {
        return secuCode;
    }

    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    public String getSecuName() {
        return secuName;
    }

    public void setSecuName(String secuName) {
        this.secuName = secuName;
    }

    public String getSecuUnit() {
        return secuUnit;
    }

    public void setSecuUnit(String secuUnit) {
        this.secuUnit = secuUnit;
    }

    public String getAssetTypeCd() {
        return assetTypeCd;
    }

    public void setAssetTypeCd(String assetTypeCd) {
        this.assetTypeCd = assetTypeCd;
    }

    public String getAssetTypeDesc() {
        return assetTypeDesc;
    }

    public void setAssetTypeDesc(String assetTypeDesc) {
        this.assetTypeDesc = assetTypeDesc;
    }

    public String getAssetDir() {
        return assetDir;
    }

    public void setAssetDir(String assetDir) {
        this.assetDir = assetDir;
    }

    public String getCurrCd() {
        return currCd;
    }

    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    public BigDecimal getSecuQtty() {
        return secuQtty;
    }

    public void setSecuQtty(BigDecimal secuQtty) {
        this.secuQtty = secuQtty;
    }

    public BigDecimal getInTranAmt() {
        return inTranAmt;
    }

    public void setInTranAmt(BigDecimal inTranAmt) {
        this.inTranAmt = inTranAmt;
    }

    public String getExpectBillDate() {
        return expectBillDate;
    }

    public void setExpectBillDate(String expectBillDate) {
        this.expectBillDate = expectBillDate;
    }

    public String getCrdtAcctFlag() {
        return crdtAcctFlag;
    }

    public void setCrdtAcctFlag(String crdtAcctFlag) {
        this.crdtAcctFlag = crdtAcctFlag;
    }

    public BigDecimal getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
    }

    public BigDecimal getXrPrice() {
        return xrPrice;
    }

    public void setXrPrice(BigDecimal xrPrice) {
        this.xrPrice = xrPrice;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }


}
