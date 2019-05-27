package code6;

public class Demo5_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1 = new Person6();
		p1.name = "苍老师";
		p1.country = "日本";
		p1.speak();
		
		Person6 p2 = new Person6();
		p2.name = "小泽老师";
		p2.country = "日本"; 
		p2.speak();
	}

}
class Person6 {
	String name;
	String country;
	// static String country;  静态
	public void speak() {
		System.out.println(name + "..." + country);
	}
}