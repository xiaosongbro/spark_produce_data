package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUnits {

    public static final SimpleDateFormat TIME_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd");

    public static final SimpleDateFormat DATE_KEY_FORMAT =
            new SimpleDateFormat("yyyyMMdd");

    public static String getTIME_FORMAT() {
        return TIME_FORMAT.format(new Date());
    }

    public static String getDATE_FORMAT() {
        return DATE_FORMAT.format(new Date());
    }

    public static String getDATE_KEY_FORMAT() {
        return DATE_KEY_FORMAT.format(new Date());
    }

    public static void getToDayDate(String InDateString,String InDateFormat) throws ParseException {

        /*  parse()返回的是一个Date类型数据，
            parse方法可以把String型的字符串转换成特定格式的date类型，
            使用parse时字符串长度要和定义的SimpleDateFormat对象长度一致
            这种格式(Sun Jan 29 22:26:23 GMT+08:00 2012)
        */

        SimpleDateFormat ft = new SimpleDateFormat(InDateFormat);
        Date date2= ft.parse(InDateString);
        System.out.println(date2);

        /* format返回的是一个StringBuffer类型的数据
           format方法可以把Date型的字符串转换成特定格式的String类型，
           如果Date类型和定义的SimpleDateFormat长度不一致会自动在后面补充0
        */
        String nowDate = ft.format(new Date());
        System.out.println(nowDate);
    }


    //字符串时间类型互相转换
    public static String DateFormatTran(String inFormat ,String inDateString ,String outFormat) throws BizException {
        try {
            Date format = null;
            format = new SimpleDateFormat(inFormat).parse(inDateString);
            String shortDate = new SimpleDateFormat(outFormat).format(format);
            return shortDate;
        } catch (ParseException e) {
            throw new BizException("转换异常");
        }
    }

    // yyyy-MM-dd格式时间字符串转为时间戳
    public static String dateToStamp(String dateFormat,String dateString) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Date date = simpleDateFormat.parse(dateString);
        // 除以1000精度为秒
        long ts = date.getTime()/1000;
        res = String.valueOf(ts);
        return res;
    }

    // 时间戳字符串转yyyy-MM-dd
    public static String stampToDate(String dateFormat,String stamp){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        long lt = new Long(stamp);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
}
