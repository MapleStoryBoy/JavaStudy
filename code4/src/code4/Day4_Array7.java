package code4;
/*
A:案例演示
数组遍历：就是依次输出数组中的每一个元素。
数组的属性:arr.length数组的长度
数组的最大索引:arr.length - 1;
*/
public class Day4_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55};
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		for (int i = 0;i < 5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		//arr.length 代表的是数组的长度
		System.out.println(arr.length);
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		int[] arr2 = {3,4,5};
		print(arr2);
	}
	/*
	 * 数组的遍历
	 * 1，返回类型void
	 * 2，参数列表int[] arr
	 */
	public static void print(int[] arr) {
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
