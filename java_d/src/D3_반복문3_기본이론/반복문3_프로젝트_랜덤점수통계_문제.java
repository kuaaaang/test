package D3_반복문3_기본이론;

import java.util.Random;

public class 반복문3_프로젝트_랜덤점수통계_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [랜덤점수통계]
		  
		  1. 10회 반복을 한다.
		  2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		  3. 성적이 60점 이상이면 합격생이다.
		  ---------------------------------------
		  . [1] 전교생(10명)의 총점과 평균을 출력한다.
		  . [2] 합격자 수를 출력한다.
		  . [3] 1등 학생의 번호와 성적을 출력한다.
		*/
		Random ran = new Random();
		int count = 0;
		int counto = 0;
		int a = 0;
		int b = 0;
		
		while(true) {int n = ran.nextInt(100)+1;
		  	         System.out.println(n);
		             count = count + 1;
		             a = a + n;
		     
		             if(n>=60) {counto = counto + 1;}
		             
		             if(n>b) {b=n;}
		             
		             if(count == 10) {System.out.println("평균 : " + a/10.0 + " 점");
		                              break;}

		              }
		System.out.println("합격자수 : " + counto + " 명");
		System.out.println("1등 점수 : " + b + " 점");
	}
}
