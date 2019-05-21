package code2;

import java.util.Scanner;   //导包
public class Day2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//键盘录入练习：键盘录入两个数据，比较这两个数据是否相等
		Scanner sc = new Scanner(System.in);  //创建键盘录入对象
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();                 // 将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();                 // 将键盘录入的数据保存在y中
		
		//boolean b = (x == y)? true : false;
		boolean b = (x == y);
		System.out.println(b);
	}

}
