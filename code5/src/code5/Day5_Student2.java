package code5;

public class Day5_Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
		Student2 s = new Student2();
		print(s);
	}
	public static void print(int x) {  //基本数据类型当作形式参数
		System.out.println(x);
	}
	public static void print(Student2 stu) { //引用数据类型当作形式参数
		stu.name = "张三";
		stu.age = 23;
		stu.speak();
		
	}

}
//A:方法的参数是类名public void print(Student s){}//print(new Student());
//如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象。
class Student2 {
	String name;
	int age;
	
	public void speak() {
		System.out.println(name + "...." + age);
	}
}
