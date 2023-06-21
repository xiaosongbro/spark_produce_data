package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class CreditClearingStockDataBean {
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
    public String getProdTypeCd() {
        return prodTypeCd;
    }
    @JsonIgnore
    public void setProdTypeCd(String prodTypeCd) {
        this.prodTypeCd = prodTypeCd;
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
    public void setTotalProfitLoss(BigDecimal totalProfitLoss) {
        this.totalProfitLoss = totalProfitLoss;
    }
    @JsonIgnore
    public BigDecimal getWinRatio() {
        return winRatio;
    }
    @JsonIgnore
    public void setWinRatio(BigDecimal winRatio) {
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
    public BigDecimal getBuyMoneyCount() {
        return buyMoneyCount;
    }
    @JsonIgnore
    public void setBuyMoneyCount(BigDecimal buyMoneyCount) {
        this.buyMoneyCount = buyMoneyCount;
    }
    @JsonIgnore
    public BigDecimal getSellMoneyCount() {
        return sellMoneyCount;
    }
    @JsonIgnore
    public void setSellMoneyCount(BigDecimal sellMoneyCount) {
        this.sellMoneyCount = sellMoneyCount;
    }
    @JsonIgnore
    public BigDecimal getSecDiviAmt() {
        return secDiviAmt;
    }
    @JsonIgnore
    public void setSecDiviAmt(BigDecimal secDiviAmt) {
        this.secDiviAmt = secDiviAmt;
    }
    @JsonIgnore
    public BigDecimal getClearPrice() {
        return clearPrice;
    }
    @JsonIgnore
    public void setClearPrice(BigDecimal clearPrice) {
        this.clearPrice = clearPrice;
    }
    @JsonIgnore
    public int getClearCount() {
        return clearCount;
    }
    @JsonIgnore
    public void setClearCount(int clearCount) {
        this.clearCount = clearCount;
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
    public BigDecimal getPosCount() {
        return posCount;
    }
    @JsonIgnore
    public void setPosCount(BigDecimal posCount) {
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
