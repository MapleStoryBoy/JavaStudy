package code9;

public class TestFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用while和for循环输出1-1000之间能被5整除的数，且每行输出5个
		int j = 0;
		for (int i=1;i<=1000;i++) {
			if (i%5==0) {
				System.out.print(i+"\t");
				j++;
			}
			if (j==5) {
				System.out.println();
				j = 0;
			}
		}

	}

}
