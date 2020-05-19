
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
import java.util.List;

/**
 * @create 2019/9/27
 *

 */
public class UserTest {
    private InputStream is;
    private SqlSessionFactory factory;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws Exception {
        //1，读取配置文件
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2，创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(is);
        //3，使用工厂生产一个SqlSession对象
        sqlSession = factory.openSession();
        //4，使用SqlSession创建dao接口的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);

    }

    @After
    public void destroy() throws Exception {
        //事物提交
        //sqlSession.commit();
        //6，释放资源
        sqlSession.close();
        is.close();
    }


    @Test
    public void testFirstLevelCache(){
        User user1 = userDao.findById(41);
        System.out.println(user1);

        sqlSession.close();
        //再次获取SqlSession对象
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(IUserDao.class);
        User user2 = userDao.findById(41);
        System.out.println(user2);

        System.out.println(user1 == user2);
    }


}