package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class CustomerDyPositionPart2 {
    //Asset_Belong_Name STRING 资产归属名称
    @JsonProperty("assetBelongName")
    private String Asset_Belong_Name;

    //Belong_Subj_Id STRING 归属科目代码
    @JsonProperty("belongSubjId")
    private String Belong_Subj_Id;

    //Secu_Acct STRING 证券账户
    @JsonProperty("secuAcct")
    private String Secu_Acct;

    //Trade_Mrkt STRING 交易市场名称
    @JsonProperty("tradeMkt")
    private String Trade_Mrkt;

    //Trade_Board STRING 交易板块名称
    @JsonProperty("tradeBoard")
    private String Trade_Board;

    //Secu_Cd STRING 证券代码
    @JsonProperty("secuCode")
    private String Secu_Cd;

    //Secu_Type_Desc STRING 证券类别代码
    @JsonProperty("secuTypeDesc")
    private String Secu_Type_Desc;

    //Secu_Name STRING 证券名称
    @JsonProperty("secuName")
    private String Secu_Name;

    //Share_Bal DECIMAL(26,4) 持有余额
    @JsonProperty("shareBal")
    private BigDecimal Share_Bal;

    //Ref_Cost_Price DECIMAL(26,4) 参考成本价
    @JsonProperty("refCostPrice")
    private BigDecimal Ref_Cost_Price;

    //Ref_Cost DECIMAL(26,4) 参考成本
    @JsonProperty("refCost")
    private BigDecimal Ref_Cost;

    //Price DECIMAL(26,4) 期末市价
    @JsonProperty("price")
    private BigDecimal Price;

    //Mrkt_Val DECIMAL(26,4) 期末市值
    @JsonProperty("mktVal")
    private BigDecimal Mrkt_Val;

    //Ref_Prft_And_Loss DECIMAL(26,4) 参考盈亏
    @JsonProperty("refProfitAndLoss")
    private BigDecimal Ref_Prft_And_Loss;

    //Rmb_Mrkt_Val DECIMAL(26,4) 折人民币市值
    @JsonProperty("rmbMrktVal")
    private BigDecimal Rmb_Mrkt_Val;

    //Memo DECIMAL(26,4) 备注
    @JsonProperty("memo")
    private BigDecimal Memo;

    public String getAsset_Belong_Name() {
        return Asset_Belong_Name;
    }

    public void setAsset_Belong_Name(String asset_Belong_Name) {
        Asset_Belong_Name = asset_Belong_Name;
    }

    public String getBelong_Subj_Id() {
        return Belong_Subj_Id;
    }

    public void setBelong_Subj_Id(String belong_Subj_Id) {
        Belong_Subj_Id = belong_Subj_Id;
    }

    public String getSecu_Acct() {
        return Secu_Acct;
    }

    public void setSecu_Acct(String secu_Acct) {
        Secu_Acct = secu_Acct;
    }

    public String getTrade_Mrkt() {
        return Trade_Mrkt;
    }

    public void setTrade_Mrkt(String trade_Mrkt) {
        Trade_Mrkt = trade_Mrkt;
    }

    public String getTrade_Board() {
        return Trade_Board;
    }

    public void setTrade_Board(String trade_Board) {
        Trade_Board = trade_Board;
    }

    public String getSecu_Cd() {
        return Secu_Cd;
    }

    public void setSecu_Cd(String secu_Cd) {
        Secu_Cd = secu_Cd;
    }

    public String getSecu_Type_Desc() {
        return Secu_Type_Desc;
    }

    public void setSecu_Type_Desc(String secu_Type_Desc) {
        Secu_Type_Desc = secu_Type_Desc;
    }

    public String getSecu_Name() {
        return Secu_Name;
    }

    public void setSecu_Name(String secu_Name) {
        Secu_Name = secu_Name;
    }

    public BigDecimal getShare_Bal() {
        return Share_Bal;
    }

    public void setShare_Bal(BigDecimal share_Bal) {
        Share_Bal = share_Bal;
    }

    public BigDecimal getRef_Cost_Price() {
        return Ref_Cost_Price;
    }

    public void setRef_Cost_Price(BigDecimal ref_Cost_Price) {
        Ref_Cost_Price = ref_Cost_Price;
    }

    public BigDecimal getRef_Cost() {
        return Ref_Cost;
    }

    public void setRef_Cost(BigDecimal ref_Cost) {
        Ref_Cost = ref_Cost;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public BigDecimal getMrkt_Val() {
        return Mrkt_Val;
    }

    public void setMrkt_Val(BigDecimal mrkt_Val) {
        Mrkt_Val = mrkt_Val;
    }

    public BigDecimal getRef_Prft_And_Loss() {
        return Ref_Prft_And_Loss;
    }

    public void setRef_Prft_And_Loss(BigDecimal ref_Prft_And_Loss) {
        Ref_Prft_And_Loss = ref_Prft_And_Loss;
    }

    public BigDecimal getRmb_Mrkt_Val() {
        return Rmb_Mrkt_Val;
    }

    public void setRmb_Mrkt_Val(BigDecimal rmb_Mrkt_Val) {
        Rmb_Mrkt_Val = rmb_Mrkt_Val;
    }

    public BigDecimal getMemo() {
        return Memo;
    }

    public void setMemo(BigDecimal memo) {
        Memo = memo;
    }
}
