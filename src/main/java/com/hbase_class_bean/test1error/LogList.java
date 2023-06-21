package com.hbase_class_bean.test1error;


import java.util.ArrayList;


public class LogList {


    private ArrayList<LogComment> logList=new ArrayList<>(); // 一个LogComment集合

    public ArrayList<LogComment> getLogList() {
        return logList;
    }

    public void setLogList(ArrayList<LogComment> logList) {
        this.logList = logList;
    }
}
