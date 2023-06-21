package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class AccountAnalysisFund {
    @JsonProperty("u")
    private String u;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("origCurrCd")
    private Integer origCurrCd;
    @JsonProperty("origCurrCapBal")
    private BigDecimal origCurrCapBal;
    @JsonProperty("exchRate")
    private BigDecimal exchRate;
    @JsonProperty("capBalRmb")
    private BigDecimal capBalRmb;

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

    public Integer getOrigCurrCd() {
        return origCurrCd;
    }

    public void setOrigCurrCd(Integer origCurrCd) {
        this.origCurrCd = origCurrCd;
    }

    public BigDecimal getOrigCurrCapBal() {
        return origCurrCapBal;
    }

    public void setOrigCurrCapBal(BigDecimal origCurrCapBal) {
        this.origCurrCapBal = origCurrCapBal;
    }

    public BigDecimal getExchRate() {
        return exchRate;
    }

    public void setExchRate(BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    public BigDecimal getCapBalRmb() {
        return capBalRmb;
    }

    public void setCapBalRmb(BigDecimal capBalRmb) {
        this.capBalRmb = capBalRmb;
    }
}
