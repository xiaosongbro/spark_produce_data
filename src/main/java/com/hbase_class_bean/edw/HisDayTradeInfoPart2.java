package com.hbase_class_bean.edw;


import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Objects;

public class HisDayTradeInfoPart2 {

    //fundacct string   资金账号
    @JsonIgnore
    private String fundacct;
    //stkqty   string   证券持仓数量
    @JsonProperty("stkQty")
    private String stkqty;
    //status_num    string  交易状态映射码
    @JsonProperty("status")
    private String status_num;
    //prod_no  string   产品代码
    @JsonProperty("stkCode")
    private String prod_no;
    //trade_mrkt     string   市场
    @JsonProperty("market")
    private String trade_mrkt;
    @JsonIgnore
    public String getFundacct() {
        return fundacct;
    }
    @JsonIgnore
    public void setFundacct(String fundacct) {
        this.fundacct = fundacct;
    }
    @JsonIgnore
    public String getStkqty() {
        return stkqty;
    }
    @JsonIgnore
    public void setStkqty(String stkqty) {
        this.stkqty = stkqty;
    }
    @JsonIgnore
    public String getStatus_num() {
        return status_num;
    }
    @JsonIgnore
    public void setStatus_num(String status_num) {
        this.status_num = status_num;
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

    @Override
    public int hashCode() {
        //return super.hashCode();
        return Objects.hash(fundacct,prod_no);
    }

    @Override
    public boolean equals(Object obj) {
        //return super.equals(obj);
        if (obj == this){
            return true;
        }
        if(!(obj instanceof HisDayTradeInfoPart2)){
            return false;
        }
        HisDayTradeInfoPart2 stkDayTradeInfoPart2 = (HisDayTradeInfoPart2)obj;
        return Objects.equals(fundacct,stkDayTradeInfoPart2.fundacct)
                && Objects.equals(prod_no,stkDayTradeInfoPart2.prod_no);
    }
}
