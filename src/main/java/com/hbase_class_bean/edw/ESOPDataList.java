package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;


public class ESOPDataList {

    @JsonProperty("dataList")
    private List dataList;

    @JsonIgnore
    public List getDataList() {
        return dataList;
    }
    @JsonIgnore
    public void setDataList(List dataList) {
        this.dataList = dataList;
    }
}
