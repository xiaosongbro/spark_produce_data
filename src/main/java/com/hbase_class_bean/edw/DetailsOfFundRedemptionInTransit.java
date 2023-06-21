package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class DetailsOfFundRedemptionInTransit {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("fundCd")
    private String fundCd;
    @JsonProperty("fundName")
    private String fundName;
    @JsonProperty("fundUnitNetVal")
    private BigDecimal fundUnitNetVal;
    @JsonProperty("fundTradeShare")
    private BigDecimal fundTradeShare;
    @JsonProperty("fundTradeAmt")
    private BigDecimal fundTradeAmt;
    @JsonProperty("fundRedemDt")
    private String fundRedemDt;
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

    public String getFundCd() {
        return fundCd;
    }

    public void setFundCd(String fundCd) {
        this.fundCd = fundCd;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public BigDecimal getFundUnitNetVal() {
        return fundUnitNetVal;
    }

    public void setFundUnitNetVal(BigDecimal fundUnitNetVal) {
        this.fundUnitNetVal = fundUnitNetVal;
    }

    public BigDecimal getFundTradeShare() {
        return fundTradeShare;
    }

    public void setFundTradeShare(BigDecimal fundTradeShare) {
        this.fundTradeShare = fundTradeShare;
    }

    public BigDecimal getFundTradeAmt() {
        return fundTradeAmt;
    }

    public void setFundTradeAmt(BigDecimal fundTradeAmt) {
        this.fundTradeAmt = fundTradeAmt;
    }

    public String getFundRedemDt() {
        return fundRedemDt;
    }

    public void setFundRedemDt(String fundRedemDt) {
        this.fundRedemDt = fundRedemDt;
    }

    public String getExpectBillDt() {
        return expectBillDt;
    }

    public void setExpectBillDt(String expectBillDt) {
        this.expectBillDt = expectBillDt;
    }
}
