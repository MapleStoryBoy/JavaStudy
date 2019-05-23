package code3;

public class Day3_Mark {   //mark标记

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a: for (int i = 1;i <= 10;i++) {  // a就是标号，只要是合法的标识符即可
			System.out.println("i = " + i);
			b: for (int j =1;j <= 10;j++) {
				System.out.println("j = " + j);
				break b;
			}
			//break;
		}
	}

}
