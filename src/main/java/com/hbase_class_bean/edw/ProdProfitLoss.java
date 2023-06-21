package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class ProdProfitLoss {

    @JsonProperty("prodNo")
    private String prodNo;
    @JsonProperty("prodName")
    private String prodName;
    @JsonProperty("prodTypeCd")
    private String prodTypeCd;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
    @JsonProperty("posStatus")
    private String posStatus;
    @JsonProperty("prodProfitLoss")
    private BigDecimal prodProfitLoss;

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdTypeCd() {
        return prodTypeCd;
    }

    public void setProdTypeCd(String prodTypeCd) {
        this.prodTypeCd = prodTypeCd;
    }

    public String getTradeMrkt() {
        return tradeMrkt;
    }

    public void setTradeMrkt(String tradeMrkt) {
        this.tradeMrkt = tradeMrkt;
    }

    public String getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus;
    }

    public BigDecimal getProdProfitLoss() {
        return prodProfitLoss;
    }

    public void setProdProfitLoss(BigDecimal prodProfitLoss) {
        this.prodProfitLoss = prodProfitLoss;
    }
}
