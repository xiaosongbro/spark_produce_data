package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class FundPositionsUnpayPrft {
    @JsonProperty("unpayPrftDt")
    private String unpayPrftDt;
    @JsonProperty("curEstiUnpayPrft")
    private BigDecimal curEstiUnpayPrft;
    // 20230406 新增
    @JsonProperty("holdShare")
    public BigDecimal holdShare;
    @JsonProperty("moneFund10ThouShareYld")
    public BigDecimal moneFund10ThouShareYld;
    @JsonProperty("moneFund7daysAnnuYId")
    public String moneFund7daysAnnuYId;

    @JsonIgnore
    public String getUnpayPrftDt() {
        return unpayPrftDt;
    }
    @JsonIgnore
    public void setUnpayPrftDt(String unpayPrftDt) {
        this.unpayPrftDt = unpayPrftDt;
    }
    @JsonIgnore
    public BigDecimal getCurEstiUnpayPrft() {
        return curEstiUnpayPrft;
    }
    @JsonIgnore
    public void setCurEstiUnpayPrft(BigDecimal curEstiUnpayPrft) {
        this.curEstiUnpayPrft = curEstiUnpayPrft;
    }

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
