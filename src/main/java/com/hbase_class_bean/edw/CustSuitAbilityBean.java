package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class CustSuitAbilityBean {

    @JsonProperty("custid")
    private String custid;

    @JsonProperty("riskRatingCd")
    private String riskratingcd;

    @JsonProperty("investVariety")
    private String investvariety;

    @JsonProperty("investDeadLine")
    private String investdeadline;

    @JsonProperty("zgInvestorFlag")
    private String zginvestorflag;

    @JsonProperty("smInvestorFlag")
    private String sminvestorflag;

    @JsonProperty("bizDt")
    private String bizdt;

    @JsonIgnore
    public CustSuitAbilityBean() {
    }

    @JsonIgnore
    public CustSuitAbilityBean(String riskratingcd, String investvariety, String investdeadline, String zginvestorflag, String sminvestorflag, String bizdt) {
        this.riskratingcd = riskratingcd;
        this.investvariety = investvariety;
        this.investdeadline = investdeadline;
        this.zginvestorflag = zginvestorflag;
        this.sminvestorflag = sminvestorflag;
        this.bizdt = bizdt;
    }
}
