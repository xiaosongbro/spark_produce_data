package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;


public class EmpRelaInfo implements Serializable {
    @JsonProperty("empId")
    private String empId;
    @JsonProperty("rela")
    private String rela;

    @JsonIgnore
    public String getEmpId() {
        return empId;
    }
    @JsonIgnore
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    @JsonIgnore
    public String getRela() {
        return rela;
    }
    @JsonIgnore
    public void setRela(String rela) {
        this.rela = rela;
    }
}
