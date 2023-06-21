package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class TradeStatusQueryPart2 {

    //ser_num	流水号	String
    @JsonProperty("serNum")
    private String ser_num;
    //order_status_cd	委托状态代码	String
    @JsonProperty("status")
    private String order_status_cd;
    //trade_mrkt	交易市场	String
    @JsonProperty("tradeMrkt")
    private String trade_mrkt;
    //prod_no	产品编号	String
    @JsonProperty("prodNo")
    private String prod_no;
    @JsonIgnore
    public String getSer_num() {
        return ser_num;
    }
    @JsonIgnore
    public void setSer_num(String ser_num) {
        this.ser_num = ser_num;
    }
    @JsonIgnore
    public String getOrder_status_cd() {
        return order_status_cd;
    }
    @JsonIgnore
    public void setOrder_status_cd(String order_status_cd) {
        this.order_status_cd = order_status_cd;
    }
    @JsonIgnore
    public String getTrade_mrkt() {
        return trade_mrkt;
    }
    @JsonIgnore
    public void setTrade_mrkt(String trade_mrkt) {
        this.trade_mrkt = trade_mrkt;
    }
    @JsonIgnore
    public String getProd_no() {
        return prod_no;
    }

    public void setProd_no(String prod_no) {
        this.prod_no = prod_no;
    }
}
