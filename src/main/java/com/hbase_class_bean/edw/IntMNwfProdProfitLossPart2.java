package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class IntMNwfProdProfitLossPart2 {
    //Biz_Dt	业务日期
    @JsonProperty("Biz_dt")
    private String biz_dt;
    //Curr_Cd   币种
    @JsonProperty("Curr_Cd")
    private String curr_cd;
    //Data_Label	数据标签
    @JsonProperty("Data_Label")
    private String data_label;
    //Trade_Mrkt	交易市场
    @JsonProperty("Trade_Mrkt")
    private String trade_mrkt;
    //Prod_No	产品代码
    @JsonProperty("Prod_No")
    private String prod_no;
    //Prod_Name	产品名称
    @JsonProperty("Prod_Name")
    private String prod_name;
    //Prod_Type_Cd	产品分类
    @JsonProperty("Prod_Type_Cd")
    private String prod_type_cd;
    //Exch_Rate 折人民币汇率
    @JsonProperty("Exch_Rate")
    private BigDecimal exch_rate;
    //Month_Orig_Profit_Loss    当月盈亏（原币种）
    @JsonProperty("Month_Orig_Profit_Loss")
    private BigDecimal month_orig_profit_loss;
    //Month_Profit_Loss_Rmb     当月盈亏（折人民币）
    @JsonProperty("Month_Profit_Loss_Rmb")
    private BigDecimal month_profit_loss_rmb;

    //盈利排序
    @JsonProperty("profit_sort_id")
    private int profit_sort_id;
    //亏损排序
    @JsonProperty("loss_sort_id")
    private int loss_sort_id;
    //总排序
    @JsonProperty("all_sort_id")
    private int all_sort_id;

    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
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
    public String getProd_type_cd() {
        return prod_type_cd;
    }
    @JsonIgnore
    public void setProd_type_cd(String prod_type_cd) {
        this.prod_type_cd = prod_type_cd;
    }
    @JsonIgnore
    public BigDecimal getMonth_orig_profit_loss() {
        return month_orig_profit_loss;
    }
    @JsonIgnore
    public void setMonth_orig_profit_loss(BigDecimal month_orig_profit_loss) {
        this.month_orig_profit_loss = month_orig_profit_loss;
    }
    @JsonIgnore
    public BigDecimal getMonth_profit_loss_rmb() {
        return month_profit_loss_rmb;
    }
    @JsonIgnore
    public void setMonth_profit_loss_rmb(BigDecimal month_profit_loss_rmb) {
        this.month_profit_loss_rmb = month_profit_loss_rmb;
    }
    @JsonIgnore
    public int getProfit_sort_id() {
        return profit_sort_id;
    }
    @JsonIgnore
    public void setProfit_sort_id(int profit_sort_id) {
        this.profit_sort_id = profit_sort_id;
    }
    @JsonIgnore
    public int getLoss_sort_id() {
        return loss_sort_id;
    }
    @JsonIgnore
    public void setLoss_sort_id(int loss_sort_id) {
        this.loss_sort_id = loss_sort_id;
    }
    @JsonIgnore
    public int getAll_sort_id() {
        return all_sort_id;
    }
    @JsonIgnore
    public void setAll_sort_id(int all_sort_id) {
        this.all_sort_id = all_sort_id;
    }
}
