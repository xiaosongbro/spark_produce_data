package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class CreditClearingStockStatusDataBean {
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
    @JsonProperty("stkName")
    private String stkName;
    @JsonProperty("stkCode")
    private String stkCode;
    @JsonProperty("prodTypeCd")
    private String prodTypeCd;
    @JsonProperty("market")
    private String market;
    @JsonProperty("tradeBoard")
    private String tradeBoard;
    @JsonProperty("totalPosDays")
    private BigDecimal totalPosDays;
    @JsonProperty("totalProfitLoss")
    private BigDecimal totalProfitLoss;
    @JsonProperty("winRatio")
    private BigDecimal winRatio;
    @JsonProperty("buyCount")
    private BigDecimal buyCount;
    @JsonProperty("sellCount")
    private BigDecimal sellCount;
    @JsonProperty("buyMoneyCount")
    private BigDecimal buyMoneyCount;
    @JsonProperty("sellMoneyCount")
    private BigDecimal sellMoneyCount;
    @JsonProperty("secDiviAmt")
    private BigDecimal secDiviAmt;
    @JsonProperty("clearPrice")
    private BigDecimal clearPrice;
    @JsonProperty("clearCount")
    private int clearCount;
    @JsonProperty("clearDate")
    private String clearDate;

    @JsonProperty("posCount")
    private BigDecimal posCount;
    @JsonProperty("status")
    private String status;

    @JsonProperty("regular")
    private String regular;

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getAcctTotalProfitLoss() {
        return acctTotalProfitLoss;
    }

    public void setAcctTotalProfitLoss(BigDecimal acctTotalProfitLoss) {
        this.acctTotalProfitLoss = acctTotalProfitLoss;
    }

    public int getProfitStockCount() {
        return profitStockCount;
    }

    public void setProfitStockCount(int profitStockCount) {
        this.profitStockCount = profitStockCount;
    }

    public int getLossStockCount() {
        return lossStockCount;
    }

    public void setLossStockCount(int lossStockCount) {
        this.lossStockCount = lossStockCount;
    }

    public BigDecimal getAcctTotalProfit() {
        return acctTotalProfit;
    }

    public void setAcctTotalProfit(BigDecimal acctTotalProfit) {
        this.acctTotalProfit = acctTotalProfit;
    }

    public BigDecimal getAcctTotalLoss() {
        return acctTotalLoss;
    }

    public void setAcctTotalLoss(BigDecimal acctTotalLoss) {
        this.acctTotalLoss = acctTotalLoss;
    }

    public BigDecimal getAcctAvgPosDays() {
        return acctAvgPosDays;
    }

    public void setAcctAvgPosDays(BigDecimal acctAvgPosDays) {
        this.acctAvgPosDays = acctAvgPosDays;
    }

    public BigDecimal getAcctAvgProfitLoss() {
        return acctAvgProfitLoss;
    }

    public void setAcctAvgProfitLoss(BigDecimal acctAvgProfitLoss) {
        this.acctAvgProfitLoss = acctAvgProfitLoss;
    }

    public int getAcctclearCount() {
        return acctclearCount;
    }

    public void setAcctclearCount(int acctclearCount) {
        this.acctclearCount = acctclearCount;
    }

    public String getStkName() {
        return stkName;
    }

    public void setStkName(String stkName) {
        this.stkName = stkName;
    }

    public String getStkCode() {
        return stkCode;
    }

    public void setStkCode(String stkCode) {
        this.stkCode = stkCode;
    }

    public String getProdTypeCd() {
        return prodTypeCd;
    }

    public void setProdTypeCd(String prodTypeCd) {
        this.prodTypeCd = prodTypeCd;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getTradeBoard() {
        return tradeBoard;
    }

    public void setTradeBoard(String tradeBoard) {
        this.tradeBoard = tradeBoard;
    }

    public BigDecimal getTotalPosDays() {
        return totalPosDays;
    }

    public void setTotalPosDays(BigDecimal totalPosDays) {
        this.totalPosDays = totalPosDays;
    }

    public BigDecimal getTotalProfitLoss() {
        return totalProfitLoss;
    }

    public void setTotalProfitLoss(BigDecimal totalProfitLoss) {
        this.totalProfitLoss = totalProfitLoss;
    }

    public BigDecimal getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(BigDecimal winRatio) {
        this.winRatio = winRatio;
    }

    public BigDecimal getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(BigDecimal buyCount) {
        this.buyCount = buyCount;
    }

    public BigDecimal getSellCount() {
        return sellCount;
    }

    public void setSellCount(BigDecimal sellCount) {
        this.sellCount = sellCount;
    }

    public BigDecimal getBuyMoneyCount() {
        return buyMoneyCount;
    }

    public void setBuyMoneyCount(BigDecimal buyMoneyCount) {
        this.buyMoneyCount = buyMoneyCount;
    }

    public BigDecimal getSellMoneyCount() {
        return sellMoneyCount;
    }

    public void setSellMoneyCount(BigDecimal sellMoneyCount) {
        this.sellMoneyCount = sellMoneyCount;
    }

    public BigDecimal getSecDiviAmt() {
        return secDiviAmt;
    }

    public void setSecDiviAmt(BigDecimal secDiviAmt) {
        this.secDiviAmt = secDiviAmt;
    }

    public BigDecimal getClearPrice() {
        return clearPrice;
    }

    public void setClearPrice(BigDecimal clearPrice) {
        this.clearPrice = clearPrice;
    }

    public int getClearCount() {
        return clearCount;
    }

    public void setClearCount(int clearCount) {
        this.clearCount = clearCount;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    public BigDecimal getPosCount() {
        return posCount;
    }

    public void setPosCount(BigDecimal posCount) {
        this.posCount = posCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }
}
