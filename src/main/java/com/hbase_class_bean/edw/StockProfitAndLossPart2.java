package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class StockProfitAndLossPart2 {
    //    asset_acct string comment '资金账号',
    //    stkName string comment '证券名称',
    //    stkCode string comment '证券代码',
    //    currProfit decimal(19,4) comment '原币种区间盈亏',
    //    rmbProfit decimal(19,4) comment '人民币区间盈亏',
    //    currCode string comment '原币种代码',
    //    rate decimal(4,4) comment '参考汇率',
    //    stkType string comment '证券类型',
    //    market string comment '交易市场'
    //    status string comment '状态',


    @JsonProperty("stkName")
    private String stkName;
    @JsonProperty("stkCode")
    private String stkCode;
    @JsonProperty("currProfit")
    private BigDecimal currProfit;
    @JsonProperty("rmbProfit")
    private BigDecimal rmbProfit;
    @JsonProperty("currCode")
    private String currCode;
    @JsonProperty("rate")
    private BigDecimal rate;
    @JsonProperty("stkType")
    private String stkType;
    @JsonProperty("market")
    private String market;
    @JsonProperty("status")
    private String status;

    @JsonProperty
    public String getStatus() {
        return status;
    }
    @JsonProperty
    public void setStatus(String status) {
        this.status = status;
    }

//    //证券类型
//    @JsonProperty
//    private String secuType;
//    //盈亏类型
//    @JsonProperty
//    private String dataType;

    @JsonIgnore
    public String getStkName() {
        return stkName;
    }
    @JsonIgnore
    public void setStkName(String stkName) {
        this.stkName = stkName;
    }
    @JsonIgnore
    public String getStkCode() {
        return stkCode;
    }
    @JsonIgnore
    public void setStkCode(String stkCode) {
        this.stkCode = stkCode;
    }
    @JsonIgnore
    public BigDecimal getCurrProfit() {
        return currProfit;
    }
    @JsonIgnore
    public void setCurrProfit(BigDecimal currProfit) {
        this.currProfit = currProfit;
    }
    @JsonIgnore
    public BigDecimal getRmbProfit() {
        return rmbProfit;
    }
    @JsonIgnore
    public void setRmbProfit(BigDecimal rmbProfit) {
        this.rmbProfit = rmbProfit;
    }
    @JsonIgnore
    public String getCurrCode() {
        return currCode;
    }
    @JsonIgnore
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }
    @JsonIgnore
    public BigDecimal getRate() {
        return rate;
    }
    @JsonIgnore
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
    @JsonIgnore
    public String getStkType() {
        return stkType;
    }
    @JsonIgnore
    public void setStkType(String stkType) {
        this.stkType = stkType;
    }
    @JsonIgnore
    public String getMarket() {
        return market;
    }
    @JsonIgnore
    public void setMarket(String market) {
        this.market = market;
    }
}
