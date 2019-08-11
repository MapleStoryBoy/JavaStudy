/**
 * 
 */
package com.jsp.state;

/**
 * 终止线程
 * 1，线程正常执行完毕----次数
 * 2,外部干涉----加入标识位
 * @author Jsp
 *
 */
public class TerminateThread implements Runnable {
	//加入标识标记线程体是否可以运行
	private boolean flag = true;
	private String name;
	
	public TerminateThread(String name) {
	
		this.name = name;
	}



	@Override
	public void run() {
		//关联标识，true---运行  false----停止
		int i = 0;
		while(flag){
			System.out.println(name+"-----"+i++);
		}
		
	}
	//对外提供方法改变标识
	public void terminate() {
		this.flag = false;
	}
	public static void main(String[] args) {
		TerminateThread tt = new TerminateThread("Jsp");
		new Thread(tt).start();
		
		for (int i = 0; i < 99; i++) {
			if (i==88) {
				tt.terminate();//线程的终止
				System.out.println("tt game over");
			}
			System.out.println("main--->"+i);
		}
	}
	
}
