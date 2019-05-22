package code2;

import java.util.Scanner;

public class Day2_TestSwitch4 {

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
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月是春季");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月是夏️季");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月是秋季");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月是冬季");
		break;
		default:
			System.out.println("对不起没有对应的季节");
		break;
		}

	}

}