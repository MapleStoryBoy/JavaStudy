package code7;
//计算素数50以内
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nValues = 50;  //定义整型value
		boolean isPrime = true; 
		
		for (int i = 2;i <= nValues;i++) {
			isPrime = true;
			
			for (int j = 2;j < i;j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);
		}
	}

}
