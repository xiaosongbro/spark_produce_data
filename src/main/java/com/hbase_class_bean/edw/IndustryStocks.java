package com.hbase_class_bean.edw;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class IndustryStocks {

    @JsonProperty("indCode")
    private String IndCode;

    @JsonProperty("indName")
    private String IndName;

    @JsonProperty("market")
    private String marketEs;

    @JsonProperty("stkCode")
    private String stkCode;
    @JsonProperty("stkName")
    private String stkName;

    @JsonIgnore
    public String getIndCode() {
        return IndCode;
    }
    @JsonIgnore
    public void setIndCode(String indCode) {
        IndCode = indCode;
    }
    @JsonIgnore
    public String getIndName() {
        return IndName;
    }
    @JsonIgnore
    public void setIndName(String indName) {
        IndName = indName;
    }
    @JsonIgnore
    public String getMarketEs() {
        return marketEs;
    }
    @JsonIgnore
    public void setMarketEs(String marketEs) {
        this.marketEs = marketEs;
    }

    @JsonIgnore
    public String getStkCode() {
        return stkCode;
    }
    @JsonIgnore
    public void setStkCode(String tkCode) {
        this.stkCode = tkCode;
    }
    @JsonIgnore
    public String getStkName() {
        return stkName;
    }
    @JsonIgnore
    public void setStkName(String stkName) {
        this.stkName = stkName;
    }
}
