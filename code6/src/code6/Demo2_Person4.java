package code6;

public class Demo2_Person4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 p1 = new Person4("张三",23);
		System.out.println(p1.getName() + "..." + p1.getAge());
		System.out.println("-----------------------------");
		Person4 p2 = new Person4();
		p2.setName("李四");
		p2.setAge(24);
		
		p2.setName("李鬼");
		System.out.println(p2.getName() + "..." + p2.getAge());
	
	}

}
class Person4 {
	private String name;
	private int age;
	
	public Person4() {
		System.out.println("空参构的造");
	}
	public Person4(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("又参的构造");
	}
	public void setName(String name) {  
		this.name = name;     //设置姓名
	}
	public String getName() {
		return name;          // 获取姓名
	}
	public void setAge(int age) {
		this.age = age;	      //设置年龄
	}
	public int getAge() {
		return age;	          //获取年龄
	}
	
	
}