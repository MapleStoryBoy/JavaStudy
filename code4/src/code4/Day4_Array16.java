package code4;
/*
A:案例演示
需求：二维数组遍历
外循环控制的是二维数组的长度，其实就是一维数组的个数。
内循环控制的是一维数组的长度。
*/
public class Day4_Array16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0;j < arr[i].length;j++) {  //获取到每个二维数组中的一维数组
				System.out.println(arr[i][j] + " "); //获取每个一维数组中的元素
			}
			System.out.println();
		}
	}

}
