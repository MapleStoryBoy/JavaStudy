package code2;

/*
 * 如何实现键盘录入呢?
	先照格式来。
	a:导包
	格式：
    	import java.util.Scanner;
	位置：
    	在class上面。
	b:创建键盘录入对象
	格式：
    	Scanner sc = new Scanner(System.in);
	c:通过对象获取数据
	格式：
    	int x = sc.nextInt();
 */
import java.util.Scanner;

public class Day2_Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int x = sc.nextInt();
		System.out.println(x);


	}

}
