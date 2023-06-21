package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class OTCRevenueVoucherDetails {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("otcCd")
    private String otcCd;
    @JsonProperty("otcName")
    private String otcName;
    @JsonProperty("prodpreRatio")
    private BigDecimal prodpreRatio;
    @JsonProperty("otcTerm")
    private BigDecimal otcTerm;
    @JsonProperty("otcPurchDt")
    private String otcPurchDt;
    @JsonProperty("otcPurchAmt")
    private BigDecimal otcPurchAmt;
    @JsonProperty("estDt")
    private String estDt;
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

    public String getOtcCd() {
        return otcCd;
    }

    public void setOtcCd(String otcCd) {
        this.otcCd = otcCd;
    }

    public String getOtcName() {
        return otcName;
    }

    public void setOtcName(String otcName) {
        this.otcName = otcName;
    }

    public BigDecimal getProdpreRatio() {
        return prodpreRatio;
    }

    public void setProdpreRatio(BigDecimal prodpreRatio) {
        this.prodpreRatio = prodpreRatio;
    }

    public BigDecimal getOtcTerm() {
        return otcTerm;
    }

    public void setOtcTerm(BigDecimal otcTerm) {
        this.otcTerm = otcTerm;
    }

    public String getOtcPurchDt() {
        return otcPurchDt;
    }

    public void setOtcPurchDt(String otcPurchDt) {
        this.otcPurchDt = otcPurchDt;
    }

    public BigDecimal getOtcPurchAmt() {
        return otcPurchAmt;
    }

    public void setOtcPurchAmt(BigDecimal otcPurchAmt) {
        this.otcPurchAmt = otcPurchAmt;
    }

    public String getEstDt() {
        return estDt;
    }

    public void setEstDt(String estDt) {
        this.estDt = estDt;
    }

    public String getExpectBillDt() {
        return expectBillDt;
    }

    public void setExpectBillDt(String expectBillDt) {
        this.expectBillDt = expectBillDt;
    }
}
