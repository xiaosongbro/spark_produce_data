package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class FundProfitInfo {
    @JsonProperty("fundNo")
    private String fundNo;
    @JsonProperty("stkName")
    private String stkName;
    @JsonProperty("stkPrft")
    private BigDecimal stkPrft;

    @JsonIgnore
    public String getFundNo() {
        return fundNo;
    }
    @JsonIgnore
    public void setFundNo(String fundNo) {
        this.fundNo = fundNo;
    }
    @JsonIgnore
    public String getStkName() {
        return stkName;
    }
    @JsonIgnore
    public void setStkName(String stkName) {
        this.stkName = stkName;
    }
    @JsonIgnore
    public BigDecimal getStkPrft() {
        return stkPrft;
    }
    @JsonIgnore
    public void setStkPrft(BigDecimal stkPrft) {
        this.stkPrft = stkPrft;
    }
}
