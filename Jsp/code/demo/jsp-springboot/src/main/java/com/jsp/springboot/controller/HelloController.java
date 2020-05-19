/**
 * FileName: HelloController
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/2/14 3:00 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.springboot.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac
 * @create 2020/2/14
 */
@RestController
@RequestMapping("hello")

public class HelloController {

    @GetMapping("show")
    public String test() {
        return "hello springboot 1";
    }


}


