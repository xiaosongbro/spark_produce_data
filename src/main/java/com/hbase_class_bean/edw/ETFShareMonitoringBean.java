package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ETFShareMonitoringBean {
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
    @JsonProperty("shareChgVol")
    private BigDecimal shareChgVol;
    @JsonProperty("shareChgRang")
    private BigDecimal shareChgRang;
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
    public BigDecimal getShareChgVol() {
        return shareChgVol;
    }
    @JsonIgnore
    public void setShareChgVol(BigDecimal shareChgVol) {
        this.shareChgVol = shareChgVol;
    }
    @JsonIgnore
    public BigDecimal getShareChgRang() {
        return shareChgRang;
    }
    @JsonIgnore
    public void setShareChgRang(BigDecimal shareChgRang) {
        this.shareChgRang = shareChgRang;
    }
}
