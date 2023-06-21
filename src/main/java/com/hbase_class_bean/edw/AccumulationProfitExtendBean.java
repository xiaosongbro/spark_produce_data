package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;


public class AccumulationProfitExtendBean {
    //biz_dt String 业务日期
    @JsonProperty("date")
    private String biz_dt;
    //asset_acct String 资产账户
    //@JsonProperty("asset_acct")
    @JsonIgnore
    private String asset_acct;
    //fortune_acct String 财富账户
    //@JsonProperty("fortune_acct")
    @JsonIgnore
    private String fortune_acct;
    //trade_mrkt String 交易市场
    @JsonProperty("trade_mrkt")
    private String trade_mrkt;
    //prod_no String 产品代码
    @JsonProperty("prod_no")
    private String prod_no;
    //prod_name String 产品名称
    //@JsonProperty("prod_name")
//    @JsonIgnore
//    private String prod_name;
    //prod_type_cd String 产品类别代码
    //@JsonProperty("prod_type_cd")
    @JsonIgnore
    private String prod_type_cd;
    //day_profit DECIMAL(26,4) 当日收益
    @JsonProperty("day_profit")
    private String day_profit;
    //post_profit DECIMAL(26,4) 持仓收益
    @JsonProperty("post_profit")
    private String post_profit;
    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
    }
    @JsonIgnore
    public String getAsset_acct() {
        return asset_acct;
    }
    @JsonIgnore
    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
    }
    @JsonIgnore
    public String getFortune_acct() {
        return fortune_acct;
    }
    @JsonIgnore
    public void setFortune_acct(String fortune_acct) {
        this.fortune_acct = fortune_acct;
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
    @JsonIgnore
    public void setProd_no(String prod_no) {
        this.prod_no = prod_no;
    }

    @JsonIgnore
    public String getProd_type_cd() {
        return prod_type_cd;
    }
    @JsonIgnore
    public void setProd_type_cd(String prod_type_cd) {
        this.prod_type_cd = prod_type_cd;
    }
    @JsonIgnore
    public String getDay_profit() {
        return day_profit;
    }
    @JsonIgnore
    public void setDay_profit(String day_profit) {
        this.day_profit = day_profit;
    }
    @JsonIgnore
    public String getPost_profit() {
        return post_profit;
    }
    @JsonIgnore
    public void setPost_profit(String post_profit) {
        this.post_profit = post_profit;
    }
}
