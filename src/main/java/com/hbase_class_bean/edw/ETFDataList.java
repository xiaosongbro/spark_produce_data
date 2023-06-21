package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;


public class ETFDataList {
    @JsonProperty("bizDt")
    private String bizDt;

    @JsonProperty("dataList")
    private List dataList;

    @JsonIgnore
    public String getBizDt() {
        return bizDt;
    }
    @JsonIgnore
    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }
    @JsonIgnore
    public List getDataList() {
        return dataList;
    }
    @JsonIgnore
    public void setDataList(List dataList) {
        this.dataList = dataList;
    }
}
