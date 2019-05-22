package code3;
/*
需求：统计”水仙花数”共有多少个
	分析：
	1，需要一个变量记录住水仙花数的个数
	2，获取到所有的3位数
	3，判断是否满足水仙花数
	4，如果满足条件，计数器就自增
*/
public class Day3_TestFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100;i <= 999;i++) {
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 10 / 10 % 10;
			if (i == a*a*a + b*b*b + c*c*c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
