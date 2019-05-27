package code6;

public class Demo4_Phone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone1 p1 = new Phone1();
		p1.setBrand("苹果");
		p1.setPrice(1500);
		System.out.println(p1.getBrand() + "..." + p1.getPrice());
		
		Phone1 p2 = new Phone1("小米",98);
		p2.show();
		
	}

}
/*
手机类：
	成员变量：
		品牌brand，价格price
	构造方法
		无参，有参
	成员方法
		setXxx和getXxx
		show
*/
class Phone1 {
	private String brand;
	private int price;
	
	public Phone1() {}
	
	public Phone1(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void show() {
		System.out.println("我的品牌是：" + brand + ",我的价格是：" + price);
	}
}
