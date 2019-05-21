package code2;

public class Day2_Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
    	位异或运算符的特点
    	^的特点：一个数据对另一个数据位异或两次，该数本身不变。
		 */
		System.out.println(5 ^ 10 ^ 10);
		System.out.println(5 ^ 10 ^ 5);

	    //请自己实现两个整数变量的交换
	    //注意：以后讲课的过程中，我没有明确指定数据的类型，默认int类型。
		int x = 10;
		int y = 5;
		
		x = x ^ y;
		y = x ^ y;
		
		x = x ^ y;
		
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
