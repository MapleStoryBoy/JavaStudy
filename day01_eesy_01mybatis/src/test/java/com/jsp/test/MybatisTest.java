
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
import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @create 2019/9/12
 */
public class MybatisTest {
    private InputStream is;
    private SqlSession sqlSession;
    private IUserDao userDao;

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
        userDao = sqlSession.getMapper(IUserDao.class);

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

        //5，使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

    /**
     * 测试保存操作
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("Maple");
        user.setAddress("安徽");
        user.setSex("男");
        user.setBirthday(new Date());
        //5，保存方法
        userDao.saveUser(user);

    }

    /**
     * 测试更新方法
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(50);
        user.setUsername("Maple");
        user.setAddress("安徽");
        user.setSex("2");
        user.setBirthday(new Date());
        //5，更新方法
        userDao.updateUser(user);
    }

    /**
     * 测试删除方法
     */
    @Test
    public void testDelete() {
        //5，删除方法
        userDao.deleteUser(50);
    }

    /**
     * 测试查询一个的方法
     */
    @Test
    public void testFindOne() {
        //测试查询一个的方法
        User user = userDao.findById(48);
        System.out.println(user);
    }

    /**
     * 测试模糊查询的方法
     */
    @Test
    public void testFindByName() {
        //测试模糊查询的方法
        List<User> users = userDao.findByName("%王%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试查询总记录条数
     */
    @Test
    public void testFindTotal() {
        //测试查询总记录条数
        int count = userDao.findTotal();
        System.out.println(count);
    }

}