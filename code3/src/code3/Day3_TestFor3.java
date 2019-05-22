package code3;
/*
案例演示
需求：在控制台输出所有的”水仙花数”
所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
举例：153就是一个水仙花数。
153 = 111 + 555 + 333 = 1 + 125 + 27 = 153
*/

public class Day3_TestFor3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100;i <= 999;i++) {  //获取100到999之间的所有整数
			int a = i % 10;   // 个位
			int b = i / 10 % 10;  // 十位
			int c = i / 10 /10 % 10; //百位
			if (a*a*a + b*b*b + c*c*c == i) {
				System.out.println(i);
				
			}
		}

	}

}
