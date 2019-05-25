package code4;
/*
A:案例演示
数组获取最值(获取数组中的最大值最小值)
*/
public class Day4_Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {33,11,22,44,55};
		int max = getMax(arr);
		System.out.println(max);
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length;i++) {  //从数组的第二个元素开始遍历
			if (max < arr[i]) {    //如果max记录的值小于数组中的元素
				max = arr[i];  //max记录住较大的
			}
		}
		return max;
	}
}
