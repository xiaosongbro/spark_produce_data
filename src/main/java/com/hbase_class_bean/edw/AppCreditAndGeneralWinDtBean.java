package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//账户分析----->两融账户&普通账户跑赢（20210811）
//impala表：app_data.int_d_nwf_credit_win_new、app_data.int_d_nwf_general_win_new

public class AppCreditAndGeneralWinDtBean {
    //跑批日期	biz_dt	INT
    @JsonProperty("biz_dt")
    private int biz_dt;
    //资金账户	asset_acct	STRING
    @JsonProperty("asset_acct")
    private String asset_acct;
    //营业部代码	belong_org_id	STRING
    @JsonProperty("belong_org_id")
    private String belong_org_id;
    //资金账户开户日期	open_acct_dt	STRING
    @JsonProperty("open_acct_dt")
    private String open_acct_dt;
    //近一个月跑赢全体账户	l1_mth_lead_rate	DECIMAL(26,4)
    @JsonProperty("l1_mth_lead_rate")
    private BigDecimal l1_mth_lead_rate;
    //近三个月跑赢全体账户	l3_mth_lead_rate	DECIMAL(26,4)
    @JsonProperty("l3_mth_lead_rate")
    private BigDecimal l3_mth_lead_rate;
    //近六个月跑赢全体账户	l6_mth_lead_rate	DECIMAL(26,4)
    @JsonProperty("l6_mth_lead_rate")
    private BigDecimal l6_mth_lead_rate;
    //近一年跑赢全体账户	l1_year_lead_rate	DECIMAL(26,4)
    @JsonProperty("l1_year_lead_rate")
    private BigDecimal l1_year_lead_rate;
    //本月跑赢全体账户	this_mth_lead_rate	DECIMAL(26,4)
    @JsonProperty("this_mth_lead_rate")
    private BigDecimal this_mth_lead_rate;
    //本年跑赢全体账户	this_year_lead_rate	DECIMAL(26,4)
    @JsonProperty("this_year_lead_rate")
    private BigDecimal this_year_lead_rate;
    //全部日期范围跑赢全体账户	all_day_lead_rate	DECIMAL(26,4)
    @JsonProperty("all_day_lead_rate")
    private BigDecimal all_day_lead_rate;
    //全部日期区间累计收益	rec_all_day_profit	DECIMAL(26,4)
    @JsonProperty("rec_all_day_profit")
    private BigDecimal rec_all_day_profit;
    //全部日期范围累计相对盈亏率	recent_all_day_rate	DECIMAL(26,4)
    @JsonProperty("recent_all_day_rate")
    private BigDecimal recent_all_day_rate;
    @JsonIgnore
    public int getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(int biz_dt) {
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
    public String getBelong_org_id() {
        return belong_org_id;
    }
    @JsonIgnore
    public void setBelong_org_id(String belong_org_id) {
        this.belong_org_id = belong_org_id;
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
    public BigDecimal getL1_mth_lead_rate() {
        return l1_mth_lead_rate;
    }
    @JsonIgnore
    public void setL1_mth_lead_rate(BigDecimal l1_mth_lead_rate) {
        this.l1_mth_lead_rate = l1_mth_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getL3_mth_lead_rate() {
        return l3_mth_lead_rate;
    }
    @JsonIgnore
    public void setL3_mth_lead_rate(BigDecimal l3_mth_lead_rate) {
        this.l3_mth_lead_rate = l3_mth_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getL6_mth_lead_rate() {
        return l6_mth_lead_rate;
    }
    @JsonIgnore
    public void setL6_mth_lead_rate(BigDecimal l6_mth_lead_rate) {
        this.l6_mth_lead_rate = l6_mth_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getL1_year_lead_rate() {
        return l1_year_lead_rate;
    }
    @JsonIgnore
    public void setL1_year_lead_rate(BigDecimal l1_year_lead_rate) {
        this.l1_year_lead_rate = l1_year_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getThis_mth_lead_rate() {
        return this_mth_lead_rate;
    }
    @JsonIgnore
    public void setThis_mth_lead_rate(BigDecimal this_mth_lead_rate) {
        this.this_mth_lead_rate = this_mth_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getThis_year_lead_rate() {
        return this_year_lead_rate;
    }
    @JsonIgnore
    public void setThis_year_lead_rate(BigDecimal this_year_lead_rate) {
        this.this_year_lead_rate = this_year_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getAll_day_lead_rate() {
        return all_day_lead_rate;
    }
    @JsonIgnore
    public void setAll_day_lead_rate(BigDecimal all_day_lead_rate) {
        this.all_day_lead_rate = all_day_lead_rate;
    }
    @JsonIgnore
    public BigDecimal getRec_all_day_profit() {
        return rec_all_day_profit;
    }
    @JsonIgnore
    public void setRec_all_day_profit(BigDecimal rec_all_day_profit) {
        this.rec_all_day_profit = rec_all_day_profit;
    }
    @JsonIgnore
    public BigDecimal getRecent_all_day_rate() {
        return recent_all_day_rate;
    }
    @JsonIgnore
    public void setRecent_all_day_rate(BigDecimal recent_all_day_rate) {
        this.recent_all_day_rate = recent_all_day_rate;
    }
}
