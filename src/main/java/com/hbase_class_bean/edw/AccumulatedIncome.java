package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;


public class AccumulatedIncome {

//    @JsonProperty("fundacct")
//    private String fundacct;
//    @JsonProperty("fundbreed")
//    private String fundbreed;

    @JsonProperty("date")
    private String date;
    @JsonProperty("accuprofit")
    private String accuprofit;

    @JsonIgnore
    public String getDate() {
        return date;
    }

    @JsonIgnore
    public void setDate(String date) {
        this.date = date;
    }

    @JsonIgnore
    public String getAccuprofit() {
        return accuprofit;
    }

    @JsonIgnore
    public void setAccuprofit(String accuprofit) {
        this.accuprofit = accuprofit;
    }

}
