package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//板块指数
//表名：int_d_nwf_mrkt_index
public class IntDNwfMrktIndexNew {

    //Biz_Dt	业务日期	DATE
    @JsonProperty("Biz_Dt")
    private String biz_dt;
    //Index_Cd	指数代码	VARCHAR(60)
    @JsonProperty("Index_Cd")
    private String index_cd;
    //Index_Name	指数名称	VARCHAR(200)
    @JsonProperty("Index_Name")
    private String index_name;
    //Highest_Price	最高价	DECIMAL(26,8)
    @JsonProperty("Highest_Price")
    private BigDecimal hightest_price;
    //Lowest_Price	最低价	DECIMAL(26,8)
    @JsonProperty("Lowest_Price")
    private BigDecimal lowest_price;
    //Open_Price	开盘价	DECIMAL(26,8)
    @JsonProperty("Open_Price")
    private BigDecimal open_price;
    //Closing_Price	收盘价	DECIMAL(26,8)
    @JsonProperty("Closing_Price")
    private BigDecimal closing_price;
    //Last_Closing_Price 上次交易日收盘价 DECIMAL(26,8)
    @JsonProperty("Last_Closing_Price")
    private BigDecimal last_closing_price;
    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
    }
    @JsonIgnore
    public String getIndex_cd() {
        return index_cd;
    }
    @JsonIgnore
    public void setIndex_cd(String index_cd) {
        this.index_cd = index_cd;
    }
    @JsonIgnore
    public String getIndex_name() {
        return index_name;
    }
    @JsonIgnore
    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }
    @JsonIgnore
    public BigDecimal getHightest_price() {
        return hightest_price;
    }
    @JsonIgnore
    public void setHightest_price(BigDecimal hightest_price) {
        this.hightest_price = hightest_price;
    }
    @JsonIgnore
    public BigDecimal getLowest_price() {
        return lowest_price;
    }
    @JsonIgnore
    public void setLowest_price(BigDecimal lowest_price) {
        this.lowest_price = lowest_price;
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
