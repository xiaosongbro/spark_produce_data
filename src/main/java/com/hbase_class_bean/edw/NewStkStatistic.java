package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class NewStkStatistic {
    ////日期;格式：yyyy
    @JsonProperty("dateTime")
    private String dateTime;
    //打新次数
    @JsonProperty("ipoSubsCnt")
    private BigDecimal ipoSubsCnt;
    //中签次数
    @JsonProperty("ipoTakeCnt")
    private BigDecimal ipoTakeCnt;
    @JsonIgnore
    public String getDateTime() {
        return dateTime;
    }
    @JsonIgnore
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    @JsonIgnore
    public BigDecimal getIpoSubsCnt() {
        return ipoSubsCnt;
    }
    @JsonIgnore
    public void setIpoSubsCnt(BigDecimal ipoSubsCnt) {
        this.ipoSubsCnt = ipoSubsCnt;
    }
    @JsonIgnore
    public BigDecimal getIpoTakeCnt() {
        return ipoTakeCnt;
    }
    @JsonIgnore
    public void setIpoTakeCnt(BigDecimal ipoTakeCnt) {
        this.ipoTakeCnt = ipoTakeCnt;
    }
}
