package code4;
/*
A:案例演示
数组元素反转(就是把元素对调)
*/
public class Day4_Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55};
		reverseArray(arr);
	}
	/*
	 * 数组元素反转
	 * 1，明确返回值类型void
	 * 2，明确参数列表int[] arr
	 */
	public static void reverseArray(int[] arr) {
		for (int i = 0;i < arr.length / 2;i++) {
			//arr[0]和[arr.length - 1]交换
			//arr[1]和arr[arr.length-1-1]交换
			//arr[2]和arr[arr.length-1-2]
			//....
			int temp = arr[i];
			arr[0] = arr[arr.length - 1 - i];
			arr[arr.length-1] = temp;
		}
	}

}
