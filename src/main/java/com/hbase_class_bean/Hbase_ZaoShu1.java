package com.hbase_class_bean;

import Utils.BizException;
import Utils.DateUnits;
import Utils.StringUtils;
import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;
import java.util.Date;

import static Utils.DateUnits.*;
import static org.datanucleus.NucleusContext.random;

public class Hbase_ZaoShu1 {


    public String getrowkey(String acct_asset, String mark_id, String date, String rownum) {
        String acct_asset2 = acct_asset.charAt(acct_asset.length() - 2) + "" + acct_asset.charAt(acct_asset.length() - 1);
        String mark_id2 = mark_id.charAt(mark_id.length() - 2) + "" + mark_id.charAt(mark_id.length() - 1);
        String random_num = 0 + "" + random.nextInt(2);
        return acct_asset2 + acct_asset + random_num + mark_id + date + random_num;
    }


    public String get_put_commond1(String acct_asset, String mark_id, String date, String rownum) throws BizException {
        String c1 = "put 'his_trade_info',";
        String c2 = ",'info:rownum',";
        return c1 + "\'" + getrowkey(acct_asset, mark_id, DateUnits.DateFormatTran("",date,""), rownum) + "\'" + c2 + rownum;
    }

    public String get_put_commond2(String acct_asset, String mark_id, String date, String rownum, String volume) throws ParseException, BizException {
        String c1 = "put 'his_trade_info',";
        String info_s = ",'info:val','";
        String info_e = "\'";
        int stkQty_tem = random.nextInt(10000);
        String stkQty = StringUtils.four(stkQty_tem);

        String str = "{\"" + "date" + "\"" + ":" + "\"" + date + "\"," + "\"" + "stkQty" + "\":" + "\"" + stkQty + "\"," + "\"";
        String logList_s = "logList[";
        String logList_e = "]";
        String loglist_comment = "";
        if (Integer.parseInt(rownum) > 1) {
            for (int i = 1; i < Integer.parseInt(rownum); i++) {
                int price_tem = random.nextInt(100);
                int side = random.nextInt(2);
                String price = StringUtils.five(price_tem);
                String tradingTime = dateToStamp("yyyy-MM-dd",date);
                loglist_comment = "{"
                        + "\""
                        + "price" + "\":" + price + "\""
                        + ",\"side\":" + "\"" + side + "\""
                        + ",\"tradingTime\":" + "\"" + tradingTime + "\""
                        + ",\"volume\":" + "\"" + volume + "\""
                        + "}";
                loglist_comment += loglist_comment;
            }
        }
        return c1 + "\'" + getrowkey(acct_asset, mark_id, DateUnits.DateFormatTran("",date,""), rownum) + "\'" + info_s + str + logList_s + loglist_comment + logList_e + "}" + info_e;


    }

    public static void test() {
        JSONObject jsonObj = new JSONObject();
//            Map<String, String> ingredients = new HashMap<String, String>();

        jsonObj.put("project", "nio_business_prod");

        jsonObj.put("sugar", "1kg");

        jsonObj.put("pastry", "2.4kg");

        jsonObj.put("bestEaten", "outdoors");

        System.out.println(jsonObj);


        String json_to_string = JSONObject.toJSONString(jsonObj);

        System.out.println(json_to_string);

    }

    public static void main(String[] args) throws ParseException, BizException {
/*        Hbase_ZaoShu1 hbase_zaoshu = new Hbase_ZaoShu1();
        System.out.println(hbase_zaoshu.get_put_commond1("1653032985", "110059", "2023-05-08 9:55:00", "2"));
        System.out.println(hbase_zaoshu.get_put_commond2("1653032985", "110059", "2023-05-08 9:55:00", "2", "5000"));

        test();*/




        System.out.println(new Date().getTime());
        long time = new Date().getTime()/1000;

        System.out.println(new Date().getTime());
        System.out.println(time);
        System.out.println(new Date());

        System.out.println(
                getTIME_FORMAT()+","+ getDATE_FORMAT()+","+ getDATE_KEY_FORMAT());

        getToDayDate("2023-06-06","yyyy-MM-dd");

        System.out.println(DateFormatTran("yyyyMMdd", "20230606", "yyyy-MM-dd HH:mm:ss"));

    }
}

