package com.hbase_class_bean.edw;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class CustomerCapFlowPart2 implements Comparable<CustomerCapFlowPart2>{

    //Ser_Num STRING 流水序号
    @JsonProperty("serNum")
    private String ser_num;

    //Occur_Dt STRING 发生日期
    @JsonProperty("occurDt")
    private String occur_dt;

    //Trade_Dt STRING 交易日期
    @JsonProperty("tradeDt")
    private String trade_dt;

    //Secu_Acct STRING 股东账户
    @JsonProperty("secuAcct")
    private String secu_acct;

    //Biz_Cd STRING 业务代码
    @JsonProperty("bizCd")
    private String biz_cd;

    //Biz_Name STRING 业务名称
    @JsonProperty("bizName")
    private String biz_name;

    //Trade_Mrkt STRING 交易市场名称
    @JsonProperty("tradeMkt")
    private String trade_mrkt;

    //Trade_Board STRING 交易板块名称
    @JsonProperty("tradeBoard")
    private String trade_board;

    //Secu_Cd STRING 证券代码
    @JsonProperty("secuCode")
    private String secu_cd;

    //Secu_Name STRING 证券名称
    @JsonProperty("secuName")
    private String secu_name;

    //Match_Qtty DECIMAL(26,4) 成交数量
    @JsonProperty("matchVol")
    private BigDecimal match_qtty;

    //Match_Price DECIMAL(26,4) 成交价格
    @JsonProperty("matchPrice")
    private BigDecimal match_price;

    //Occur_Amt DECIMAL(26,4) 发生金额
    @JsonProperty("occurAmt")
    private BigDecimal occur_amt;

    //Match_Amt DECIMAL(26,4) 成交金额
    @JsonProperty("matchAmt")
    private BigDecimal match_amt;

    //Comm_Fee DECIMAL(26,4) 手续费
    @JsonProperty("commFee")
    private BigDecimal comm_fee;

    //Stamp_Tax DECIMAL(26,4) 印花税
    @JsonProperty("stampTax")
    private BigDecimal stamp_tax;

    //Net_Comm DECIMAL(26,4) 佣金
    @JsonProperty("netComm")
    private BigDecimal net_comm;

    //Brokerage_Fee DECIMAL(26,4) 经手费
    @JsonProperty("brokerageFee")
    private BigDecimal brokerage_fee;

    //Ovhd_Expns_Fee DECIMAL(26,4) 管理费
    @JsonProperty("ovhdExpnsFee")
    private BigDecimal ovhd_expns_fee;

    //Trade_Sys_Use_Fee DECIMAL(26,4) 交易系统使用费
    @JsonProperty("tradeSysUseFee")
    private BigDecimal trade_sys_use_fee;

    //Tran_Fee DECIMAL(26,4) 过户费
    @JsonProperty("tranFee")
    private BigDecimal tran_fee;

    //Other_Fee DECIMAL(26,4) 其他费用
    @JsonProperty("otherFee")
    private BigDecimal other_fee;

    //Cap_Bal DECIMAL(26,4) 本次余额
    @JsonProperty("capBal")
    private BigDecimal cap_bal;

    //Memo STRING 备注
    @JsonProperty("memo")
    private String memo;

    //ETL_Tx_Dt STRING ETL加工日期
    @JsonProperty("etlTxDt")
    private String etl_tx_dt;

    //Share_Bal DECIMAL(26,0)股份余额
    @JsonProperty("shareBal")
    private BigDecimal share_bal;

    //busFee DECIMAL(26,4) 交易规费
    @JsonProperty("busFee")
    private BigDecimal busFee;

    //stkBal DECIMAL(26,4) 本次持仓数量
    @JsonProperty("stkBal")
    private BigDecimal stkBal;

    //type String 操作类型
    @JsonProperty("type")
    private String type;

    @JsonIgnore
    public String getSer_num() {
        return ser_num;
    }
    @JsonIgnore
    public void setSer_num(String ser_num) {
        this.ser_num = ser_num;
    }
    @JsonIgnore
    public String getOccur_dt() {
        return occur_dt;
    }
    @JsonIgnore
    public void setOccur_dt(String occur_dt) {
        this.occur_dt = occur_dt;
    }
    @JsonIgnore
    public String getTrade_dt() {
        return trade_dt;
    }
    @JsonIgnore
    public void setTrade_dt(String trade_dt) {
        this.trade_dt = trade_dt;
    }
    @JsonIgnore
    public String getSecu_acct() {
        return secu_acct;
    }
    @JsonIgnore
    public void setSecu_acct(String secu_acct) {
        this.secu_acct = secu_acct;
    }
    @JsonIgnore
    public String getBiz_cd() {
        return biz_cd;
    }
    @JsonIgnore
    public void setBiz_cd(String biz_cd) {
        this.biz_cd = biz_cd;
    }
    @JsonIgnore
    public String getBiz_name() {
        return biz_name;
    }
    @JsonIgnore
    public void setBiz_name(String biz_name) {
        this.biz_name = biz_name;
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
    public String getSecu_cd() {
        return secu_cd;
    }
    @JsonIgnore
    public void setSecu_cd(String secu_cd) {
        this.secu_cd = secu_cd;
    }
    @JsonIgnore
    public String getSecu_name() {
        return secu_name;
    }
    @JsonIgnore
    public void setSecu_name(String secu_name) {
        this.secu_name = secu_name;
    }
    @JsonIgnore
    public BigDecimal getMatch_qtty() {
        return match_qtty;
    }
    @JsonIgnore
    public void setMatch_qtty(BigDecimal match_qtty) {
        this.match_qtty = match_qtty;
    }
    @JsonIgnore
    public BigDecimal getMatch_price() {
        return match_price;
    }
    @JsonIgnore
    public void setMatch_price(BigDecimal match_price) {
        this.match_price = match_price;
    }
    @JsonIgnore
    public BigDecimal getOccur_amt() {
        return occur_amt;
    }
    @JsonIgnore
    public void setOccur_amt(BigDecimal occur_amt) {
        this.occur_amt = occur_amt;
    }
    @JsonIgnore
    public BigDecimal getMatch_amt() {
        return match_amt;
    }
    @JsonIgnore
    public void setMatch_amt(BigDecimal match_amt) {
        this.match_amt = match_amt;
    }
    @JsonIgnore
    public BigDecimal getComm_fee() {
        return comm_fee;
    }
    @JsonIgnore
    public void setComm_fee(BigDecimal comm_fee) {
        this.comm_fee = comm_fee;
    }
    @JsonIgnore
    public BigDecimal getStamp_tax() {
        return stamp_tax;
    }
    @JsonIgnore
    public void setStamp_tax(BigDecimal stamp_tax) {
        this.stamp_tax = stamp_tax;
    }
    @JsonIgnore
    public BigDecimal getNet_comm() {
        return net_comm;
    }
    @JsonIgnore
    public void setNet_comm(BigDecimal net_comm) {
        this.net_comm = net_comm;
    }
    @JsonIgnore
    public BigDecimal getBrokerage_fee() {
        return brokerage_fee;
    }
    @JsonIgnore
    public void setBrokerage_fee(BigDecimal brokerage_fee) {
        this.brokerage_fee = brokerage_fee;
    }
    @JsonIgnore
    public BigDecimal getOvhd_expns_fee() {
        return ovhd_expns_fee;
    }
    @JsonIgnore
    public void setOvhd_expns_fee(BigDecimal ovhd_expns_fee) {
        this.ovhd_expns_fee = ovhd_expns_fee;
    }
    @JsonIgnore
    public BigDecimal getTrade_sys_use_fee() {
        return trade_sys_use_fee;
    }
    @JsonIgnore
    public void setTrade_sys_use_fee(BigDecimal trade_sys_use_fee) {
        this.trade_sys_use_fee = trade_sys_use_fee;
    }
    @JsonIgnore
    public BigDecimal getTran_fee() {
        return tran_fee;
    }
    @JsonIgnore
    public void setTran_fee(BigDecimal tran_fee) {
        this.tran_fee = tran_fee;
    }
    @JsonIgnore
    public BigDecimal getOther_fee() {
        return other_fee;
    }
    @JsonIgnore
    public void setOther_fee(BigDecimal other_fee) {
        this.other_fee = other_fee;
    }
    @JsonIgnore
    public BigDecimal getCap_bal() {
        return cap_bal;
    }
    @JsonIgnore
    public void setCap_bal(BigDecimal cap_bal) {
        this.cap_bal = cap_bal;
    }
    @JsonIgnore
    public String getMemo() {
        return memo;
    }
    @JsonIgnore
    public void setMemo(String memo) {
        this.memo = memo;
    }
    @JsonIgnore
    public String getEtl_tx_dt() {
        return etl_tx_dt;
    }
    @JsonIgnore
    public void setEtl_tx_dt(String etl_tx_dt) {
        this.etl_tx_dt = etl_tx_dt;
    }
    public BigDecimal getShare_bal() {
        return share_bal;
    }
    public void setShare_bal(BigDecimal share_bal) {
        this.share_bal = share_bal;
    }
    @JsonIgnore
    public BigDecimal getBusFee() {
        return busFee;
    }
    @JsonIgnore
    public void setBusFee(BigDecimal busFee) {
        this.busFee = busFee;
    }
    @JsonIgnore
    public BigDecimal getStkBal() {
        return stkBal;
    }
    @JsonIgnore
    public void setStkBal(BigDecimal stkBal) {
        this.stkBal = stkBal;
    }
    @JsonIgnore
    public String getType() {
        return type;
    }
    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(CustomerCapFlowPart2 o) {
        if(!this.ser_num.equals(o.ser_num)){
            return this.ser_num.compareTo(o.ser_num);
        }else{
            return this.occur_dt.compareTo(o.occur_dt);
        }
    }
}
