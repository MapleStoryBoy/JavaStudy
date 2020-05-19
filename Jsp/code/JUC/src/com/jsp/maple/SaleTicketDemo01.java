/**
 * FileName: SaleTicketDemo01
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/24 4:13 下午
 * <p>
 * Description:
 * <p>
 * History:
 *
 * <author> <time> <version> <desc>
 * <p>
 * 作者姓名 修改时间 版本号 描述
 */
package com.jsp.maple;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/24
 *

 */
public class SaleTicketDemo01
{
    public static void main(String[] args)
    {
        Ticket ticket = new Ticket();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 40; i++) {
//                    ticket.sale();
//                }
//            }
//        }, "A").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 40; i++) {
//                    ticket.sale();
//                }
//            }
//        }, "B").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 40; i++) {
//                    ticket.sale();
//                }
//            }
//        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i <= 40; i++) ticket.sale();
        },"A").start();
        new Thread(() -> {
            for (int i = 0; i <= 40; i++) ticket.sale();
        },"B").start();
        new Thread(() -> {
            for (int i = 0; i <= 40; i++) ticket.sale();
        },"C").start();
    }
}


class Ticket
{
    private int number = 30;
    Lock lock = new ReentrantLock();//可重入锁
    public void sale()
    {
        lock.lock();
        try{
            if (number > 0) {
                System.out.println(Thread.currentThread().getName()+"\t卖出第：" + (number--)+"\t还剩下："+number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
