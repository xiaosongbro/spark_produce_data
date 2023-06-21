package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class FundPositionsProfit {
    @JsonProperty("bizDate")
    private String bizDate;
    @JsonProperty("dailyPrft")
    private BigDecimal dailyPrft;
    @JsonProperty("holdShare")
    private BigDecimal holdShare;
    @JsonProperty("netVal")
    private BigDecimal netVal;
    @JsonProperty("dailyAoin")
    private BigDecimal dailyAoin;
    // 20230406 新增
    @JsonProperty("moneFund10ThouShareYld")
    public BigDecimal moneFund10ThouShareYld;
    @JsonProperty("moneFund7daysAnnuYId")
    public String moneFund7daysAnnuYId;


    @JsonIgnore
    public String getBizDate() {
        return bizDate;
    }
    @JsonIgnore
    public void setBizDate(String bizDate) {
        this.bizDate = bizDate;
    }
    @JsonIgnore
    public BigDecimal getDailyPrft() {
        return dailyPrft;
    }
    @JsonIgnore
    public void setDailyPrft(BigDecimal dailyPrft) {
        this.dailyPrft = dailyPrft;
    }

    @JsonIgnore
    public BigDecimal getHoldShare() {
        return holdShare;
    }
    @JsonIgnore
    public void setHoldShare(BigDecimal holdShare) {
        this.holdShare = holdShare;
    }
    @JsonIgnore
    public BigDecimal getNetVal() {
        return netVal;
    }
    @JsonIgnore
    public void setNetVal(BigDecimal netVal) {
        this.netVal = netVal;
    }
    @JsonIgnore
    public BigDecimal getDailyAoin() {
        return dailyAoin;
    }
    @JsonIgnore
    public void setDailyAoin(BigDecimal dailyAoin) {
        this.dailyAoin = dailyAoin.multiply(BigDecimal.valueOf(100));
    }

    public BigDecimal getMoneFund10ThouShareYld() {
        return moneFund10ThouShareYld;
    }

    public void setMoneFund10ThouShareYld(BigDecimal moneFund10ThouShareYld) {
        this.moneFund10ThouShareYld = moneFund10ThouShareYld;
    }

    public String getMoneFund7daysAnnuYId() {
        return moneFund7daysAnnuYId;
    }

    public void setMoneFund7daysAnnuYId(String moneFund7daysAnnuYId) {
        this.moneFund7daysAnnuYId = moneFund7daysAnnuYId;
    }
}
