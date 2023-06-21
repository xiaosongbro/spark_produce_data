package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class MarketIndexProfitAndLossList {
    @JsonProperty("d")
    private String d;
    @JsonProperty("type")
    private int type;
    @JsonProperty("c")
    private List<MarketIndexProfitAndLoss> c;

    @JsonIgnore
    public String getD() {
        return d;
    }
    @JsonIgnore
    public void setD(String d) {
        this.d = d;
    }
    @JsonIgnore
    public int getType() {
        return type;
    }
    @JsonIgnore
    public void setType(int type) {
        this.type = type;
    }
    @JsonIgnore
    public List<MarketIndexProfitAndLoss> getC() {
        return c;
    }
    @JsonIgnore
    public void setC(List<MarketIndexProfitAndLoss> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "{" +
                "d='" + d + '\'' +
                ", type=" + type +
                ", c=" + c +
                '}';
    }
}
