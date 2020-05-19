/**
 * FileName: AnnotationCRUDTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/10/29 9:10 下午
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

import javax.print.attribute.PrintJobAttributeSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2019/10/29
 *

 */
public class AnnotationCRUDTest {
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
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("-------每个用户的信息-------");
            System.out.println(user);
            System.out.println(user.getAccounts());
        }
    }


    @Test
    public void testFindOne(){
        User user = userDao.findById(48);
        System.out.println(user);
    }

    @Test
    public void testFindByName(){
        List<User> users = userDao.findUserByName("小二王");
        for (User user:users) {
            System.out.println(user);
        }
    }


}