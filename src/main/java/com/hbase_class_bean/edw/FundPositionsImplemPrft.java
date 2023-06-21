package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class FundPositionsImplemPrft {
    // 收益结转日期
    @JsonProperty("divdndDt")
    private String divdndDt;
    // 当日结转收益（元）
    @JsonProperty("divdndAmt")
    private BigDecimal divdndAmt;
    // 20230406 新增
    @JsonProperty("holdShare")
    public BigDecimal holdShare;
    @JsonProperty("moneFund10ThouShareYld")
    public BigDecimal moneFund10ThouShareYld;
    @JsonProperty("moneFund7daysAnnuYId")
    public String moneFund7daysAnnuYId;

    @JsonIgnore
    public String getDivdndDt() {
        return divdndDt;
    }
    @JsonIgnore
    public void setDivdndDt(String divdndDt) {
        this.divdndDt = divdndDt;
    }
    @JsonIgnore
    public BigDecimal getDivdndAmt() {
        return divdndAmt;
    }
    @JsonIgnore
    public void setDivdndAmt(BigDecimal divdndAmt) {
        this.divdndAmt = divdndAmt;
    }
    @JsonIgnore
    public BigDecimal getHoldShare() {
        return holdShare;
    }
    @JsonIgnore
    public void setHoldShare(BigDecimal holdShare) {
        this.holdShare = holdShare;
    }
    @JsonIgnore
    public BigDecimal getMoneFund10ThouShareYld() {
        return moneFund10ThouShareYld;
    }
    @JsonIgnore
    public void setMoneFund10ThouShareYld(BigDecimal moneFund10ThouShareYld) {
        this.moneFund10ThouShareYld = moneFund10ThouShareYld;
    }
    @JsonIgnore
    public String getMoneFund7daysAnnuYId() {
        return moneFund7daysAnnuYId;
    }
    @JsonIgnore
    public void setMoneFund7daysAnnuYId(String moneFund7daysAnnuYId) {
        this.moneFund7daysAnnuYId = moneFund7daysAnnuYId;
    }
}
