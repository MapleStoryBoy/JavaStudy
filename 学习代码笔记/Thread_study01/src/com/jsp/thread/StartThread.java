/**
 * 
 */
package com.jsp.thread;

/**
 * 创建线程方式1
 * 1，创建：继承Thread+重写run
 * @author Jsp
 *
 */
public class StartThread extends Thread {
	/**
	 * 线程入口
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			System.out.println("一边听歌");
		}
	}
	
	public static void main(String[] args) {
		//创建子类对象
		StartThread st = new StartThread();
		//启动
		st.start();
		//st.run(); 普通方法调用
		for(int i=0;i<20;i++){
			System.out.println("一边coding");
		}
	}
}
