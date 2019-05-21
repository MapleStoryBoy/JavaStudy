package code;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A:案例演示
		 * 请分别计算出a,b,c的值?
			int a = 10;
			int b = 10;
			int c = 10;
			a = b++;		
			c = --a;			
			b = ++a;		
			a = c--;			
		 * B:案例演示
		 	* 请分别计算出x,y的值?
			int x = 4;
			int y = (x++)+(++x)+(x*10);
		 * C:面试题
		 	* byte b = 10;
		 	* b++;
		 	* b = b + 1;
		 	* 问哪句会报错,为什么 
		 */
		int a = 10;
		int b = 10;
		int c = 10;
		a = b++;	//a = 10,b = 11	
		c = --a;	//a = 9,c = 9		
		b = ++a;	//a = 10,b = 10	
		a = c--;	//a = 9,c=8
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);

		//第二题
		int x = 4;
		//        4     6     60
		int y = (x++)+(++x)+(x*10);
		System.out.println(x);
		System.out.println(y);
		
		//第三题
		byte n = 10;
		n++;  //b = (byte)(n + 1)
		//n = n + 1;  //当byte与int进行混合运算的时候，会提升为int类型，两个int相加的结果还是int，赋值给byte会损失精度。
		System.out.println(n);
	}

}
