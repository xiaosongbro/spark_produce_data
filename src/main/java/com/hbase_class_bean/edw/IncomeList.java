package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class IncomeList {
    @JsonProperty("profitList")
    private List<AccumulatedIncomeBean1> profitList = new ArrayList<AccumulatedIncomeBean1>();

    @JsonIgnore
    public List<AccumulatedIncomeBean1> getProfitList() {
        return profitList;
    }
    @JsonIgnore
    public void setProfitList(List<AccumulatedIncomeBean1> profitList) {
        this.profitList = profitList;
    }
}
