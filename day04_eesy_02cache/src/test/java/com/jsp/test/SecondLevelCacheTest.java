
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
 * @create 2019/9/27
 *

 */
public class SecondLevelCacheTest {
    private InputStream is;
    private SqlSessionFactory factory;

    @Before
    public void init() throws Exception {
        //1，读取配置文件
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2，创建SqlSessionFactory工厂
        factory = new SqlSessionFactoryBuilder().build(is);


    }

    @After
    public void destroy() throws Exception {
        is.close();
    }


    @Test
    public void testFirstLevelCache(){
        SqlSession sqlSession1 = factory.openSession();
        IUserDao dao1 = sqlSession1.getMapper(IUserDao.class);
        User user1 = dao1.findById(41);
        System.out.println(user1);
        sqlSession1.close();

        SqlSession sqlSession2 = factory.openSession();
        IUserDao dao2= sqlSession2.getMapper(IUserDao.class);
        User user2 = dao2.findById(41);
        System.out.println(user2);
        sqlSession2.close();

        System.out.println(user1 == user2);
    }


}