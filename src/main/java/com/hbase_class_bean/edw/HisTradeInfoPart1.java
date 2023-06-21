package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class HisTradeInfoPart1 {

    //match_dt string   成交日期
    @JsonProperty("date")
    private String datetime;
    //stkQty String 对应交易日清算后证券持仓数量
    @JsonProperty("stkQty")
    private String stkQty;
    //数据列表
    @JsonProperty("logList")
    private ArrayList<HisTradeInfoPart2> trdInfoList;

    @JsonIgnore
    public String getDatetime() {
        return datetime;
    }

    @JsonIgnore
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonIgnore
    public String getStkQty() {
        return stkQty;
    }

    @JsonIgnore
    public void setStkQty(String stkQty) {
        this.stkQty = stkQty;
    }

    @JsonIgnore
    public ArrayList<HisTradeInfoPart2> getTrdInfoList() {
        return trdInfoList;
    }

    @JsonIgnore
    public void setTrdInfoList(ArrayList<HisTradeInfoPart2> trdInfoList) {
        this.trdInfoList = trdInfoList;
    }
}
