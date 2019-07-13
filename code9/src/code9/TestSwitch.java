package code9;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch语句
		int month = (int)(1+12*Math.random());
		System.out.println("月份："+month);
		
		switch(month) {
		case 1:
			System.out.println("一月份！过新年了");
			break;
		case 2:
			System.out.println("二月份！开春了");
			break;
		default:
			System.out.println("其它月份");
			break;
		}
	

	}

}
