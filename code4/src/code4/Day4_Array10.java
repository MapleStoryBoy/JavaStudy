package code4;
import java.util.Scanner;
public class Day4_Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应的星期范围在1-7:");
		int week = sc.nextInt();
		System.out.println("星期" + getWeek(week));
	}
	/*
	 * 根据索引返回对应的星期
	 * 1，返回值类型char
	 * 2，参数列表int week
	 */
	public static char getWeek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'};
		return arr[week];
	}

}
