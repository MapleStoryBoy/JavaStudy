package cn.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 * JDBC快速入门
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //导入驱动jar包
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库的链接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","maple");
        //定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //获取执行sql的对象
        Statement stmt = conn.createStatement();

        //执行sql
        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();
        conn.close();

    }
}
