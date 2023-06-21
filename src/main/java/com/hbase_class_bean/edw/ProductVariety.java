package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ProductVariety {
    @JsonProperty("date")
    private String date;
    @JsonProperty("fitRankList")
    private List<FundProfitInfo> fitRankList = new ArrayList<FundProfitInfo>();

    @JsonIgnore
    public String getDate() {
        return date;
    }
    @JsonIgnore
    public void setDate(String date) {
        this.date = date;
    }
    @JsonIgnore
    public List<FundProfitInfo> getFitRankList() {
        return fitRankList;
    }
    @JsonIgnore
    public void setFitRankList(List<FundProfitInfo> fitRankList) {
        this.fitRankList = fitRankList;
    }
}
