package code8;

public class Demo2_Polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Son();      // 父类引用指向子类对象
		System.out.println(f.num);
		
		Son s = new Son();
		System.out.println(s.num);
	}

}
/*
 * 成员变量
 * 编译看左边（父类），运行看左边（父类）
 * 
 */
class Father {
	int num = 10;
}
class Son extends Father {
	int num = 20;
}


