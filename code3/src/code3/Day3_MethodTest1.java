package code3;
//需求：键盘录入两个数据，返回两个数中的较大值
import java.util.Scanner;
public class Day3_MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();
		int max = getMax(x,y);
		System.out.println(max);
		boolean b = isEquals(x,y);
		System.out.println(b);		
	}
	public static int getMax(int a,int b) {
		return a > b ? a : b;
	}
	public static boolean isEquals(int a,int b) {
		return a == b;
	}

}
