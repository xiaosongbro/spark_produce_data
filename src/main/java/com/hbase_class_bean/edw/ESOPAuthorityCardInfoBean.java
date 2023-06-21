package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;


public class ESOPAuthorityCardInfoBean {
    @JsonProperty("secuCode")
    private String secuCode;
    @JsonProperty("secuName")
    private String secuName;
    @JsonProperty("execCode")
    private String execCode;
    @JsonProperty("execName")
    private String execName;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;

    @JsonIgnore
    public String getSecuCode() {
        return secuCode;
    }

    @JsonIgnore
    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    @JsonIgnore
    public String getSecuName() {
        return secuName;
    }

    @JsonIgnore
    public void setSecuName(String secuName) {
        this.secuName = secuName;
    }

    @JsonIgnore
    public String getExecCode() {
        return execCode;
    }

    @JsonIgnore
    public void setExecCode(String execCode) {
        this.execCode = execCode;
    }

    @JsonIgnore
    public String getExecName() {
        return execName;
    }

    @JsonIgnore
    public void setExecName(String execName) {
        this.execName = execName;
    }

    @JsonIgnore
    public String getTradeMrkt() {
        return tradeMrkt;
    }

    @JsonIgnore
    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }
}
