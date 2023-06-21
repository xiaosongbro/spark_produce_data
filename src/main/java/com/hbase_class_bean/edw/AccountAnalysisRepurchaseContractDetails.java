package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class AccountAnalysisRepurchaseContractDetails {
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
    @JsonProperty("noIntRevAmt")
    private BigDecimal noIntRevAmt;
    @JsonProperty("repaidAmt")
    private BigDecimal repaidAmt;
    @JsonProperty("buyBackDirCd")
    private String buyBackDirCd;
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

    public BigDecimal getNoIntRevAmt() {
        return noIntRevAmt;
    }

    public void setNoIntRevAmt(BigDecimal noIntRevAmt) {
        this.noIntRevAmt = noIntRevAmt;
    }

    public BigDecimal getRepaidAmt() {
        return repaidAmt;
    }

    public void setRepaidAmt(BigDecimal repaidAmt) {
        this.repaidAmt = repaidAmt;
    }

    public String getBuyBackDirCd() {
        return buyBackDirCd;
    }

    public void setBuyBackDirCd(String buyBackDirCd) {
        this.buyBackDirCd = buyBackDirCd;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }
}
