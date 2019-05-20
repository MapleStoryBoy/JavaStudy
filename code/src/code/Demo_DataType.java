package code;

public class Demo_DataType {   //Data_Type数据类型
	public static void main(String[] args) {
		//整数类型
		byte b = 10;     //占一个字节，-128～127
		short s = 20;    //占两个字节
		int i = 30;      //占四个字节,整数类型默认就是int类型
		long x =8888888L;      //占八个字节,如果long类型后面加L进行标识最好加大写的L，小l长的像1.
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(x);
		
		System.out.println(12345 + 5432l);
		
		//浮点类型
		float f = 12.3f;   // 占四个字节,因为小数默认是double类型，所以这里要加个f
		double d = 33.4;  // 占八个字节，小数默认的数据类型是double
		System.out.println(f);
		System.out.println(d);
		
		//字符类型
		char c = 'a';
		System.out.println(c);
		
		//布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
