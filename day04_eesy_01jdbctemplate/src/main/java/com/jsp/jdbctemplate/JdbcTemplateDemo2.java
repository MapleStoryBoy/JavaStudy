/**
 * FileName: JdbcTemplateDemo1
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/12/16 8:52 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate的最基本用法
 * @create 2019/12/16
 *

 */
public class JdbcTemplateDemo2 {
    public static void main(String[] args) {

        //1，获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2,获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //3，执行操作
        jt.execute("insert into account(name,money)values ('ddd',2222)");



        /*
        //准备数据源：spring的内置数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/eesy");
        ds.setUsername("root");
        ds.setPassword("maple");

        //1,创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        //给jt设置数据源
        jt.setDataSource(ds);
        //2,执行操作
        jt.execute("insert into account(name,money)values ('ccc',1000)");
         */



    }
}