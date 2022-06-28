package C1_조건문1_기본이론;

import java.util.Scanner;

public class 조건문1_알고리즘_짝수홀수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		   int a 변수에 숫자를 입력받고 "짝수" "홀수" 를 출력하시오.
		  
		 예)
		  (1) 숫자를 입력 : 
		  (2) 짝수
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int a = scan.nextInt();
		
		if(a%2 == 0) {System.out.println("짝수");}
		if(a%2 != 0) {System.out.println("홀수");}
		
		scan.close();
	}
}
