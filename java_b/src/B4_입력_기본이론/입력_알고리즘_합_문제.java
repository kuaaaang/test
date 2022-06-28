package B4_입력_기본이론;

import java.util.Scanner;

public class 입력_알고리즘_합_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
		 숫자 2개를 입력받는다. 두숫자의 합을구하시오.
        */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int 숫자1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int 숫자2 = scan.nextInt();
		
		System.out.println(숫자1 + 숫자2);
		scan.close();
	}
}
