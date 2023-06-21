package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class AccountAnalysisAndSalesRestrictionDetails {
    @JsonProperty("u")
    private String u;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("prodName")
    private String prodName;
    @JsonProperty("prodNo")
    private String prodNo;
    @JsonProperty("prodTypeCd")
    private String prodTypeCd;
    @JsonProperty("limitQtty")
    private BigDecimal limitQtty;
    @JsonProperty("limitMrktVal")
    private BigDecimal limitMrktVal;
    @JsonProperty("impawnFlag")
    private Integer impawnFlag;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;

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

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }

    public String getProdTypeCd() {
        return prodTypeCd;
    }

    public void setProdTypeCd(String prodTypeCd) {
        this.prodTypeCd = prodTypeCd;
    }

    public BigDecimal getLimitQtty() {
        return limitQtty;
    }

    public void setLimitQtty(BigDecimal limitQtty) {
        this.limitQtty = limitQtty;
    }

    public BigDecimal getLimitMrktVal() {
        return limitMrktVal;
    }

    public void setLimitMrktVal(BigDecimal limitMrktVal) {
        this.limitMrktVal = limitMrktVal;
    }

    public Integer getImpawnFlag() {
        return impawnFlag;
    }

    public void setImpawnFlag(Integer impawnFlag) {
        this.impawnFlag = impawnFlag;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }
}
