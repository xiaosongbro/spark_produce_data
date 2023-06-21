package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;


public class BlackWhiteList1 {
    @JsonProperty("")
    private String flag;

    @JsonIgnore
    public String getFlag() {
        return flag;
    }

    @JsonIgnore
    public void setFlag(String flag) {
        this.flag = flag;
    }
}
