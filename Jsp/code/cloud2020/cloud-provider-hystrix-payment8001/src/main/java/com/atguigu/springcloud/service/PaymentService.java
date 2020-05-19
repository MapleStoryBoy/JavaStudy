package com.atguigu.springcloud.service;

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
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try { TimeUnit.SECONDS.sleep(timeNumber); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池：" + Thread.currentThread().getName()+" paymentInfo_TimeOut,id: "+id+"\t"+"耗时:" + timeNumber;
    }
}
