package com.jsp.service.impl;

import com.jsp.dao.IAccountDao;
import com.jsp.dao.impl.AccountDaoImpl;
import com.jsp.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 账户的业务层实现类
 *
 *  <bean id="accountService" class="com.jsp.service.impl.AccountServiceImpl"></bean>
 *
 *  用于创建对象
 *      就和xml配置文件中编写bean标签实现的功能是一样的
 *      @Component：
 *          作用：用于把当前类对象存入spring容器
 *          属性：
 *               value：用于指定bean的id。当我们不写时，它默认值是当前类名，且首字母小写
 *      @Controller：一般用在表现层
 *      @Service：一般用在业务层
 *      @Repository：一般用在持久层
 *      以上三个注解他们的作用和属性与Component是一样的，
 *      他们三个是Spring框架为我们提供明确的三层使用的注解，
 *      使我们的三层对象更加清晰。
 *
 *  用于注入数据
 *      就和xml配置文件中的bean标签中写一个property标签作用一样
 *      @Autowried:
 *          作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功。
 *          如果ioc容器中没有任何bean的类型和要注入的变量类型匹配，则报错。
 *          如果ioc容器中由多个类型匹配时，
 *          出现位置：可以是成员变量上，也可以是方法上。
 *          细节：在使用注解注入时，set方法就不是必须的了
 *      @Qualifier：
 *          作用：在按照类型注入的基础之上，再按照名称注入。它在给类成员注入时不能单独使用。
 *          但是在给方法参数注入时可以
 *          属性：value：用于注入指定bean的id
 *      @Resource:
 *         作用：直接按照bean的id注入。它可以独立使用
 *         属性：name：用于指定bean的id
 *      以上三个注入都只能注入其它bean类型的数据，而基本类型和String类型无法使用上述注解实现
 *      另外，集合类型的注入只能通过xml来实现
 *
 *      @Value：
 *          作用：用于注入基本类型和String类型的数据
 *          属性：value：用于指定数据的值。它可以使用spring中的SpEL（也就是spring中的el表达式）
 *          SpEL的写法：${表达式}
 *
 *  用于改变作用范围
 *      就和集合在bean标签中使用scope属性实现的功能一样
 *      @Scope：
 *          作用：用于指定bean的作用范围
 *          属性：value：指定范围的取值。常用取值：singleton prototype
 *  和生命周期相关
 *      在bean标签中使用init-method和destroy-method的作用一样
 *      @PreDestroy：用于指定销毁方法
 *      @PostConstruct：用于指定初始化方法
 */
@Component("accountService")
public class AccountServiceImpl implements IAccountService {
    //@Autowired
    //@Qualifier("accountDao2")
    @Resource(name = "accountDao1")
    private IAccountDao accountDao;

    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
