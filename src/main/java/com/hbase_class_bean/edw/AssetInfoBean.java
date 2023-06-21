package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;


/*
bizDt  业务日期yyyy-MM-dd
totalAsset 总资产
netAsset 净资产
totalLiab 负债
stockAsset 股票资产
chremAsset 理财资产
cashAsset 现金资产
inTianAmt 在途资产
otherAsset 其他资产
assetInfo20 近20日日均资产
trdAmount90 近3月总交易量
capBal 资金余额
assetExt 在外资产
 */
public class AssetInfoBean {

    @JsonProperty("bizDt")
    private String biz_Dt;

    @JsonProperty("totalAsset")
    private BigDecimal total_Asset;

    @JsonProperty("netAsset")
    private BigDecimal net_Asset;

    @JsonProperty("totalLiab")
    private BigDecimal total_Liab;

    @JsonProperty("stockAsset")
    private BigDecimal stock_Asset;

    @JsonProperty("chremAsset")
    private BigDecimal chrem_Asset;

    @JsonProperty("cashAsset")
    private BigDecimal cash_Asset;

    @JsonProperty("inTianAmt")
    private BigDecimal in_Tian_Amt;

    @JsonProperty("otherAsset")
    private BigDecimal other_Asset;

    @JsonProperty("assetInfo20")
    private BigDecimal asset_Info_20;

    @JsonProperty("trdAmount90")
    private BigDecimal trd_Amount_90;

    @JsonProperty("capBal")
    private BigDecimal cap_Bal;

    @JsonProperty("usableBal")
    private BigDecimal usable_bal;

    @JsonProperty("assetExt")
    private BigDecimal asset_Ext;

    @JsonIgnore
    public AssetInfoBean() {
    }

    @JsonIgnore
    public AssetInfoBean(String biz_Dt, BigDecimal total_Asset, BigDecimal net_Asset, BigDecimal total_Liab, BigDecimal stock_Asset, BigDecimal chrem_Asset, BigDecimal cash_Asset, BigDecimal in_Tian_Amt, BigDecimal other_Asset, BigDecimal asset_Info_20, BigDecimal trd_Amount_90, BigDecimal cap_Bal, BigDecimal usable_bal, BigDecimal asset_Ext) {
        this.biz_Dt = biz_Dt;
        this.total_Asset = total_Asset;
        this.net_Asset = net_Asset;
        this.total_Liab = total_Liab;
        this.stock_Asset = stock_Asset;
        this.chrem_Asset = chrem_Asset;
        this.cash_Asset = cash_Asset;
        this.in_Tian_Amt = in_Tian_Amt;
        this.other_Asset = other_Asset;
        this.asset_Info_20 = asset_Info_20;
        this.trd_Amount_90 = trd_Amount_90;
        this.cap_Bal = cap_Bal;
        this.usable_bal = usable_bal;
        this.asset_Ext = asset_Ext;
    }

    @JsonIgnore
    public String getBiz_Dt() {
        return biz_Dt;
    }

    @JsonIgnore
    public void setBiz_Dt(String biz_Dt) {
        this.biz_Dt = biz_Dt;
    }

    @JsonIgnore
    public BigDecimal getTotal_Asset() {
        return total_Asset;
    }

    @JsonIgnore
    public void setTotal_Asset(BigDecimal total_Asset) {
        this.total_Asset = total_Asset;
    }

    @JsonIgnore
    public BigDecimal getNet_Asset() {
        return net_Asset;
    }

    @JsonIgnore
    public void setNet_Asset(BigDecimal net_Asset) {
        this.net_Asset = net_Asset;
    }

    @JsonIgnore
    public BigDecimal getTotal_Liab() {
        return total_Liab;
    }

    @JsonIgnore
    public void setTotal_Liab(BigDecimal total_Liab) {
        this.total_Liab = total_Liab;
    }

    @JsonIgnore
    public BigDecimal getStock_Asset() {
        return stock_Asset;
    }

    @JsonIgnore
    public void setStock_Asset(BigDecimal stock_Asset) {
        this.stock_Asset = stock_Asset;
    }

    @JsonIgnore
    public BigDecimal getChrem_Asset() {
        return chrem_Asset;
    }

    @JsonIgnore
    public void setChrem_Asset(BigDecimal chrem_Asset) {
        this.chrem_Asset = chrem_Asset;
    }

    @JsonIgnore
    public BigDecimal getCash_Asset() {
        return cash_Asset;
    }

    @JsonIgnore
    public void setCash_Asset(BigDecimal cash_Asset) {
        this.cash_Asset = cash_Asset;
    }

    @JsonIgnore
    public BigDecimal getIn_Tian_Amt() {
        return in_Tian_Amt;
    }

    @JsonIgnore
    public void setIn_Tian_Amt(BigDecimal in_Tian_Amt) {
        this.in_Tian_Amt = in_Tian_Amt;
    }

    @JsonIgnore
    public BigDecimal getOther_Asset() {
        return other_Asset;
    }

    @JsonIgnore
    public void setOther_Asset(BigDecimal other_Asset) {
        this.other_Asset = other_Asset;
    }

    @JsonIgnore
    public BigDecimal getAsset_Info_20() {
        return asset_Info_20;
    }

    @JsonIgnore
    public void setAsset_Info_20(BigDecimal asset_Info_20) {
        this.asset_Info_20 = asset_Info_20;
    }

    @JsonIgnore
    public BigDecimal getTrd_Amount_90() {
        return trd_Amount_90;
    }

    @JsonIgnore
    public void setTrd_Amount_90(BigDecimal trd_Amount_90) {
        this.trd_Amount_90 = trd_Amount_90;
    }

    @JsonIgnore
    public BigDecimal getCap_Bal() {
        return cap_Bal;
    }

    @JsonIgnore
    public void setCap_Bal(BigDecimal cap_Bal) {
        this.cap_Bal = cap_Bal;
    }

    @JsonIgnore
    public BigDecimal getAsset_Ext() {
        return asset_Ext;
    }

    @JsonIgnore
    public void setAsset_Ext(BigDecimal asset_Ext) {
        this.asset_Ext = asset_Ext;
    }

    @JsonIgnore
    public BigDecimal getUsable_bal() {
        return usable_bal;
    }

    @JsonIgnore
    public void setUsable_bal(BigDecimal usable_bal) {
        this.usable_bal = usable_bal;
    }
}
