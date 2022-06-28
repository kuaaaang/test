package C1_조건문1_기본이론;

import java.util.Scanner;

public class 조건문1_프로젝트_합격_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		   [점수 유효성 검사]
		  1. 점수2개를 입력받아 평균을 구한다.
		  2. 평균이  60점 이상이면 합격, 60점 미만이면 불합격이다.
		  3. 조건1)  입력받은 정수가 
		     음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
		     예) 점수를  잘못 입력했습니다.
		  4. 조건2) 평균이 60 이상이라도 , 한과목이라도 50미만이면 불합격을 출력한다.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 점수를 입력하세요.");
		int 점수1 = scan.nextInt();
		
		System.out.println("두번째 점수를 입력하세요.");
		int 점수2 = scan.nextInt();
		
		int 평균 = (점수1 + 점수2)/2;
			
		if(점수1>=0 && 점수2>=0 && 점수1<=100 && 점수2<=100) {
			if(평균>=60 && 점수1>=50 && 점수2 >=50) {System.out.println("합격");}
		    if(평균<60 || 점수1<50 || 점수2<50) {System.out.println("불합격");}
		}
		if(점수1<0 || 점수2<0 || 점수1>100 || 점수2>100) {System.out.println("점수를 잘못 입력했습니다.");}
		
		scan.close();
	}
}
