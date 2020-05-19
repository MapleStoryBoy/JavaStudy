/**
 * FileName: MySelfRule
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/5/5 6:21 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/5/5
 *

 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
