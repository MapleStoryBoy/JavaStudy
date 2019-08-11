/**
 * 
 */
package com.jsp.thread;

/**
 * 创建线程方式2
 * 1，创建：实现Runnable+重写run
 * 2，启动：创建实现类对象+Thread对象+start
 * @author Jsp
 *
 */
public class StartRun implements Runnable {
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
		/*//创建实现类对象
		StartRun st = new StartRun();
		//创建代理类对象
		Thread t = new Thread(st);
		//启动
		t.start();
		//st.run(); 普通方法调用
		*/		
		new Thread(new StartRun()).start();
		for(int i=0;i<20;i++){
			System.out.println("一边coding");
		}
	}
}
