package code7;
//带标签的continue
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long limit = 20L;
		long factorial = 1L;
		
		OuterLoop:
			for(long i = 1L;i <= limit;i++) {
				factorial = 1;
				for(long j = 2L;j <= i;j++) {
					if(i > 10L && i % 2L == 1L) {
						continue OuterLoop;
					}
					factorial *= j;
				}
				System.out.println(i + "! is " + factorial);
			}
	}

}
