package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class SectorIndexDayBean {

    @JsonProperty("biz_dt")
    private String biz_dt;

    @JsonProperty("last_dt")
    private String last_dt;

    @JsonProperty("open_price")
    private BigDecimal open_price;

    @JsonProperty("closing_price")
    private BigDecimal closing_price;

    @JsonProperty("last_closing_price")
    private BigDecimal last_closing_price;

    @JsonIgnore
    public SectorIndexDayBean() {
    }

    @JsonIgnore
    public SectorIndexDayBean(String biz_dt, String last_dt, BigDecimal open_price, BigDecimal closing_price, BigDecimal last_closing_price) {
        this.biz_dt = biz_dt;
        this.last_dt = last_dt;
        this.open_price = open_price;
        this.closing_price = closing_price;
        this.last_closing_price = last_closing_price;
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
    public String getLast_dt() {
        return last_dt;
    }

    @JsonIgnore
    public void setLast_dt(String last_dt) {
        this.last_dt = last_dt;
    }

    @JsonIgnore
    public BigDecimal getOpen_price() {
        return open_price;
    }

    @JsonIgnore
    public void setOpen_price(BigDecimal open_price) {
        this.open_price = open_price;
    }

    @JsonIgnore
    public BigDecimal getClosing_price() {
        return closing_price;
    }

    @JsonIgnore
    public void setClosing_price(BigDecimal closing_price) {
        this.closing_price = closing_price;
    }

    @JsonIgnore
    public BigDecimal getLast_closing_price() {
        return last_closing_price;
    }

    @JsonIgnore
    public void setLast_closing_price(BigDecimal last_closing_price) {
        this.last_closing_price = last_closing_price;
    }
}
