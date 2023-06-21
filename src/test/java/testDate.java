import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDate {
    public static void main(String[] args) throws ParseException {
        Date date1 = null;
        String s1 = "2012-01-29-22-26-23";
        String pattern = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
        date1 = sdf1.parse(s1);
        System.out.println("------自定义格式Date的parse------");
        System.out.println("      " + date1);


    }
}
