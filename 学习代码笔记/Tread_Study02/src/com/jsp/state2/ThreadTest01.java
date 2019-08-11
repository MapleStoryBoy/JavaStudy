/**
 * 
 */
package com.jsp.state2;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1，创建一个实现了Runnable接口的类
 * 2，创建实现类的对象
 * 3，创建Thread类的子类对象
 * 4，通过此对象调用start()
 * @author Jsp
 *
 */
class MThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			
		}
	}
	
}
public class ThreadTest01 {
	public static void main(String[] args) {
		MThread mThread = new MThread();
		Thread t1 = new Thread(mThread);
		t1.setName("线程一");
		t1.start();
		//new Thread(mThread).start();
		//new Thread(mThread).start();
		Thread t2 = new Thread(mThread);
		t2.setName("线程二");
		t2.start();
	}
}
