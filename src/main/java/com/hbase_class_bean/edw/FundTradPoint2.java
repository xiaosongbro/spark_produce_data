package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class FundTradPoint2 implements Comparable<FundTradPoint2>{

    //Trade_Dt STRING 交易日期
    @JsonProperty("tradeDt")
    private String trade_dt;
    //Occur_Dt STRING 发生日期
    @JsonProperty("occurDt")
    private String occur_dt;
    //Asset_Acct STRING 资金账号
    @JsonProperty("fundAcct")
    private String asset_acct;
    //Order_Ser_Num STRING 委托流水号
    @JsonProperty("orderSerNum")
    private String order_ser_num;
    //Cust_Cd STRING 客户编号
    @JsonProperty("custCd")
    private String cust_cd;
    //Cust_Name STRING 客户名称
    @JsonProperty("custName")
    private String cust_name;
    //Belong_Org_Id STRING 营业部代码
    @JsonProperty("belongOrgId")
    private String belong_org_id;
    //Fund_Cd STRING 基金代码
    @JsonProperty("stkCode")
    private String fund_cd;
    //Fund_Sname STRING 基金简称
    @JsonProperty("fundSname")
    private String fund_sname;
    //Order_Share DECIMAL(19,2) 委托份额
    @JsonProperty("orderShare")
    private BigDecimal order_share;
    //Order_Amt DECIMAL(19,2) 委托金额
    @JsonProperty("orderAmt")
    private BigDecimal order_amt;
    //Chan_Id STRING 渠道编号
    @JsonProperty("chanId")
    private String chan_id;
    //Bs_Flag STRING 买卖点标识
    @JsonProperty("bsFlag")
    private String bs_flag;
    @JsonIgnore
    public String getTrade_dt() {
        return trade_dt;
    }
    @JsonIgnore
    public void setTrade_dt(String trade_dt) {
        this.trade_dt = trade_dt;
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
    public String getAsset_acct() {
        return asset_acct;
    }
    @JsonIgnore
    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
    }
    @JsonIgnore
    public String getOrder_ser_num() {
        return order_ser_num;
    }
    @JsonIgnore
    public void setOrder_ser_num(String order_ser_num) {
        this.order_ser_num = order_ser_num;
    }
    @JsonIgnore
    public String getCust_cd() {
        return cust_cd;
    }
    @JsonIgnore
    public void setCust_cd(String cust_cd) {
        this.cust_cd = cust_cd;
    }
    @JsonIgnore
    public String getCust_name() {
        return cust_name;
    }
    @JsonIgnore
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
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
    public String getFund_cd() {
        return fund_cd;
    }
    @JsonIgnore
    public void setFund_cd(String fund_cd) {
        this.fund_cd = fund_cd;
    }
    @JsonIgnore
    public String getFund_sname() {
        return fund_sname;
    }
    @JsonIgnore
    public void setFund_sname(String fund_sname) {
        this.fund_sname = fund_sname;
    }
    @JsonIgnore
    public BigDecimal getOrder_share() {
        return order_share;
    }
    @JsonIgnore
    public void setOrder_share(BigDecimal order_share) {
        this.order_share = order_share;
    }
    @JsonIgnore
    public BigDecimal getOrder_amt() {
        return order_amt;
    }
    @JsonIgnore
    public void setOrder_amt(BigDecimal order_amt) {
        this.order_amt = order_amt;
    }
    @JsonIgnore
    public String getChan_id() {
        return chan_id;
    }
    @JsonIgnore
    public void setChan_id(String chan_id) {
        this.chan_id = chan_id;
    }
    @JsonIgnore
    public String getBs_flag() {
        return bs_flag;
    }
    @JsonIgnore
    public void setBs_flag(String bs_flag) {
        this.bs_flag = bs_flag;
    }

    @Override
    public int compareTo(FundTradPoint2 o) {
        return this.order_ser_num.compareTo(o.order_ser_num);
    }
}
