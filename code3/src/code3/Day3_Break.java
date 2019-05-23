package code3;

//A:break的使用场景

//只能在switch和循环中

public class Day3_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1;x <= 10;x++) {
			if (x == 4) {
				break;
			}
			System.out.println("x = " + x);
		}
	}

}
