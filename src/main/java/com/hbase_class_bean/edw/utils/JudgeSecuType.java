package com.hbase_class_bean.edw.utils;


import java.util.HashMap;

public class JudgeSecuType {
    // 判断证券类型
    private static HashMap<String,String> map;

    static {
        map = new HashMap<String, String>();
        map.put("S00","AG");
        map.put("S10","AG");
        map.put("S30","AG");
        map.put("S36","AG");
        map.put("S37","AG");
        map.put("B91","ZQ");
        map.put("B72","ZQ");
        map.put("B61","ZQ");
        map.put("B51","ZQ");
        map.put("B43","ZQ");
        map.put("B33","ZQ");
        map.put("B32","ZQ");
        map.put("B31","ZQ");
        map.put("B30","ZQ");
        map.put("B20","ZQ");
        map.put("B12","ZQ");
        map.put("B10","ZQ");
        map.put("B00","ZQ");
    }
    public HashMap<String, String> getMap() {
        // AG ==> A股    ZQ ==> 债券
        return map;
    }

//    public void setMap(HashMap<String, String> map) {
//
//    }
}
