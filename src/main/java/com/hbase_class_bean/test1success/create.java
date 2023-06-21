package com.hbase_class_bean.test1success;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class create {
    public static void main(String[] args) throws IOException {



        // 如果使用info类  就会多一个logList——key   把INFO属性 加到LogList里面
        // LogList和 date 和 stkQty 是同级的
        // 集合是不用单独创建一个类的

        getlog_comment("1","2","3","4");


        Info info = getlogList("1","2",getlog_comment("1","2","3","4"));

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

    public static Info getlogList(String date, String stkoty, LogComment logComment){
        Info info = new Info();
        info.setDate(date);
        info.getLogList().add(logComment);
        info.setStkQty(stkoty);
        return info;
    }
}
