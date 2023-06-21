package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class SectorIndexUserMonthBean {

    @JsonProperty("biz_dt")
    private String biz_dt;



    @JsonProperty("open_acct_dt")
    private String open_acct_dt;

    @JsonProperty("ori_open_price")
    private BigDecimal ori_open_price;

    @JsonIgnore
    public SectorIndexUserMonthBean() {
    }

    @JsonIgnore
    public SectorIndexUserMonthBean(String biz_dt, String open_acct_dt, BigDecimal ori_open_price) {
        this.biz_dt = biz_dt;

        this.open_acct_dt = open_acct_dt;
        this.ori_open_price = ori_open_price;
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
    public String getOpen_acct_dt() {
        return open_acct_dt;
    }

    @JsonIgnore
    public void setOpen_acct_dt(String open_acct_dt) {
        this.open_acct_dt = open_acct_dt;
    }

    @JsonIgnore
    public BigDecimal getOri_open_price() {
        return ori_open_price;
    }

    @JsonIgnore
    public void setOri_open_price(BigDecimal ori_open_price) {
        this.ori_open_price = ori_open_price;
    }
}
