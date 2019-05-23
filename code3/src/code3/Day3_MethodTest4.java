package code3;

public class Day3_MethodTest4 {
	//方法的重载
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = add(10,20);
		System.out.println(sum1);
		int sum2 = add(10,20,30);
		System.out.println(sum2);
		
		double sum3 = add(12.3,13.4);
		System.out.println(sum3);
	}
	/*
	 * 求两个整数的和
	 * 1，返回值类型int
	 * 2，参数列表int a，int b
	 */
	public static int add(int a,int b) {
		return a + b;
	}
	/*
	 * 求三个整数的和
	 * 1，返回值类型int
	 * 2，参数列表int a，int b，int c
	 */
	public static int add(int a,int b,int c) {
		return a + b + c;
	}
	public static double add(double a,double b) {
		return a + b;
	}
	

}
/*
方法重载概述
求和案例
    2个整数
    3个整数
    4个整数
B:方法重载：
在同一个类中，方法名相同，参数列表不同。与返回值类型无关。
参数列表不同：
    A:参数个数不同
    B:参数类型不同
    C:参数的顺序不同(算重载,但是在开发中不用)
*/

/*
 * 重载的分类：
 * 1，参数个数不同
 * 2，参数类型不同
 * 3，顺序不同
 */


    
