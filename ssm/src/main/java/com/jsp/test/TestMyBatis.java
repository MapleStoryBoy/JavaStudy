/**
 * FileName: TestMyBatis
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/1/2 6:24 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.test;

import com.jsp.dao.AccountDao;
import com.jsp.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/1/2
 *

 */
public class TestMyBatis {
    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //查询所有的账户信息
        List<Account> list = dao.findAll();
        for (Account account:list) {
            System.out.println(account);
        }
        //关闭资源
        session.close();
        in.close();
    }

    @Test
    public void run3() throws Exception {
        Account account = new Account();
        account.setName("Pjs");
        account.setMoney(3000d);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.saveAccount(account);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        in.close();
    }
}