package com.hbase_class_bean.edw;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class CustAssetInfoBean {

    //资金账号
    @JsonProperty("Asset_Acct")
    private String Asset_Acct;
    //业务类型代码
    @JsonProperty("Biz_Type_Cd")
    private String Biz_Type_Cd;
    //标签类型代码
    @JsonProperty("Label_Type_Cd")
    private String Label_Type_Cd;
    //标签类型值
    @JsonProperty("Label_Type_Val")
    private String Label_Type_Val;
    //备注
    @JsonProperty("Memo")
    private String Memo;
    //开始日期
    @JsonProperty("Start_Dt")
    private String Start_Dt;
    //结束日期
    @JsonProperty("End_Dt")
    private String End_Dt;

    @JsonIgnore
    public String getAsset_Acct() {
        return Asset_Acct;
    }
    @JsonIgnore
    public void setAsset_Acct(String asset_Acct) {
        Asset_Acct = asset_Acct;
    }
    @JsonIgnore
    public String getBiz_Type_Cd() {
        return Biz_Type_Cd;
    }
    @JsonIgnore
    public void setBiz_Type_Cd(String biz_Type_Cd) {
        Biz_Type_Cd = biz_Type_Cd;
    }
    @JsonIgnore
    public String getLabel_Type_Cd() {
        return Label_Type_Cd;
    }
    @JsonIgnore
    public void setLabel_Type_Cd(String label_Type_Cd) {
        Label_Type_Cd = label_Type_Cd;
    }
    @JsonIgnore
    public String getLabel_Type_Val() {
        return Label_Type_Val;
    }
    @JsonIgnore
    public void setLabel_Type_Val(String label_Type_Val) {
        Label_Type_Val = label_Type_Val;
    }
    @JsonIgnore
    public String getMemo() {
        return Memo;
    }
    @JsonIgnore
    public void setMemo(String memo) {
        Memo = memo;
    }
    @JsonIgnore
    public String getStart_Dt() {
        return Start_Dt;
    }
    @JsonIgnore
    public void setStart_Dt(String start_Dt) {
        Start_Dt = start_Dt;
    }
    @JsonIgnore
    public String getEnd_Dt() {
        return End_Dt;
    }
    @JsonIgnore
    public void setEnd_Dt(String end_Dt) {
        End_Dt = end_Dt;
    }
}
