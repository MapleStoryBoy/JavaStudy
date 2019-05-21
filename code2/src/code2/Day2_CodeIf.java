package code2;

/*
    a:比较表达式无论简单还是复杂，结果必须是boolean类型
    b:if语句控制的语句体如果是一条语句，大括号可以省略；
        如果是多条语句，就不能省略。建议永远不要省略。
    c:一般来说：有左大括号就没有分号，有分号就没有左大括号

 */


public class Day2_CodeIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		if (age >= 18) 
			System.out.println("可浏览本网站");
		
		System.out.println("完了");
	}
}