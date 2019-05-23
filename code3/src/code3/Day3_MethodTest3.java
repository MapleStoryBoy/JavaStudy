package code3;

import java.util.Scanner;
public class Day3_MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		print99(num);

	}
	public static void print99(int a) {
		for (int i = 1;i <= a;i++) {
			for (int j = 1;j <= i;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + '\t');
			}
			System.out.println();
		}
	}
}
