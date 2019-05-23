package code3;
/*
A:如何写一个方法
    1,明确返回值类型
    2,明确参数列表
B:案例演示
    需求：求两个数据之和的案例
C:方法调用图解
*/
public class Day3_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 10;
		//int b = 20;
		// int sum = a + b;
		// System.out.println(sum);
		
		// int c = 30;
		// int d = 40;
		// int sum2 = c + d;
		// System.out.println(sum2);
		int sum = add(10,20);
		System.out.println(sum);
	}
	/*
	 求两个整数的和
	 1，整数的和结果应该还是整数
	 2，有两个未知内容参与运算
	 */
	public static int add(int a,int b) {
		int sum = a + b;
		return sum;
	}
}
