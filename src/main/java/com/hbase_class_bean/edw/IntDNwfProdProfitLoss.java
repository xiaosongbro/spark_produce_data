package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class IntDNwfProdProfitLoss {
    //Biz_Dt	业务日期	DATE
    @JsonProperty("Biz_dt")
    private String biz_dt;
    //Asset_Acct	资金账户	VARCHAR(19)
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //Belong_Org_Id	营业部代码	VARCHAR(12)
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //Data_Label	数据标签	CHAR(4)
    @JsonProperty("Data_Label")
    private String data_label;
    //Acct_Flag	账户标志	CHAR(1)
    @JsonProperty("Acct_Flag")
    private String acct_flag;
    //Trade_Mrkt	交易市场	CHAR(4)
    @JsonProperty("Trade_Mrkt")
    private String trade_mrkt;
    //Prod_No	产品代码	VARCHAR(80)
    @JsonProperty("Prod_No")
    private String prod_no;
    //Prod_Name	产品名称	VARCHAR(120)
    @JsonProperty("Prod_Name")
    private String prod_name;
    //Prod_Type_Cd	产品分类	CHAR(4)
    @JsonProperty("Prod_Type_Cd")
    private String prod_type_cd;
    //Curr_Cd
    @JsonProperty("Curr_Cd")
    private String curr_cd;
    //Exch_Rate
    @JsonProperty("Exch_Rate")
    private BigDecimal exch_rate;
    //Orig_Profit_Loss
    @JsonProperty("Orig_Profit_Loss")
    private BigDecimal orig_profit_loss;
    //Profit_Loss_Rmb
    @JsonProperty("Profit_Loss_Rmb")
    private BigDecimal profit_loss_rmb;
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
    public String getData_label() {
        return data_label;
    }
    @JsonIgnore
    public void setData_label(String data_label) {
        this.data_label = data_label;
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
    public String getProd_name() {
        return prod_name;
    }
    @JsonIgnore
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    @JsonIgnore
    public String getCurr_cd() {
        return curr_cd;
    }
    @JsonIgnore
    public void setCurr_cd(String curr_cd) {
        this.curr_cd = curr_cd;
    }
    @JsonIgnore
    public BigDecimal getExch_rate() {
        return exch_rate;
    }
    @JsonIgnore
    public void setExch_rate(BigDecimal exch_rate) {
        this.exch_rate = exch_rate;
    }
    @JsonIgnore
    public BigDecimal getOrig_profit_loss() {
        return orig_profit_loss;
    }
    @JsonIgnore
    public void setOrig_profit_loss(BigDecimal orig_profit_loss) {
        this.orig_profit_loss = orig_profit_loss;
    }
    @JsonIgnore
    public BigDecimal getProfit_loss_rmb() {
        return profit_loss_rmb;
    }
    @JsonIgnore
    public void setProfit_loss_rmb(BigDecimal profit_loss_rmb) {
        this.profit_loss_rmb = profit_loss_rmb;
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
    public String getProd_type_cd() {
        return prod_type_cd;
    }
    @JsonIgnore
    public void setProd_type_cd(String prod_type_cd) {
        this.prod_type_cd = prod_type_cd;
    }
}
