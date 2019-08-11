package com.jsp.thread;

public class TDownloader extends Thread {
	private String url; //远程路径
	private String name;//存储名字
	
	public TDownloader(String url, String name) {
		
		this.url = url;
		this.name = name;
	}
	
	@Override
	public void run(){
		WebDownloader wd = new WebDownloader();
		wd.download(url, name);
	}
	
	public static void main(String[] args) {
		TDownloader td1 = new TDownloader("http://pic31.nipic.com/20130801/11604791_100539834000_2.jpg","1.jpg");
		TDownloader td2 = new TDownloader("http://pic32.nipic.com/20130902/13395269_103525238102_2.jpg","2.jpg");
		TDownloader td3 = new TDownloader("http://pic41.nipic.com/20140508/18609517_112216473140_2.jpg","3.jpg");
		
		//启动三个线程
		td1.start();
		td2.start();
		td3.start();
	}
}
