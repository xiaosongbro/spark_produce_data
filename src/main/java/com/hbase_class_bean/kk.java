package com.hbase_class_bean;

import Utils.DateUnits;
import Utils.StringUtils;

import java.text.ParseException;

import static org.datanucleus.NucleusContext.random;

public class kk {
    public static void main(String[] args) throws ParseException {
        System.out.println((char) (65 + random.nextInt(26)));
        System.out.println(random.nextInt(10000) + "");
        System.out.println(StringUtils.fulfuill(5, random.nextInt(10000) + ""));

    }
}
