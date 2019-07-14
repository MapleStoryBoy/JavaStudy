package code12;

public class JspStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JspStu stu = new JspStu();
		stu.id = 1001;
		stu.name = "jsp";
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		
		stu.comp = c1;
		
		stu.play();
		stu.study();
	}
	
	int id;
	String name;
	int age;
	Computer comp;//计算机
	
	
	void study() {
		System.out.println("我在学习，使用电脑：" + comp.brand);
	}
	
	void play() {
		System.out.println("我在玩游戏");
	}
}
class Computer {
	String brand;
}