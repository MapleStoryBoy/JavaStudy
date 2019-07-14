package code12;
/*
• this的作用:
	• this表示的是当前对象本身，
	• 更准确地说，this代表当前对象的一个引用。
• 普通方法中使用this。
	• 区分类成员属性和方法的形参.
	• 调用当前对象的其他方法(可以省略) 
	• 位置:任意
• 构造方法中使用this。
	• 使用this来调用其它构造方法 
	• 位置:必须是第一条语句
• this不能用于static方法。
 */
public class TestThis {
	int a,b,c;
	TestThis(int a,int b){
		this.a = a;
		this.b = b;
	}
	TestThis(int a,int b,int c){
		this(a,b);
		this.c = c;
	}
	void sing() {}	
	void eat() {
		this.sing();
		System.out.println("你妈妈喊你回家吃饭！");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThis hi = new TestThis(2,3);
		hi.eat();

	}

}
