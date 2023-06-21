package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class PositionCycleProfitLossBean {
    //biz_dt	 日期
    @JsonProperty("bizDt")
    private String biz_dt;
    //asset_acct	资金账号
    @JsonProperty("assetAcct")
    private String asset_acct;
    //data_label	数据标签
    @JsonProperty("dataLabel")
    private String data_label;
    //acct_flag	账户标志
    @JsonProperty("acctFlag")
    private String acct_flag;
    //prod_name	股票名称
    @JsonProperty("prodName")
    private String prod_name;
    //trade_mrkt	交易市场
    @JsonProperty("tradeMrkt")
    private String trade_mrkt;
    //trade_board	交易板块
    @JsonProperty("tradeBoard")
    private String trade_board;
    //prod_no	股票代码
    @JsonProperty("prodNo")
    private String prod_no;
    //tran_status	当日主动交易状态
    @JsonProperty("tranStatus")
    private String tran_status;
    //pos_status	当日持仓状态
    @JsonProperty("posStatus")
    private String pos_status;
    //build_dt	建仓日期
    @JsonProperty("buildDate")
    private String build_dt;
    //clear_dt	清仓日期
    @JsonProperty("clearDate")
    private String clear_dt;
    //pos_days	持股天数
    @JsonProperty("posDays")
    private BigDecimal pos_days;
    //buy_count	买入次数
    @JsonProperty("buyCount")
    private BigDecimal buy_count;
    //sell_count	卖出次数
    @JsonProperty("sellCount")
    private BigDecimal sell_count;
    //total_profit_loss	累计盈亏
    @JsonProperty("profitLoss")
    private BigDecimal total_profit_loss;
    //total_cost	累计成本
    @JsonProperty("totalCost")
    private BigDecimal total_cost;
    //profit_loss_bl	累计盈亏比例
    @JsonProperty("profitLossBl")
    private BigDecimal profit_loss_bl;
    //bngn_cost	期初成本
    @JsonProperty("bngnCost")
    private BigDecimal bngn_cost;
    //sec_buy_amt	区间买入总金额
    @JsonProperty("secBuyAmt")
    private BigDecimal sec_buy_amt;
    //sec_tran_in_mval	区间转入总市值
    @JsonProperty("secTranInMval")
    private BigDecimal sec_tran_in_mval;
    //sec_tzx_amt	区间扣税总金额
    @JsonProperty("secTzxAmt")
    private BigDecimal sec_tzx_amt;
    //sec_sell_amt	区间卖出总金额
    @JsonProperty("secSellAmt")
    private BigDecimal sec_sell_amt;
    //sec_divi_amt	区间分红总金额
    @JsonProperty("secDiviAmt")
    private BigDecimal sec_divi_amt;
    //sec_tran_out_mval	区间转出总市值
    @JsonProperty("secTranOutMval")
    private BigDecimal sec_tran_out_mval;
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
    public String getProd_name() {
        return prod_name;
    }
    @JsonIgnore
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
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
    public String getTrade_board() {
        return trade_board;
    }
    @JsonIgnore
    public void setTrade_board(String trade_board) {
        this.trade_board = trade_board;
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
    public String getTran_status() {
        return tran_status;
    }
    @JsonIgnore
    public void setTran_status(String tran_status) {
        this.tran_status = tran_status;
    }
    @JsonIgnore
    public String getPos_status() {
        return pos_status;
    }
    @JsonIgnore
    public void setPos_status(String pos_status) {
        this.pos_status = pos_status;
    }
    @JsonIgnore
    public String getBuild_dt() {
        return build_dt;
    }
    @JsonIgnore
    public void setBuild_dt(String build_dt) {
        this.build_dt = build_dt;
    }
    @JsonIgnore
    public String getClear_dt() {
        return clear_dt;
    }
    @JsonIgnore
    public void setClear_dt(String clear_dt) {
        this.clear_dt = clear_dt;
    }
    @JsonIgnore
    public BigDecimal getPos_days() {
        return pos_days;
    }
    @JsonIgnore
    public void setPos_days(BigDecimal pos_days) {
        this.pos_days = pos_days;
    }
    @JsonIgnore
    public BigDecimal getBuy_count() {
        return buy_count;
    }
    @JsonIgnore
    public void setBuy_count(BigDecimal buy_count) {
        this.buy_count = buy_count;
    }
    @JsonIgnore
    public BigDecimal getSell_count() {
        return sell_count;
    }
    @JsonIgnore
    public void setSell_count(BigDecimal sell_count) {
        this.sell_count = sell_count;
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
    public BigDecimal getTotal_cost() {
        return total_cost;
    }
    @JsonIgnore
    public void setTotal_cost(BigDecimal total_cost) {
        this.total_cost = total_cost;
    }
    @JsonIgnore
    public BigDecimal getProfit_loss_bl() {
        return profit_loss_bl;
    }
    @JsonIgnore
    public void setProfit_loss_bl(BigDecimal profit_loss_bl) {
        this.profit_loss_bl = profit_loss_bl;
    }
    @JsonIgnore
    public BigDecimal getBngn_cost() {
        return bngn_cost;
    }
    @JsonIgnore
    public void setBngn_cost(BigDecimal bngn_cost) {
        this.bngn_cost = bngn_cost;
    }
    @JsonIgnore
    public BigDecimal getSec_buy_amt() {
        return sec_buy_amt;
    }
    @JsonIgnore
    public void setSec_buy_amt(BigDecimal sec_buy_amt) {
        this.sec_buy_amt = sec_buy_amt;
    }
    @JsonIgnore
    public BigDecimal getSec_tran_in_mval() {
        return sec_tran_in_mval;
    }
    @JsonIgnore
    public void setSec_tran_in_mval(BigDecimal sec_tran_in_mval) {
        this.sec_tran_in_mval = sec_tran_in_mval;
    }
    @JsonIgnore
    public BigDecimal getSec_tzx_amt() {
        return sec_tzx_amt;
    }
    @JsonIgnore
    public void setSec_tzx_amt(BigDecimal sec_tzx_amt) {
        this.sec_tzx_amt = sec_tzx_amt;
    }
    @JsonIgnore
    public BigDecimal getSec_sell_amt() {
        return sec_sell_amt;
    }
    @JsonIgnore
    public void setSec_sell_amt(BigDecimal sec_sell_amt) {
        this.sec_sell_amt = sec_sell_amt;
    }
    @JsonIgnore
    public BigDecimal getSec_divi_amt() {
        return sec_divi_amt;
    }
    @JsonIgnore
    public void setSec_divi_amt(BigDecimal sec_divi_amt) {
        this.sec_divi_amt = sec_divi_amt;
    }
    @JsonIgnore
    public BigDecimal getSec_tran_out_mval() {
        return sec_tran_out_mval;
    }
    @JsonIgnore
    public void setSec_tran_out_mval(BigDecimal sec_tran_out_mval) {
        this.sec_tran_out_mval = sec_tran_out_mval;
    }
}
