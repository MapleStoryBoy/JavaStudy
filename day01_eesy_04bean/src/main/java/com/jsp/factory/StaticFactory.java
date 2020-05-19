/**
 * FileName: InstanceFactory
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/11/17 9:02 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.factory;

import com.jsp.service.IAccountService;
import com.jsp.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类（该类可能存在于jar包中，我们无法通过修改源码的方式来提供默认构造函数）
 *
 * @author mac

 * @create 2019/11/17
 *

 */
public class StaticFactory {
    public static  IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}