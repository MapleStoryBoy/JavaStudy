package code2;

public class Day2_TestSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 3;
		switch(x){
		    default:
		        y++;
		        break;
		    case 3:
		        y++;
		    case 4:
		        y++;
		}
		System.out.println("y="+y);

	}

}
