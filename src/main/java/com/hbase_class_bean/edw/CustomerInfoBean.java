package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class CustomerInfoBean {
    //asset_acct	string	资金账户
    @JsonProperty("fundAcct")
    private String asset_acct;
    //belong_org_id	string	归属营业部
    @JsonProperty("code")
    private String belong_org_id;
    //belong_org_name	string	归属营业部名称
    @JsonProperty("orgName")
    private String belong_org_name;
    //open_acct_dt	string	开户日期
    @JsonProperty("openAcctDt")
    private String open_acct_dt;
    //acct_type	string	账户类别
    @JsonProperty("acctCate")
    private String acct_type;
    //cust_id	string	客户编号
    @JsonProperty("custId")
    private String cust_id;
    //cust_name	string	客户姓名
    @JsonProperty("ustName")
    private String cust_name;
    //cert_type_cd	string	证件类型代码
    @JsonProperty("certTypeCd")
    private String cert_type_cd;
    //cert_id	string	证件号码
    @JsonProperty("certId")
    private String cert_id;
    //certtype	string	证件类型
    @JsonProperty("certType")
    private String certtype;
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
    public String getBelong_org_name() {
        return belong_org_name;
    }
    @JsonIgnore
    public void setBelong_org_name(String belong_org_name) {
        this.belong_org_name = belong_org_name;
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
    public String getAcct_type() {
        return acct_type;
    }
    @JsonIgnore
    public void setAcct_type(String acct_type) {
        this.acct_type = acct_type;
    }
    @JsonIgnore
    public String getCust_id() {
        return cust_id;
    }
    @JsonIgnore
    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
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
    public String getCert_type_cd() {
        return cert_type_cd;
    }
    @JsonIgnore
    public void setCert_type_cd(String cert_type_cd) {
        this.cert_type_cd = cert_type_cd;
    }
    @JsonIgnore
    public String getCert_id() {
        return cert_id;
    }
    @JsonIgnore
    public void setCert_id(String cert_id) {
        this.cert_id = cert_id;
    }
    @JsonIgnore
    public String getCerttype() {
        return certtype;
    }
    @JsonIgnore
    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }
}
