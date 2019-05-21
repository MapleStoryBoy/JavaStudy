package code2;

public class Day2_Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 案例演示 >>,>>>,<<的用法:
    		<<:左移 左边最高位丢弃，右边补齐0
    		>>:右移 最高位是0，左边补齐0;最高为是1，左边补齐1
    		>>>:无符号右移 无论最高位是0还是1，左边补齐0
    		最有效率的算出2 * 8的结果
		 */
		//左移，向左移动几位就是乘以2的几次幂
		System.out.println(12 << 1);
		System.out.println(12 << 2);
		System.out.println(2 << 3);
		
		//右移,向右移动几位就是除以2的几次幂
		System.out.println(12 >> 1);
		System.out.println(12 >> 2);
		
	}

}
