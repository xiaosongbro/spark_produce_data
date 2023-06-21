package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class MarketIndexProfitAndLoss {
    @JsonProperty("d")
    private String d;
    @JsonProperty("szlj")
    private BigDecimal szlj;
    @JsonProperty("sclj")
    private BigDecimal sclj;
    @JsonProperty("cylj")
    private BigDecimal cylj;
    @JsonProperty("hslj")
    private BigDecimal hslj;
    @JsonIgnore
    public String getD() {
        return d;
    }
    @JsonIgnore
    public void setD(String d) {
        this.d = d;
    }
    @JsonIgnore
    public BigDecimal getSzlj() {
        return szlj;
    }
    @JsonIgnore
    public void setSzlj(BigDecimal szlj) {
        this.szlj = szlj;
    }
    @JsonIgnore
    public BigDecimal getSclj() {
        return sclj;
    }
    @JsonIgnore
    public void setSclj(BigDecimal sclj) {
        this.sclj = sclj;
    }
    @JsonIgnore
    public BigDecimal getCylj() {
        return cylj;
    }
    @JsonIgnore
    public void setCylj(BigDecimal cylj) {
        this.cylj = cylj;
    }
    @JsonIgnore
    public BigDecimal getHslj() {
        return hslj;
    }
    @JsonIgnore
    public void setHslj(BigDecimal hslj) {
        this.hslj = hslj;
    }
}
