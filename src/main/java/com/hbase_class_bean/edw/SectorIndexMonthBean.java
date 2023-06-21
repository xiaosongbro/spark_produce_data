package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class SectorIndexMonthBean {

    @JsonProperty("biz_dt")
    private String biz_dt;

    @JsonProperty("biz_month")
    private String biz_month;

    @JsonProperty("month_closing_price")
    private BigDecimal month_closing_price;

    @JsonProperty("ori_open_price")
    private BigDecimal ori_open_price;

    @JsonIgnore
    public SectorIndexMonthBean() {
    }

    @JsonIgnore
    public SectorIndexMonthBean(String biz_dt, String biz_month, BigDecimal month_closing_price, BigDecimal ori_open_price) {
        this.biz_dt = biz_dt;
        this.biz_month = biz_month;
        this.month_closing_price = month_closing_price;
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
    public String getBiz_month() {
        return biz_month;
    }

    @JsonIgnore
    public void setBiz_month(String biz_month) {
        this.biz_month = biz_month;
    }


    public BigDecimal getMonth_closing_price() {
        return month_closing_price;
    }

    public void setMonth_closing_price(BigDecimal month_closing_price) {
        this.month_closing_price = month_closing_price;
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
