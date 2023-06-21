package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class CRMCustomerInfoBean {
    //Asset_Acct	STRING	资金账户
    @JsonProperty("fundAcct")
    private String asset_acct;
    //Cust_Name	STRING	客户姓名
    @JsonProperty("custName")
    private String cust_name;
    //Acct_Type	STRING	账户类别
    @JsonProperty("acctCate")
    private String acct_type;
    //Belong_Org_Name	STRING	归属营业部名称
    @JsonProperty("orgName")
    private String belong_org_name;
    //Cert_Addr	STRING	证件地址
    @JsonProperty("addr")
    private String cert_addr;
    @JsonIgnore
    public String getAsset_acct() {
        return asset_acct;
    }
    @JsonIgnore
    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
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
    public String getAcct_type() {
        return acct_type;
    }
    @JsonIgnore
    public void setAcct_type(String acct_type) {
        this.acct_type = acct_type;
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
    public String getCert_addr() {
        return cert_addr;
    }
    @JsonIgnore
    public void setCert_addr(String cert_addr) {
        this.cert_addr = cert_addr;
    }
}
