package code3;

/*
A:return的作用
    返回
    其实它的作用不是结束循环的，而是结束方法的。
B:案例演示
    return和break以及continue的区别?
    return是结束方法
    break是跳出循环
    continue是终止本次循环继续下次循环
*/

public class Day3_Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i <= 10;i++) {
			if (i == 4) {
				//break;   // 结束循环
				return;    //返回的意思，用来返回方法
			}
		}
		System.out.println("结束");
	}

}
