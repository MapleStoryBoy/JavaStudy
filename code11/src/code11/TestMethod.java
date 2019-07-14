package code11;

public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		int c = tm.add(2, 3, 4)+100;
		System.out.println(c);

	}
	void printSxt() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");		
	}
	
	int add(int a,int b,int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum; //return两个作用：1，结束方法的运行，2，返回值
	}

}
