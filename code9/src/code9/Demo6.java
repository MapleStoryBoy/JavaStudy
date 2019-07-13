package code9;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//条件运算符
		int socre = 80;
		String type = socre<60?"不及格":"及格";
		System.out.println(type);
		
		if(socre<60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		
		int x = -100;
		System.out.println(x>0?1:(x==0?0:-1));

	}

}
