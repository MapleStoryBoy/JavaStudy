package code5;
/*
A:人类赋值年龄的问题
B:private关键字特点
    a:是一个权限修饰符
    b:可以修饰成员变量和成员方法
    c:被其修饰的成员只能在本类中被访问
C:案例演示
    封装和private的应用：
    A:把成员变量用private修饰
    B:提供对应的getXxx()和setXxx()方法
    private仅仅是封装的一种体现形式,不能说封装就是私有
*/

public class Day5_Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();
		p1.name = "张三";
		//p1.age = 23;
		p1.speak();
		p1.setAge(1000);
		System.out.println(p1.getAge());
	}
}
class Person1 {
	String name;
	private int age;
	public void setAge(int a) {  //设置年龄
		if (a > 0 && a < 200) {
			age = a;
		}else {
			System.out.println("请回火星");
		}
	}
	public int getAge() {   //获取年龄
		return age;
	}
	public void speak() {
		System.out.println(name + "..." + age);
	}
}






