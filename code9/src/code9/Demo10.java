package code9;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if-else if - else结构
		int age = (int) (100 * Math.random()); 
		System.out.print("年龄是" + age + ", 属于"); 
		
		if (age < 15) {
			System.out.println("儿童, 喜欢玩!");
			} else if (age < 25) {
			System.out.println("青年, 要学习!");
			} else if (age < 45) {
			System.out.println("中年, 要工作!");
			} else if (age < 65) {
			System.out.println("中老年, 要补钙!");
			} else if (age < 85) {
			System.out.println("老年, 多运动!");
			} else {
				System.out.println("老寿星, 古来稀!");
			}

	}

}
