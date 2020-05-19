/**
 * FileName: Logger
 * <p>
 * Author: mac
 * <p>
 * Date: 2019/12/11 9:11 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.utils;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 * @create 2019/12/11
 */
public class Logger {

    /**
     * 用于打印日志：计划让其在切入点方法（业务层方法）之前执行
     */
    public void printLog(){
        System.out.println("Logger类中的printLog方法开始记录日志了。。。。");
    }
}