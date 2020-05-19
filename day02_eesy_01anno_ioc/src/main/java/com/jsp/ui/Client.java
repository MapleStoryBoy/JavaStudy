package com.jsp.ui;

import com.jsp.dao.IAccountDao;
import com.jsp.service.IAccountService;
import com.jsp.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1，获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2，根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
//        System.out.println(as);
//
//        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
//        System.out.println(adao);
        as.saveAccount();
    }
}
