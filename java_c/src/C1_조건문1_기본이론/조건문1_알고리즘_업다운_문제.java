package C1_조건문1_기본이론;

import java.util.Scanner;

public class 조건문1_알고리즘_업다운_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		  	[Up & Down 게임]
		  
		   com은 8이다.
		   me는 숫자를 하나입력받는다.
		   com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		    [1] me < com	: Up!
		    [2] me == com : Bingo!
		    [3] me > com  : Down!
		    
		    예)
		    (1) 숫자를 입력 : 
		    (2) Up! 
		*/
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.println("숫자를 입력하세요.");
		int 숫자1 = scan.nextInt();
		
		if(com > 숫자1) {System.out.println("Up!");}
		if(com == 숫자1) {System.out.println("Bingo!");}
		if(com < 숫자1) {System.out.println("Down!");}
		
		scan.close();
    }
}
