package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최소공배수1_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
		  8 과 12 의 최소 공배수를 구하시요
			 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은숫자를 말한다.
			 예) 8 16 24... 
			 예) 12 24....
			 여기서 24가 최소공배수이다.
	    */
		
		int a = 8;
		int b = 12;
		int num1 = a;
		int num2 = b;
		
		while(true) {if(num1>num2) {num2 = num2 + 12;}
		             else if(num2>num1) {num1 = num1 + 8;}
		             else if(num1==num2) {System.out.println("최소공배수 : " + num1);
		                                  break;}
		             }
	}
}
