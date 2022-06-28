package D1_반복문1_기본이론;

public class 반복문1_알고리즘_약수1_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[문제] 
		 148의 약수를 전부 출력하시오. (어떤수를 나누어떨어지게하는수를 그수의 약수라고합니다.)
	    */
		int i = 1;
		while (i<=148) {if(148%i == 0) {System.out.println(i);}
		                i = i + 1;
		                }
	}
}
