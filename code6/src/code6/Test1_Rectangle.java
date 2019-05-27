package code6;

public class Test1_Rectangle {        //矩形

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(10,20);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
	}

}
/*
A:案例演示
需求：
    定义一个长方形类,定义 求周长和面积的方法，
    然后定义一个测试类进行测试。
分析：
	成员变量：
		宽width，高high
	空参有参构造
	成员方法：
		setXxx,getXxx
		求周长：getLength()
		求面积：getArea()
    
*/
class Rectangle {
	private int width; //宽
	private int high;  //高
	
	public Rectangle() {}
	
	public Rectangle(int width,int high) {
		this.width = width;
		this.high = high;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHigh(int high) {
		this.high = high;
	}
	public int getHigh() {
		return high;
	}
	
	public int getLength() {
		return 2 * (width + high);
	}
	public int getArea() {
		return width * high;
	}
}
