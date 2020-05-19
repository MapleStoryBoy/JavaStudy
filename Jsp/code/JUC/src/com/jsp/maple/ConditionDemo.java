/**
 * FileName: ConditionDemo
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/25 5:20 下午
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

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/25
 *

 */
public class ConditionDemo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        new Thread(() -> {
            for (int i = 1; i <= 10 ; i++) {
                shareData.print5();
            }
        },"A").start();

        new Thread(() -> {
            for (int i = 1; i <= 10 ; i++) {
                shareData.print10();
            }
        },"B").start();

        new Thread(() -> {
            for (int i = 1; i <= 10 ; i++) {
                shareData.print15();
            }
        },"C").start();
    }
}

class ShareData{
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();
    public void print5(){
        lock.lock();
        try{
            while (number != 1){
                c1.await();
            }
            //2
            for (int i = 1; i <= 5 ; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            //3
            number = 2;
            c2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print10(){
        lock.lock();
        try{
            while (number != 2){
                c2.await();
            }
            //2
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            //3
            number = 3;
            c3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void print15(){
        lock.lock();
        try{
            while (number != 3){
                c3.await();
            }
            //2
            for (int i = 1; i <= 15 ; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }
            //3
            number = 1;
            c1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}




