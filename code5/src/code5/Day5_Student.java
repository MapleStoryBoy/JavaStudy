package code5;

public class Day5_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象的格式：类名 对象名 = new 类名();
		// 对象名：其实就是合法的标识符，如果是一个单词所有的字母小写，如果是多个单词，从第二个开始首字母大写
		Student s = new Student();
		// 如何使用成员变量呢？
		//对象名.变量名
		s.name = "张三";
		s.age = 23;
		System.out.println(s.name + "..." +s.age);
		// 如何使用成员方法呢？
		// 对象名.方法名(...)
		s.study();
		s.sleep();
	}

}
