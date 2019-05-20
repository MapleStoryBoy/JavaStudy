package code;

public class Demo4_DataTypeConversion {
	public static void main(String[] args) {
		float f = 12.3f;
		long x = 12345;
		
		//f = x;         // 隐式转换
		//System.out.println(f);
		x = (long)f;     //强制转换
		System.out.println(x);
		/*
		 * float占四个字节
		 * IEEE 754
		 * 32个二进制位
		 * 1代表是符号位
		 * 8位代表指数位  00000000 - 11111111  0～255之间
		 * 0代表0
		 * 255代表无穷大
		 * 1～254
		 * -126～127
		 * 23位代表尾数位
		 * 结合文字笔记了解
		 */
		
		// 字符和字符串参与运算
		System.out.println('a');
		System.out.println('a' + 1); //a与int类型相加，a会提升到int类型，根据ASCII表得到a是97
		System.out.println((char)('a' + 1)); //char类型转换98为ASCII表98对应的b
		System.out.println("Hello" + 'a' + 1);//任何数据类型用+与字符串连接都会产生新的字符串
		System.out.println('a' + 1 + "Hello");//运算从左往右算，所以的到98Hello
		
		System.out.println("5 + 5 = " + 5 + 5);
		System.out.println("5 + 5 = " + (5 + 5));//可以加个小括号提升计算的优先级
		
	}
}
