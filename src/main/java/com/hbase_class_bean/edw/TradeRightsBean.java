package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class TradeRightsBean {
    //biz_dt	业务日期	String
    @JsonProperty("bizDate")
    private String biz_dt;
    //cust_cd	客户代码	String
    @JsonProperty("custCode")
    private String cust_cd;
    //cust_type	客户类型	String
    @JsonProperty("custType")
    private String cust_type;
    //asset_acct	资金账号	String
    @JsonProperty("assetAcct")
    private String asset_acct;
    //acct_flag	账户标志 	String
    @JsonProperty("acctFlag")
    private String acct_flag;
    //belong_org_id	归属营业部	String
    @JsonProperty("belongOrgId")
    private String belong_org_id;
    //fist_trade_dt	首次交易日期(公司级)	String
    @JsonProperty("fistTradeDt")
    private String fist_trade_dt;
    //trade_almt	交易年限	DECIMAL(16,4)
    @JsonProperty("tradeAlmt")
    private BigDecimal trade_almt;
    //secu_acct_flag	股东账户开通情况（A股）	String
    @JsonProperty("secuAcctFlag")
    private String secu_acct_flag;
    //net_asset_avg_20	20日均净资产	DECIMAL(26,4)
    @JsonProperty("netAssetAvg20")
    private BigDecimal net_asset_avg_20;
    //net_asset_avg_10	10日均净资产	DECIMAL(26,4)
    @JsonProperty("netAssetAvg10")
    private BigDecimal net_asset_avg_10;
    //net_asset	t-1日净资产	DECIMAL(26,4)
    @JsonProperty("netAsset")
    private BigDecimal net_asset;
    //kcb_flag	科创板标志	String
    @JsonProperty("kcbFlag")
    private String kcb_flag;
    //cyb_flag	创业板标志	String
    @JsonProperty("cybFlag")
    private String cyb_flag;
    //hgt_flag	沪股通标志	String
    @JsonProperty("hgtFlag")
    private String hgt_flag;
    //sgt_flag	深股通标志	String
    @JsonProperty("sgtFlag")
    private String sgt_flag;
    //by3_flag	备用字段3	String
    @JsonProperty("by3Flag")
    private String by3_flag;
    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
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
    public String getCust_type() {
        return cust_type;
    }
    @JsonIgnore
    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
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
    public String getAcct_flag() {
        return acct_flag;
    }
    @JsonIgnore
    public void setAcct_flag(String acct_flag) {
        this.acct_flag = acct_flag;
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
    public String getFist_trade_dt() {
        return fist_trade_dt;
    }
    @JsonIgnore
    public void setFist_trade_dt(String fist_trade_dt) {
        this.fist_trade_dt = fist_trade_dt;
    }
    @JsonIgnore
    public BigDecimal getTrade_almt() {
        return trade_almt;
    }
    @JsonIgnore
    public void setTrade_almt(BigDecimal trade_almt) {
        this.trade_almt = trade_almt;
    }
    @JsonIgnore
    public String getSecu_acct_flag() {
        return secu_acct_flag;
    }
    @JsonIgnore
    public void setSecu_acct_flag(String secu_acct_flag) {
        this.secu_acct_flag = secu_acct_flag;
    }
    @JsonIgnore
    public BigDecimal getNet_asset_avg_20() {
        return net_asset_avg_20;
    }
    @JsonIgnore
    public void setNet_asset_avg_20(BigDecimal net_asset_avg_20) {
        this.net_asset_avg_20 = net_asset_avg_20;
    }
    @JsonIgnore
    public BigDecimal getNet_asset_avg_10() {
        return net_asset_avg_10;
    }
    @JsonIgnore
    public void setNet_asset_avg_10(BigDecimal net_asset_avg_10) {
        this.net_asset_avg_10 = net_asset_avg_10;
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
    public String getKcb_flag() {
        return kcb_flag;
    }
    @JsonIgnore
    public void setKcb_flag(String kcb_flag) {
        this.kcb_flag = kcb_flag;
    }
    @JsonIgnore
    public String getCyb_flag() {
        return cyb_flag;
    }
    @JsonIgnore
    public void setCyb_flag(String cyb_flag) {
        this.cyb_flag = cyb_flag;
    }
    @JsonIgnore
    public String getHgt_flag() {
        return hgt_flag;
    }
    @JsonIgnore
    public void setHgt_flag(String hgt_flag) {
        this.hgt_flag = hgt_flag;
    }
    @JsonIgnore
    public String getSgt_flag() {
        return sgt_flag;
    }
    @JsonIgnore
    public void setSgt_flag(String sgt_flag) {
        this.sgt_flag = sgt_flag;
    }
    @JsonIgnore
    public String getBy3_flag() {
        return by3_flag;
    }
    @JsonIgnore
    public void setBy3_flag(String by3_flag) {
        this.by3_flag = by3_flag;
    }
}
