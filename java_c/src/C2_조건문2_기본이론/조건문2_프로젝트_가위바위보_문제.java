package C2_조건문2_기본이론;

import java.util.Scanner;

public class 조건문2_프로젝트_가위바위보_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
		  	[가위(0) 바위(1) 보(2) 게임]
		  1. player1 은 0~2 사이의 숫자를 입력받는다. 
		  2. player2 는 0~2 사이의 숫자를 입력받는다. 
		  3. 가위,바위,보를 아직문자로는 표현할수없으므로  0,1,2 숫자로 대신표현한다.
		  4. player1과 player2를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("player1 숫자를 입력하세요.");
		int n1 = scan.nextInt();
		
		System.out.println("player2 숫자를 입력하세요.");
		int n2 = scan.nextInt();
		
		if(n1 == n2) {System.out.println("비겼다.");}
		if(n1 == 0 && n2 == 1) {System.out.println("player1 lose , player2 win!");}
		if(n1 == 0 && n2 == 2) {System.out.println("player1 win! , player2 lose");}
		if(n1 == 1 && n2 == 0) {System.out.println("player1 win! , player2 lose");}
		if(n1 == 1 && n2 == 2) {System.out.println("player1 lose , player2 win!");}
		if(n1 == 2 && n2 == 0) {System.out.println("player1 lose , player2 win!");}
		if(n1 == 2 && n2 == 1) {System.out.println("player1 win! , player2 lose");}
		
		scan.close();
	}
}
