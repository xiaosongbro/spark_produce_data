package com.hbase_class_bean.test1error;


public class Info {

    private String date;
    private String stkQty;
    private LogList logList; // 一个 LogList对象

    public LogList getLogList() {
        return logList;
    }

    public void setLogList(LogList logList) {
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
