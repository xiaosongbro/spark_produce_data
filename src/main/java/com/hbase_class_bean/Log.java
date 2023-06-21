package com.hbase_class_bean;

import java.util.ArrayList;

public class Log {


    public static void main(String[] args) {
        A a = new A();
        a.getArrayList().add(a);
//        a.arrayList.add(a); 属性私有无法用
    }
}


class A {
       private  ArrayList arrayList = new ArrayList();

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
}


