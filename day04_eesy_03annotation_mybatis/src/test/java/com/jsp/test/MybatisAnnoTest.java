/**
 * FileName: MybatisAnnoTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/10/28 9:21 下午
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

import java.io.InputStream;
import java.util.List;

/**
 * @author mac
 * @create 2019/10/28
 *
 */
public class MybatisAnnoTest {
    /**
     * 测试基于注解的mybatis使用
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // 1，获取字节输入流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2，根据字节输入流构建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 3，根据SqlSessionFactory生产一个SqlSession
        SqlSession session = factory.openSession();
        // 4，使用SqlSession获取Dao的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        // 5，执行Dao的方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        // 6，释放资源
        session.close();
        in.close();

    }
}