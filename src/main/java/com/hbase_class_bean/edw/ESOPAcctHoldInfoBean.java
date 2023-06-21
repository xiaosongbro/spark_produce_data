package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ESOPAcctHoldInfoBean {
    @JsonProperty("initDate")
    private String initDate; //持仓日期（必须）
    @JsonProperty("tradeMrkt")
    private String tradeMrkt; //交易市场（必须）
//    @JsonProperty("fundAccount")
//    private long fundAccount; //资产账号（必须）
    @JsonProperty("stockAccount")
    private String stockAccount; //证券账号(股东账号)
    @JsonProperty("stockCode")
    private String stockCode; //证券代码（必须）
    @JsonProperty("currentAmount")
    private BigDecimal currentAmount; //持有数量
    @JsonProperty("stockName")
    private String stockName; //证券名称
    @JsonProperty("currentStkIncAmount")
    private BigDecimal currentStkIncAmount; //股权激励限售股持仓数量

    @JsonIgnore
    public String getInitDate() {
        return initDate;
    }
    @JsonIgnore
    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }
    @JsonIgnore
    public String getTradeMrkt() {
        return tradeMrkt;
    }
    @JsonIgnore
    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }

    @JsonIgnore
    public String getStockAccount() {
        return stockAccount;
    }
    @JsonIgnore
    public void setStockAccount(String stockAccount) {
        this.stockAccount = stockAccount;
    }
    @JsonIgnore
    public String getStockCode() {
        return stockCode;
    }
    @JsonIgnore
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    @JsonIgnore
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }
    @JsonIgnore
    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }
    @JsonIgnore
    public String getStockName() {
        return stockName;
    }
    @JsonIgnore
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    @JsonIgnore
    public BigDecimal getCurrentStkIncAmount() {
        return currentStkIncAmount;
    }
    @JsonIgnore
    public void setCurrentStkIncAmount(BigDecimal currentStkIncAmount) {
        this.currentStkIncAmount = currentStkIncAmount;
    }
}
