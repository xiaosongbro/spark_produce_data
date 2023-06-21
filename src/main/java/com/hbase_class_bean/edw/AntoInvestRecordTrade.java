package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class AntoInvestRecordTrade {

    @JsonProperty("lastDectDt")
    private String lastDectDt;
    @JsonProperty("lastDectAmt")
    private BigDecimal lastDectAmt;
    @JsonProperty("trdResult")
    private String trdResult;
    @JsonProperty("failReason")
    private String failReason;

    @JsonIgnore
    public String getLastDectDt() {
        return lastDectDt;
    }
    @JsonIgnore
    public void setLastDectDt(String lastDectDt) {
        this.lastDectDt = lastDectDt;
    }

    @JsonIgnore
    public BigDecimal getLastDectAmt() {
        return lastDectAmt;
    }
    @JsonIgnore
    public void setLastDectAmt(BigDecimal lastDectAmt) {
        this.lastDectAmt = lastDectAmt;
    }
    @JsonIgnore
    public String getTrdResult() {
        return trdResult;
    }
    @JsonIgnore
    public void setTrdResult(String trdResult) {
        this.trdResult = trdResult;
    }
    @JsonIgnore
    public String getFailReason() {
        return failReason;
    }
    @JsonIgnore
    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
