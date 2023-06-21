package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class StockProfitMonthPart1 {

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("typeCount")
    private Integer typeCount;

    @JsonProperty("parCount")
    private Integer parCount;

    @JsonProperty("profit")
    private String profit;

    @JsonProperty("totalProfit")
    private String totalProfit;

    @JsonProperty("stockAnalyzeList")
    private List<StockProfitMonthPart2> productList;

    @JsonIgnore
    public StockProfitMonthPart1() {
    }

    @JsonIgnore
    public StockProfitMonthPart1(Integer count, Integer typeCount, Integer parCount, String profit, String totalProfit, List<StockProfitMonthPart2> productList) {
        this.count = count;
        this.typeCount = typeCount;
        this.parCount = parCount;
        this.profit = profit;
        this.totalProfit = totalProfit;
        this.productList = productList;
    }

    @JsonIgnore
    public Integer getCount() {
        return count;
    }

    @JsonIgnore
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonIgnore
    public Integer getTypeCount() {
        return typeCount;
    }

    @JsonIgnore
    public void setTypeCount(Integer typeCount) {
        this.typeCount = typeCount;
    }

    @JsonIgnore
    public Integer getParCount() {
        return parCount;
    }

    @JsonIgnore
    public void setParCount(Integer parCount) {
        this.parCount = parCount;
    }

    @JsonIgnore
    public String getProfit() {
        return profit;
    }

    @JsonIgnore
    public void setProfit(String profit) {
        this.profit = profit;
    }

    @JsonIgnore
    public String getTotalProfit() {
        return totalProfit;
    }

    @JsonIgnore
    public void setTotalProfit(String totalProfit) {
        this.totalProfit = totalProfit;
    }

    @JsonIgnore
    public List<StockProfitMonthPart2> getProductList() {
        return productList;
    }

    @JsonIgnore
    public void setProductList(List<StockProfitMonthPart2> productList) {
        this.productList = productList;
    }
}
