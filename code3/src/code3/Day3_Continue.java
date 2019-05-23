package code3;
//A:continue的使用场景

//只能在循环中

public class Day3_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1;x <= 10;x++) {
			if (x == 4) {
				continue;   //查看结果可以看到跳过了4这个值
			}
			System.out.println("x = " + x);
		}

	}

}
