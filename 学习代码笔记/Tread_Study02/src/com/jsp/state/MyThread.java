package com.jsp.state;

public class MyThread extends Thread{
	@Override 
	public void run(){
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				//System.out.println(i);
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}

}
