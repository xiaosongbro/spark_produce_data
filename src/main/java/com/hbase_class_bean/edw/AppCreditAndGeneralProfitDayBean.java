package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//账户分析----->两融账户、普通账户盈亏日表（20210812）
//impala表：app_data.int_d_nwf_acct_profit_bill_new

public class AppCreditAndGeneralProfitDayBean {
    //业务日期	biz_dt	STRING
    @JsonProperty("biz_dt")
    private String biz_dt;
    //资金账号	asset_acct	STRING
    @JsonProperty("asset_acct")
    private String asset_acct;
    //营业部代码	belong_org_id	STRING
    @JsonProperty("belong_org_id")
    private String belong_org_id;
    //总资产	total_asset	DECIMAL(26,4)
    @JsonProperty("total_asset")
    private BigDecimal total_asset;
    //总负债	total_liab	DECIMAL(26,4)
    @JsonProperty("total_liab")
    private BigDecimal total_liab;
    //日末净资产	net_asset	DECIMAL(26,4)
    @JsonProperty("net_asset")
    private BigDecimal net_asset;
    //日初净资产	yes_net_asset	DECIMAL(26,4)
    @JsonProperty("yes_net_asset")
    private BigDecimal yes_net_asset;
    //银证转出	secu_to_bank	DECIMAL(26,4)
    @JsonProperty("secu_to_bank")
    private BigDecimal secu_to_bank;
    //银证转入	bank_to_secu	DECIMAL(26,4)
    @JsonProperty("bank_to_secu")
    private BigDecimal bank_to_secu;
    //转出资金	profit_cap_out	DECIMAL(26,4)
    @JsonProperty("profit_cap_out")
    private BigDecimal profit_cap_out;
    //转入资金	profit_cap_in	DECIMAL(26,4)
    @JsonProperty("profit_cap_in")
    private BigDecimal profit_cap_in;
    //转出市值	profit_mrkt_out	DECIMAL(26,4)
    @JsonProperty("profit_mrkt_out")
    private BigDecimal profit_mrkt_out;
    //转入市值	profit_mrkt_in	DECIMAL(26,4)
    @JsonProperty("profit_mrkt_in")
    private BigDecimal profit_mrkt_in;
    //当日盈亏	profit_loss	DECIMAL(26,4)
    @JsonProperty("profit_loss")
    private BigDecimal profit_loss;
    //当日成本	cost	DECIMAL(26,4)
    @JsonProperty("cost")
    private BigDecimal cost;
    //当日盈亏率	profit_rate	DECIMAL(26,4)
    @JsonProperty("profit_rate")
    private BigDecimal profit_rate;
    //累计盈亏	total_profit_loss	DECIMAL(26,4)
    @JsonProperty("total_profit_loss")
    private BigDecimal total_profit_loss;
    //数据标签	data_label	STRING
    @JsonProperty("data_label")
    private String data_label;
    //担保品转入	collateral_in	DECIMAL(26,4)
    @JsonProperty("collateral_in")
    private BigDecimal collateral_in;
    //担保品转出	collateral_out	DECIMAL(26,4)
    @JsonProperty("collateral_out")
    private BigDecimal collateral_out;
    //其他转入	other_in	DECIMAL(26,4)
    @JsonProperty("other_in")
    private BigDecimal other_in;
    //其他转出	other_out	DECIMAL(26,4)
    @JsonProperty("other_out")
    private BigDecimal other_out;
    //上一个交易日日期	front_dt	STRING
    @JsonProperty("front_dt")
    private String front_dt;
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
    public BigDecimal getTotal_asset() {
        return total_asset;
    }
    @JsonIgnore
    public void setTotal_asset(BigDecimal total_asset) {
        this.total_asset = total_asset;
    }
    @JsonIgnore
    public BigDecimal getTotal_liab() {
        return total_liab;
    }
    @JsonIgnore
    public void setTotal_liab(BigDecimal total_liab) {
        this.total_liab = total_liab;
    }
    @JsonIgnore
    public BigDecimal getNet_asset() {
        return net_asset;
    }
    @JsonIgnore
    public void setNet_asset(BigDecimal net_asset) {
        this.net_asset = net_asset;
    }
    @JsonIgnore
    public BigDecimal getYes_net_asset() {
        return yes_net_asset;
    }
    @JsonIgnore
    public void setYes_net_asset(BigDecimal yes_net_asset) {
        this.yes_net_asset = yes_net_asset;
    }
    @JsonIgnore
    public BigDecimal getSecu_to_bank() {
        return secu_to_bank;
    }
    @JsonIgnore
    public void setSecu_to_bank(BigDecimal secu_to_bank) {
        this.secu_to_bank = secu_to_bank;
    }
    @JsonIgnore
    public BigDecimal getBank_to_secu() {
        return bank_to_secu;
    }
    @JsonIgnore
    public void setBank_to_secu(BigDecimal bank_to_secu) {
        this.bank_to_secu = bank_to_secu;
    }
    @JsonIgnore
    public BigDecimal getProfit_cap_out() {
        return profit_cap_out;
    }
    @JsonIgnore
    public void setProfit_cap_out(BigDecimal profit_cap_out) {
        this.profit_cap_out = profit_cap_out;
    }
    @JsonIgnore
    public BigDecimal getProfit_cap_in() {
        return profit_cap_in;
    }
    @JsonIgnore
    public void setProfit_cap_in(BigDecimal profit_cap_in) {
        this.profit_cap_in = profit_cap_in;
    }
    @JsonIgnore
    public BigDecimal getProfit_mrkt_out() {
        return profit_mrkt_out;
    }
    @JsonIgnore
    public void setProfit_mrkt_out(BigDecimal profit_mrkt_out) {
        this.profit_mrkt_out = profit_mrkt_out;
    }
    @JsonIgnore
    public BigDecimal getProfit_mrkt_in() {
        return profit_mrkt_in;
    }
    @JsonIgnore
    public void setProfit_mrkt_in(BigDecimal profit_mrkt_in) {
        this.profit_mrkt_in = profit_mrkt_in;
    }
    @JsonIgnore
    public BigDecimal getProfit_loss() {
        return profit_loss;
    }
    @JsonIgnore
    public void setProfit_loss(BigDecimal profit_loss) {
        this.profit_loss = profit_loss;
    }
    @JsonIgnore
    public BigDecimal getCost() {
        return cost;
    }
    @JsonIgnore
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    @JsonIgnore
    public BigDecimal getProfit_rate() {
        return profit_rate;
    }
    @JsonIgnore
    public void setProfit_rate(BigDecimal profit_rate) {
        this.profit_rate = profit_rate;
    }
    @JsonIgnore
    public BigDecimal getTotal_profit_loss() {
        return total_profit_loss;
    }
    @JsonIgnore
    public void setTotal_profit_loss(BigDecimal total_profit_loss) {
        this.total_profit_loss = total_profit_loss;
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
    public BigDecimal getCollateral_in() {
        return collateral_in;
    }
    @JsonIgnore
    public void setCollateral_in(BigDecimal collateral_in) {
        this.collateral_in = collateral_in;
    }
    @JsonIgnore
    public BigDecimal getCollateral_out() {
        return collateral_out;
    }
    @JsonIgnore
    public void setCollateral_out(BigDecimal collateral_out) {
        this.collateral_out = collateral_out;
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
    public String getFront_dt() {
        return front_dt;
    }
    @JsonIgnore
    public void setFront_dt(String front_dt) {
        this.front_dt = front_dt;
    }
}
