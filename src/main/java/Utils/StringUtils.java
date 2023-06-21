package Utils;

import java.text.DecimalFormat;

public class StringUtils {
    public static String fulfuill(int num, String str){
        if (str.length() == num){
            return str;
        }
        else {
            int fulNum = num-str.length();
            String tmpStr = "";
            for (int i = 0; i < fulNum; i++) {
                tmpStr+="0";
            }
            return tmpStr+str;
        }
    }
    // 重载
    public static String  fulfuill(String str){
        if (str.length() == 1) {
            return "0"+str;
        }
        return str;
    }

    //保留四位小数
    public static String four(double d) {
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println(df.format(d));
        return df.format(d);
    }
    public static String five(double d) {
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.println(df.format(d));
        return df.format(d);
    }
}
