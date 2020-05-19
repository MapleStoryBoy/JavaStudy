/**
 * FileName: CallableDemo
 * <p>
 * Author: mac
 * <p>
 * Date: 2020/4/25 5:44 下午
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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac

 * @create 2020/4/25
 *

 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask(new MyThread());
        new Thread(futureTask,"input thread name").start();
        Integer result = futureTask.get();
        System.out.println(result);
    }
}

//class MyThread implements Runnable{
//
//    @Override
//    public void run() {
//
//    }
//}

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("***************");
        return 1024;
    }
}
