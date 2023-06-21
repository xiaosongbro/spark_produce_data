import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {


        // 该类按字符读取流中数据   (字符输入流)
        FileReader fileReader1 = null;

        FileReader fileReader2 = null;
        fileReader1 = new FileReader("D:\\test2.txt");
        fileReader2 = new FileReader("D:\\test1.txt");


        FileWriter fileWriter = null;
        fileWriter = new FileWriter("D:\\test3.txt", true);//控制追加 覆盖
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        String line; // 按行读取
        String line1;
        while ((line = bufferedReader1.readLine()) != null && (line1 = bufferedReader2.readLine()) != null) {
            System.out.println(line+","+line1);

            bufferedWriter.write(line+","+line1);
            bufferedWriter.newLine();

        }
        bufferedReader1.close();
        bufferedReader2.close();
        bufferedWriter.close();
    }
}