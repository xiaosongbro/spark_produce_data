package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ProdProfitLossList {
    @JsonProperty("date")
    private String date;

    @JsonProperty("fitRankList")
    private List<ProdProfitLoss> fitRankList;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ProdProfitLoss> getFitRankList() {
        return fitRankList;
    }

    public void setFitRankList(List<ProdProfitLoss> fitRankList) {
        this.fitRankList = fitRankList;
    }

    @Override
    public String toString() {
        return "ProdProfitLossList{" +
                ", date='" + date + '\'' +
                ", fitRankList=" + fitRankList +
                '}';
    }
}
