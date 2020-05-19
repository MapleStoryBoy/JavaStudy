/**
 * FileName: AccountTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/9/27 9:57 下午
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

import com.jsp.dao.IAccountDao;
import com.jsp.dao.IUserDao;
import com.jsp.domain.Account;
import com.jsp.domain.AccountUser;
import com.jsp.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2019/9/27
 *

 */
public class AccountTest {
    private InputStream is;
    private SqlSession sqlSession;
    private IAccountDao accountDao;

    @Before
    public void init() throws Exception {
        //1，读取配置文件
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2，创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        //3，使用工厂生产一个SqlSession对象
        sqlSession = factory.openSession();
        //4，使用SqlSession创建dao接口的代理对象
        accountDao = sqlSession.getMapper(IAccountDao.class);

    }

    @After
    public void destroy() throws Exception {
        //事物提交
        sqlSession.commit();
        //6，释放资源
        sqlSession.close();
        is.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts){
            System.out.println("-----每个account的信息---------");
            System.out.println(account);
            System.out.println(account.getUser());
        }
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAllAccountUser() {
        List<AccountUser> aus = accountDao.findAllAccount();
        for (AccountUser au : aus){
            System.out.println(au);
        }
    }



}