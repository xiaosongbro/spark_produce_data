package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class DetailsOfBonusSharesOfCustomers {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("assetAcct")
    private String assetAcct;
    @JsonProperty("belongOrgId")
    private String belongOrgId;
    @JsonProperty("secuCode")
    private String secuCode;
    @JsonProperty("secuName")
    private String secuName;
    @JsonProperty("per10DivdndAmt")
    private BigDecimal per10DivdndAmt;
    @JsonProperty("posQtty")
    private BigDecimal posQtty;
    @JsonProperty("preDivdndTotalAmt")
    private BigDecimal preDivdndTotalAmt;
    @JsonProperty("divdndTotalAmt")
    private BigDecimal divdndTotalAmt;
    @JsonProperty("per10BoundQtty")
    private BigDecimal per10BoundQtty;
    @JsonProperty("per10TransAddBoundQtty")
    private BigDecimal per10TransAddBoundQtty;
    @JsonProperty("per10BoundQttyTotal")
    private BigDecimal per10BoundQttyTotal;
    @JsonProperty("preBoundQttyTotal")
    private BigDecimal preBoundQttyTotal;
    @JsonProperty("declaDt")
    private String declaDt;
    @JsonProperty("expectBillDt")
    private String expectBillDt;
    @JsonProperty("xrPrice")
    private BigDecimal xrPrice;
    @JsonProperty("closingPrice")
    private BigDecimal closingPrice;


    public String getBizDt() {
        return bizDt;
    }

    public void setBizDt(String bizDt) {
        this.bizDt = bizDt;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public String getAssetAcct() {
        return assetAcct;
    }

    public void setAssetAcct(String assetAcct) {
        this.assetAcct = assetAcct;
    }

    public String getBelongOrgId() {
        return belongOrgId;
    }

    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    public String getSecuCode() {
        return secuCode;
    }

    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    public String getSecuName() {
        return secuName;
    }

    public void setSecuName(String secuName) {
        this.secuName = secuName;
    }

    public BigDecimal getPer10DivdndAmt() {
        return per10DivdndAmt;
    }

    public void setPer10DivdndAmt(BigDecimal per10DivdndAmt) {
        this.per10DivdndAmt = per10DivdndAmt;
    }

    public BigDecimal getPosQtty() {
        return posQtty;
    }

    public void setPosQtty(BigDecimal posQtty) {
        this.posQtty = posQtty;
    }

    public BigDecimal getPreDivdndTotalAmt() {
        return preDivdndTotalAmt;
    }

    public void setPreDivdndTotalAmt(BigDecimal preDivdndTotalAmt) {
        this.preDivdndTotalAmt = preDivdndTotalAmt;
    }

    public BigDecimal getDivdndTotalAmt() {
        return divdndTotalAmt;
    }

    public void setDivdndTotalAmt(BigDecimal divdndTotalAmt) {
        this.divdndTotalAmt = divdndTotalAmt;
    }

    public BigDecimal getPer10BoundQtty() {
        return per10BoundQtty;
    }

    public void setPer10BoundQtty(BigDecimal per10BoundQtty) {
        this.per10BoundQtty = per10BoundQtty;
    }

    public BigDecimal getPer10TransAddBoundQtty() {
        return per10TransAddBoundQtty;
    }

    public void setPer10TransAddBoundQtty(BigDecimal per10TransAddBoundQtty) {
        this.per10TransAddBoundQtty = per10TransAddBoundQtty;
    }

    public BigDecimal getPer10BoundQttyTotal() {
        return per10BoundQttyTotal;
    }

    public void setPer10BoundQttyTotal(BigDecimal per10BoundQttyTotal) {
        this.per10BoundQttyTotal = per10BoundQttyTotal;
    }

    public BigDecimal getPreBoundQttyTotal() {
        return preBoundQttyTotal;
    }

    public void setPreBoundQttyTotal(BigDecimal preBoundQttyTotal) {
        this.preBoundQttyTotal = preBoundQttyTotal;
    }

    public String getDeclaDt() {
        return declaDt;
    }

    public void setDeclaDt(String declaDt) {
        this.declaDt = declaDt;
    }

    public String getExpectBillDt() {
        return expectBillDt;
    }

    public void setExpectBillDt(String expectBillDt) {
        this.expectBillDt = expectBillDt;
    }

    public BigDecimal getXrPrice() {
        return xrPrice;
    }

    public void setXrPrice(BigDecimal xrPrice) {
        this.xrPrice = xrPrice;
    }
}
