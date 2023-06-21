package com.hbase_class_bean.edw;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class IndustryStockList {

    @JsonProperty("stockList")
    private ArrayList<IndustryStocks> stockList;

    @JsonIgnore
    public ArrayList<IndustryStocks> getStockList() {
        return stockList;
    }

    @JsonIgnore
    public void setStockList(ArrayList<IndustryStocks> stockList) {
        this.stockList = stockList;
    }
}




