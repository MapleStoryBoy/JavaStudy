/**
 * FileName: ApplicationContextConfig
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/30 5:58 上午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/30
 *

 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
