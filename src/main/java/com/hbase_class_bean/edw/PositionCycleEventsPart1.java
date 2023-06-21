package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;


public class PositionCycleEventsPart1 {

    //操作日期 string
    @JsonProperty("dateTime")
    private String dateTime;
    //数据列表 list
    @JsonProperty("operaList")
    private ArrayList<PositionCycleEventsPart2> operaList;
    @JsonIgnore
    public String getDateTime() {
        return dateTime;
    }
    @JsonIgnore
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    @JsonIgnore
    public ArrayList<PositionCycleEventsPart2> getOperaList() {
        return operaList;
    }
    @JsonIgnore
    public void setOperaList(ArrayList<PositionCycleEventsPart2> operaList) {
        this.operaList = operaList;
    }
}
