/**
 * FileName: LoadBalancer
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/5/5 9:00 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/5/5
 *

 */
public interface LoadBalancer
{
   ServiceInstance instances(List<ServiceInstance> serviceInstance);
}
