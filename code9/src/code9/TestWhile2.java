package code9;

public class TestWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用while和for循环输出1-1000之间能被5整除的数，且每行输出5个
		int i = 1;
		int j = 0;
		while(i<=1000) {
			if (i%5==0) {
				System.out.print(i+"\t");
				j++;
			}
			i++;
			if (j==5) {
				System.out.println();
				j = 0;
			}
		}

	}

}
