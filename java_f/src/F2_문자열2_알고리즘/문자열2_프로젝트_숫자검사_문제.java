package F2_문자열2_알고리즘;

import java.util.Scanner;

public class 문자열2_프로젝트_숫자검사_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 문자열 속 숫자검사
		  예) adklajsiod
		  	 문자만 있다.
		  예) 123123
		     숫자만 있다.
		  예) dasd12312asd
		     문자와 숫자가 섞여있다.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		
		int count = 0;
		for(int i = 0; i<text.length(); i+=1) {
			if(text.charAt(i) <= 57 && text.charAt(i) >= 48) {
				count += 1;
			}
		}
		if(count == text.length()) {System.out.println("숫자만 있다.");}
		else if(count == 0) {System.out.println("문자만 있다.");}
		else {System.out.println("문자와 숫자가 섞여있다.");}
	}
}
