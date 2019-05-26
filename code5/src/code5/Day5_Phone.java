package code5;

public class Day5_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Phone p = new Phone();
		//调用对象中的属性并赋值
		p.brand = "锤子";
		p.price = 998;
		System.out.println(p.brand + "..." + p.price);
		
		//调用成员方法
		p.call();
		p.sendMessage();
		p.playGame();
	}

}

class Phone {
	String brand;
	int price;
	
	
	public void call() {
		System.out.println("打电话");	
	}
	public void sendMessage() {
		System.out.println("发信息");
	}
	public void playGame() {
		System.out.println("玩游戏");
	}
}