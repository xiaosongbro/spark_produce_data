package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by junxiang on 2022/11/24 15:14
 */
public class IncomeListTest {
    @JsonProperty("profitList")
    private List<AccumulatedIncome> profitList = new ArrayList<AccumulatedIncome>();

    @JsonIgnore
    public List<AccumulatedIncome> getProfitList() {
        return profitList;
    }
    @JsonIgnore
    public void setProfitList(List<AccumulatedIncome> profitList) {
        this.profitList = profitList;
    }
}
