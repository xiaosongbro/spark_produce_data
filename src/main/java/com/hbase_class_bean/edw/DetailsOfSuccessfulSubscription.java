package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class DetailsOfSuccessfulSubscription {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("secuCode")
    private String secuCode;
    @JsonProperty("secuName")
    private String secuName;
    @JsonProperty("subscrDt")
    private String subscrDt;
    @JsonProperty("lotteryDt")
    private String lotteryDt;
    @JsonProperty("settleDt")
    private String settleDt;
    @JsonProperty("issuePrice")
    private BigDecimal issuePrice;
    @JsonProperty("subscrQtty")
    private BigDecimal subscrQtty;
    @JsonProperty("refeMrktVal")
    private BigDecimal refeMrktVal;
    @JsonProperty("expectBillDt")
    private String expectBillDt;

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

    public String getSubscrDt() {
        return subscrDt;
    }

    public void setSubscrDt(String subscrDt) {
        this.subscrDt = subscrDt;
    }

    public String getLotteryDt() {
        return lotteryDt;
    }

    public void setLotteryDt(String lotteryDt) {
        this.lotteryDt = lotteryDt;
    }

    public String getSettleDt() {
        return settleDt;
    }

    public void setSettleDt(String settleDt) {
        this.settleDt = settleDt;
    }

    public BigDecimal getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(BigDecimal issuePrice) {
        this.issuePrice = issuePrice;
    }

    public BigDecimal getSubscrQtty() {
        return subscrQtty;
    }

    public void setSubscrQtty(BigDecimal subscrQtty) {
        this.subscrQtty = subscrQtty;
    }

    public BigDecimal getRefeMrktVal() {
        return refeMrktVal;
    }

    public void setRefeMrktVal(BigDecimal refeMrktVal) {
        this.refeMrktVal = refeMrktVal;
    }

    public String getExpectBillDt() {
        return expectBillDt;
    }

    public void setExpectBillDt(String expectBillDt) {
        this.expectBillDt = expectBillDt;
    }
}
