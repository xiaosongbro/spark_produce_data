package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CustomerDyPositionPart1 {

    //cap_acct STRING 资金账户
    @JsonProperty("fundAcct")
    private String cap_acct;

    //biz_dt STRING 业务日期
    @JsonProperty("bizDt")
    private int biz_dt;

    //curr_name STRING 币种名称
    @JsonProperty("currency")
    private String curr_name;

    //acct_cate_cd STRING 信用账户标志
    @JsonProperty("acctCate")
    private String acct_cate_cd;

    //totalShareBal DECIMAL(26,2) 股份余额-合计
    @JsonProperty("totalShareBal")
    private BigDecimal totalShareBal;

    //totalMktVal DECIMAL(26,2) 期末市值-合计
    @JsonProperty("totalMktVal")
    private BigDecimal totalMktVal;

    //totalProfitAndLoss DECIMAL(26,2) 参考盈亏-合计
    @JsonProperty("totalProfitAndLoss")
    private BigDecimal totalProfitAndLoss;

    //posList 持仓列表
    @JsonProperty("posList")
    private ArrayList<CustomerDyPositionPart2> posList;

    public String getCap_acct() {
        return cap_acct;
    }

    public void setCap_acct(String cap_acct) {
        this.cap_acct = cap_acct;
    }

    public int getBiz_dt() {
        return biz_dt;
    }

    public void setBiz_dt(int biz_dt) {
        this.biz_dt = biz_dt;
    }

    public String getCurr_name() {
        return curr_name;
    }

    public void setCurr_name(String curr_name) {
        this.curr_name = curr_name;
    }

    public String getAcct_cate_cd() {
        return acct_cate_cd;
    }

    public void setAcct_cate_cd(String acct_cate_cd) {
        this.acct_cate_cd = acct_cate_cd;
    }

    public BigDecimal getTotalShareBal() {
        return totalShareBal;
    }

    public void setTotalShareBal(BigDecimal totalShareBal) {
        this.totalShareBal = totalShareBal;
    }

    public BigDecimal getTotalMktVal() {
        return totalMktVal;
    }

    public void setTotalMktVal(BigDecimal totalMktVal) {
        this.totalMktVal = totalMktVal;
    }

    public BigDecimal getTotalProfitAndLoss() {
        return totalProfitAndLoss;
    }

    public void setTotalProfitAndLoss(BigDecimal totalProfitAndLoss) {
        this.totalProfitAndLoss = totalProfitAndLoss;
    }

    public ArrayList<CustomerDyPositionPart2> getPosList() {
        return posList;
    }

    public void setPosList(ArrayList<CustomerDyPositionPart2> posList) {
        this.posList = posList;
    }
}
