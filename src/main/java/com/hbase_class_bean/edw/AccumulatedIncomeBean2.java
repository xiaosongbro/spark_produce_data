package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashSet;


public class AccumulatedIncomeBean2 {
    @JsonProperty("asset_acct")
    public String asset_acct;
    @JsonProperty("fund_breed_cd")
    public String fund_breed_cd;
    @JsonProperty("fundNoSet")
    public HashSet fundNoSet;

    @JsonProperty("maxDate")
    public String maxDate;

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


    public HashSet getFundNoSet() {
        return fundNoSet;
    }

    public void setFundNoSet(HashSet fundNoSet) {
        this.fundNoSet = fundNoSet;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }
}
