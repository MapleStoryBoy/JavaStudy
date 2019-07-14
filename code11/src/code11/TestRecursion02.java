package code11;

public class TestRecursion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果：%s%n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时：%s%n",d2-d1);
		
		factorialLoop(10);
	}
	/**求阶乘的方法*/
	static long factorial(int n) {
		if (n == 1) {//递归头
			return 1;
		}else {//递归体
			return n*factorial(n-1);
		}
	}
	//普通循环求n的阶乘
	static long factorialLoop(int a) {
		long d3 = System.currentTimeMillis();
		long result = 1;
		while (a>1) {
			result *= a*(a-1);
			a -= 2;
		}
		long d4 = System.currentTimeMillis();
		System.out.println(result);
		System.out.printf("普通循环费时：%s%n",d4-d3);
		return result;
	}

}
