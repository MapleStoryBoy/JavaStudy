
package com.jsp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 *
 * 连接的工具类，他用于从数据源中获取一个连接，并且实现和线程的绑定
 * @author mac

 * @create 2019/12/4
 *

 */
@Component("connectionUtils")
public class ConnectionUtils {

    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    @Autowired
    private DataSource dataSource;


    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection() {
        try {
            //1，先从ThreadLocal上获取
            Connection conn = tl.get();
            //2，判断当前线程上是否有连接
            if (conn == null) {

                //3，从数据源中获取一个连接，并且和线程绑定存入ThreadLocal中
                conn = dataSource.getConnection();
                //4，存入
                tl.set(conn);
            }
            //4,返回当前线程上的连接
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把连接和线程解绑
     */
    public void removeConnection(){
        tl.remove();
    }
}