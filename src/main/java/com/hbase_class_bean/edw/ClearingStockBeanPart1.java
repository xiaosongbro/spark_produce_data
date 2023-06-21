package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class ClearingStockBeanPart1 {

    @JsonProperty("updateDate")
    private String biz_dt;

    @JsonProperty("fundAcct")
    private String fundAcct;

    @JsonProperty("acctType")
    private String acctType;

    @JsonProperty("totalList")
    private ArrayList<ClearingStockBeanPart2> totalList;

    @JsonIgnore
    public String getFundAcct() {
        return fundAcct;
    }

    @JsonIgnore
    public void setFundAcct(String fundAcct) {
        this.fundAcct = fundAcct;
    }

    @JsonIgnore
    public String getAcctType() {
        return acctType;
    }

    @JsonIgnore
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    @JsonIgnore
    public ClearingStockBeanPart1() {
    }

    @JsonIgnore
    public ClearingStockBeanPart1(String biz_dt, String fundAcct, String acctType, ArrayList<ClearingStockBeanPart2> totalList) {
        this.biz_dt = biz_dt;
        this.fundAcct = fundAcct;
        this.acctType = acctType;
        this.totalList = totalList;
    }

    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }

    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
    }

    @JsonIgnore
    public ArrayList<ClearingStockBeanPart2> getTotalList() {
        return totalList;
    }

    @JsonIgnore
    public void setTotalList(ArrayList<ClearingStockBeanPart2> totalList) {
        this.totalList = totalList;
    }
}
