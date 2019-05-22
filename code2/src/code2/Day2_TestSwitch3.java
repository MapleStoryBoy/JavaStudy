package code2;

public class Day2_TestSwitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 3;
		switch(x){
		    default:
		        y++;
		        //没有遇到break，所以继续执行case，知道遇到大括号，程序退出，输出y值
		    case 3:
		        y++;
		    case 4:
		        y++;
		}
		System.out.println("y="+y);

	}

}
