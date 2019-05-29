package code7;

public class Demo4_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.print();
	}

}
class Father {
	int num1 = 10;
	int num2 = 30;   //子父类出现同名的变量
}
class Son extends Father {
	int num2 = 20;
	public void print() {
		System.out.println(num1);
		System.out.println(num2);    //就近原则
		System.out.println(super.num2);
	}
/*
08.08_面向对象(this和super的区别和应用)(掌握)

A:this和super都代表什么

    this:代表当前对象的引用,谁来调用我,我就代表谁
    super:代表当前对象父类的引用
B:this和super的使用区别

    a:调用成员变量
        this.成员变量 调用本类的成员变量,也可以调用父类的成员变量
        super.成员变量 调用父类的成员变量
    b:调用构造方法
        this(...) 调用本类的构造方法
        super(...) 调用父类的构造方法
    c:调用成员方法
        this.成员方法 调用本类的成员方法,也可以调用父类的方法
        super.成员方法 调用父类的成员方法

*/	
	
	
	
	
}