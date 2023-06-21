package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

//盈亏分析=====>累计盈亏 INT_D_NWF_ALL_ASSET_INFO
public class IntDNwfAllAssetInfo {
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
    private java.math.BigDecimal total_asset;
    //Total_Liab	总负债	DECIMAL(26,4)
    @JsonProperty("Total_Liab")
    private java.math.BigDecimal total_liab;
    //Net_Asset	净资产	DECIMAL(26,4)
    @JsonProperty("Net_Asset")
    private java.math.BigDecimal net_asset;
    //Data_Label	数据标签	VARCHAR(4)
    @JsonProperty("Data_Label")
    private String data_label;
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
    public java.math.BigDecimal getTotal_asset() {
        return total_asset;
    }
    @JsonIgnore
    public void setTotal_asset(java.math.BigDecimal total_asset) {
        this.total_asset = total_asset;
    }
    @JsonIgnore
    public java.math.BigDecimal getTotal_liab() {
        return total_liab;
    }
    @JsonIgnore
    public void setTotal_liab(java.math.BigDecimal total_liab) {
        this.total_liab = total_liab;
    }
    @JsonIgnore
    public java.math.BigDecimal getNet_asset() {
        return net_asset;
    }
    @JsonIgnore
    public void setNet_asset(java.math.BigDecimal net_asset) {
        this.net_asset = net_asset;
    }
    @JsonIgnore
    public String getData_label() {
        return data_label;
    }
    @JsonIgnore
    public void setData_label(String data_label) {
        this.data_label = data_label;
    }
}
