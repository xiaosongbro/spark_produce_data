package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class AccountAnalysisAssets {
    @JsonProperty("u")
    private String u;
    @JsonProperty("org")
    private String org;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("totalAsset")
    private BigDecimal totalAsset;
    @JsonProperty("capBal")
    private BigDecimal capBal;
    @JsonProperty("otcMrktVal")
    private BigDecimal otcMrktVal;
    @JsonProperty("secuAllMrktVal")
    private BigDecimal secuAllMrktVal;
    @JsonProperty("assetModif")
    private BigDecimal assetModif;
    @JsonProperty("totalLiab")
    private BigDecimal totalLiab;
    @JsonProperty("acctProfit")
    private BigDecimal acctProfit;
    @JsonProperty("acctProfitRate")
    private BigDecimal acctProfitRate;
    @JsonProperty("openAcctDt")
    private String openAcctDt;


    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getBizDt() {
        return bizDt;
    }

    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    public BigDecimal getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(BigDecimal totalAsset) {
        this.totalAsset = totalAsset;
    }

    public BigDecimal getCapBal() {
        return capBal;
    }

    public void setCapBal(BigDecimal capBal) {
        this.capBal = capBal;
    }

    public BigDecimal getOtcMrktVal() {
        return otcMrktVal;
    }

    public void setOtcMrktVal(BigDecimal otcMrktVal) {
        this.otcMrktVal = otcMrktVal;
    }

    public BigDecimal getSecuAllMrktVal() {
        return secuAllMrktVal;
    }

    public void setSecuAllMrktVal(BigDecimal secuAllMrktVal) {
        this.secuAllMrktVal = secuAllMrktVal;
    }

    public BigDecimal getAssetModif() {
        return assetModif;
    }

    public void setAssetModif(BigDecimal assetModif) {
        this.assetModif = assetModif;
    }

    public BigDecimal getTotalLiab() {
        return totalLiab;
    }

    public void setTotalLiab(BigDecimal totalLiab) {
        this.totalLiab = totalLiab;
    }

    public BigDecimal getAcctProfit() {
        return acctProfit;
    }

    public void setAcctProfit(BigDecimal acctProfit) {
        this.acctProfit = acctProfit;
    }

    public BigDecimal getAcctProfitRate() {
        return acctProfitRate;
    }

    public void setAcctProfitRate(BigDecimal acctProfitRate) {
        this.acctProfitRate = acctProfitRate;
    }

    public String getOpenAcctDt() {
        return openAcctDt;
    }

    public void setOpenAcctDt(String openAcctDt) {
        this.openAcctDt = openAcctDt;
    }
}
