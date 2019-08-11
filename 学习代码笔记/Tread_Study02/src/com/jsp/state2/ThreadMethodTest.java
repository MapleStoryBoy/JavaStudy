/**
 * 
 */
package com.jsp.state2;

/**
 * 测试Thread中的常用方法：
 * 1，start():启动当前线程：调用当前线程的run()
 * 2，run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3，currentThread()：静态方法，返回当前代码执行的线程
 * 4，getName()：获取当前线程的名字
 * 5，setName()：设置当前线程的名字
 * 6，yield():释放当前cpu的执行权
 * 7，join()：在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行往后a再继续执行
 * 8，stop():已过时。当执行此方法时，强制结束当前线程
 * 9，sleep():让当前线程“睡眠”指定的时长，单位毫秒
 * 10，isAlive()：判断当前线程是否存活
 * 
 * 线程的优先级
 * 1，	- MAX_PRIORITY：10
 *		- MIN_PRIORITY：1
 *		- NORM_PRIORITY：5
 * 2，如何获取和设置当前线程的优先级
 *
 * @author Jsp
 *
 */
class HelloThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			if (i % 20 == 0) {
				yield();//this----h1
			}
		}
	}
	public HelloThread(String name){
		super(name);
	}
	
}



public class ThreadMethodTest {
	public static void main(String[] args) {
		
		HelloThread h1 = new HelloThread("Thread:1");
		//h1.setName("线程一");
		h1.start();
		
		//给主线程命名
		Thread.currentThread().setName("主线程");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			
			if (i == 20) {
				try {
					h1.join();//停止主线程，开始h1线程的执行，h1完成后继续执行主线程
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		System.out.println(h1.isAlive());
	}
}
