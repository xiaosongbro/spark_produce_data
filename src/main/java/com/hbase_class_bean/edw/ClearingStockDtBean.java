package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

public class ClearingStockDtBean {
    //asset_acct String 资金账号
    @JsonProperty("assetAcct")
    private String asset_acct;
    //data_label String 数据标签
    @JsonProperty("dataLabel")
    private String data_label;
    //acct_flag String 账户标志
    @JsonProperty("acctFlag")
    private String acct_flag;
    //prod_name String 股票名称
    @JsonProperty("stkName")
    private String prod_name;
    //prod_desc String 股票名称简拼
    @JsonProperty("prodDesc")
    private String prod_desc;
    //prod_no String 股票代码
    @JsonProperty("stkCode")
    private String prod_no;
    //trade_mrkt String 交易市场
    @JsonProperty("market")
    private String trade_mrkt;
    //trade_board String 交易板块
    @JsonProperty("tradeBoard")
    private String trade_board;
    //totalProfitLoss DECIMAL(26,4) 累计盈亏
    @JsonProperty("totalProfitLoss")
    private BigDecimal totalProfitLoss;
    //totalcost DECIMAL(26,4) 累计成本
    @JsonProperty("totalcost")
    private BigDecimal totalcost;
    //profitlossbl DECIMAL(26,4) 累计盈亏比例
    @JsonProperty("profitlossbl")
    private BigDecimal profitlossbl;
    //winratio DECIMAL(10,4) 胜率
    @JsonProperty("winRatio")
    private BigDecimal winratio;
    //posCount DECIMAL(10,0) 持仓总期数
    @JsonProperty("posCount")
    private BigDecimal posCount;
    //buyCount DECIMAL(26,0) 买入次数
    @JsonProperty("buyCount")
    private BigDecimal buyCount;
    //sellCount DECIMAL(26,0) 卖出次数
    @JsonProperty("sellCount")
    private BigDecimal sellCount;
    //totalPosDays DECIMAL(26,0) 总持仓天数
    @JsonProperty("totalPosDays")
    private BigDecimal totalPosDays;
    //clearDate STRING 最后清仓日期
    @JsonProperty("clearDate")
    private String clearDate;
    //regular String 用作 股票名称、股票简称、股票代码的模糊匹配
    @JsonProperty("regular")
    private String regular;
    //status String 状态
    @JsonProperty("status")
    private String status;

    @JsonIgnore
    public String getAsset_acct() {
        return asset_acct;
    }
    @JsonIgnore
    public void setAsset_acct(String asset_acct) {
        this.asset_acct = asset_acct;
    }
    @JsonIgnore
    public String getData_label() {
        return data_label;
    }
    @JsonIgnore
    public void setData_label(String data_label) {
        this.data_label = data_label;
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
    public String getProd_name() {
        return prod_name;
    }
    @JsonIgnore
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    @JsonIgnore
    public String getProd_desc() {
        return prod_desc;
    }
    @JsonIgnore
    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }
    @JsonIgnore
    public String getProd_no() {
        return prod_no;
    }
    @JsonIgnore
    public void setProd_no(String prod_no) {
        this.prod_no = prod_no;
    }
    @JsonIgnore
    public String getTrade_mrkt() {
        return trade_mrkt;
    }
    @JsonIgnore
    public void setTrade_mrkt(String trade_mrkt) {
        this.trade_mrkt = trade_mrkt;
    }
    @JsonIgnore
    public String getTrade_board() {
        return trade_board;
    }
    @JsonIgnore
    public void setTrade_board(String trade_board) {
        this.trade_board = trade_board;
    }
    @JsonIgnore
    public BigDecimal getTotalProfitLoss() {
        return totalProfitLoss;
    }
    @JsonIgnore
    public void setTotalProfitLoss(BigDecimal totalProfitLoss) {
        this.totalProfitLoss = totalProfitLoss;
    }
    @JsonIgnore
    public BigDecimal getTotalcost() {
        return totalcost;
    }
    @JsonIgnore
    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }
    @JsonIgnore
    public BigDecimal getProfitlossbl() {
        return profitlossbl;
    }
    @JsonIgnore
    public void setProfitlossbl(BigDecimal profitlossbl) {
        this.profitlossbl = profitlossbl;
    }
    @JsonIgnore
    public BigDecimal getWinratio() {
        return winratio;
    }
    @JsonIgnore
    public void setWinratio(BigDecimal winratio) {
        this.winratio = winratio;
    }
    @JsonIgnore
    public BigDecimal getPosCount() {
        return posCount;
    }
    @JsonIgnore
    public void setPosCount(BigDecimal posCount) {
        this.posCount = posCount;
    }
    @JsonIgnore
    public BigDecimal getBuyCount() {
        return buyCount;
    }
    @JsonIgnore
    public void setBuyCount(BigDecimal buyCount) {
        this.buyCount = buyCount;
    }
    @JsonIgnore
    public BigDecimal getSellCount() {
        return sellCount;
    }
    @JsonIgnore
    public void setSellCount(BigDecimal sellCount) {
        this.sellCount = sellCount;
    }
    @JsonIgnore
    public BigDecimal getTotalPosDays() {
        return totalPosDays;
    }
    @JsonIgnore
    public void setTotalPosDays(BigDecimal totalPosDays) {
        this.totalPosDays = totalPosDays;
    }
    @JsonIgnore
    public String getClearDate() {
        return clearDate;
    }
    @JsonIgnore
    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }
    @JsonIgnore
    public String getRegular() {
        return regular;
    }
    @JsonIgnore
    public void setRegular(String regular) {
        this.regular = regular;
    }
    @JsonIgnore
    public String getStatus() {
        return status;
    }
    @JsonIgnore
    public void setStatus(String status) {
        this.status = status;
    }
}
