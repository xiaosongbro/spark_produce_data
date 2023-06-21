package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//账户分析----->两融账户、普通账户 盈亏年表（20210812）
//impala表：app_data.int_n_nwf_acct_profit_bill_new

public class AppCreditAndGeneralYearProfitBean {
    //业务日期	biz_dt	STRING
    @JsonProperty("biz_dt")
    private String biz_dt;
    //年份	biz_year	STRING
    @JsonProperty("biz_year")
    private String biz_year;
    //资金账号	asset_acct	STRING
    @JsonProperty("asset_acct")
    private String asset_acct;
    //营业部代码	belong_org_id	STRING
    @JsonProperty("belong_org_id")
    private String belong_org_id;
    //年度盈亏	year_profit_loss	DECIMAL(26,4)
    @JsonProperty("year_profit_loss")
    private BigDecimal year_profit_loss;
    //数据标签	data_label	STRING
    @JsonProperty("data_label")
    private String data_label;
    //当年日均净资产	aver_net_asset	DECIMAL(26,4)
    @JsonProperty("aver_net_asset")
    private BigDecimal aver_net_asset;
    //期初净资产	begin_net_asset	DECIMAL(26,4)
    @JsonProperty("begin_net_asset")
    private BigDecimal begin_net_asset;
    //净流入资产	year_net_asset_in	DECIMAL(26,4)
    @JsonProperty("year_net_asset_in")
    private BigDecimal year_net_asset_in;
    //期末净资产	end_net_asset	DECIMAL(26,4)
    @JsonProperty("end_net_asset")
    private BigDecimal end_net_asset;
    //银证转入	year_bank_to_secu	DECIMAL(26,4)
    @JsonProperty("year_bank_to_secu")
    private BigDecimal year_bank_to_secu;
    //银证转出	year_secu_to_bank	DECIMAL(26,4)
    @JsonProperty("year_secu_to_bank")
    private BigDecimal year_secu_to_bank;
    //担保品转入	year_collateral_in	DECIMAL(26,4)
    @JsonProperty("year_collateral_in")
    private BigDecimal year_collateral_in;
    //担保品转出	year_collateral_out	DECIMAL(26,4)
    @JsonProperty("year_collateral_out")
    private BigDecimal year_collateral_out;
    //转出资金	year_cap_out	DECIMAL(26,4)
    @JsonProperty("year_cap_out")
    private BigDecimal year_cap_out;
    //转入资金	year_cap_in	DECIMAL(26,4)
    @JsonProperty("year_cap_in")
    private BigDecimal year_cap_in;
    //转出市值	year_mrkt_out	DECIMAL(26,4)
    @JsonProperty("year_mrkt_out")
    private BigDecimal year_mrkt_out;
    //转入市值	year_mrkt_in	DECIMAL(26,4)
    @JsonProperty("year_mrkt_in")
    private BigDecimal year_mrkt_in;
    //当年成本	year_cost	DECIMAL(26,4)
    @JsonProperty("year_cost")
    private BigDecimal year_cost;
    //其他转入	other_in	DECIMAL(26,4)
    @JsonProperty("other_in")
    private BigDecimal other_in;
    //其他转出	other_out	DECIMAL(26,4)
    @JsonProperty("other_out")
    private BigDecimal other_out;
    //本年收益率	year_profit_rate	DECIMAL(26,4)
    @JsonProperty("year_profit_rate")
    private BigDecimal year_profit_rate;
    //开户日期	open_acct_dt	STRING
    @JsonProperty("open_acct_dt")
    private String open_acct_dt;
    //跑赢全体账户	win_all_rate	DECIMAL(26,4)
    @JsonProperty("win_all_rate")
    private BigDecimal win_all_rate;
    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
    }
    @JsonIgnore
    public String getBiz_year() {
        return biz_year;
    }
    @JsonIgnore
    public void setBiz_year(String biz_year) {
        this.biz_year = biz_year;
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
    public BigDecimal getYear_profit_loss() {
        return year_profit_loss;
    }
    @JsonIgnore
    public void setYear_profit_loss(BigDecimal year_profit_loss) {
        this.year_profit_loss = year_profit_loss;
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
    public BigDecimal getYear_net_asset_in() {
        return year_net_asset_in;
    }
    @JsonIgnore
    public void setYear_net_asset_in(BigDecimal year_net_asset_in) {
        this.year_net_asset_in = year_net_asset_in;
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
    public BigDecimal getYear_bank_to_secu() {
        return year_bank_to_secu;
    }
    @JsonIgnore
    public void setYear_bank_to_secu(BigDecimal year_bank_to_secu) {
        this.year_bank_to_secu = year_bank_to_secu;
    }
    @JsonIgnore
    public BigDecimal getYear_secu_to_bank() {
        return year_secu_to_bank;
    }
    @JsonIgnore
    public void setYear_secu_to_bank(BigDecimal year_secu_to_bank) {
        this.year_secu_to_bank = year_secu_to_bank;
    }
    @JsonIgnore
    public BigDecimal getYear_collateral_in() {
        return year_collateral_in;
    }
    @JsonIgnore
    public void setYear_collateral_in(BigDecimal year_collateral_in) {
        this.year_collateral_in = year_collateral_in;
    }
    @JsonIgnore
    public BigDecimal getYear_collateral_out() {
        return year_collateral_out;
    }
    @JsonIgnore
    public void setYear_collateral_out(BigDecimal year_collateral_out) {
        this.year_collateral_out = year_collateral_out;
    }
    @JsonIgnore
    public BigDecimal getYear_cap_out() {
        return year_cap_out;
    }
    @JsonIgnore
    public void setYear_cap_out(BigDecimal year_cap_out) {
        this.year_cap_out = year_cap_out;
    }
    @JsonIgnore
    public BigDecimal getYear_cap_in() {
        return year_cap_in;
    }
    @JsonIgnore
    public void setYear_cap_in(BigDecimal year_cap_in) {
        this.year_cap_in = year_cap_in;
    }
    @JsonIgnore
    public BigDecimal getYear_mrkt_out() {
        return year_mrkt_out;
    }
    @JsonIgnore
    public void setYear_mrkt_out(BigDecimal year_mrkt_out) {
        this.year_mrkt_out = year_mrkt_out;
    }
    @JsonIgnore
    public BigDecimal getYear_mrkt_in() {
        return year_mrkt_in;
    }
    @JsonIgnore
    public void setYear_mrkt_in(BigDecimal year_mrkt_in) {
        this.year_mrkt_in = year_mrkt_in;
    }
    @JsonIgnore
    public BigDecimal getYear_cost() {
        return year_cost;
    }
    @JsonIgnore
    public void setYear_cost(BigDecimal year_cost) {
        this.year_cost = year_cost;
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
    public BigDecimal getYear_profit_rate() {
        return year_profit_rate;
    }
    @JsonIgnore
    public void setYear_profit_rate(BigDecimal year_profit_rate) {
        this.year_profit_rate = year_profit_rate;
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
    public BigDecimal getWin_all_rate() {
        return win_all_rate;
    }
    @JsonIgnore
    public void setWin_all_rate(BigDecimal win_all_rate) {
        this.win_all_rate = win_all_rate;
    }
}
