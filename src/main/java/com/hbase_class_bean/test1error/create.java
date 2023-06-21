package com.hbase_class_bean.test1error;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class create {
    public static void main(String[] args) throws IOException {



        // 如果使用info类  就会多一个logList——key   把INFO属性 加到LogList里面

        // LogList和 date 和 stkQty 是同级的

        // logList是一个单独的集合 不是一个类 所以不能单独定义类
        getlog_comment("1","2","3","4");
        LogList logList = getlogList();
        logList.getLogList().add(getlog_comment("","2","3","4"));
        logList.getLogList().add(getlog_comment("1","2","3","4"));



        Info info = getInfo("1", "2", logList);

        String s = new ObjectMapper().writeValueAsString(info);

        System.out.println(s);
    }

    public static LogComment getlog_comment(String price, String side, String tradingtime, String volume){
        LogComment log_comment = new LogComment();

        log_comment.setPrice(price);
        log_comment.setSide(side);
        log_comment.setTradingTime(tradingtime);
        log_comment.setVolume(volume);
        return log_comment;
    }

    public static LogList getlogList(){
        return new LogList();
    }

    public static Info getInfo(String date, String stkoty, LogList logList){
        Info info = new Info();

        info.setLogList(logList);
        info.setDate(date);
        info.setStkQty(stkoty);

        return info;
    }
}
