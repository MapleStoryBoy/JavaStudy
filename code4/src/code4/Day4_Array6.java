package code4;
/*
A:静态初始化的格式：
    格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
    简化格式：
        数据类型[] 数组名 = {元素1,元素2,…};
B:案例演示
    对数组的解释
    输出数组名称和数组元素
C:画图演示
    一个数组
*/

public class Day4_Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {11,22,33,44,55};//不允许动静结合
		int[] arr2 = {11,22,33,44,55};
		System.out.println(arr);
		System.out.println(arr2);
		
		
	}

}
