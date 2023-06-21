package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class CreditClearingStockBean {
    @JsonProperty("updateDate")
    private String updateDate;
    @JsonProperty("totalCount")
    private BigDecimal totalCount;
    @JsonProperty("acctTotalProfitLoss")
    private BigDecimal acctTotalProfitLoss;
    @JsonProperty("profitStockCount")
    private int profitStockCount;
    @JsonProperty("lossStockCount")
    private int lossStockCount;
    @JsonProperty("acctTotalProfit")
    private BigDecimal acctTotalProfit;
    @JsonProperty("acctTotalLoss")
    private BigDecimal acctTotalLoss;
    @JsonProperty("acctAvgPosDays")
    private BigDecimal acctAvgPosDays;
    @JsonProperty("acctAvgProfitLoss")
    private BigDecimal acctAvgProfitLoss;
    @JsonProperty("acctclearCount")
    private int acctclearCount;
    @JsonProperty("totalList")
    private List<CreditClearingStockDataBean> totalList;

    @JsonIgnore
    public String getUpdateDate() {
        return updateDate;
    }
    @JsonIgnore
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @JsonIgnore
    public BigDecimal getTotalCount() {
        return totalCount;
    }
    @JsonIgnore
    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }
    @JsonIgnore
    public BigDecimal getAcctTotalProfitLoss() {
        return acctTotalProfitLoss;
    }
    @JsonIgnore
    public void setAcctTotalProfitLoss(BigDecimal acctTotalProfitLoss) {
        this.acctTotalProfitLoss = acctTotalProfitLoss;
    }
    @JsonIgnore
    public int getProfitStockCount() {
        return profitStockCount;
    }
    @JsonIgnore
    public void setProfitStockCount(int profitStockCount) {
        this.profitStockCount = profitStockCount;
    }
    @JsonIgnore
    public int getLossStockCount() {
        return lossStockCount;
    }
    @JsonIgnore
    public void setLossStockCount(int lossStockCount) {
        this.lossStockCount = lossStockCount;
    }
    @JsonIgnore
    public BigDecimal getAcctTotalProfit() {
        return acctTotalProfit;
    }
    @JsonIgnore
    public void setAcctTotalProfit(BigDecimal acctTotalProfit) {
        this.acctTotalProfit = acctTotalProfit;
    }
    @JsonIgnore
    public BigDecimal getAcctTotalLoss() {
        return acctTotalLoss;
    }
    @JsonIgnore
    public void setAcctTotalLoss(BigDecimal acctTotalLoss) {
        this.acctTotalLoss = acctTotalLoss;
    }
    @JsonIgnore
    public BigDecimal getAcctAvgPosDays() {
        return acctAvgPosDays;
    }
    @JsonIgnore
    public void setAcctAvgPosDays(BigDecimal acctAvgPosDays) {
        this.acctAvgPosDays = acctAvgPosDays;
    }
    @JsonIgnore
    public BigDecimal getAcctAvgProfitLoss() {
        return acctAvgProfitLoss;
    }
    @JsonIgnore
    public void setAcctAvgProfitLoss(BigDecimal acctAvgProfitLoss) {
        this.acctAvgProfitLoss = acctAvgProfitLoss;
    }
    @JsonIgnore
    public int getAcctclearCount() {
        return acctclearCount;
    }
    @JsonIgnore
    public void setAcctclearCount(int acctclearCount) {
        this.acctclearCount = acctclearCount;
    }
    @JsonIgnore
    public List<CreditClearingStockDataBean> getTotalList() {
        return totalList;
    }
    @JsonIgnore
    public void setTotalList(List<CreditClearingStockDataBean> totalList) {
        this.totalList = totalList;
    }
}
