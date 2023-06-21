package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//历史版本，待下线（20210811）
//账户分析月表

public class IntNNwfAcctProfitMon {
    //资金账号 Asset_Acct
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //月度盈亏 Month_Profit_Loss
    @JsonProperty("Month_Profit_Loss")
    private BigDecimal month_profit_loss;
    //Biz_Dt 业务日期
    @JsonProperty("Biz_Dt")
    private String biz_dt;
    //Biz_Month 月份
    @JsonProperty("Biz_Month")
    private String biz_month;
    //Belong_Org_Id	营业部代码
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //Acct_Flag	账户标志
    @JsonProperty("Acct_Flag")
    private Integer acct_flag;
    //Data_Label	数据标签
    @JsonProperty("Data_Label")
    private String data_label;
    //aver_net_asset	当月日均净资产	decimal(26,4)
    @JsonProperty("Aver_Net_Asset")
    private BigDecimal aver_net_asset;
    //begin_net_asset	期初净资产	decimal(26,4)
    @JsonProperty("Begin_Net_Asset")
    private BigDecimal begin_net_asset;
    //month_net_asset_in	净流入资产	decimal(26,4)
    @JsonProperty("Month_Net_Asset_In")
    private BigDecimal month_net_asset_in;
    //end_net_asset	期末净资产	decimal(26,4)
    @JsonProperty("End_Net_Asset")
    private BigDecimal end_net_asset;
    //month_bank_to_secu	银证转入	decimal(26,4)
    @JsonProperty("Month_Bank_To_Secu")
    private BigDecimal month_bank_to_secu;
    //month_secu_to_bank	银证转出	decimal(26,4)
    @JsonProperty("Month_Secu_To_Bank")
    private BigDecimal month_secu_to_bank;
    //month_collateral_in	担保品转入	decimal(26,4)
    @JsonProperty("Month_Collateral_In")
    private BigDecimal month_collateral_in;
    //month_collateral_out	担保品转出	decimal(26,4)
    @JsonProperty("Month_Collateral_Out")
    private BigDecimal month_collateral_out;
    //month_cap_out	转出资金	decimal(26,4)
    @JsonProperty("Month_Cap_Out")
    private BigDecimal month_cap_out;
    //month_cap_in	转入资金	decimal(26,4)
    @JsonProperty("Month_Cap_In")
    private BigDecimal month_cap_in;
    //month_mrkt_out	转出市值	decimal(26,4)
    @JsonProperty("Month_Mrkt_Out")
    private BigDecimal month_mrkt_out;
    //month_mrkt_in	转入市值	decimal(26,4)
    @JsonProperty("Month_Mrkt_In")
    private BigDecimal month_mrkt_in;
    //month_cost	当月成本	decimal(26,4)
    @JsonProperty("Month_Cost")
    private BigDecimal month_cost;
    //other_in	其他转入	decimal(26,4)
    @JsonProperty("Other_In")
    private BigDecimal other_in;
    //other_out	其他转出	decimal(26,4)
    @JsonProperty("Other_Out")
    private BigDecimal other_out;
    //month_profit_rate	本月收益率	decimal(26,4)
    @JsonProperty("Month_Profit_Rate")
    private BigDecimal month_profit_rate;
    //mth_lead_rate	跑赢全体账户(月)	decimal（26，4）
    @JsonProperty("month_lead_rate")
    private BigDecimal month_lead_rate;
    //open_acct_dt string 开户日期
    @JsonProperty("Open_Acct_Dt")
    private String open_acct_dt;


