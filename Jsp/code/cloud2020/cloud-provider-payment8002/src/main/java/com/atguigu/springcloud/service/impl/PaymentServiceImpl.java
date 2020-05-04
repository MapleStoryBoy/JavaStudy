/**
 * FileName: PaymentServiceImpl
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/29 3:08 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/29
 *

 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
       return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
