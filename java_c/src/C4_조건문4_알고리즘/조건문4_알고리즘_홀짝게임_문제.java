package C4_조건문4_알고리즘;

import java.util.Scanner;
import java.util.Random;

public class 조건문4_알고리즘_홀짝게임_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]		  
		  	[홀짝 게임]  
		  1. 1~10개의 숫자중 랜덤으로 한개의 숫자를 저장한다.
		  2. 랜덤의 숫자가 [1.홀수][2.짝수] 인지 맞추는게임이다.
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int R1 = ran.nextInt(10) + 1;
		
		System.out.println("[1.홀수][2.짝수]");
		int S1 = scan.nextInt();
		
		if(S1 == 1) {if(R1%2 > 0) {System.out.println("숫자 : " + R1 + " 정답!");}
		             if(R1%2 == 0) {System.out.println("숫자 : " + R1 + " 땡!");}
		             }
		else if(S1 == 2) {if(R1%2 == 0) {System.out.println("숫자 : " + R1 + " 정답!");}
                          if(R1%2 > 0) {System.out.println("숫자 : " + R1 + " 땡!");}
		                  }
		else {System.out.println("오류");}
		scan.close();
	}
}
