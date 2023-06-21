package com.hbase_class_bean.edw.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.security.UserGroupInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;


public class BigdataDbUtil {
  private static final Logger LOG = LoggerFactory.getLogger(BigdataDbUtil.class);
  private static String hiveDriver = "org.apache.hive.jdbc.HiveDriver";
  private static String impalaDriver = "com.cloudera.impala.jdbc41.Driver";
  private static final char SPLIT_FIELD = (char) 1;
  private static final char SPLIT_LINE = (char) 10;

  /**
   * hive
   *
   * @return
   * @throws SQLException
   */
  public static Connection getConn() throws SQLException {
    loadDriverAndLogin(hiveDriver);
    String jdbcURL = "jdbc:hive2://10.1.67.128:21050/analytics;principal=sys_dw_etl/bdp-bat-master01.yhsys.com@YHSYS.COM";
    return DriverManager.getConnection(jdbcURL);
  }

  private static void loadDriverAndLogin(String driverName) {
    try {
      Class.forName(driverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    LOG.info("设置kerberos..");
    if (StringUtils.containsIgnoreCase(System.getProperty("os.name"), "windows")) {
      LOG.info("windows系统");
      System.setProperty("java.security.auth.login.config", "src\\main\\resources\\gss-jaas.conf");
      System.setProperty("sun.security.jgss.debug", "true");
      System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
      System.setProperty("java.security.krb5.conf", "src\\main\\resources\\krb5.conf");
    } else {
      try {
        File file = new File("/etc/sys_dw_etl.keytab");
        if (file.exists()) {
          LOG.info("使用系统的/etc/sys_dw_etl.keytab进行登录");
          UserGroupInformation.loginUserFromKeytab("sys_dw_etl@YHSYS.COM", "/etc/sys_dw_etl.keytab");
        } else {
          LOG.info("使用conf/sys_dw_etl.keytab进行登录");
          UserGroupInformation.loginUserFromKeytab("sys_dw_etl@YHSYS.COM", "conf/sys_dw_etl.keytab");
        }
        UserGroupInformation.getLoginUser();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * 连接hive 生产
   *
   * @param schema
   * @return
   * @throws SQLException
   */
  public static Connection getConn(String schema) throws SQLException {
    loadDriverAndLogin(hiveDriver);
    String jdbcURL = "jdbc:hive2://10.1.67.134:21050/" + schema
            + ";principal=impala/bdp-bat-worker04.yhsys.com@YHSYS.COM";
    return DriverManager.getConnection(jdbcURL);
  }

  /**
   * impala 生产
   *
   * @return
   * @throws SQLException
   */
  public static Connection getImpalaConn(String schema) throws SQLException {
    loadDriverAndLogin(impalaDriver);
    if (schema == null) {
      schema = "default";
    }
    String jdbcURL = "jdbc:impala://10.1.67.134:21050/" + schema
            + ";AuthMech=1;KrbRealm=YHSYS.COM;KrbHostFQDN=bdp-bat-worker04.yhsys.com;KrbServiceName=impala";
    return DriverManager.getConnection(jdbcURL);
  }

  public static void getColumnInfo(ResultSet rs) throws SQLException {
    ResultSetMetaData metaData = rs.getMetaData();
    int columnCount = metaData.getColumnCount();
    System.out.println("columnCount: " + columnCount);
    for (int i = 1; i <= columnCount; i++) {
      String columnName = metaData.getColumnName(i);
      String columnTypeName = metaData.getColumnTypeName(i);
      System.out.println(columnName + "----->" + columnTypeName);
    }
    rs.close();
  }

  public static String getPercentage(BigDecimal num) {
    NumberFormat nf = NumberFormat.getPercentInstance();
    nf.setMaximumFractionDigits(2);
    String ratio = nf.format(num);
    return ratio;
  }

 /* Comparator<DayRecord> comparator = new Comparator<DayRecord>(){
    public int compare(DayRecord d1, DayRecord d2) {

        int i = d1.getDay().compareTo(d2.getDay());
        return i;
      }
  };*/



  public static void main(String[] args) {
    String percentage = getPercentage(new BigDecimal("1011"));
    System.out.println(percentage);

  }
}
