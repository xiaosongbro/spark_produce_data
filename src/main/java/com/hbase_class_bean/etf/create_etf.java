package com.hbase_class_bean.etf;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class create_etf {
    public static void main(String[] args) throws IOException {

        ETFIndexDetailsPageList etfIndexDetailsPageList = new ETFIndexDetailsPageList();

        etfIndexDetailsPageList.setIndxCd("rs._1._1");
        etfIndexDetailsPageList.setBizDt("111");
        etfIndexDetailsPageList.setIndxCname("rs._1._3");
        etfIndexDetailsPageList.setIndxFlag("rs._1._4");

        etfIndexDetailsPageList.setIndxIntr("1");



        ETFIndexDetailsPage etfIndexDetailsPage = new ETFIndexDetailsPage();

        etfIndexDetailsPage.setFundCd("ine._1");
        etfIndexDetailsPage.setMrkt("ine._1");

        etfIndexDetailsPage.setFundNetDt("1111");

        etfIndexDetailsPageList.getDataList().add(etfIndexDetailsPage);

//        ArrayList arrayList = new ArrayList();
//        arrayList.add(etfIndexDetailsPage);
//        arrayList.add(etfIndexDetailsPage);
//        etfIndexDetailsPageList.setDataList(arrayList);

        String s = new ObjectMapper().writeValueAsString(etfIndexDetailsPageList);
        System.out.println(s);
    }
}
