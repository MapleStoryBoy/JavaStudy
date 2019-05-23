package code3;

// 需求：在控制台输出九九乘法表。
public class Day3_Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i <= 9;i++) {
			for (int j = 1;j <= i;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + '\t');
			}
			System.out.println();
		}
	}
}
/*
注意：
'\x' x表示任意，\是转义符号,这种做法叫转移字符。

'\t'    tab键的位置
'\r'    回车
'\n'    换行
'\"'
'\''
*/
