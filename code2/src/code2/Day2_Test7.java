package code2;
/*
 * 案例演示

    需求：获取三个数据中的最大值
    if语句的嵌套使用。

 */
public class Day2_Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 60;
		int c = 30;
		if (a > b) {
			if (a > c) {
				System.out.println(a + "是最大值");
			}else {
				System.out.println(c + "是最大值");
			}
		}else {
			if (b > c) {
				System.out.println(b + "是最大值");
			}else {
				System.out.println(c + "是最大值");
			}
		}

	}

}
