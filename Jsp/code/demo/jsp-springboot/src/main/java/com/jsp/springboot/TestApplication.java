/**
 * FileName: TestApplication
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/2/14 6:11 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac
 * @create 2020/2/14
 */
@EnableAutoConfiguration
@ComponentScan
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}