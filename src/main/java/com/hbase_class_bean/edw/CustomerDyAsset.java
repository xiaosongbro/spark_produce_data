package com.hbase_class_bean.edw;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


public class CustomerDyAsset {

    //Cap_Acct STRING 资金账户
    @JsonProperty("fundAcct")
    private String Cap_Acct;

    //Biz_Dt STRING 业务日期
    @JsonProperty("bizDt")
    private int Biz_Dt;

    //Curr_Name STRING 币种名称
    @JsonProperty("currency")
    private String Curr_Name;

    //Cap_Asset DECIMAL(16,2) 现金资产
    @JsonProperty("capAsset")
    private BigDecimal Cap_Asset;

    //Cap_Liab DECIMAL(16,2) 现金负债
    @JsonProperty("capLiab")
    private BigDecimal Cap_Liab;

    //Secu_Asset DECIMAL(16,2) 证券资产
    @JsonProperty("secuAsset")
    private BigDecimal Secu_Asset;

    //Secu_Liab DECIMAL(16,2) 证券负债
    @JsonProperty("secuLiab")
    private BigDecimal Secu_Liab;

    //Net_Asset DECIMAL(16,2) 本币资产余额
    @JsonProperty("netAsset")
    private BigDecimal Net_Asset;

    //ETL_Tx_Dt STRING ETL抽取时间
    @JsonProperty("EtlTxDt")
    private String ETL_Tx_Dt;

    //Rmb_Net_Asset DECIMAL(16,2) 折人民币资产余额
    @JsonProperty("rmbNetAsset")
    private BigDecimal Rmb_Net_Asset;

    //Acct_Cate_Cd STRING 信用账户标志
    @JsonProperty("acctCate")
    private String Acct_Cate_Cd;

    @JsonIgnore
    public String getCap_Acct() {
        return Cap_Acct;
    }
    @JsonIgnore
    public void setCap_Acct(String cap_Acct) {
        Cap_Acct = cap_Acct;
    }
    @JsonIgnore
    public int getBiz_Dt() {
        return Biz_Dt;
    }
    @JsonIgnore
    public void setBiz_Dt(int biz_Dt) {
        Biz_Dt = biz_Dt;
    }
    @JsonIgnore
    public String getCurr_Name() {
        return Curr_Name;
    }
    @JsonIgnore
    public void setCurr_Name(String curr_Name) {
        Curr_Name = curr_Name;
    }
    @JsonIgnore
    public BigDecimal getCap_Asset() {
        return Cap_Asset;
    }
    @JsonIgnore
    public void setCap_Asset(BigDecimal cap_Asset) {
        Cap_Asset = cap_Asset;
    }
    @JsonIgnore
    public BigDecimal getCap_Liab() {
        return Cap_Liab;
    }
    @JsonIgnore
    public void setCap_Liab(BigDecimal cap_Liab) {
        Cap_Liab = cap_Liab;
    }
    @JsonIgnore
    public BigDecimal getSecu_Asset() {
        return Secu_Asset;
    }
    @JsonIgnore
    public void setSecu_Asset(BigDecimal secu_Asset) {
        Secu_Asset = secu_Asset;
    }
    @JsonIgnore
    public BigDecimal getSecu_Liab() {
        return Secu_Liab;
    }
    @JsonIgnore
    public void setSecu_Liab(BigDecimal secu_Liab) {
        Secu_Liab = secu_Liab;
    }
    @JsonIgnore
    public BigDecimal getNet_Asset() {
        return Net_Asset;
    }
    @JsonIgnore
    public void setNet_Asset(BigDecimal net_Asset) {
        Net_Asset = net_Asset;
    }
    @JsonIgnore
    public String getETL_Tx_Dt() {
        return ETL_Tx_Dt;
    }
    @JsonIgnore
    public void setETL_Tx_Dt(String ETL_Tx_Dt) {
        this.ETL_Tx_Dt = ETL_Tx_Dt;
    }
    @JsonIgnore
    public BigDecimal getRmb_Net_Asset() {
        return Rmb_Net_Asset;
    }
    @JsonIgnore
    public void setRmb_Net_Asset(BigDecimal rmb_Net_Asset) {
        Rmb_Net_Asset = rmb_Net_Asset;
    }
    @JsonIgnore
    public String getAcct_Cate_Cd() {
        return Acct_Cate_Cd;
    }
    @JsonIgnore
    public void setAcct_Cate_Cd(String acct_Cate_Cd) {
        Acct_Cate_Cd = acct_Cate_Cd;
    }
}
