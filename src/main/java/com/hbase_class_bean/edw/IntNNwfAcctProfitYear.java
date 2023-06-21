package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//历史版本，待下线（20210811）
//账户分析年表

public class IntNNwfAcctProfitYear implements Serializable {
    //业务日期
    @JsonProperty("Biz_Dt")
    private String biz_dt;
    //年份
    @JsonProperty("Biz_Year")
    private String biz_year;
    //资金账号
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //营业部代码
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //账户标志
    @JsonProperty("Acct_Flag")
    private Integer acct_flag;
    //年度盈亏 Decimal(26,4)
    @JsonProperty("Year_Profit_Loss")
    private BigDecimal year_profit_loss;
    //数据标签
    @JsonProperty("Data_Label")
    private String data_label;
    //当年日均净资产 Decimal(26,4)
    @JsonProperty("Aver_Net_Asset")
    private BigDecimal aver_net_asset;
    //期初净资产 Decimal(26,4)
    @JsonProperty("Begin_Net_Asset")
    private BigDecimal begin_net_asset;
    //净流入资产 Decimal(26,4)
    @JsonProperty("Year_Net_Asset_In")
    private BigDecimal year_net_asset_in;
    //期末净资产 Decimal(26,4)
    @JsonProperty("End_Net_Asset")
    private BigDecimal end_net_asset;
    //银证转入 Decimal(26,4)
    @JsonProperty("Year_Bank_To_Secu")
    private BigDecimal year_bank_to_secu;
    //银证转出 Decimal(26,4)
    @JsonProperty("Year_Secu_To_Bank")
    private BigDecimal year_secu_to_bank;
    //担保品转入 Decimal(26,4)
    @JsonProperty("Year_Collateral_In")
    private BigDecimal year_collateral_in;
    //担保品转出 Decimal(26,4)
    @JsonProperty("Year_Collateral_Out")
    private BigDecimal year_collateral_out;
    //转出资金 Decimal(26,4)
    @JsonProperty("Year_Cap_Out")
    private BigDecimal year_cap_out;
    //转入资金 Decimal(26,4)
    @JsonProperty("Year_Cap_In")
    private BigDecimal year_cap_in;
    //转出市值 Decimal(26,4)
    @JsonProperty("Year_Mrkt_Out")
    private BigDecimal year_mrkt_out;
    //转入市值 Decimal(26,4)
    @JsonProperty("Year_Mrkt_In")
    private BigDecimal year_mrkt_in;
    //当年成本 Decimal(26,4)
    @JsonProperty("Year_Cost")
    private BigDecimal year_cost;
    //其他转入 Decimal(26,4)
    @JsonProperty("Other_In")
    private BigDecimal other_in;
    //其他转出 Decimal(26,4)
    @JsonProperty("Other_Out")
    private BigDecimal other_out;
    //本年收益率 Decimal(26,4)
    @JsonProperty("profitRate")
    private BigDecimal year_profit_rate;
    //open_acct_dt string 开户日期
    @JsonProperty("Open_Acct_Dt")
    private String open_acct_dt;
    //win_all_rate decimal(26,4) 跑赢全体账户
    @JsonProperty("winAll")
    private BigDecimal year_lead_rate;

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
    public Integer getAcct_flag() {
        return acct_flag;
    }
    @JsonIgnore
    public void setAcct_flag(Integer acct_flag) {
        this.acct_flag = acct_flag;
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
    public String getOpen_acct_dt() {
        return open_acct_dt;
    }
    @JsonIgnore
    public void setOpen_acct_dt(String open_acct_dt) {
        this.open_acct_dt = open_acct_dt;
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
    public BigDecimal getYear_lead_rate() {
        return year_lead_rate;
    }
    @JsonIgnore
    public void setYear_lead_rate(BigDecimal year_lead_rate) {
        this.year_lead_rate = year_lead_rate;
    }
}
