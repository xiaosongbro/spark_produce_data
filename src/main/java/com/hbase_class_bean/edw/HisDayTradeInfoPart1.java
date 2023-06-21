package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class HisDayTradeInfoPart1 {
    //日期 String 样式yyyy-MM-dd
    @JsonProperty("date")
    private String date;
    //数据
    @JsonProperty("operaList")
    private ArrayList<HisDayTradeInfoPart2> operaList;
    @JsonIgnore
    public String getDate() {
        return date;
    }
    @JsonIgnore
    public void setDate(String date) {
        this.date = date;
    }
    @JsonIgnore
    public ArrayList<HisDayTradeInfoPart2> getOperaList() {
        return operaList;
    }
    @JsonIgnore
    public void setOperaList(ArrayList<HisDayTradeInfoPart2> operaList) {
        this.operaList = operaList;
    }
}
