package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class AccountAnalysisSecuritiesPositionDetails {
    @JsonProperty("u")
    private String u;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("secuAcct")
    private String secuAcct;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("prodNo")
    private String prodNo;
    @JsonProperty("prodName")
    private String prodName;
    @JsonProperty("prodTypeCd")
    private String prodTypeCd;
    @JsonProperty("origCurrCd")
    private String origCurrCd;
    @JsonProperty("exchRate")
    private BigDecimal exchRate;
    @JsonProperty("shareBal")
    private BigDecimal shareBal;
    @JsonProperty("posCost")
    private BigDecimal posCost;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("origCurrMrktVal")
    private BigDecimal origCurrMrktVal;
    @JsonProperty("mrktValRmb")
    private BigDecimal mrktValRmb;

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getBizDt() {
        return bizDt;
    }

    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    public String getSecuAcct() {
        return secuAcct;
    }

    public void setSecuAcct(String secuAcct) {
        this.secuAcct = secuAcct;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdTypeCd() {
        return prodTypeCd;
    }

    public void setProdTypeCd(String prodTypeCd) {
        this.prodTypeCd = prodTypeCd;
    }

    public String getOrigCurrCd() {
        return origCurrCd;
    }

    public void setOrigCurrCd(String origCurrCd) {
        this.origCurrCd = origCurrCd;
    }

    public BigDecimal getExchRate() {
        return exchRate;
    }

    public void setExchRate(BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    public BigDecimal getShareBal() {
        return shareBal;
    }

    public void setShareBal(BigDecimal shareBal) {
        this.shareBal = shareBal;
    }

    public BigDecimal getPosCost() {
        return posCost;
    }

    public void setPosCost(BigDecimal posCost) {
        this.posCost = posCost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOrigCurrMrktVal() {
        return origCurrMrktVal;
    }

    public void setOrigCurrMrktVal(BigDecimal origCurrMrktVal) {
        this.origCurrMrktVal = origCurrMrktVal;
    }

    public BigDecimal getMrktValRmb() {
        return mrktValRmb;
    }

    public void setMrktValRmb(BigDecimal mrktValRmb) {
        this.mrktValRmb = mrktValRmb;
    }
}
