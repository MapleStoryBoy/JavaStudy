/**
 * FileName: SecondLevelCatchTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/10/31 8:42 下午
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

import com.jsp.dao.IUserDao;
import com.jsp.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2019/10/31
 *

 */
public class SecondLevelCatchTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;

    @Before
    public void init() throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        userDao = session.getMapper(IUserDao.class);
    }

    @After
    public void destroy() throws Exception {
        in.close();
    }

    @Test
    public void testFindOne(){
        User user = userDao.findById(48);
        System.out.println(user);

        session.close();//释放一级缓存
        SqlSession session1 = factory.openSession();//再次打开session
        IUserDao userDao1 = session1.getMapper(IUserDao.class);
        User user1 = userDao1.findById(48);
        System.out.println(user1);
        session1.close();
    }
}