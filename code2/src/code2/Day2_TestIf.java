package code2;
import java.util.Scanner;
public class Day2_TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 一年有四季、
		 * 3，4，5春季
		 * 6，7，8夏季
		 * 9，10，11秋季
		 * 12,1,2冬季
		 * 键盘录入月份，输出对应季节
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("对不起没有对应的季节");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "月是春季");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "月是夏季");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "月是秋季");
		}else {
			System.out.println(month + "月是冬季");
		}
		
	}
}	
