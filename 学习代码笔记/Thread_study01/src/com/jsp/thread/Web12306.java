package com.jsp.thread;
/**
 * 共享资源，并发
 * @author Jsp
 *
 */
public class Web12306 implements Runnable{
	//票数
	private int ticketNums = 99;
		
	@Override
	public void run() {
		while (true) {
			if(ticketNums<0){
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---------"+ticketNums--);
		}
		
	}
	public static void main(String[] args) {
		//一份资源
		Web12306 web = new Web12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"malong").start();
		new Thread(web,"lagong").start();
		new Thread(web,"hahong").start();
	}

}
