package B4_입력_기본이론;

import java.util.Scanner;

public class 입력_알고리즘_장학생_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		   국어점수가 100점이거나 수학점수가 100점이면 장학생입니다.
		   아래 두학생의 시험점수가있습니다. 
		   각각의 학생은 장학생입니까?
		*/
		Scanner scan = new Scanner(System.in);
		
			int 국어1 = 99;
			int 수학1 = 99;
					
			int 국어2 = 1;
			int 수학2 = 100;
			
			System.out.println("국어점수를 입력하세요.");
			int 국어 = scan.nextInt();
			
			System.out.println("수학점수를 입력하세요.");
			int 수학 = scan.nextInt();
			
			System.out.println(국어 == 100 || 수학 == 100);
			scan.close();
	}
}
