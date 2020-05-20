package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author mac
 * @create 2020/5/6
 */
@Service
public class PaymentService {
    /**
     * 正常访问ok的方法
     * @param id
     * @return
     */
    public String paymentInfo_ok(Integer id){
        return "线程池：" + Thread.currentThread().getName()+" paymentInfo_ok,id: "+id+"\t"+"哈哈";
    }

    /**
     * 正常访问ok的方法
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id){
        //int age = 10/0;
        //int timeNumber = 5;
        //try { TimeUnit.SECONDS.sleep(timeNumber); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池：" + Thread.currentThread().getName()+" paymentInfo_TimeOut,id: "+id+"\t"+"耗时:" ;
    }

    /**
     * 超时兜底,服务降级
     * @param id
     * @return
     */
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池：" + Thread.currentThread().getName()+" 8001系统繁忙或者运行报错，请稍后再试,id: "+id+"\t"+"失败";
    }
}
