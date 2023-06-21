package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class FundTradPoint1 {

    //日期。格式：yyyy-MM-dd
    @JsonProperty
    private String dateTime;
    //数据列表
    @JsonProperty
    private ArrayList<FundTradPoint2> dataList;

    @JsonIgnore
    public String getDateTime() {
        return dateTime;
    }
    @JsonIgnore
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    @JsonIgnore
    public ArrayList<FundTradPoint2> getDataList() {
        return dataList;
    }
    @JsonIgnore
    public void setDataList(ArrayList<FundTradPoint2> dataList) {
        this.dataList = dataList;
    }
}
