package code3;
/*
案例演示
需求：请输出一个4行5列的星星(*)图案。
如图：
    *****
    *****
    *****
    *****
注意：
    System.out.println("*");和System.out.print("*");的区别
B:结论：
外循环控制行数，内循环控制列数
*/
public class Day3_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i <= 3;i++) {
			System.out.println("i = " + i);
			for (int j = i;j <= 3;j++) {
				System.out.println("j = " + j);
			}
		}
	}
}
