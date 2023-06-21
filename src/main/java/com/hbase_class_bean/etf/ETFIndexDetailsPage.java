package com.hbase_class_bean.etf;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class ETFIndexDetailsPage {
    @JsonProperty("fundCd")
    private String fundCd;
    @JsonProperty("mrkt")
    private String mrkt;
    @JsonProperty("fundName")
    private String fundName;
    @JsonProperty("fundSName")
    private String fundSName;
    @JsonProperty("thisYearAoin")
    private BigDecimal thisYearAoin;
    @JsonProperty("l3mAoin")
    private BigDecimal l3mAoin;
    @JsonProperty("l1yAoin")
    private BigDecimal l1yAoin;
    @JsonProperty("l3yAoin")
    private BigDecimal l3yAoin;
    @JsonProperty("resumptionUnitNet")
    private BigDecimal resumptionUnitNet;
    @JsonProperty("fundNetDt")
    private String fundNetDt;



    public String getFundCd() {
        return fundCd;
    }

    public void setFundCd(String fundCd) {
        this.fundCd = fundCd;
    }

    public String getMrkt() {
        return mrkt;
    }

    public void setMrkt(String mrkt) {
        this.mrkt = mrkt;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundSName() {
        return fundSName;
    }

    public void setFundSName(String fundSName) {
        this.fundSName = fundSName;
    }

    public BigDecimal getThisYearAoin() {
        return thisYearAoin;
    }

    public void setThisYearAoin(BigDecimal thisYearAoin) {
        this.thisYearAoin = thisYearAoin;
    }

    public BigDecimal getL3mAoin() {
        return l3mAoin;
    }

    public void setL3mAoin(BigDecimal l3mAoin) {
        this.l3mAoin = l3mAoin;
    }

    public BigDecimal getL1yAoin() {
        return l1yAoin;
    }

    public void setL1yAoin(BigDecimal l1yAoin) {
        this.l1yAoin = l1yAoin;
    }

    public BigDecimal getL3yAoin() {
        return l3yAoin;
    }

    public void setL3yAoin(BigDecimal l3yAoin) {
        this.l3yAoin = l3yAoin;
    }

    public BigDecimal getResumptionUnitNet() {
        return resumptionUnitNet;
    }

    public void setResumptionUnitNet(BigDecimal resumptionUnitNet) {
        this.resumptionUnitNet = resumptionUnitNet;
    }

    public String getFundNetDt() {
        return fundNetDt;
    }

    public void setFundNetDt(String fundNetDt) {
        this.fundNetDt = fundNetDt;
    }
}
