package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class IntDNwfAssetAcctInfo {
    //Cust_Cd	客户号	VARCHAR(19)
    @JsonProperty("Cust_Cd")
    private String cust_cd;
    //Cust_Char	客户性质	CHAR(4)
    @JsonProperty("Cust_Char")
    private String cust_char;
    //Asset_Acct	资金账户	VARCHAR(19)
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //Belong_Org_Id	营业部代码	VARCHAR(12)
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //Belong_Company	分公司代码	VARCHAR(20)
    @JsonProperty("Belong_Company")
    private String belong_company;
    //Acct_Flag	账户标志 	CHAR(1)
    @JsonProperty("Acct_Flag")
    private String acct_flag;
    //Rela_Asset_Acct	关联普通账户	VARCHAR(19)
    @JsonProperty("Rela_Asset_Acct")
    private String rela_asset_acct;
    //Acct_Status	账户状态	CHAR(4)
    @JsonProperty("Acct_Status")
    private String acct_status;
    //Main_Auxiliary_Flag	主辅标志	CHAR(1)
    @JsonProperty("Main_Auxiliary_Flag")
    private String main_auxiliary_flag;
    //Acct_Open_Chan	开户渠道 	VARCHAR(16)
    @JsonProperty("Acct_Open_Chan")
    private String acct_open_chan;
    //Open_Acct_Dt	开户日期	DATE
    @JsonProperty("Open_Acct_Dt")
    private String open_acct_dt;
    //Close_Acct_Dt	销户日期	DATE
    @JsonProperty("Close_Acct_Dt")
    private String close_acct_dt;
    //Start_Dt	开始日期	DATE
    @JsonProperty("Start_Dt")
    private String start_dt;
    //End_Dt	结束日期	DATE
    @JsonProperty("End_Dt")
    private String end_dt;
    //Data_Label	数据标签	CHAR(4)
    @JsonProperty("Data_Label")
    private String data_label;
    @JsonIgnore
    public String getCust_cd() {
        return cust_cd;
    }
    @JsonIgnore
    public void setCust_cd(String cust_cd) {
        this.cust_cd = cust_cd;
    }
    @JsonIgnore
    public String getCust_char() {
        return cust_char;
    }
    @JsonIgnore
    public void setCust_char(String cust_char) {
        this.cust_char = cust_char;
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
    public String getBelong_company() {
        return belong_company;
    }
    @JsonIgnore
    public void setBelong_company(String belong_company) {
        this.belong_company = belong_company;
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
    public String getRela_asset_acct() {
        return rela_asset_acct;
    }
    @JsonIgnore
    public void setRela_asset_acct(String rela_asset_acct) {
        this.rela_asset_acct = rela_asset_acct;
    }
    @JsonIgnore
    public String getAcct_status() {
        return acct_status;
    }
    @JsonIgnore
    public void setAcct_status(String acct_status) {
        this.acct_status = acct_status;
    }
    @JsonIgnore
    public String getMain_auxiliary_flag() {
        return main_auxiliary_flag;
    }
    @JsonIgnore
    public void setMain_auxiliary_flag(String main_auxiliary_flag) {
        this.main_auxiliary_flag = main_auxiliary_flag;
    }
    @JsonIgnore
    public String getAcct_open_chan() {
        return acct_open_chan;
    }
    @JsonIgnore
    public void setAcct_open_chan(String acct_open_chan) {
        this.acct_open_chan = acct_open_chan;
    }
    @JsonIgnore
    public String getOpen_acct_dt() {
        return open_acct_dt;
    }
    @JsonIgnore
    public void setOpen_acct_dt(String open_acct_dt) {
        this.open_acct_dt = open_acct_dt;
    }
    @JsonIgnore
    public String getClose_acct_dt() {
        return close_acct_dt;
    }
    @JsonIgnore
    public void setClose_acct_dt(String close_acct_dt) {
        this.close_acct_dt = close_acct_dt;
    }
    @JsonIgnore
    public String getStart_dt() {
        return start_dt;
    }
    @JsonIgnore
    public void setStart_dt(String start_dt) {
        this.start_dt = start_dt;
    }
    @JsonIgnore
    public String getEnd_dt() {
        return end_dt;
    }
    @JsonIgnore
    public void setEnd_dt(String end_dt) {
        this.end_dt = end_dt;
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
