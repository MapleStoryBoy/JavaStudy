package code4;
/*
A:案例演示
数组元素查找(查找指定元素第一次在数组中出现的索引)
*/
public class Day4_Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55,66,77};
		int index = getIndex(arr,55);
		System.out.println(index);
	}
	/*
	 * 查找元素索引
	 * 1，返回值类型int
	 * 2，明确参数列表，int[] arr,int value
	 */
	public static int getIndex(int[] arr,int value) {
		for (int i = 0;i < arr.length;i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
