package code9;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 一元运算符 ++ 与 --
		int a = 3;
		int b = a++; // 执行完后，b=3，先给b赋值，再自增
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a;// 执行完后，b=4，a先自增，再给c赋值
		System.out.println("a="+a+"\nc="+b);
		

	}

}
