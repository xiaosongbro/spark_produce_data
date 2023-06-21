package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

//历史版本，待下线（20210811）
//两融账户跑赢

public class IntDNwfCreditRunWin {
    //biz_date	跑批日期
    @JsonProperty("Biz_Dt")
    private String biz_dt;
    //Asset_Acct	资金账户
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //Belong_Org_Id	营业部代码
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //l1_mth_lead_rate	近1月跑赢全体账户
    @JsonProperty("l1_mth_lead_rate")
    private java.math.BigDecimal l1_mth_lead_rate;
    //l3_mth_lead_rate	近3月跑赢全体账户
    @JsonProperty("l3_mth_lead_rate")
    private java.math.BigDecimal l3_mth_lead_rate;
    //l6_mth_lead_rate	近6月跑赢全体账户
    @JsonProperty("l6_mth_lead_rate")
    private java.math.BigDecimal l6_mth_lead_rate;
    //l1_year_lead_rate	近1年跑赢全体账户
    @JsonProperty("l1_year_lead_rate")
    private java.math.BigDecimal l1_year_lead_rate;
    //l1_mth_lead_status	近1月账户的状态	int
    @JsonProperty("l1_mth_lead_status")
    private Integer l1_mth_lead_status;
    //l3_mth_lead_status	近3月账户的状态	int
    @JsonProperty("l3_mth_lead_status")
    private Integer l3_mth_lead_status;
    //l6_mth_lead_status	近6月账户的状态	int
    @JsonProperty("l6_mth_lead_status")
    private Integer l6_mth_lead_status;
    //l1_year_lead_status	近1年账户的状态	int
    @JsonProperty("l1_year_lead_status")
    private Integer l1_year_lead_status;
    //开户日期	string
    @JsonProperty("open_acct_dt")
    private String open_acct_dt;
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
    public String getBelong_org_id() {
        return belong_org_id;
    }
    @JsonIgnore
    public void setBelong_org_id(String belong_org_id) {
        this.belong_org_id = belong_org_id;
    }
    @JsonIgnore
    public java.math.BigDecimal getL1_mth_lead_rate() {
        return l1_mth_lead_rate;
    }
    @JsonIgnore
    public void setL1_mth_lead_rate(java.math.BigDecimal l1_mth_lead_rate) {
        this.l1_mth_lead_rate = l1_mth_lead_rate;
    }
    @JsonIgnore
    public java.math.BigDecimal getL3_mth_lead_rate() {
        return l3_mth_lead_rate;
    }
    @JsonIgnore
    public void setL3_mth_lead_rate(java.math.BigDecimal l3_mth_lead_rate) {
        this.l3_mth_lead_rate = l3_mth_lead_rate;
    }
    @JsonIgnore
    public java.math.BigDecimal getL6_mth_lead_rate() {
        return l6_mth_lead_rate;
    }
    @JsonIgnore
    public void setL6_mth_lead_rate(java.math.BigDecimal l6_mth_lead_rate) {
        this.l6_mth_lead_rate = l6_mth_lead_rate;
    }
    @JsonIgnore
    public java.math.BigDecimal getL1_year_lead_rate() {
        return l1_year_lead_rate;
    }
    @JsonIgnore
    public void setL1_year_lead_rate(java.math.BigDecimal l1_year_lead_rate) {
        this.l1_year_lead_rate = l1_year_lead_rate;
    }
    @JsonIgnore
    public Integer getL1_mth_lead_status() {
        return l1_mth_lead_status;
    }
    @JsonIgnore
    public void setL1_mth_lead_status(Integer l1_mth_lead_status) {
        this.l1_mth_lead_status = l1_mth_lead_status;
    }
    @JsonIgnore
    public Integer getL3_mth_lead_status() {
        return l3_mth_lead_status;
    }
    @JsonIgnore
    public void setL3_mth_lead_status(Integer l3_mth_lead_status) {
        this.l3_mth_lead_status = l3_mth_lead_status;
    }
    @JsonIgnore
    public Integer getL6_mth_lead_status() {
        return l6_mth_lead_status;
    }
    @JsonIgnore
    public void setL6_mth_lead_status(Integer l6_mth_lead_status) {
        this.l6_mth_lead_status = l6_mth_lead_status;
    }
    @JsonIgnore
    public Integer getL1_year_lead_status() {
        return l1_year_lead_status;
    }
    @JsonIgnore
    public void setL1_year_lead_status(Integer l1_year_lead_status) {
        this.l1_year_lead_status = l1_year_lead_status;
    }
    @JsonIgnore
    public String getOpen_acct_dt() {
        return open_acct_dt;
    }
    @JsonIgnore
    public void setOpen_acct_dt(String open_acct_dt) {
        this.open_acct_dt = open_acct_dt;
    }
}
