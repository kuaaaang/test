package B4_입력_기본이론;

import java.util.Scanner;

public class 입력_평가문제_오류_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  	숫자 3개를 입력받는다.
		  	그숫자중에 한개의 숫자라도 홀수가있으면 오류입니다.
		  	아래숫자들은오류가 있나요?
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int 숫자1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int 숫자2 = scan.nextInt();
		
		System.out.println("세번째 숫자를 입력하세요.");
		int 숫자3 = scan.nextInt();

		System.out.println(숫자1%2 == 0 && 숫자2%2 == 0 && 숫자3%2 == 0);
		
		scan.close();
	}
}
