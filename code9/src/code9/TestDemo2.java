package code9;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 九九乘法表
		for (int i=1;i<10;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j + "*" + i + "=" + (i * j<10?(" " + i * j) : i * j) + "  ");
			}
			System.out.println();
		}

	}

}