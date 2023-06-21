package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class StockProfitMonthPart2 {

    @JsonProperty("stkName")
    private String stkName;

    @JsonProperty("stkCode")
    private String stkCode;

    @JsonProperty("currProfit")
    private BigDecimal currProfit;

    @JsonProperty("rmbProfit")
    private BigDecimal rmbProfit;

    @JsonProperty("currCode")
    private String currCode;

    @JsonProperty("rate")
    private BigDecimal rate;

    @JsonProperty("stkType")
    private String stkType;

    @JsonProperty("market")
    private String market;

    @JsonProperty("status")
    private String status;

    @JsonIgnore
    public StockProfitMonthPart2() {
    }

    @JsonIgnore
    public StockProfitMonthPart2(String stkName, String stkCode, BigDecimal currProfit, BigDecimal rmbProfit, String currCode, BigDecimal rate, String stkType, String market, String status) {
        this.stkName = stkName;
        this.stkCode = stkCode;
        this.currProfit = currProfit;
        this.rmbProfit = rmbProfit;
        this.currCode = currCode;
        this.rate = rate;
        this.stkType = stkType;
        this.market = market;
        this.status = status;
    }

    @JsonIgnore
    public String getStkName() {
        return stkName;
    }

    @JsonIgnore
    public void setStkName(String stkName) {
        this.stkName = stkName;
    }

    @JsonIgnore
    public String getStkCode() {
        return stkCode;
    }

    @JsonIgnore
    public void setStkCode(String stkCode) {
        this.stkCode = stkCode;
    }

    @JsonIgnore
    public BigDecimal getCurrProfit() {
        return currProfit;
    }

    @JsonIgnore
    public void setCurrProfit(BigDecimal currProfit) {
        this.currProfit = currProfit;
    }

    @JsonIgnore
    public BigDecimal getRmbProfit() {
        return rmbProfit;
    }

    @JsonIgnore
    public void setRmbProfit(BigDecimal rmbProfit) {
        this.rmbProfit = rmbProfit;
    }

    @JsonIgnore
    public String getCurrCode() {
        return currCode;
    }

    @JsonIgnore
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    @JsonIgnore
    public BigDecimal getRate() {
        return rate;
    }

    @JsonIgnore
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @JsonIgnore
    public String getStkType() {
        return stkType;
    }

    @JsonIgnore
    public void setStkType(String stkType) {
        this.stkType = stkType;
    }

    @JsonIgnore
    public String getMarket() {
        return market;
    }

    @JsonIgnore
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonIgnore
    public String getStatus() {
        return status;
    }

    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
    }
}
