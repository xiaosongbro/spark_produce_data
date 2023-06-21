package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

//bizDate 	    	String(10)
//custCode 	    	String(19)
//custType 	    	String(1)
//kcbFlag 			String(1)
//cybFlag 			String(1)
//hgtFlag 			String(1)
//sgtFlag 			String(1)
//secuAcctFlag 		String(1)
//ydghAcctFlag 		String(1)
//gpzyAcctFlag 		String(1)
//rzghAcctFlag  	String(1)
//netAssetAvg20 	DECIMAL(26,4)
//tradeAlmt 		DECIMAL(16,4)
public class TradeRightsInfoBean {

    @JsonProperty("bizDate")
    private String biz_dt;

    @JsonProperty("custCode")
    private String cust_cd;

    @JsonProperty("custType")
    private String cust_type;

    @JsonProperty("kcbFlag")
    private String kcb_flag;

    @JsonProperty("cybFlag")
    private String cyb_flag;

    @JsonProperty("hgtFlag")
    private String hgt_flag;

    @JsonProperty("sgtFlag")
    private String sgt_flag;

    @JsonProperty("secuAcctFlag")
    private String secu_acct_flag;

    @JsonProperty("ydghAcctFlag")
    private String ydgh_flag;

    @JsonProperty("gpzyAcctFlag")
    private String gpzy_flag;

    @JsonProperty("rzghAcctFlag")
    private String gzzhg_flag;

    @JsonProperty("netAssetAvg20")
    private BigDecimal net_asset_avg_20;

    @JsonProperty("tradeAlmt")
    private BigDecimal trade_almt;

    @JsonProperty("fislFlag")
    private String fislFlag;

    @JsonProperty("xsbFlag")
    private String xsbFlag;

    @JsonProperty("cbondFlag")
    private String cbondFlag;

    @JsonProperty("fortuneFlag")
    private String fortuneFlag;

    @JsonProperty("ttzFlag")
    private String ttzFlag;

    @JsonProperty("ttlFlag")
    private String ttlFlag;

    @JsonProperty("scbFlag")
    private String scbFlag;

    @JsonProperty("blxFlag")
    private String blxFlag;

    @JsonIgnore
    public TradeRightsInfoBean() {
    }

    @JsonIgnore
    public TradeRightsInfoBean(String biz_dt, String cust_cd, String cust_type, String kcb_flag, String cyb_flag, String hgt_flag, String sgt_flag, String secu_acct_flag, String ydgh_flag, String gpzy_flag, String gzzhg_flag, BigDecimal net_asset_avg_20, BigDecimal trade_almt) {
        this.biz_dt = biz_dt;
        this.cust_cd = cust_cd;
        this.cust_type = cust_type;
        this.kcb_flag = kcb_flag;
        this.cyb_flag = cyb_flag;
        this.hgt_flag = hgt_flag;
        this.sgt_flag = sgt_flag;
        this.secu_acct_flag = secu_acct_flag;
        this.ydgh_flag = ydgh_flag;
        this.gpzy_flag = gpzy_flag;
        this.gzzhg_flag = gzzhg_flag;
        this.net_asset_avg_20 = net_asset_avg_20;
        this.trade_almt = trade_almt;
    }

    @JsonIgnore
    public TradeRightsInfoBean(String biz_dt, String cust_cd, String cust_type, String kcb_flag, String cyb_flag, String hgt_flag, String sgt_flag, String secu_acct_flag, String ydgh_flag, String gpzy_flag, String gzzhg_flag, BigDecimal net_asset_avg_20, BigDecimal trade_almt, String fislFlag, String xsbFlag, String cbondFlag, String fortuneFlag, String ttzFlag, String ttlFlag, String scbFlag, String blxFlag) {
        this.biz_dt = biz_dt;
        this.cust_cd = cust_cd;
        this.cust_type = cust_type;
        this.kcb_flag = kcb_flag;
        this.cyb_flag = cyb_flag;
        this.hgt_flag = hgt_flag;
        this.sgt_flag = sgt_flag;
        this.secu_acct_flag = secu_acct_flag;
        this.ydgh_flag = ydgh_flag;
        this.gpzy_flag = gpzy_flag;
        this.gzzhg_flag = gzzhg_flag;
        this.net_asset_avg_20 = net_asset_avg_20;
        this.trade_almt = trade_almt;
        this.fislFlag = fislFlag;
        this.xsbFlag = xsbFlag;
        this.cbondFlag = cbondFlag;
        this.fortuneFlag = fortuneFlag;
        this.ttzFlag = ttzFlag;
        this.ttlFlag = ttlFlag;
        this.scbFlag = scbFlag;
        this.blxFlag = blxFlag;
    }

    @JsonIgnore
    public String getFislFlag() {
        return fislFlag;
    }

    @JsonIgnore
    public void setFislFlag(String fislFlag) {
        this.fislFlag = fislFlag;
    }

    @JsonIgnore
    public String getXsbFlag() {
        return xsbFlag;
    }

    @JsonIgnore
    public void setXsbFlag(String xsbFlag) {
        this.xsbFlag = xsbFlag;
    }

    @JsonIgnore
    public String getCbondFlag() {
        return cbondFlag;
    }

    @JsonIgnore
    public void setCbondFlag(String cbondFlag) {
        this.cbondFlag = cbondFlag;
    }

    @JsonIgnore
    public String getFortuneFlag() {
        return fortuneFlag;
    }

    @JsonIgnore
    public void setFortuneFlag(String fortuneFlag) {
        this.fortuneFlag = fortuneFlag;
    }

    @JsonIgnore
    public String getTtzFlag() {
        return ttzFlag;
    }

    @JsonIgnore
    public void setTtzFlag(String ttzFlag) {
        this.ttzFlag = ttzFlag;
    }

    @JsonIgnore
    public String getTtlFlag() {
        return ttlFlag;
    }

    @JsonIgnore
    public void setTtlFlag(String ttlFlag) {
        this.ttlFlag = ttlFlag;
    }

    @JsonIgnore
    public String getScbFlag() {
        return scbFlag;
    }

    @JsonIgnore
    public void setScbFlag(String scbFlag) {
        this.scbFlag = scbFlag;
    }

    @JsonIgnore
    public String getBlxFlag() {
        return blxFlag;
    }

    @JsonIgnore
    public void setBlxFlag(String blxFlag) {
        this.blxFlag = blxFlag;
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
    public String getSecu_acct_flag() {
        return secu_acct_flag;
    }

    @JsonIgnore
    public void setSecu_acct_flag(String secu_acct_flag) {
        this.secu_acct_flag = secu_acct_flag;
    }

    @JsonIgnore
    public String getYdgh_flag() {
        return ydgh_flag;
    }

    @JsonIgnore
    public void setYdgh_flag(String ydgh_flag) {
        this.ydgh_flag = ydgh_flag;
    }

    @JsonIgnore
    public String getGpzy_flag() {
        return gpzy_flag;
    }

    @JsonIgnore
    public void setGpzy_flag(String gpzy_flag) {
        this.gpzy_flag = gpzy_flag;
    }

    @JsonIgnore
    public String getGzzhg_flag() {
        return gzzhg_flag;
    }

    @JsonIgnore
    public void setGzzhg_flag(String gzzhg_flag) {
        this.gzzhg_flag = gzzhg_flag;
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
    public BigDecimal getTrade_almt() {
        return trade_almt;
    }

    @JsonIgnore
    public void setTrade_almt(BigDecimal trade_almt) {
        this.trade_almt = trade_almt;
    }
}
