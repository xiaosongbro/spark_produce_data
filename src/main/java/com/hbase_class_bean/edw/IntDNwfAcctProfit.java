package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

//历史版本，待下线（20210811）
//账户分析日表

public class IntDNwfAcctProfit implements Serializable {
    //表名 INT_D_NWF_ACCT_PROFIT
    //Biz_Dt	业务日期	DATE
    @JsonProperty("Biz_Dt")
    private String biz_dt;
    //Asset_Acct	资金账号	VARCHAR(19)
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //Belong_Org_Id	营业部代码	VARCHAR(12)
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //Acct_Flag	账户标志 	CHAR(1)
    @JsonProperty("Acct_Flag")
    private String acct_flag;
    //Total_Asset	总资产	DECIMAL(26,4)
    @JsonProperty("Total_Asset")
    private BigDecimal total_asset;
    //Total_Liab	总负债	DECIMAL(26,4)
    @JsonProperty("Total_Liab")
    private BigDecimal total_liab;
    //Net_Asset	日末净资产	DECIMAL(26,4)
    @JsonProperty("Net_Asset")
    private BigDecimal net_asset;
    //Yes_Net_Asset	日初净资产	DECIMAL(26,4)
    @JsonProperty("Yes_Net_Asset")
    private BigDecimal yes_net_asset;
    //Secu_To_Bank	银证转出	DECIMAL(26,4)
    @JsonProperty("Secu_To_Bank")
    private BigDecimal secu_to_bank;
    //Bank_To_Secu	银证转入	DECIMAL(26,4)
    @JsonProperty("Bank_To_Secu")
    private BigDecimal bank_to_secu;
    //Profit_Cap_Out	转出资金	DECIMAL(26,4)
    @JsonProperty("Profit_Cap_Out")
    private BigDecimal profit_cap_out;
    //Profit_Cap_In	转入资金	DECIMAL(26,4)
    @JsonProperty("Profit_Cap_In")
    private BigDecimal profit_cap_in;
    //Profit_Mrkt_Out	转出市值	DECIMAL(26,4)
    @JsonProperty("Profit_Mrkt_Out")
    private BigDecimal profit_mrkt_out;
    //Profit_Mrkt_In	转入市值	DECIMAL(26,4)
    @JsonProperty("Profit_Mrkt_In")
    private BigDecimal profit_mrkt_in;
    //Profit_Loss	当日盈亏	DECIMAL(26,4)
    @JsonProperty("Profit_Loss")
    private BigDecimal profit_loss;
    //Cost	当日成本	DECIMAL(26,4)
    @JsonProperty("Cost")
    private BigDecimal cost;
    //Profit_Rate	当日盈亏率	DECIMAL(26,4)
    @JsonProperty("Profit_Rate")
    private BigDecimal profit_rate;
    //Total_profit_loss
    @JsonProperty("Total_Profit_Loss")
    private BigDecimal total_profit_loss;
    //Data_Label	数据标签	VARCHAR(4)
    @JsonProperty("Data_Label")
    private String data_label;
    //Collateral_In	担保品转入	DECIMAL(26,4)
    @JsonProperty("Collateral_In")
    private BigDecimal collateral_in;
    //Collateral_Out	担保品转出	DECIMAL(26,4)
    @JsonProperty("Collateral_Out")
    private BigDecimal collateral_out;
    //Other_In	其他转入	DECIMAL(26,4)
    @JsonProperty("Other_In")
    private BigDecimal other_in;
    //Other_Out	其他转出	DECIMAL(26,4)
    @JsonProperty("Other_Out")
    private BigDecimal other_out;
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
    public String getAcct_flag() {
        return acct_flag;
    }
    @JsonIgnore
    public void setAcct_flag(String acct_flag) {
        this.acct_flag = acct_flag;
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
    public String getData_label() {
        return data_label;
    }
    @JsonIgnore
    public void setData_label(String data_label) {
        this.data_label = data_label;
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
}
