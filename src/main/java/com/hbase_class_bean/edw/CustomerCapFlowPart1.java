package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class CustomerCapFlowPart1 {

    //Cap_Acct STRING 资金账户
    @JsonProperty("fundAcct")
    private String cap_acct;

    //Crdt_Acct_Flag STRING 信用账户标志
    @JsonProperty("acctCate")
    private String crdt_acct_flag;

    //Curr_Name STRING 币种名称
    @JsonProperty("currency")
    private String curr_name;

    @JsonProperty("logList")
    private ArrayList<CustomerCapFlowPart2> logList;

    @JsonIgnore
    public String getCap_acct() {
        return cap_acct;
    }
    @JsonIgnore
    public void setCap_acct(String cap_acct) {
        this.cap_acct = cap_acct;
    }
    @JsonIgnore
    public String getCrdt_acct_flag() {
        return crdt_acct_flag;
    }
    @JsonIgnore
    public void setCrdt_acct_flag(String crdt_acct_flag) {
        this.crdt_acct_flag = crdt_acct_flag;
    }
    @JsonIgnore
    public String getCurr_name() {
        return curr_name;
    }
    @JsonIgnore
    public void setCurr_name(String curr_name) {
        this.curr_name = curr_name;
    }
    @JsonIgnore
    public ArrayList<CustomerCapFlowPart2> getLogList() {
        return logList;
    }
    @JsonIgnore
    public void setLogList(ArrayList<CustomerCapFlowPart2> logList) {
        this.logList = logList;
    }
}
