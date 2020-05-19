/**
 * FileName: AOPTest
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/12/11 9:42 下午
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

import com.jsp.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试AOP的配置
 */
public class AOPTest {
    public static void main(String[] args) {
        //1，获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2，获取对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        //3，执行方法
        as.saveAccount();
    }
}