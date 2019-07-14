package code12;

public class User {
	int id;
	String name;
	String pwd;
	
	public User() {}
	
	public User(int id,String name) {
		// super(); //构造方法的第一句总是super()
		this.id = id; //this表示创建好的对象。
		this.name = name;
	}
	
	public User(int id,String name,String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		User u2 = new User(101,"a");
		User u3 = new User(100,"b","123456");
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);

	}

}

