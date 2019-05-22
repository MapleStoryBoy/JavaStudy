package code3;
/*
A:循环结构do...while语句的格式：
do {
    循环体语句;
}while(判断条件语句);
完整格式；
初始化语句;
do {
    循环体语句;
    控制条件语句;
}while(判断条件语句);
B:执行流程：
    a:执行初始化语句
    b:执行循环体语句;
    c:执行控制条件语句
    d:执行判断条件语句,看其返回值是true还是false
        如果是true，就继续执行
        如果是false，就结束循环
    e:回到b继续。
C:案例演示
    需求：请在控制台输出数据1-10
*/
public class Day3_DoWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			System.out.println("i = " + i);
			i++;
		}
		while (i <= 10);
	}
}
/*
    三种循环语句的区别:
    do...while循环至少执行一次循环体。
    而for,while循环必须先判断条件是否成立，然后决定是否执行循环体语句。
*/




