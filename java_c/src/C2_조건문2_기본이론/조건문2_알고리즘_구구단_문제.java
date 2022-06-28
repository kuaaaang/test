package C2_조건문2_기본이론;

import java.util.Scanner;

public class 조건문2_알고리즘_구구단_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
		   구구단 게임
		  1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		  2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
		  예)	3 x 7 = ?
		  3. 문제에 해당하는 정답을 입력받는다.
		  4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int n1 = scan.nextInt();
		
		System.out.println("두번쨰 숫자를 입력하세요.");
		int n2 = scan.nextInt();
		
		System.out.println(n1 + " X " + n2 + " = ?");
		int 정답 = scan.nextInt();
		
		if(정답 == n1*n2) {System.out.println("정답!");}
		if(정답 != n1*n2) {System.out.println("땡!");}
		
		
		
		scan.close();
	}
}
