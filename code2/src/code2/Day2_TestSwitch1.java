package code2;

//A:整数(给定一个值,输出对应星期几)

public class Day2_TestSwitch1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 5;
		switch (week) {
		case 1:
			System.out.println("星期一");
		break;
		case 2:
			System.out.println("星期二");
		break;
		case 3:
			System.out.println("星期三");
		break;
		case 4:
			System.out.println("星期四");
		break;
		case 5:
			System.out.println("星期五");
		break;
		case 6:
			System.out.println("星期六");
		break;
		case 7:
			System.out.println("星期日");
		break;
		default:
			System.out.println("对不起没有对应的星期");
		break;
		}
	}
}
/*
A:案例演示

a:case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
b:default可以省略吗?
    可以省略，但是不建议，因为它的作用是对不正确的情况给出提示。
    特殊情况：
        case就可以把值固定。
        A,B,C,D
c:break可以省略吗?
    最后一个可以省略,其他最好不要省略
    会出现一个现象：case穿透。
    最终我们建议不要省略
d:default一定要在最后吗?
    不是，可以在任意位置。但是建议在最后。
e:switch语句的结束条件
    a:遇到break就结束了
    b:执行到switch的右大括号就结束了
*/