package code;

public class Demo3_DataTypeConversion {          // Convertion转换
	public static void main(String[] args) {
		//数据类型转换之隐式转换
		int x = 3;
		byte y = 4;
		x = x + y;  //计算机底层会把byte提升为int类型，然后再相加
		System.out.println(x);
		
		// 数据类型转换之强制转换
		int a = 3;
		byte b = 4;
		b = (byte)(a + b); //添加强制转换符，强制砍掉前3个8位。
		System.out.println(b);
		//注意事项
		byte k = (byte)(126 + 4);
		System.out.println(k);  //为什么输出的是-126
		//00000000000000000000000010000010  130的二进制
		//10000010     -126的补码
		//00000001     减1求反码
		//10000001     -126的反码
		//11111110     -126的原码
		
		byte b2 = (byte)300;
		//00000000 00000000 00000001 00101100   300的二进制
		System.out.println(b2);   //求的结果44
		//00101100 砍掉前三个8位-------得到44
		//所以强转有可能损失精度
		
		/*
		 *  面试题：看下面的程序是否有问题，如果有问题，请指出并说明理由
		 *  byte b1 = 3;
		 *  byte b2 = 4;
		 *  byte b3 = b1 + b2;
		 *  byte b4 = 3 + 4;
		 */
		byte d1 = 3;
		byte d2 = 4;
		//byte b3 = d1 + d2;
		//System.out.println(b3);
		/*
		 * 从两个方面
		 * 1，byte与byte（或者short，char）进行运算的时候会提升为int类型，两个int类型相加的结果也是int类型
		 * 2，d1和d2是两个变量，变量存储的值是变化的。在编译的时候无法判断里面具体的值，相加有可能会超出byte的取值范围
		 */
		byte b4 = 3 + 4; //java编译器有常量优化机制
		System.out.println(b4);
		
		
		
	}
}
