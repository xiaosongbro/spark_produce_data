import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class test {
    private static Random rand = new Random();

    public static void main(String[] args) throws IOException {

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("135");
        objects.add("187");
        objects.add("150");
        objects.add("180");

        FileWriter fileWriter = null;
        fileWriter = new FileWriter("D:\\test1.txt", true);//控制追加 覆盖
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int m = 0; m < objects.size() - 1; m++) {
            for (int i = 0; i < 11500; i++) {
                int flag = rand.nextInt(100000000);
                String acct = "" + rand.nextInt(1000000000);
                String id1 = "" + rand.nextInt(10000);
                String id2 = "" + rand.nextInt(10000);
                String id3 = "" + rand.nextInt(10000);
                String id4 = "" + rand.nextInt(10000);
                String id5 = "" + rand.nextInt(10000);
                String id6 = "" + rand.nextInt(10000);
                String id7 = "" + rand.nextInt(10000);

                String a = "" + flag;
                if (a.length() != 11) {
                    int b = 8 - a.length();
                    for (int j = 0; j < b; j++) {
                        a = a + "0";
                    }
                }
                String mmm = acct + "," + acct + "," + acct + "," + id1 + "," + id2 + "," + id3 + "," + id4 + "," + objects.get(0) + a + "," + objects.get(0) + a + "," + id5 + "," + id6 + "," + id7;

//                System.out.println(acct+","+acct+","+acct+","+id1+","+id2+","+id3+","+id4+","+objects.get(0)+a+","+objects.get(0)+a+","+id5+","+id6+","+id7);

                bufferedWriter.write(mmm);
                bufferedWriter.newLine();
            }

        }

        bufferedWriter.close();


    }
}
