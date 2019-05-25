package code4;
/*
A:二维数组概述
B:二维数组格式1
    int[][] arr = new int[3][2];
C:二维数组格式1的解释
D:注意事项
    a:以下格式也可以表示二维数组
        1:数据类型 数组名[][] = new 数据类型[m][n];
        2:数据类型[] 数组名[] = new 数据类型[m][n];
    B:注意下面定义的区别
    int x;
    int y;
    int x,y;
    int[] x;
    int[] y[];
    int[] x,y[];    x是一维数组,y是二维数组
*/

public class Day4_Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][2];
		/*
		 * 这是一个二维数组
		 * 这个二维数组中有3个一维数组
		 * 每个一维数组中有两个元素
		 */
		System.out.println(arr);  //二维数组
		System.out.println(arr[0]);  //二维数组中的第一个一维数组
		System.out.println(arr[0][0]); //二维数组中的第一个一维数组的第一个元素
		
	}

}
