package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//账户分析----->两融账户、普通账户盈亏月表（20210812）
//impala表：app_data.int_m_nwf_acct_profit_bill_new

public class AppCreditAndGeneralMonthProfitBean {
    //业务日期	biz_dt	STRING
    @JsonProperty("biz_dt")
    private String biz_dt;
    //开户日期	open_acct_dt	STRING
    @JsonProperty("open_acct_dt")
    private String open_acct_dt;
    //月份	biz_month	STRING
    @JsonProperty("biz_month")
    private String biz_month;
    //资金账号	asset_acct	STRING
    @JsonProperty("asset_acct")
    private String asset_acct;
    //营业部代码	belong_org_id	STRING
    @JsonProperty("belong_org_id")
    private String belong_org_id;
    //月度盈亏	month_profit_loss	DECIMAL(26,4)
    @JsonProperty("month_profit_loss")
    private BigDecimal month_profit_loss;
    //数据标签	data_label	STRING
    @JsonProperty("data_label")
    private String data_label;
    //当月日均净资产	aver_net_asset	DECIMAL(26,4)
    @JsonProperty("aver_net_asset")
    private BigDecimal aver_net_asset;
    //期初净资产	begin_net_asset	DECIMAL(26,4)
    @JsonProperty("begin_net_asset")
    private BigDecimal begin_net_asset;
    //净流入资产	month_net_asset_in	DECIMAL(26,4)
    @JsonProperty("month_net_asset_in")
    private BigDecimal month_net_asset_in;
    //期末净资产	end_net_asset	DECIMAL(26,4)
    @JsonProperty("end_net_asset")
    private BigDecimal end_net_asset;
    //银证转入	month_bank_to_secu	DECIMAL(26,4)
    @JsonProperty("month_bank_to_secu")
    private BigDecimal month_bank_to_secu;
    //银证转出	month_secu_to_bank	DECIMAL(26,4)
    @JsonProperty("month_secu_to_bank")
    private BigDecimal month_secu_to_bank;
    //担保品转入	month_collateral_in	DECIMAL(26,4)
    @JsonProperty("month_collateral_in")
    private BigDecimal month_collateral_in;
    //担保品转出	month_collateral_out	DECIMAL(26,4)
    @JsonProperty("month_collateral_out")
    private BigDecimal month_collateral_out;
    //转出资金	month_cap_out	DECIMAL(26,4)
    @JsonProperty("month_cap_out")
    private BigDecimal month_cap_out;
    //转入资金	month_cap_in	DECIMAL(26,4)
    @JsonProperty("month_cap_in")
    private BigDecimal month_cap_in;
    //转出市值	month_mrkt_out	DECIMAL(26,4)
    @JsonProperty("month_mrkt_out")
    private BigDecimal month_mrkt_out;
    //转入市值	month_mrkt_in	DECIMAL(26,4)
    @JsonProperty("month_mrkt_in")
    private BigDecimal month_mrkt_in;
    //当月成本	month_cost	DECIMAL(26,4)
    @JsonProperty("month_cost")
    private BigDecimal month_cost;
    //其他转入	other_in	DECIMAL(26,4)
    @JsonProperty("other_in")
    private BigDecimal other_in;
    //其他转出	other_out	DECIMAL(26,4)
    @JsonProperty("other_out")
    private BigDecimal other_out;
    //本月收益率	month_profit_rate	DECIMAL(26,4)
    @JsonProperty("month_profit_rate")
    private BigDecimal month_profit_rate;
    //跑赢全体账户	month_lead_rate	DECIMAL(26,4)
    @JsonProperty("month_lead_rate")
    private BigDecimal month_lead_rate;
    //累计收益率	Total_Profit_Rate	DECIMAL(26,4)
    @JsonProperty("Total_Profit_Rate")
    private BigDecimal Total_Profit_Rate;
    @JsonIgnore
    public BigDecimal getTotal_Profit_Rate() {
        return Total_Profit_Rate;
    }
    @JsonIgnore
    public void setTotal_Profit_Rate(BigDecimal total_Profit_Rate) {
        Total_Profit_Rate = total_Profit_Rate;
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
    public String getBiz_month() {
        return biz_month;
    }
    @JsonIgnore
    public void setBiz_month(String biz_month) {
        this.biz_month = biz_month;
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
    public BigDecimal getMonth_profit_loss() {
        return month_profit_loss;
    }
    @JsonIgnore
    public void setMonth_profit_loss(BigDecimal month_profit_loss) {
        this.month_profit_loss = month_profit_loss;
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
}
