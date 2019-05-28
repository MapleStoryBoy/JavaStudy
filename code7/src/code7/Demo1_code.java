
package code7;
class Demo1_Code {
	public static void main(String[] args){
		{
			int x = 10;     //限定变量的声明周期
			System.out.println(x);
		}
	}
}

class Student {
	private String name;
	private int age;

	public Student(){}

	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}



