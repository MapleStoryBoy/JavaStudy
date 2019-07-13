package code9;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求1到100之间的累加和
		int i = 0;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
