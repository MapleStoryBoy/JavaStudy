
package com.jsp.cglib;

import com.jsp.proxy.IProducer;

/**
 * 一个生产者
 * @author mac

 * @create 2019/12/8
 *

 */
public class Producer {
    public void saleProduct(float money){
        System.out.println("销售产品，并拿到钱：" + money);
    }

    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱：" + money);
    }
}