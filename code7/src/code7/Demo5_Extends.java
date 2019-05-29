package code7;

public class Demo5_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s = new Son1();
	}

}
/*
A:案例演示
子类中所有的构造方法默认都会访问父类中空参数的构造方法
B:为什么呢?
因为子类会继承父类中的数据，可能还会使用父类的数据。
所以，子类初始化之前，一定要先完成父类数据的初始化。
其实：
    每一个构造方法的第一条语句默认都是：super() Object类最顶层的父类
*/

class Father1 {
	public Father1() {
		System.out.println("Father 的构造方法");
	}
}
class Son1 extends Father1 {
	public Son1() {
		super();    //这是一条语句，如果不写，系统会默认加上，用来访问父类中的空参构造
		System.out.println("Son 的构造方法");
	}
}