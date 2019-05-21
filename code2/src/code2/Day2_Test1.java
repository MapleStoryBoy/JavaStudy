package code2;
import java.util.Scanner;
public class Day2_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
		Scanner sc = new Scanner(System.in);  //创建键盘录入对象
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();                 // 将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();                 // 将键盘录入的数据保存在y中
		System.out.println("请输入第三个整数：");
		int z = sc.nextInt();                 // 将键盘录入的数据保存在z中
		
		//定义临时变量记录比较出前两个变量中的最大值
		int temp = (x > y) ? x : y;
		//将比较后的结果与第三个变量中的值比较，比较出三个数中的最大值
		int max = (temp > z) ? temp : z;
		System.out.println(max);
		
	}

}
