package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class HisTradeInfoPart2 implements Comparable<HisTradeInfoPart2>{

    //stkqty   string   证券持仓数量
    @JsonIgnore
    private String stkqty;
    //price    decimal(26,5)  成交价格
    @JsonProperty("price")
    private String price;
    //side   int   买卖标识
    @JsonProperty("side")
    private String side;
    //tradingtime    string   成交时间戳
    @JsonProperty("tradingTime")
    private String tradingTime;
    //volume   decimal(26,0)  成交数量
    @JsonProperty("volume")
    private String volume;
    @JsonIgnore
    public String getStkqty() {
        return stkqty;
    }
    @JsonIgnore
    public void setStkqty(String stkqty) {
        this.stkqty = stkqty;
    }
    @JsonIgnore
    public String getPrice() {
        return price;
    }
    @JsonIgnore
    public void setPrice(String price) {
        this.price = price;
    }
    @JsonIgnore
    public String getSide() {
        return side;
    }
    @JsonIgnore
    public void setSide(String side) {
        this.side = side;
    }
    @JsonIgnore
    public String getTradingTime() {
        return tradingTime;
    }
    @JsonIgnore
    public void setTradingTime(String tradingTime) {
        this.tradingTime = tradingTime;
    }
    @JsonIgnore
    public String getVolume() {
        return volume;
    }
    @JsonIgnore
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public int compareTo(HisTradeInfoPart2 o) {
        return this.tradingTime.compareTo(o.tradingTime);
    }
}
