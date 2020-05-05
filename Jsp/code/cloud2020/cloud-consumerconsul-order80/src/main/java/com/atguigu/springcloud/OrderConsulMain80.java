/**
 * FileName: OrderConsulMain80
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/5/5 4:10 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/5/5
 *

 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
     public static void main(String[] args) {
             SpringApplication.run(OrderConsulMain80.class,args);
         }
}
