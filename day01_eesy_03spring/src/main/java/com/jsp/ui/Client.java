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
     * 获取spring的IoC核心容器，并根据id获取对象     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext: 它可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话加载不了。
     *      FileSystemXmlApplicationContext: 它可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *      AnnotationConfigApplicationContext: 它是用于读取注解创建容器的
     *
     * 核心容器的两个接口引发出的问题：
     * ApplicationContext： 单例对象适用
     *      它在构建核心容器时，创建对象采取的策略是立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象
     * BeanFactory：  多例对象适用
     *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据id获取对象，什么时候才真正的创建对象。
     * @param args
     */
    public static void main(String[] args) {
        // 1，获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2，根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
        //as.saveAccount();
    }
}
