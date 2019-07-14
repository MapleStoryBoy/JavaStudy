package code9;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用while和for循环分别计算100以内奇数和偶数的和，并输出
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1;i<100;i++) {
			if (i%2==0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
		for (int i=1,j=i+10;i<5;i++,j=i*2) {
			System.out.println(i);
			System.out.println(j);
		}

	}

}