    @JsonIgnore
    public String getAsset_acct() {
        return asset_acct;
    }
    @JsonIgnore
    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
    }
    @JsonIgnore
    public BigDecimal getMonth_profit_loss() {
        return month_profit_loss;
    }
    @JsonIgnore
    public void setMonth_profit_loss(BigDecimal month_profit_loss) {
        this.month_profit_loss = month_profit_loss;
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
    @JsonIgnore
    public String getBelong_org_id() {
        return belong_org_id;
    }
    @JsonIgnore
    public void setBelong_org_id(String belong_org_id) {
        this.belong_org_id = belong_org_id;
    }
    @JsonIgnore
    public Integer getAcct_flag() {
        return acct_flag;
    }
    @JsonIgnore
    public void setAcct_flag(Integer acct_flag) {
        this.acct_flag = acct_flag;
    }
    @JsonIgnore
    public String getData_label() {
        return data_label;
    }
    @JsonIgnore
    public void setData_label(String data_label) {
        this.data_label = data_label;
    }
    @JsonIgnore
    public BigDecimal getAver_net_asset() {
        return aver_net_asset;
    }
    @JsonIgnore
    public void setAver_net_asset(BigDecimal aver_net_asset) {
        this.aver_net_asset = aver_net_asset;
    }
    @JsonIgnore
    public BigDecimal getBegin_net_asset() {
        return begin_net_asset;
    }
    @JsonIgnore
    public void setBegin_net_asset(BigDecimal begin_net_asset) {
        this.begin_net_asset = begin_net_asset;
    }
    @JsonIgnore
    public BigDecimal getMonth_net_asset_in() {
        return month_net_asset_in;
    }
    @JsonIgnore
    public void setMonth_net_asset_in(BigDecimal month_net_asset_in) {
        this.month_net_asset_in = month_net_asset_in;
    }
    @JsonIgnore
    public BigDecimal getEnd_net_asset() {
        return end_net_asset;
    }
    @JsonIgnore
    public void setEnd_net_asset(BigDecimal end_net_asset) {
        this.end_net_asset = end_net_asset;
    }
    @JsonIgnore
    public BigDecimal getMonth_bank_to_secu() {
        return month_bank_to_secu;
    }
    @JsonIgnore
    public void setMonth_bank_to_secu(BigDecimal month_bank_to_secu) {
        this.month_bank_to_secu = month_bank_to_secu;
    }
    @JsonIgnore
    public BigDecimal getMonth_secu_to_bank() {
        return month_secu_to_bank;
    }
    @JsonIgnore
    public void setMonth_secu_to_bank(BigDecimal month_secu_to_bank) {
        this.month_secu_to_bank = month_secu_to_bank;
    }
    @JsonIgnore
    public BigDecimal getMonth_collateral_in() {
        return month_collateral_in;
    }
    @JsonIgnore
    public void setMonth_collateral_in(BigDecimal month_collateral_in) {
        this.month_collateral_in = month_collateral_in;
    }
    @JsonIgnore
    public BigDecimal getMonth_collateral_out() {
        return month_collateral_out;
    }
    @JsonIgnore
    public void setMonth_collateral_out(BigDecimal month_collateral_out) {
        this.month_collateral_out = month_collateral_out;
    }
    @JsonIgnore
    public BigDecimal getMonth_cap_out() {
        return month_cap_out;
    }
    @JsonIgnore
    public void setMonth_cap_out(BigDecimal month_cap_out) {
        this.month_cap_out = month_cap_out;
    }
    @JsonIgnore
    public BigDecimal getMonth_cap_in() {
        return month_cap_in;
    }
    @JsonIgnore
    public void setMonth_cap_in(BigDecimal month_cap_in) {
        this.month_cap_in = month_cap_in;
    }
    @JsonIgnore
    public BigDecimal getMonth_mrkt_out() {
        return month_mrkt_out;
    }
    @JsonIgnore
    public void setMonth_mrkt_out(BigDecimal month_mrkt_out) {
        this.month_mrkt_out = month_mrkt_out;
    }
    @JsonIgnore
    public BigDecimal getMonth_mrkt_in() {
        return month_mrkt_in;
    }
    @JsonIgnore
    public void setMonth_mrkt_in(BigDecimal month_mrkt_in) {
        this.month_mrkt_in = month_mrkt_in;
    }
    @JsonIgnore
    public BigDecimal getMonth_cost() {
        return month_cost;
    }
    @JsonIgnore
    public void setMonth_cost(BigDecimal month_cost) {
        this.month_cost = month_cost;
    }
    @JsonIgnore
    public BigDecimal getOther_in() {
        return other_in;
    }
    @JsonIgnore
    public void setOther_in(BigDecimal other_in) {
        this.other_in = other_in;
    }
    @JsonIgnore
    public BigDecimal getOther_out() {
        return other_out;
    }
    @JsonIgnore
    public void setOther_out(BigDecimal other_out) {
        this.other_out = other_out;
    }
    @JsonIgnore
    public BigDecimal getMonth_profit_rate() {
        return month_profit_rate;
    }
    @JsonIgnore
    public void setMonth_profit_rate(BigDecimal month_profit_rate) {
        this.month_profit_rate = month_profit_rate;
    }
    @JsonIgnore
    public BigDecimal getMonth_lead_rate() {
        return month_lead_rate;
    }
    @JsonIgnore
    public void setMonth_lead_rate(BigDecimal month_lead_rate) {
        this.month_lead_rate = month_lead_rate;
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
