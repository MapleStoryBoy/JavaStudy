package code7;
//计算阶乘
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long limit = 20L;
		long factorial = 1L;
		
		for (long i = 1L;i <= limit;i++) {
			factorial = 1L; //初始化factorial
			
			for (long factor = 2;factor <= i;factor++) {
				factorial *= factor;
			}
			System.out.println(i + "! is " + factorial);
		}
	}

}
