package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class AccountAnalysisDetailsOfPledgeAgreement {
    @JsonProperty("u")
    private String u;
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("buyBackTypeDesc")
    private String buyBackTypeDesc;
    @JsonProperty("contrSeqNum")
    private String contrSeqNum;
    @JsonProperty("matchId")
    private String matchId;
    @JsonProperty("prodName")
    private String prodName;
    @JsonProperty("prodNo")
    private String prodNo;
    @JsonProperty("prodTypeCd")
    private String prodTypeCd;
    @JsonProperty("initTradeDt")
    private String initTradeDt;
    @JsonProperty("repurchDt")
    private String repurchDt;
    @JsonProperty("mgnPurchQtty")
    private BigDecimal mgnPurchQtty;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("impawnMrktVal")
    private BigDecimal impawnMrktVal;
    @JsonProperty("haveLimitFlag")
    private Integer haveLimitFlag;
    @JsonProperty("liabAmt")
    private BigDecimal liabAmt;
    @JsonProperty("buyBackDir_Cd")
    private String buyBackDir_Cd;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;

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

    public String getBuyBackTypeDesc() {
        return buyBackTypeDesc;
    }

    public void setBuyBackTypeDesc(String buyBackTypeDesc) {
        this.buyBackTypeDesc = buyBackTypeDesc;
    }

    public String getContrSeqNum() {
        return contrSeqNum;
    }

    public void setContrSeqNum(String contrSeqNum) {
        this.contrSeqNum = contrSeqNum;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
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

    public String getInitTradeDt() {
        return initTradeDt;
    }

    public void setInitTradeDt(String initTradeDt) {
        this.initTradeDt = initTradeDt;
    }

    public String getRepurchDt() {
        return repurchDt;
    }

    public void setRepurchDt(String repurchDt) {
        this.repurchDt = repurchDt;
    }

    public BigDecimal getMgnPurchQtty() {
        return mgnPurchQtty;
    }

    public void setMgnPurchQtty(BigDecimal mgnPurchQtty) {
        this.mgnPurchQtty = mgnPurchQtty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getImpawnMrktVal() {
        return impawnMrktVal;
    }

    public void setImpawnMrktVal(BigDecimal impawnMrktVal) {
        this.impawnMrktVal = impawnMrktVal;
    }

    public Integer getHaveLimitFlag() {
        return haveLimitFlag;
    }

    public void setHaveLimitFlag(Integer haveLimitFlag) {
        this.haveLimitFlag = haveLimitFlag;
    }

    public BigDecimal getLiabAmt() {
        return liabAmt;
    }

    public void setLiabAmt(BigDecimal liabAmt) {
        this.liabAmt = liabAmt;
    }

    public String getBuyBackDir_Cd() {
        return buyBackDir_Cd;
    }

    public void setBuyBackDir_Cd(String buyBackDir_Cd) {
        this.buyBackDir_Cd = buyBackDir_Cd;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }
}
