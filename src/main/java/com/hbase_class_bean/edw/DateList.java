package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;


public class DateList {
    @JsonProperty("dateList")
    private List dateList;
    @JsonIgnore
    public List getDateList() {
        return dateList;
    }
    @JsonIgnore
    public void setDateList(List dateList) {
        this.dateList = dateList;
    }

}
