package com.hbase_class_bean.edw;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ESOPAccountExerciseFlowBean {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("dataLabel")
    private String dataLabel;
    @JsonProperty("mmbs")
    private String mmbs;
    @JsonProperty("bizCd")
    private String bizCd;
    @JsonProperty("execDate")
    private String execDate;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("orderSno")
    private String orderSno;
    @JsonProperty("execCode")
    private String execCode;
    @JsonProperty("secuCode")
    private String secuCode;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("execQtty")
    private BigDecimal execQtty;
    @JsonProperty("execPrice")
    private BigDecimal execPrice;
    @JsonProperty("closingPrice")
    private BigDecimal closingPrice;

    @JsonIgnore
    public String getBizDt() {
        return bizDt;
    }

    @JsonIgnore
    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    @JsonIgnore
    public String getDataLabel() {
        return dataLabel;
    }

    @JsonIgnore
    public void setDataLabel(String dataLabel) {
        this.dataLabel = dataLabel;
    }

    @JsonIgnore
    public String getMmbs() {
        return mmbs;
    }

    @JsonIgnore
    public void setMmbs(String mmbs) {
        this.mmbs = mmbs;
    }

    @JsonIgnore
    public String getBizCd() {
        return bizCd;
    }

    @JsonIgnore
    public void setBizCd(String bizCd) {
        this.bizCd = bizCd;
    }

    @JsonIgnore
    public String getExecDate() {
        return execDate;
    }

    @JsonIgnore
    public void setExecDate(String execDate) {
        this.execDate = execDate;
    }

    @JsonIgnore
    public String getAssetAcct() {
        return assetAcct;
    }

    @JsonIgnore
    public void setAssetAcct(String assetAcct) {
        this.assetAcct = assetAcct;
    }

    @JsonIgnore
    public String getBelongOrgId() {
        return belongOrgId;
    }

    @JsonIgnore
    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    @JsonIgnore
    public String getOrderSno() {
        return orderSno;
    }

    @JsonIgnore
    public void setOrderSno(String orderSno) {
        this.orderSno = orderSno;
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
    public String getSecuCode() {
        return secuCode;
    }

    @JsonIgnore
    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    @JsonIgnore
    public String getTradeMrkt() {
        return tradeMrkt;
    }

    @JsonIgnore
    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }

    @JsonIgnore
    public BigDecimal getExecQtty() {
        return execQtty;
    }

    @JsonIgnore
    public void setExecQtty(BigDecimal execQtty) {
        this.execQtty = execQtty;
    }

    @JsonIgnore
    public BigDecimal getExecPrice() {
        return execPrice;
    }

    @JsonIgnore
    public void setExecPrice(BigDecimal execPrice) {
        this.execPrice = execPrice;
    }

    @JsonIgnore
    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    @JsonIgnore
    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }
}
