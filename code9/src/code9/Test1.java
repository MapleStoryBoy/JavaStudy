package code9;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用while和for循环分别计算100以内奇数和偶数的和，并输出。
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;
		while(i<100) {
			if (i%2==0) {
				sum1 += i;				
			}else {
				sum2 += i;
			}
			i++;
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
