package cn.jsp.datasource.druid;

import cn.jsp.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {
        /**
         * 完成添加操作，给account表添加一条记录
         */

        Connection conn = null;
        PreparedStatement pstmt = null;

        {
            try {
                //1，获取连接
                conn = JDBCUtils.getConnection();
                //2,定义sql
                String sql = "insert into account values(null,?,?)";
                //获取pstmt对象
                pstmt = conn.prepareStatement(sql);
                //给？赋值
                pstmt.setString(1,"wangwu");
                pstmt.setDouble(2,3000);

                //执行sql
                int count = pstmt.executeUpdate();
                System.out.println(count);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close(pstmt,conn);
            }
        }
    }


}
