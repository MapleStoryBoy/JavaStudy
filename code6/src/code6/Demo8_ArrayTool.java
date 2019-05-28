package code6;

public class Demo8_ArrayTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {33,11,22,66,55,44};
		ArrayTool at = new ArrayTool();
		int max = at.getMax(arr);
		System.out.println(max);
		
		at.print(arr);
	}

}
