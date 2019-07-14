package code11;

public class TestRecursion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}
	static int count = 0;
	static void a() {
		System.out.println("a");
		count++;
		if (count<10) {
			a();
		}else {
			return;
		}
	}
	
	static void b() {
		System.out.println("b");
	}

}
