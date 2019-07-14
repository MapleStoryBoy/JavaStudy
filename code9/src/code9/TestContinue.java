package code9;

public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//把100～150之间不能被3整除的数输出。每行输出5个
		int count = 0;//定义计数器
		for (int i=100;i<150;i++) {
			if (i%3==0) {
				continue;//满足i%3==0，下面代码就不执行返回for循环开头
		     }
			System.out.print(i+"\t");
			count++;
			if (count%5==0) {
				System.out.println();
			}
		}
	}
}
