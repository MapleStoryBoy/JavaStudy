package code9;

public class TestDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		while(a<0) {
			System.out.println(a);
			a++;
		}
		System.out.println("-------------------------");
		a = 0;
		do {
			System.out.println(a);
			a++;
		}while(a<0);
		
		//While和dowhile的区别: Dowhile总是保证循环体会被至少执行一次! 这是他们的主要差别
		// do while   先执行，后判断。
		//while 先判断，后执行。

	}

}
