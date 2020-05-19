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

import com.jsp.dao.IAccountDao;
import com.jsp.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate的最基本用法
 * @create 2019/12/16
 *

 */
public class JdbcTemplateDemo4 {
    public static void main(String[] args) {

        //1，获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2,获取对象
        IAccountDao accountDao = ac.getBean("accountDao",IAccountDao.class);
        Account account = accountDao.findAccountById(1);
        System.out.println(account);

        account.setMoney(10000f);
        accountDao.updateAccount(account);

    }
}