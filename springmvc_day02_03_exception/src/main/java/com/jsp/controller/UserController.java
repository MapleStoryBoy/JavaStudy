/**
 * FileName: UserController
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/1/1 7:18 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.controller;

import com.jsp.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/1/1
 *

 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException{
        System.out.println("testException执行了。。。。");

        //捕获异常
        try {
            int i = 1/0;
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询所有用户出现错误了。。。。");
        }

        return "success";
    }

}