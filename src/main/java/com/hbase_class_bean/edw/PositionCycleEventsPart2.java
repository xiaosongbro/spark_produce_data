package com.hbase_class_bean.edw;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class PositionCycleEventsPart2 implements Comparable<PositionCycleEventsPart2>{

    //biz_dt	日期	String
    @JsonProperty("bizDt")
    private String biz_dt;
    //asset_acct	资金账号	String
    @JsonProperty("assetAcct")
    private String asset_acct;
    //data_label	数据标签	String
    @JsonProperty("dataLabel")
    private String data_label;
    //acct_flag	账户标志 	String
    @JsonProperty("acctFlag")
    private String acct_flag;
    //opera_evt	操作	String
    @JsonProperty("operaEvent")
    private String opera_evt;
    //biz_cd	业务码	String
    @JsonProperty("bizCode")
    private String biz_cd;
    //evt_cd	事件代码	String
    @JsonProperty("evtCd")
    private String evt_cd;
    //opera_dt	操作日期	String
    @JsonProperty("operaDt")
    private String opera_dt;
    //occur_tm	操作时间	String
    @JsonProperty("occurTime")
    private String occur_tm;
    //match_flag	是否1笔委托多笔成交	String
    @JsonProperty("matchFlag")
    private String match_flag;
    //prod_name	股票名称	String
    @JsonProperty("stkName")
    private String prod_name;
    //trade_mrkt	交易市场	String
    @JsonProperty("tradeMrkt")
    private String trade_mrkt;
    //prod_no	股票代码	String
    @JsonProperty("prodNo")
    private String prod_no;
    //match_price	成交价	Decimal(26,4)
    @JsonProperty("matchPrice")
    private BigDecimal match_price;
    //match_qtty	成交数量	Decimal(26,0)
    @JsonProperty("matchQtty")
    private BigDecimal match_qtty;
    //pos_qtty	持仓数量	Decimal(26,0)
    @JsonProperty("posQtty")
    private BigDecimal pos_qtty;
    //pos_cost	持仓成本	Decimal(26,4)
    @JsonProperty("posCost")
    private BigDecimal pos_cost;
    //cost_price	成本价	Decimal(26,4)
    @JsonProperty("costPrice")
    private BigDecimal cost_price;
    //match_amt	成交金额	Decimal(26,4)
    @JsonProperty("matchAmt")
    private BigDecimal match_amt;
    //occur_amt	发生金额	Decimal(26,4)
    @JsonProperty("occurAmt")
    private BigDecimal occur_amt;
    //transt_fee	交易费用	Decimal(26,4)
    @JsonProperty("transtFee")
    private BigDecimal transt_fee;
    //divdnd_meth	分红方案	Decimal(16,4)
    @JsonProperty("divdndMeth")
    private String divdnd_meth;

    //contrSeqNum 合约编号 string
    @JsonProperty("contrSeqNum")
    private String contrseqnum;
    //evt_id 事件编号 string
    @JsonProperty("evtId")
    private String evtId;

    @JsonIgnore
    public String getEvtId() {
        return evtId;
    }
    @JsonIgnore
    public void setEvtId(String evtId) {
        this.evtId = evtId;
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
    public String getOpera_evt() {
        return opera_evt;
    }
    @JsonIgnore
    public void setOpera_evt(String opera_evt) {
        this.opera_evt = opera_evt;
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
    public String getEvt_cd() {
        return evt_cd;
    }
    @JsonIgnore
    public void setEvt_cd(String evt_cd) {
        this.evt_cd = evt_cd;
    }
    @JsonIgnore
    public String getOpera_dt() {
        return opera_dt;
    }
    @JsonIgnore
    public void setOpera_dt(String opera_dt) {
        this.opera_dt = opera_dt;
    }
    @JsonIgnore
    public String getOccur_tm() {
        return occur_tm;
    }
    @JsonIgnore
    public void setOccur_tm(String occur_tm) {
        this.occur_tm = occur_tm;
    }
    @JsonIgnore
    public String getMatch_flag() {
        return match_flag;
    }
    @JsonIgnore
    public void setMatch_flag(String match_flag) {
        this.match_flag = match_flag;
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
    public String getProd_no() {
        return prod_no;
    }
    @JsonIgnore
    public void setProd_no(String prod_no) {
        this.prod_no = prod_no;
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
    public BigDecimal getMatch_qtty() {
        return match_qtty;
    }
    @JsonIgnore
    public void setMatch_qtty(BigDecimal match_qtty) {
        this.match_qtty = match_qtty;
    }
    @JsonIgnore
    public BigDecimal getPos_qtty() {
        return pos_qtty;
    }
    @JsonIgnore
    public void setPos_qtty(BigDecimal pos_qtty) {
        this.pos_qtty = pos_qtty;
    }
    @JsonIgnore
    public BigDecimal getPos_cost() {
        return pos_cost;
    }
    @JsonIgnore
    public void setPos_cost(BigDecimal pos_cost) {
        this.pos_cost = pos_cost;
    }
    @JsonIgnore
    public BigDecimal getCost_price() {
        return cost_price;
    }
    @JsonIgnore
    public void setCost_price(BigDecimal cost_price) {
        this.cost_price = cost_price;
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
    public BigDecimal getOccur_amt() {
        return occur_amt;
    }
    @JsonIgnore
    public void setOccur_amt(BigDecimal occur_amt) {
        this.occur_amt = occur_amt;
    }
    @JsonIgnore
    public BigDecimal getTranst_fee() {
        return transt_fee;
    }
    @JsonIgnore
    public void setTranst_fee(BigDecimal transt_fee) {
        this.transt_fee = transt_fee;
    }
    @JsonIgnore
    public String getDivdnd_meth() {
        return divdnd_meth;
    }
    @JsonIgnore
    public void setDivdnd_meth(String divdnd_meth) {
        this.divdnd_meth = divdnd_meth;
    }
    @JsonIgnore
    public String getContrseqnum() {
        return contrseqnum;
    }
    @JsonIgnore
    public void setContrseqnum(String contrseqnum) {
        this.contrseqnum = contrseqnum;
    }

    @Override
    public int compareTo(PositionCycleEventsPart2 o) {
        return this.occur_tm.compareTo(o.occur_tm);
    }
}