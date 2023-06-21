package com.hbase_class_bean.edw;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class ESOPProductMarketInfoBean {
    @JsonProperty("bizDt")
    private String bizDt;
    @JsonProperty("secuCode")
    private String secuCode;
    @JsonProperty("tradeMrkt")
    private String tradeMrkt;
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
    public BigDecimal getClosingPrice() {
        return closingPrice;
    }
    @JsonIgnore
    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

}
