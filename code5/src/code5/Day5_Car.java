package code5;

public class Day5_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();   //创建对象
		//调用属性并赋值
		c1.color = "red";
		c1.num = 8;
		//调用方法
		c1.run();
		
		Car c2 = new Car();
		c2.color = "black";
		c2.num = 4;
		//c2 = null; //用null把原来的地址覆盖掉了，c2里面的记录是null，所以报出空指针异常。
		c2.run();
		
	}

}
/*
 *车的属性
 *	车的颜色
 *	车的轮胎数
 *车的行为
 *	车运行 
 */
class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color + "...." + num);
	}
}

