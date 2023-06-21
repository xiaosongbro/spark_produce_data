package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class QWUserInfo implements Serializable {

    @JsonProperty("custName")
    private String custName;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("age")
    private BigDecimal age;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("stockExp")
    private BigDecimal stockExp;
    @JsonProperty("riskRatingCd")
    private String riskRatingCd;
    @JsonProperty("gradeCd")
    private String gradeCd;
    @JsonProperty("custId")
    private String custId;
    @JsonProperty("address")
    private HashMap<String,String> address;
    @JsonProperty("phoneTel")
    private HashMap<String,String> phoneTel;
    @JsonProperty("dataList")
    private List<FundAcctInfo> dataList = new ArrayList<FundAcctInfo>();

    @JsonIgnore
    public String getCustName() {
        return custName;
    }
    @JsonIgnore
    public void setCustName(String custName) {
        this.custName = custName;
    }
    @JsonIgnore
    public String getBirthday() {
        return birthday;
    }
    @JsonIgnore
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @JsonIgnore
    public BigDecimal getAge() {
        return age;
    }
    @JsonIgnore
    public void setAge(BigDecimal age) {
        this.age = age;
    }
    @JsonIgnore
    public String getGender() {
        return gender;
    }
    @JsonIgnore
    public void setGender(String gender) {
        this.gender = gender;
    }
    @JsonIgnore
    public BigDecimal getStockExp() {
        return stockExp;
    }
    @JsonIgnore
    public void setStockExp(BigDecimal stockExp) {
        this.stockExp = stockExp;
    }

    @JsonIgnore
    public String getRiskRatingCd() {
        return riskRatingCd;
    }
    @JsonIgnore
    public void setRiskRatingCd(String riskRatingCd) {
        this.riskRatingCd = riskRatingCd;
    }
    @JsonIgnore
    public String getGradeCd() {
        return gradeCd;
    }
    @JsonIgnore
    public void setGradeCd(String gradeCd) {
        this.gradeCd = gradeCd;
    }
    @JsonIgnore
    public String getCustId() {
        return custId;
    }
    @JsonIgnore
    public void setCustId(String custId) {
        this.custId = custId;
    }
    @JsonIgnore
    public HashMap<String, String> getAddress() {
        return address;
    }
    @JsonIgnore
    public void setAddress(HashMap<String, String> address) {
        this.address = address;
    }
    @JsonIgnore
    public HashMap<String, String> getPhoneTel() {
        return phoneTel;
    }
    @JsonIgnore
    public void setPhoneTel(HashMap<String, String> phoneTel) {
        this.phoneTel = phoneTel;
    }
    @JsonIgnore
    public List<FundAcctInfo> getDataList() {
        return dataList;
    }
    @JsonIgnore
    public void setDataList(List<FundAcctInfo> dataList) {
        this.dataList = dataList;
    }
}
