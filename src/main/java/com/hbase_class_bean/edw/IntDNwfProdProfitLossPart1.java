package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;

public class IntDNwfProdProfitLossPart1 {
    //Biz_Dt	业务日期	DATE
    @JsonProperty("Biz_dt")
    private String biz_dt;
    //Asset_Acct	资金账户	VARCHAR(19)
    @JsonProperty("Asset_Acct")
    private String asset_acct;
    //Belong_Org_Id	营业部代码	VARCHAR(12)
    @JsonProperty("Belong_Org_Id")
    private String belong_org_id;
    //Acct_Flag	账户标志	CHAR(1)
    @JsonProperty("Acct_Flag")
    private String acct_flag;
    @JsonProperty("ProductList")
    private ArrayList<IntDNwfProdProfitLossPart2> productList;

    //盈利股票总数量
    @JsonProperty("profit_count")
    private int profit_count;
    //亏损股票总数量
    @JsonProperty("loss_count")
    private int loss_count;
    //收益为0.0000（持平）的股票数量
    @JsonProperty("par_count")
    private int par_count;

    @JsonIgnore
    public String getBiz_dt() {
        return biz_dt;
    }
    @JsonIgnore
    public void setBiz_dt(String biz_dt) {
        this.biz_dt = biz_dt;
    }
    @JsonIgnore
    public String getAsset_acct() {
        return asset_acct;
    }
    @JsonIgnore
    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
    }
    @JsonIgnore
    public String getAcct_flag() {
        return acct_flag;
    }
    @JsonIgnore
    public void setAcct_flag(String acct_flag) {
        this.acct_flag = acct_flag;
    }
    @JsonIgnore
    public String getBelong_org_id() {
        return belong_org_id;
    }
    @JsonIgnore
    public void setBelong_org_id(String belong_org_id) {
        this.belong_org_id = belong_org_id;
    }
    @JsonIgnore
    public ArrayList<IntDNwfProdProfitLossPart2> getProductList() {
        return productList;
    }
    @JsonIgnore
    public void setProductList(ArrayList<IntDNwfProdProfitLossPart2> productList) {
        this.productList = productList;
    }
    @JsonIgnore
    public int getProfit_count() {
        return profit_count;
    }
    @JsonIgnore
    public void setProfit_count(int profit_count) {
        this.profit_count = profit_count;
    }
    @JsonIgnore
    public int getLoss_count() {
        return loss_count;
    }
    @JsonIgnore
    public void setLoss_count(int loss_count) {
        this.loss_count = loss_count;
    }
    @JsonIgnore
    public int getPar_count() {
        return par_count;
    }
    @JsonIgnore
    public void setPar_count(int par_count) {
        this.par_count = par_count;
    }
}