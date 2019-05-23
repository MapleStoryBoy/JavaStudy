package code3;
/*
A:案例演示
    需求：根据键盘录入的行数和列数，在控制台输出星形
B:方法调用：(无返回值,void)
    单独调用
    输出调用(错误)
    赋值调用(错误)
*/
import java.util.Scanner;
public class Day3_MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int row = sc.nextInt();
		System.out.println("请输入列数：");
		int column = sc.nextInt();
		print(row,column);  // 单独调用,返回值是void方法只能是单独调用
		
	}
	/*
	 * 在控制台输出矩形星形
	 * 1，明确返回类型。经分析没有具体返回类型 void
	 * 2，明确参数列表 int a ，int b
	 */
	public static void print(int a,int b) {
		for (int i = 1;i <= a;i++) {
			for (int j = 1;j <= b;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
