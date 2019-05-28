package code6;
public class ArrayTool {
	//1,获取最大值
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;//返回最大值
	}
	//2,数组的遍历
	public void print(int[] arr) {
		for (int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//数组的反转
	public void revArray(int[] arr) {
		for (int i = 0;i < arr.length / 2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}
