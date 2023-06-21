package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class AntoInvestRecordBean {

    @JsonProperty("antoinvesAccumAmt")
    private BigDecimal antoinvesAccumAmt;
    @JsonProperty("antoinvesAccumTims")
    private BigDecimal antoinvesAccumTims;
    @JsonProperty("antoinvesDays")
    private BigDecimal antoinvesDays;
    @JsonProperty("tradeList")
    private List<AntoInvestRecordTrade> tradeList = new ArrayList<AntoInvestRecordTrade>();

    @JsonIgnore
    public BigDecimal getAntoinvesAccumAmt() {
        return antoinvesAccumAmt;
    }
    @JsonIgnore
    public void setAntoinvesAccumAmt(BigDecimal antoinvesAccumAmt) {
        this.antoinvesAccumAmt = antoinvesAccumAmt;
    }
    @JsonIgnore
    public BigDecimal getAntoinvesAccumTims() {
        return antoinvesAccumTims;
    }
    @JsonIgnore
    public void setAntoinvesAccumTims(BigDecimal antoinvesAccumTims) {
        this.antoinvesAccumTims = antoinvesAccumTims;
    }
    @JsonIgnore
    public BigDecimal getAntoinvesDays() {
        return antoinvesDays;
    }
    @JsonIgnore
    public void setAntoinvesDays(BigDecimal antoinvesDays) {
        this.antoinvesDays = antoinvesDays;
    }
    @JsonIgnore
    public List<AntoInvestRecordTrade> getTradeList() {
        return tradeList;
    }
    @JsonIgnore
    public void setTradeList(List<AntoInvestRecordTrade> tradeList) {
        this.tradeList = tradeList;
    }
}
