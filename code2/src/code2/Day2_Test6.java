package code2;

/*
 * 

    需求：

        键盘录入x的值，计算出y的并输出。

        x>=3 y = 2 * x + 1;

        -1<x<3 y = 2 * x;

        x<=-1 y = 2 * x - 1;

 */




import java.util.Scanner;

public class Day2_Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = sc.nextInt();
		int b = 0;
		if (a>=3) {
			b = 2 * a + 1;
		}else if (a>-1 && a<3) {
			b = 2 * a;
		}else if (a<=-1) {
			b = 2 * a - 1;
		}
		System.out.println(b);
	}

}
