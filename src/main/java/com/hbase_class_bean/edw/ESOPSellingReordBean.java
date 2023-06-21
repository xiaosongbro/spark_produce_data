package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ESOPSellingReordBean{
    @JsonProperty("initDate")
    private int initDate;
    @JsonProperty("serialNo")
    private String serialNo;
    @JsonProperty("currTime")
    private String currTime;
    @JsonProperty("opEntrustWay")
    private String opEntrustWay;
    @JsonProperty("entrustDate")
    private int entrustDate;
    @JsonProperty("entrustNo")
    private Long entrustNo;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("stockAccount")
    private String stockAccount;
    @JsonProperty("fundAccount")
    private Long fundAccount;
    @JsonProperty("stockCode")
    private String stockCode;
    @JsonProperty("stockName")
    private String stockName;
    @JsonProperty("businessNo")
    private String businessNo;
    @JsonProperty("businessType")
    private String businessType;
    @JsonProperty("businessAmount")
    private Long businessAmount;
    @JsonProperty("businessPrice")
    private BigDecimal businessPrice;
    @JsonProperty("businessBalance")
    private BigDecimal businessBalance;
    @JsonProperty("businessTime")
    private int businessTime;
    @JsonProperty("businessTimes")
    private int businessTimes;

    @JsonIgnore
    public int getInitDate() {
        return initDate;
    }
    @JsonIgnore
    public void setInitDate(int initDate) {
        this.initDate = initDate;
    }
    @JsonIgnore
    public String getSerialNo() {
        return serialNo;
    }
    @JsonIgnore
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    @JsonIgnore
    public String getCurrTime() {
        return currTime;
    }
    @JsonIgnore
    public void setCurrTime(String currTime) {
        this.currTime = currTime;
    }
    @JsonIgnore
    public String getOpEntrustWay() {
        return opEntrustWay;
    }
    @JsonIgnore
    public void setOpEntrustWay(String opEntrustWay) {
        this.opEntrustWay = opEntrustWay;
    }
    @JsonIgnore
    public int getEntrustDate() {
        return entrustDate;
    }
    @JsonIgnore
    public void setEntrustDate(int entrustDate) {
        this.entrustDate = entrustDate;
    }
    @JsonIgnore
    public Long getEntrustNo() {
        return entrustNo;
    }
    @JsonIgnore
    public void setEntrustNo(Long entrustNo) {
        this.entrustNo = entrustNo;
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
    public Long getFundAccount() {
        return fundAccount;
    }
    @JsonIgnore
    public void setFundAccount(Long fundAccount) {
        this.fundAccount = fundAccount;
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
    public String getStockName() {
        return stockName;
    }
    @JsonIgnore
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    @JsonIgnore
    public String getBusinessNo() {
        return businessNo;
    }
    @JsonIgnore
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }
    @JsonIgnore
    public String getBusinessType() {
        return businessType;
    }
    @JsonIgnore
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    @JsonIgnore
    public Long getBusinessAmount() {
        return businessAmount;
    }
    @JsonIgnore
    public void setBusinessAmount(Long businessAmount) {
        this.businessAmount = businessAmount;
    }
    @JsonIgnore
    public BigDecimal getBusinessPrice() {
        return businessPrice;
    }
    @JsonIgnore
    public void setBusinessPrice(BigDecimal businessPrice) {
        this.businessPrice = businessPrice;
    }
    @JsonIgnore
    public BigDecimal getBusinessBalance() {
        return businessBalance;
    }
    @JsonIgnore
    public void setBusinessBalance(BigDecimal businessBalance) {
        this.businessBalance = businessBalance;
    }
    @JsonIgnore
    public int getBusinessTime() {
        return businessTime;
    }
    @JsonIgnore
    public void setBusinessTime(int businessTime) {
        this.businessTime = businessTime;
    }
    @JsonIgnore
    public int getBusinessTimes() {
        return businessTimes;
    }
    @JsonIgnore
    public void setBusinessTimes(int businessTimes) {
        this.businessTimes = businessTimes;
    }

}
