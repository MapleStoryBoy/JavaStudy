package code2;

public class Day2_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * &&和&的区别?
    		a:最终结果一样。
    		b:&&具有短路效果。左边是false，右边不执行。
    		&是无论左边是false还是true,右边都会执行
    	* ||与|的区别
    	* a：最终的结果是一样的
    	* b：||具有短路效果，左边为true，右边不执行	
    	
		 */
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b && b < c);
		System.out.println(a < b && b > c);
		System.out.println(a > b && b < c);
		System.out.println(a > b && b > c);
		
		int x = 3;
		int y = 4;
		//System.out.println((++x == 3) & (++y == 4)); //false & false = false
		//System.out.println("x = " + x);   
		//System.out.println("y = " + y);

		System.out.println((++x == 3) && (++y == 4)); //false & false = false
		System.out.println("x = " + x);   
		System.out.println("y = " + y);//由于++x == 3；为false，所以短路与右边不会执行此时y没有变
		
		
	}

}
