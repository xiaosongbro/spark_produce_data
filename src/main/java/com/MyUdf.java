package com;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyUdf extends GenericUDF {

// 初始化方法
    @Override
    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        if(objectInspectors.length != 1){
            throw new UDFArgumentException("参数长度不正确");
        }
        if(!objectInspectors[0].getCategory().equals(ObjectInspector.Category.PRIMITIVE)){
            throw new UDFArgumentTypeException(0,"参数类型不正确");
        }
        return PrimitiveObjectInspectorFactory.javaStringObjectInspector;
    }

    // 计算方法
    @Override
    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        if(deferredObjects[0].get()==null){
            return "";
        }
        String data = deferredObjects[0].get().toString();
        int index = data.indexOf('?');
        if (index>0){
            data  = data.substring(0);

        }
        if (data.startsWith("https://")){
            data= data.replaceFirst("https://","http://");

        }
        return  new Text(data.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String getDisplayString(String[] strings) {
        return "";
    }

    public static void main(String[] args) {
        MyUdf myudf = new MyUdf();
        try (MyUdf myUdf = myudf) {
            System.out.println("message Error");
        } catch (IOException e) {
        }

    }
}
