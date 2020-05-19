/**
 * FileName: UserController
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/2/19 4:17 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/2/19
 *

 */
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "hello user!";
    }

}