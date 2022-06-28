package D1_반복문1_기본이론;

public class 반복문1_알고리즘_십의자리_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		   9의 배수중 십의 자리가 6인 첫번째 배수 출력하시오.
		   답 : 63
		*/
		int i = 0;
		while(i>=0) {if(i>59 && i <70) {System.out.println(i);}
		             i = i+9;}
	}
}
