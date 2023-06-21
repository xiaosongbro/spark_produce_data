package com.hbase_class_bean.edw.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


public class DbHelper {
    /**
     * 获取股票代码的中文名 stockcode-mktcode
     *
     * @return
     */
    public static HashMap getStkNameMap(Connection conn) {
//    Connection conn = null;
        HashMap<String, String> stkNameMap = new HashMap<String, String>(20000);

        try {
//      conn = BigdataDbUtil.getImpalaConn("cgs_edw");
            PreparedStatement pstmt = conn.prepareStatement("SELECT concat_ws('-',stk_code,trd_mkt_code) stk,sec_name\n" +
                    "FROM (select sec_name,stk_code,\n" +
                    "CASE trd_mkt_code\n" +
                    "when 'SHA' then '2'\n" +
                    "when 'SZA' THEN '1'\n" +
                    "END trd_mkt_code \n" +
                    "from cgs_edw.prd_invest_product\n" +
                    "where \n" +
                    "trd_mkt_code in ('SHA','SZA')\n" +
                    ")RES\n" +
                    "--WHERE trd_mkt_code='1'\n" +
                    ";");
            ResultSet set = pstmt.executeQuery();
            while (set.next()) {
                String stk = set.getString("stk");
                String secName = set.getString("sec_name");
                stkNameMap.put(stk, secName);
            }
            set.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stkNameMap;
    }

    /**
     * 获取基金的中文名称
     *
     * @param conn
     * @return
     */
    public static HashMap getFundNameMap(Connection conn) {
        HashMap<String, String> fundNameMap = new HashMap<>(20000);
        try {
//      conn = BigdataDbUtil.getImpalaConn("cgs_edw");
            PreparedStatement pstmt = conn.prepareStatement("SELECT stk_code,sec_name\n" +
                    "FROM cgs_edw.prd_invest_product WHERE trd_mkt_code='OF'");
            ResultSet set = pstmt.executeQuery();
            while (set.next()) {
                String stkCode = set.getString("stk_code");
                String secName = set.getString("sec_name");
                fundNameMap.put(stkCode, secName);
            }
            set.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fundNameMap;
    }

    /**
     * 从impala中查询出交易日的日期
     *
     * @param lstBizDate
     * @param daysNum
     * @param sql
     * @return
     */
//	public static HashSet<String> getBizDate(Integer lstBizDate, Integer daysNum, String sql) {
//		//select date_code,row_number() over(order by date_code) from d_date where date_code >= 20180101 and trd_daily_flag='1';
//		//trd_daily_flag
//		HashSet<String> hashSet = new HashSet<>();
//		try {
//			Connection conn = BigdataDbUtil.getConn("dim");
//			//TODO 暂时按年查询
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, lstBizDate);
//			pstmt.setInt(2,daysNum);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				String dateCode = rs.getString("date_code");
////        String secName = rs.getString("sec_name");
//				hashSet.add(dateCode);
//			}
//			rs.close();
//			pstmt.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return hashSet;
//	}
    public static Integer getBizDate(Integer lstBizDate, Integer daysNum, String sql) {
        //select date_code,row_number() over(order by date_code) from d_date where date_code >= 20180101 and trd_daily_flag='1';
        //trd_daily_flag
        Integer dateCode = 0;
        try {
            Connection conn = BigdataDbUtil.getConn("dim");
            //TODO 暂时按年查询
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, lstBizDate);
            pstmt.setInt(2, daysNum);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                dateCode = rs.getInt(1);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dateCode;
    }

    public static String getMaxBizDate(String custNo, String sql) {
        Integer dateCode = 0;
        try {
            Connection conn = BigdataDbUtil.getConn("cgs_prf");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, custNo);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                dateCode = rs.getInt(2);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dateCode.toString();
    }

    /**
     *
     * @param year 2019 2020
     * @param sql
     * @return
     */
    public static Integer getBizDate2(Integer year, String sql) {
        //select date_code,row_number() over(order by date_code) from d_date where date_code >= 20180101 and trd_daily_flag='1';
        //trd_daily_flag
        Integer date_code = 0;
        try {
            Connection conn = BigdataDbUtil.getConn("cgs_mart");
            //TODO 暂时按年查询
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, year);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                date_code = rs.getInt(1);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return date_code;
    }


    public static Integer getBizDate3(Integer year, Integer month,String sql) {
        //select date_code,row_number() over(order by date_code) from d_date where date_code >= 20180101 and trd_daily_flag='1';
        //trd_daily_flag
        Integer date_code = 0;
        try {
            Connection conn = BigdataDbUtil.getConn("cgs_mart");
            //TODO 暂时按年查询
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, year);
            pstmt.setInt(2,month);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                date_code = rs.getInt(1);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return date_code;
    }

    public static Boolean isTrdDay(String dt) {
        String flag = null;
        String trdFlag = "1";
        try {
            Connection conn = BigdataDbUtil.getImpalaConn("cgs_edw");
            PreparedStatement pstmt = conn.prepareStatement("select trd_daily_flag" +
                    " from cgs_mart.d_date" +
                    " where date_code=? --and trd_daily_flag='1'");
            pstmt.setInt(1, Integer.parseInt(dt));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                flag = rs.getString("trd_daily_flag");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (trdFlag.equals(flag)) {
            return true;
        } else {
            return false;
        }
    }
}

