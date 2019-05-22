package code2;


/*
A:switch语句的格式
switch(表达式) {  //基本数据类型可以接收byte，short，char，int
      case 值1： // 引用数据类型可以接收枚举（JDK1.5）String字符串
        语句体1;
        break;
        case 值2：
        语句体2;
        break;
        …
        default：    
        语句体n+1;
        break;
}
B:switch语句的格式解释
C:面试题
    byte可以作为switch的表达式吗?
    long可以作为switch的表达式吗?  //不可以
    String可以作为switch的表达式吗?
C:执行流程
    先计算表达式的值
    然后和case后面的匹配，如果有就执行对应的语句，否则执行default控制的语句
*/
public class Day2_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "张三";
		String gender = "男士";
		switch (gender) {
		case "男士":
			System.out.println(name + "是一位" + gender + "喜欢吃饭睡觉打豆豆");
		break;
		case "女士":
			System.out.println(name + "是一位" + gender + "喜欢购物逛街美容");
		break;
		default:
			System.out.println(name + "是一位" + gender + "人妖");
		break;
		}
	}

}
