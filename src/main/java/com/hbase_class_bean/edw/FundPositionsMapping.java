package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class FundPositionsMapping {
    @JsonProperty("updateDt")
    public String updateDt;
    @JsonProperty("fundBreed")
    public String fundBreed;
    @JsonProperty("qdllFlag")
    public String qdllFlag;
    @JsonProperty("prftRollCycle")
    public String prftRollCycle;
    @JsonProperty("prftRollDt")
    public String prftRollDt;
    @JsonProperty("implemPrft")
    public BigDecimal implemPrft;
    @JsonProperty("unpayoffPrft")
    public BigDecimal unpayoffPrft;
    @JsonProperty("totalProfit")
    public BigDecimal totalProfit;    // 取holdprft
    // 20230406 弃用以下3个字段
    @JsonProperty("holdShare")
    public BigDecimal holdShare;
    @JsonProperty("moneFund10ThouShareYld")
    public BigDecimal moneFund10ThouShareYld;
    @JsonProperty("moneFund7daysAnnuYId")
    public String moneFund7daysAnnuYId;

    @JsonIgnore
    public String getUpdateDt() {
        return updateDt;
    }
    @JsonIgnore
    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt;
    }
    @JsonIgnore
    public String getFundBreed() {
        return fundBreed;
    }
    @JsonIgnore
    public void setFundBreed(String fundBreed) {
        this.fundBreed = fundBreed;
    }

    @JsonIgnore
    public String getQdllFlag() {
        return qdllFlag;
    }
    @JsonIgnore
    public void setQdllFlag(String qdllFlag) {
        this.qdllFlag = qdllFlag;
    }
    @JsonIgnore
    public String getPrftRollCycle() {
        return prftRollCycle;
    }
    @JsonIgnore
    public void setPrftRollCycle(String prftRollCycle) {
        this.prftRollCycle = prftRollCycle;
    }
    @JsonIgnore
    public String getPrftRollDt() {
        return prftRollDt;
    }
    @JsonIgnore
    public void setPrftRollDt(String prftRollDt) {
        this.prftRollDt = prftRollDt;
    }
    @JsonIgnore
    public BigDecimal getImplemPrft() {
        return implemPrft;
    }
    @JsonIgnore
    public void setImplemPrft(BigDecimal implemPrft) {
        this.implemPrft = implemPrft;
    }
    @JsonIgnore
    public BigDecimal getUnpayoffPrft() {
        return unpayoffPrft;
    }
    @JsonIgnore
    public void setUnpayoffPrft(BigDecimal unpayoffPrft) {
        this.unpayoffPrft = unpayoffPrft;
    }
    @JsonIgnore
    public BigDecimal getTotalProfit() {
        return totalProfit;
    }
    @JsonIgnore
    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
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
