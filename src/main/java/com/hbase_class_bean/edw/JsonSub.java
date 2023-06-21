package com.hbase_class_bean.edw;


import com.alibaba.fastjson.JSONObject;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JsonSub extends UDF {
    public static void main(String[] args) {
        String a = "{\"ETF\":\"1\",\"封闭式基金\":\"1\",\"公募基金\":\"1\"}";
        String b = "{\"封闭式基金\":\"1\",\"资管产品\":\"1\",\"资管现金产品\":\"1\"}";
        String json = evaluate(a, b);

        System.out.println(json);

    }
    public static String evaluate(String str1, String str2) {

        if(str1==null&&str2==null){
            return null;
        }
        if(str2==null&&str1!=null){
            return str1;
        }
        if(str1==null&&str2!=null){
            return str2;
        }
        JSONObject s1 = JSONObject.parseObject(str1);
        JSONObject s2 = JSONObject.parseObject(str2);
        System.out.println(s2);

        Set<String> m1 = s1.keySet();
        Set<String> m2 = s2.keySet();

        Set<String> m3 = new HashSet<>();
        m3.addAll(m1);
        m3.addAll(m2);
        StringBuffer sb = new StringBuffer();
        HashMap<String, Object> map = new HashMap<>();
        for (String key : m3) {
            if (m1.contains(key) && m2.contains(key)) {
                Object o = s1.get(key);
                Object o1 = s2.get(key);
                int i = Integer.parseInt(o.toString()) + Integer.parseInt(o1.toString());
                map.put(key,i);
                continue;
            }
            if (m1.contains(key)) {
                map.put(key,s1.get(key));
            }
            if (m2.contains(key)) {
                map.put(key,s2.get(key));

            }
        }
        JSONObject jsonObject = new JSONObject(map);
        String s = jsonObject.toJSONString();
        return s;
    }

}
