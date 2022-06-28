package C_테스트_연습;

public class 테스트0304_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[설명]
			어느 농장에는 토끼와 오리가 모두 35마리가 있다. 
			토끼와 오리의 다리의 수의 합이 96개이다.		 
			토끼와 오리는 각각 몇마리 인지 구하시오. 
			주석으로 표현하시오.
	   */
		
		/*
		 a = 토끼 수
		 b = 오리 수
		 a+b = 35
		 a*4 + b*2 = 95
		 */
		int a = 13;
		int b = 22;
		
		System.out.println(a+b);
		System.out.println(a*4 + b*2);
		System.out.println("토끼 " + a + "마리");
		System.out.println("오리 " + b + "마리");
	}
}
