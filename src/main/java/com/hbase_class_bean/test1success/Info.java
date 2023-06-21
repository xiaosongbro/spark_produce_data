package com.hbase_class_bean.test1success;


import java.util.ArrayList;

public class Info {

    private String date;
    private String stkQty;
    private ArrayList<LogComment> logList=new ArrayList<>(); // 一个 ArrayList对象

    public ArrayList<LogComment> getLogList() {
        return logList;
    }

    public void setLogList(ArrayList<LogComment> logList) {
        this.logList = logList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStkQty() {
        return stkQty;
    }

    public void setStkQty(String stkQty) {
        this.stkQty = stkQty;
    }


}
