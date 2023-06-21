package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class ClearingStockBeanPart2 {

    @JsonProperty("stkName")
    private String stkName;

    @JsonProperty("stkCode")
    private String stkCode;

    @JsonProperty("market")
    private String market;

    @JsonProperty("tradeBoard")
    private String tradeBoard;

    @JsonProperty("totalPosDays")
    private BigDecimal totalPosDays;

    @JsonProperty("totalProfitLoss")
    private BigDecimal totalProfitLoss;

    @JsonProperty("winRatio")
    private String winRatio;

    @JsonProperty("buyCount")
    private BigDecimal buyCount;

    @JsonProperty("sellCount")
    private BigDecimal sellCount;

    @JsonProperty("clearDate")
    private String clearDate;

    @JsonProperty("posCount")
    private String posCount;

    @JsonProperty("status")
    private String status;


    @JsonIgnore
    public ClearingStockBeanPart2() {
    }


    @JsonIgnore
    public ClearingStockBeanPart2(String stkName, String stkCode, String market, String tradeBoard, BigDecimal totalPosDays, BigDecimal totalProfigtLoss, String winRatio, BigDecimal buyCount, BigDecimal sellCount, String clearDate, String posCount, String status) {
        this.stkName = stkName;
        this.stkCode = stkCode;
        this.market = market;
        this.tradeBoard = tradeBoard;
        this.totalPosDays = totalPosDays;
        this.totalProfitLoss = totalProfigtLoss;
        this.winRatio = winRatio;
        this.buyCount = buyCount;
        this.sellCount = sellCount;
        this.clearDate = clearDate;
        this.posCount = posCount;
        this.status = status;

    }

    @JsonIgnore
    public ClearingStockBeanPart2(String stkName, String stkCode, String market, String tradeBoard, BigDecimal totalPosDays, BigDecimal totalProfigtLoss,  BigDecimal buyCount, BigDecimal sellCount, String clearDate, String status) {
        this.stkName = stkName;
        this.stkCode = stkCode;
        this.market = market;
        this.tradeBoard = tradeBoard;
        this.totalPosDays = totalPosDays;
        this.totalProfitLoss = totalProfigtLoss;

        this.buyCount = buyCount;
        this.sellCount = sellCount;
        this.clearDate = clearDate;

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
    public String getMarket() {
        return market;
    }

    @JsonIgnore
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonIgnore
    public String getTradeBoard() {
        return tradeBoard;
    }

    @JsonIgnore
    public void setTradeBoard(String tradeBoard) {
        this.tradeBoard = tradeBoard;
    }

    @JsonIgnore
    public BigDecimal getTotalPosDays() {
        return totalPosDays;
    }

    @JsonIgnore
    public void setTotalPosDays(BigDecimal totalPosDays) {
        this.totalPosDays = totalPosDays;
    }

    @JsonIgnore
    public BigDecimal getTotalProfitLoss() {
        return totalProfitLoss;
    }

    @JsonIgnore
    public void setTotalProfitLoss(BigDecimal totalProfigtLoss) {
        this.totalProfitLoss = totalProfigtLoss;
    }

    @JsonIgnore
    public String getWinRatio() {
        return winRatio;
    }

    @JsonIgnore
    public void setWinRatio(String winRatio) {
        this.winRatio = winRatio;
    }

    @JsonIgnore
    public BigDecimal getBuyCount() {
        return buyCount;
    }

    @JsonIgnore
    public void setBuyCount(BigDecimal buyCount) {
        this.buyCount = buyCount;
    }

    @JsonIgnore
    public BigDecimal getSellCount() {
        return sellCount;
    }

    @JsonIgnore
    public void setSellCount(BigDecimal sellCount) {
        this.sellCount = sellCount;
    }

    @JsonIgnore
    public String getClearDate() {
        return clearDate;
    }

    @JsonIgnore
    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    @JsonIgnore
    public String getPosCount() {
        return posCount;
    }

    @JsonIgnore
    public void setPosCount(String posCount) {
        this.posCount = posCount;
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
