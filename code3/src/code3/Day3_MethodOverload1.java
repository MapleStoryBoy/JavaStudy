package code3;

public class Day3_MethodOverload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = isEquals(10,20);
		System.out.println(b1);
		
		boolean b2 = isEquals(10.2,10.2);
		System.out.println(b2);
		
	}
	/*
	 * 比较两个数据是否相等
	 * 1，返回值类型boolean
	 * 2，参数列表int a，int b
	 */
	public static boolean isEquals(int a,int b) {
		return a == b;
	}
	/*
	 * 比较两个数据是否相等
	 * 1，返回值类型boolean
	 * 2，参数列表double a，double b
	 */
	public static boolean isEquals(double a,double b) {
		return a == b;
	}
}
/*
A:案例演示
需求：比较两个数据是否相等。
参数类型分别为两个int类型，两个double类型，并在main方法中进行测试
*/
