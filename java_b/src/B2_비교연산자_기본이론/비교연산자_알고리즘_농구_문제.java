package B2_비교연산자_기본이론;

public class 비교연산자_알고리즘_농구_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	    문제) 
		  철수는 농구공을 12번던저서 7번성공했다.
		  영희는 농구공을 17번던저서 9번성공했다.
		  
		  영희의 성공확률이 철수의 성공확률보다 더높나요?
	   */
		
		double 철수던짐 = 12;
		double 철수성공 = 7;
		double 철수성공확률 = 철수성공/철수던짐;
		double 영희던짐 = 17;
		double 영희성공 = 9;
		double 영희성공확률 = 영희성공/영희던짐;
		
		System.out.println(철수성공확률);
		System.out.println(영희성공확률);
		System.out.println(철수성공확률 > 영희성공확률);
		System.out.println(철수성공확률 < 영희성공확률);	
	}
}
