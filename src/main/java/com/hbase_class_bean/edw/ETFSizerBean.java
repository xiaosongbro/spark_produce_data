package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ETFSizerBean {
    @JsonProperty("fundCd")
    private String fundCd;
    @JsonProperty("mrkt")
    private String mrkt;
    @JsonProperty("fundSName")
    private String fundSName;
    @JsonProperty("fundName")
    private String fundName;
    @JsonProperty("fundClas")
    private int fundClas;
    @JsonProperty("closePrice")
    private BigDecimal closePrice;
//    @JsonProperty("fundFit")
//    private BigDecimal fundFit;
    @JsonProperty("shr")
    private BigDecimal shr;
    @JsonProperty("l3yAoin")
    private BigDecimal l3yAoin;
    @JsonProperty("feeRate")
    private BigDecimal feeRate;
    @JsonProperty("l6mMtchAmt")
    private BigDecimal l6mMtchAmt;
    @JsonProperty("trackingError")
    private BigDecimal trackingError;

    @JsonProperty("l1dShareChgRang")
    private BigDecimal l1dShareChgRang;

    @JsonIgnore
    public String getFundCd() {
        return fundCd;
    }
    @JsonIgnore
    public void setFundCd(String fundCd) {
        this.fundCd = fundCd;
    }
    @JsonIgnore
    public String getMrkt() {
        return mrkt;
    }
    @JsonIgnore
    public void setMrkt(String mrkt) {
        this.mrkt = mrkt;
    }
    @JsonIgnore
    public String getFundSName() {
        return fundSName;
    }
    @JsonIgnore
    public void setFundSName(String fundSName) {
        this.fundSName = fundSName;
    }
    @JsonIgnore
    public String getFundName() {
        return fundName;
    }
    @JsonIgnore
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
    @JsonIgnore
    public int getFundClas() {
        return fundClas;
    }
    @JsonIgnore
    public void setFundClas(int fundClas) {
        this.fundClas = fundClas;
    }
    @JsonIgnore
    public BigDecimal getClosePrice() {
        return closePrice;
    }
    @JsonIgnore
    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }
    @JsonIgnore
    public BigDecimal getShr() {
        return shr;
    }
    @JsonIgnore
    public void setShr(BigDecimal shr) {
        this.shr = shr;
    }
    @JsonIgnore
    public BigDecimal getL3yAoin() {
        return l3yAoin;
    }
    @JsonIgnore
    public void setL3yAoin(BigDecimal l3yAoin) {
        this.l3yAoin = l3yAoin;
    }
    @JsonIgnore
    public BigDecimal getFeeRate() {
        return feeRate;
    }
    @JsonIgnore
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }
    @JsonIgnore
    public BigDecimal getL6mMtchAmt() {
        return l6mMtchAmt;
    }
    @JsonIgnore
    public void setL6mMtchAmt(BigDecimal l6mMtchAmt) {
        this.l6mMtchAmt = l6mMtchAmt;
    }
    @JsonIgnore
    public BigDecimal getTrackingError() {
        return trackingError;
    }
    @JsonIgnore
    public void setTrackingError(BigDecimal trackingError) {
        this.trackingError = trackingError;
    }

    //    @JsonIgnore
//    public BigDecimal getFundFit() {
//        return fundFit;
//    }
//    @JsonIgnore
//    public void setFundFit(BigDecimal fundFit) {
//        this.fundFit = fundFit;
//    }
    @JsonIgnore
    public BigDecimal getL1dShareChgRang() {
        return l1dShareChgRang;
    }
    @JsonIgnore
    public void setL1dShareChgRang(BigDecimal l1dShareChgRang) {
        this.l1dShareChgRang = l1dShareChgRang;
    }
}
