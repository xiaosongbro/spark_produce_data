package com.mockdata_bean;

import Utils.StringUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructType;

import java.text.ParseException;
import java.util.*;

import static Utils.DateUnits.getTIME_FORMAT;
import static org.datanucleus.NucleusContext.random;


public class MockData {

    public static void mock(JavaSparkContext sc, SparkSession spark) throws ParseException {
        List<Row> datalist = new ArrayList<Row>();
        String[] locations = new String[]{"鲁", "京", "京", "豫", "京", "京", "京", "晋", "陕", "云"};
        String date = getTIME_FORMAT();

        // 3000个车辆
        for (int i = 0; i < 3000; i++) {
            String car = locations[random.nextInt(10)] //地方
                    + (char) (65 + random.nextInt(26)) //随机大写字母
                    + StringUtils.fulfuill(5, random.nextInt(10000) + ""); //车牌数字

            String baseActionTime = date
                    + " "
                    + StringUtils.fulfuill(random.nextInt(24) + ""); //24小时制 ;

            for (int j = 0; j < (random.nextInt(300) + 1); j++) {

                //每个车辆每被30个摄像头拍摄后 时间上累计加1小时
                if (j % 30 == 0 & j != 0) {
                    baseActionTime = date
                            + " "
                            + StringUtils.fulfuill((Integer.parseInt(baseActionTime.split("")[1]) + 1) + "");
                }
                String areaId = StringUtils.fulfuill(2, random.nextInt(8) + 1 + "");
                String roadId = random.nextInt(50) + 1 + "";
                String monitorId = StringUtils.fulfuill(4, random.nextInt(9) + "");
                String cameraId = StringUtils.fulfuill(5, random.nextInt(1000) + "");
                String actionTime = baseActionTime
                        + ":"
                        + StringUtils.fulfuill(random.nextInt(60) + "")
                        + StringUtils.fulfuill(random.nextInt(60) + "");
                String speed = (random.nextInt(260) + 1) + "";

                Row row = RowFactory.create
                        (date, monitorId, cameraId, car, actionTime, speed, roadId, areaId);

                datalist.add(row);
            }
        }

        JavaRDD<Row> rowJavaRDD = sc.parallelize(datalist);

        StructType cameraFlowSchema = DataTypes.createStructType(Arrays.asList(
                DataTypes.createStructField("date", DataTypes.StringType, true),
                DataTypes.createStructField("monitorId", DataTypes.StringType, true),
                DataTypes.createStructField("cameraId", DataTypes.StringType, true),
                DataTypes.createStructField("car", DataTypes.StringType, true),
                DataTypes.createStructField("actionTime", DataTypes.StringType, true),
                DataTypes.createStructField("speed", DataTypes.StringType, true),
                DataTypes.createStructField("roadId", DataTypes.StringType, true),
                DataTypes.createStructField("areaId", DataTypes.StringType, true)

                )
        );

        Dataset<Row> ds = spark.createDataFrame(rowJavaRDD, cameraFlowSchema);
        System.out.println("打印车辆信息数据");
        ds.show();
        ds.registerTempTable("monitior_flow_action");


        // 卡口摄像头基本关系表
        Map<String, Set<String>> moitorAndCamers = new HashMap<>();

        int index = 0;
        System.out.println("================");
        System.out.println(datalist.size());

        for (Row row : datalist) {
            Set<String> sets = moitorAndCamers.get(row.getString(1));
            if (sets == null) {
                sets = new HashSet<>();
                moitorAndCamers.put((String) row.getString(1), sets);
            }
            index++;
            // 每隔1000条数据随机插入一条数据
            if (index % 1000 == 0) {
                sets.add(StringUtils.fulfuill(5, random.nextInt(100000) + ""));
            }
            String camerrId = row.getString(2);
            sets.add(camerrId);
        }
        datalist.clear();
        Set<Map.Entry<String, Set<String>>> entrySet = moitorAndCamers.entrySet();
        for (Map.Entry<String, Set<String>> entry : entrySet) {
            String monitor_id = entry.getKey();

            Set<String> sets1 = entry.getValue();
            Row row = null;
            for (String camera_id : sets1) {
                row = RowFactory.create(monitor_id, camera_id);
                datalist.add(row);
            }
        }

        StructType monitorSchema = DataTypes.createStructType(Arrays.asList(
                DataTypes.createStructField("monitor_id", DataTypes.StringType, true),
                DataTypes.createStructField("camera_id", DataTypes.StringType, true)
                )
        );

        rowJavaRDD = sc.parallelize(datalist);
        Dataset<Row> monitorDF = spark.createDataFrame(rowJavaRDD, monitorSchema);
        monitorDF.registerTempTable("monitor_camera_info");
        System.out.println("打印 卡口号对应的摄像头 数据 ---");
        monitorDF.show();
    }


    public static void main(String[] args) throws ParseException {

        SparkConf conf = new SparkConf().setAppName("test").setMaster("local");
        JavaSparkContext javaSparkContext = new JavaSparkContext(conf);
        SparkSession spark = SparkSession.builder()
                .master("local[*]")
                .appName("clear").getOrCreate();


        mock(javaSparkContext, spark);

        javaSparkContext.close();
        spark.close();
    }
}
