package code4;

public class Day4_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];  //动态初始化，在内存中开辟连续的5块空间

	}

}
/*
A:什么是数组的初始化
就是为数组开辟连续的内存空间，并为每个数组元素赋予值
B:如何对数组进行初始化
a:动态初始化 只指定长度，由系统给出初始化值
    int[] arr = new int[5];
b:静态初始化 给出初始化值，由系统决定长度
C:动态初始化的格式：
数据类型[] 数组名 = new 数据类型[数组长度];
D:案例演示
输出数组名称和数组元素
*/