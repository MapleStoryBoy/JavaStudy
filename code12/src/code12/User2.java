package code12;

public class User2 {
	int id;
	String name;
	String pwd;
	
	static String company = "A";
	
	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		System.out.println("登录：" + name);
	}
	
	public static void printCompany() {
		//login(): //调用非静态成员，编译会报错
		System.out.println(company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User2 u = new User2(101,"a");
		User2.printCompany();
		User2.company = "b";
		User2.printCompany();
	}

}
