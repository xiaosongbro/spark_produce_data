package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class TradeStatusQueryPart1 {

    //tradingList  数据集
    @JsonProperty("tradingList")
    private ArrayList<TradeStatusQueryPart2> tradingList;
    @JsonIgnore
    public ArrayList<TradeStatusQueryPart2> getTradingList() {
        return tradingList;
    }
    @JsonIgnore
    public void setTradingList(ArrayList<TradeStatusQueryPart2> tradingList) {
        this.tradingList = tradingList;
    }
}
