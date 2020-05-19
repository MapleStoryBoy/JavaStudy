/**
 * FileName: MyLB
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/5/5 9:04 下午
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
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/5/5
 *

 */
@Component
public class MyLB implements LoadBalancer {
    //原子整型类
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;

        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问，次数next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstance) {
        int index = getAndIncrement() % serviceInstance.size();

        return serviceInstance.get(index);
    }
}
