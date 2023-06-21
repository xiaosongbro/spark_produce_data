package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class AccountAnalysisAndFinancialPositionDetails {
    @JsonProperty("u")
    private String u;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("secuAcct")
    private String secuAcct;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("prodName")
    private String prodName;
    @JsonProperty("prodNo")
    private String prodNo;
    @JsonProperty("prodTypeCd")
    private String prodTypeCd;
    @JsonProperty("shareBal")
    private BigDecimal shareBal;
    @JsonProperty("amt")
    private BigDecimal amt;
    @JsonProperty("prodUnitNetVal")
    private BigDecimal prodUnitNetVal;
    @JsonProperty("posCost")
    private BigDecimal posCost;
    @JsonProperty("billDt")
    private String billDt;
    @JsonProperty("achCompStand")
    private String achCompStand;
    @JsonProperty("prodpreRatio")
    private String prodpreRatio;
    @JsonProperty("thouShareYld")
    private BigDecimal thouShareYld;
    @JsonProperty("days7AnnuYld")
    private BigDecimal days7AnnuYld;
    @JsonProperty("finProdType")
    private String finProdType;
    @JsonProperty("profitDisplayType")
    private Integer profitDisplayType;
    @JsonProperty("tradeDt")
    private String tradeDt;
    @JsonProperty("totalMrkt")
    private BigDecimal totalMrkt;

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

    public String getSecuAcct() {
        return secuAcct;
    }

    public void setSecuAcct(String secuAcct) {
        this.secuAcct = secuAcct;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
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

    public BigDecimal getShareBal() {
        return shareBal;
    }

    public void setShareBal(BigDecimal shareBal) {
        this.shareBal = shareBal;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getProdUnitNetVal() {
        return prodUnitNetVal;
    }

    public void setProdUnitNetVal(BigDecimal prodUnitNetVal) {
        this.prodUnitNetVal = prodUnitNetVal;
    }

    public BigDecimal getPosCost() {
        return posCost;
    }

    public void setPosCost(BigDecimal posCost) {
        this.posCost = posCost;
    }

    public String getBillDt() {
        return billDt;
    }

    public void setBillDt(String billDt) {
        this.billDt = billDt;
    }

    public String getAchCompStand() {
        return achCompStand;
    }

    public void setAchCompStand(String achCompStand) {
        this.achCompStand = achCompStand;
    }

    public String getProdpreRatio() {
        return prodpreRatio;
    }

    public void setProdpreRatio(String prodpreRatio) {
        this.prodpreRatio = prodpreRatio;
    }

    public BigDecimal getThouShareYld() {
        return thouShareYld;
    }

    public void setThouShareYld(BigDecimal thouShareYld) {
        this.thouShareYld = thouShareYld;
    }

    public BigDecimal getDays7AnnuYld() {
        return days7AnnuYld;
    }

    public void setDays7AnnuYld(BigDecimal days7AnnuYld) {
        this.days7AnnuYld = days7AnnuYld;
    }

    public String getFinProdType() {
        return finProdType;
    }

    public void setFinProdType(String finProdType) {
        this.finProdType = finProdType;
    }

    public Integer getProfitDisplayType() {
        return profitDisplayType;
    }

    public void setProfitDisplayType(Integer profitDisplayType) {
        this.profitDisplayType = profitDisplayType;
    }

    public String getTradeDt() {
        return tradeDt;
    }

    public void setTradeDt(String tradeDt) {
        this.tradeDt = tradeDt;
    }

    public BigDecimal getTotalMrkt() {
        return totalMrkt;
    }

    public void setTotalMrkt(BigDecimal totalMrkt) {
        this.totalMrkt = totalMrkt;
    }
}
