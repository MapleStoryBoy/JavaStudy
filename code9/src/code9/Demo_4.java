package code9;

public class Demo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 逻辑运算符-----操作布尔值
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		
		//短路
		//int c = 3/0;
		boolean b3 = 1>2&&2<(3/0); //&&短路与，第一个操作数的值为false，则不需在计算后面的计算
		System.out.println(b3);

		

	}

}
