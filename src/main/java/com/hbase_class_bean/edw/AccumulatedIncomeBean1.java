package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Map;


public class AccumulatedIncomeBean1 {

    @JsonProperty("asset_acct")
    public String asset_acct;
    @JsonProperty("fund_breed_cd")
    public String fund_breed_cd;
    @JsonProperty("fund_no")
    public String fund_no;
    @JsonProperty("fund_name")
    public String fund_name;
    @JsonProperty("profitMap")
    public Map profitMap;

    @JsonProperty("maxDate")
    public String maxDate;
    @JsonProperty("minDate")
    public String minDate;


    public String getAsset_acct() {
        return asset_acct;
    }

    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
    }

    public String getFund_breed_cd() {
        return fund_breed_cd;
    }

    public void setFund_breed_cd(String fund_breed_cd) {
        this.fund_breed_cd = fund_breed_cd;
    }

    public String getFund_no() {
        return fund_no;
    }

    public void setFund_no(String fund_no) {
        this.fund_no = fund_no;
    }

    public String getFund_name() {
        return fund_name;
    }

    public void setFund_name(String fund_name) {
        this.fund_name = fund_name;
    }

    public Map getProfitMap() {
        return profitMap;
    }

    public void setProfitMap(Map profitMap) {
        this.profitMap = profitMap;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

}
