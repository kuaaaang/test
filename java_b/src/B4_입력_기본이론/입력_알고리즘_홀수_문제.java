package B4_입력_기본이론;

import java.util.Scanner;

public class 입력_알고리즘_홀수_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		[문제]
		 숫자 1개를 입력받는다. 그숫자가 홀수인가요?	
	    */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int 숫자 = scan.nextInt();
		
		System.out.println(숫자%2 > 0);
		scan.close();
	}
}
