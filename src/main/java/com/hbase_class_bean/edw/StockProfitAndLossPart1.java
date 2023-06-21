package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StockProfitAndLossPart1 {


    //    `count` decimal(19,0) comment '股票总支数（债券/A股）',
    //    totalprofit decimal(19,4) comment '总盈利/总亏损',
    //    profitcount	DECIMAL(19,0) comment'盈利总支数',
    //    losscount DECIMAL(19,0) comment'亏损总支数',
    //    steadycount DECIMAL(19,0) comment '无盈亏无亏损总支数'
    @JsonProperty("count")
    private int count;
    @JsonProperty("profit")
    private BigDecimal profit;
    @JsonProperty("totalprofit")
    private BigDecimal totalprofit;

    @JsonProperty("typeCount")
    private int typeCount;
    @JsonProperty("parCount")
    private int parCount;

    @JsonProperty("stockAnalyzeList")
    private ArrayList<StockProfitAndLossPart2> stockAnalyzeList = new ArrayList<>();
    @JsonIgnore
    public ArrayList<StockProfitAndLossPart2> getStockAnalyzeList() {
        return stockAnalyzeList;
    }
    @JsonIgnore
    public void setStockAnalyzeList(ArrayList<StockProfitAndLossPart2> stockAnalyzeList) {
        this.stockAnalyzeList = stockAnalyzeList;
    }

    @JsonIgnore
    public int getCount() {
        return count;
    }
    @JsonIgnore
    public void setCount(int count) {
        this.count = count;
    }
    @JsonIgnore
    public BigDecimal getProfit() {
        return profit;
    }
    @JsonIgnore
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }
    @JsonIgnore
    public BigDecimal getTotalprofit() {
        return totalprofit;
    }
    @JsonIgnore
    public void setTotalprofit(BigDecimal totalprofit) {
        this.totalprofit = totalprofit;
    }

    @JsonIgnore
    public int getTypeCount() {
        return typeCount;
    }
    @JsonIgnore
    public void setTypeCount(int typeCount) {
        this.typeCount = typeCount;
    }
    @JsonIgnore
    public int getParCount() {
        return parCount;
    }
    @JsonIgnore
    public void setParCount(int parCount) {
        this.parCount = parCount;
    }


}
