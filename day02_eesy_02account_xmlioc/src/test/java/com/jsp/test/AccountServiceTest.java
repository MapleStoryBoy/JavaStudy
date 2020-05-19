/**
 * FileName: AccountServiceTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/11/21 9:46 下午
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
import com.jsp.domain.Account;
import com.jsp.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用junit单元测试，测试配置
 * @author mac

 * @create 2019/11/21
 *

 */
public class AccountServiceTest {
    @Test
    public void testFindAll() {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        //执行方法
        List<Account> accounts = as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.saveAccount(account);
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }

}