package D_테스트_연습;

public class 테스트0401_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제] 
	  		6의 배수를 순차적으로 검사한다. 
	  		6배수중 100에 가장가까운 수를 출력 하시오.
	 	[정답]
	 		102
	 	*/
		
		int i = 0;
		while(i>=0) {
			i += 1;
			if(i%6 == 0 && i>=94 && i<=106) {System.out.println(i);}
		}
		
		System.out.println(100-96);
		System.out.println(102-100);
		
		System.out.println("102가 가장 100에 가까운 6의 배수이다.");
	}
}
