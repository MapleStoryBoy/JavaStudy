package code9;
 
import java.util.Scanner;
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = scanner.nextLine();
		
		System.out.println("请输入你的爱好：");
		String favor = scanner.nextLine();
		
		System.out.println("请输入你的年龄：");
		int age = scanner.nextInt();
		
		System.out.println("***************************");
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);

	}

}
