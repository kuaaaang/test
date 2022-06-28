package C2_조건문2_기본이론;

import java.util.Scanner;

public class 조건문2_알고리즘_최대값_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		 	최대값 구하기
		  1. 숫자 3개를 입력받는다.
		  2. 입력받은 3개의 수를 비교한다.
		  3. 가장 큰 수(MAX)를 출력한다.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int b = scan.nextInt();
				
		System.out.println("세번째 숫자를 입력하세요.");
		int c = scan.nextInt();
		
		if(a>b && a>c) {System.out.println("가장 큰 수는" + a + "입니다.");}
		if(b>a && b>c) {System.out.println("가장 큰 수는" + b + "입니다.");}
		if(c>a && c>b) {System.out.println("가장 큰 수는" + c + "입니다.");}
		if(a == b && b == c) {System.out.println("가장 큰 수는" + a + "입니다.");}
	scan.close();
	}
}
