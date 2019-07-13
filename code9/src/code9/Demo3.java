package code9;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 扩展运算符
		int a = 3;
		int b = 4;
		a += b;//相当于a = a + b
		System.out.println("a="+a+"\nb="+b);
		
		a = 3;
		a *= b + 3;//相当于a = a*（b+3）
		System.out.println("a="+a+"\nb="+b);

	}

}
