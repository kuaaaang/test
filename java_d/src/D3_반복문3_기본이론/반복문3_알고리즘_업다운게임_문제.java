package D3_반복문3_기본이론;

import java.util.Random;
import java.util.Scanner;

public class 반복문3_알고리즘_업다운게임_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [Up & Down 게임]
		  1. com 은 랜덤으로 1~100사이를 저장한다.
		  2. me 는 1~100사이를 입력한다. 	 
		  3. com 과 me 를 비교해서 com 크면 "크다" , 
		  	 com 이작으면 "작다" 힌트제공 
		  4. 정답을 맞추면 게임은 종료된다.
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(100) + 1;
		
		while(true) {System.out.println("=======업다운 게임========");
		             System.out.println("숫자를 입력하세요.[1~100]");
		             int me = scan.nextInt();
		             if(me<=0) {System.out.println("숫자를 다시 입력하세요.");}
		             else if(com>me) {System.out.println("up");}
		             else if(com<me) {System.out.println("down");}
		    		 if(com == me) {System.out.print("숫자 : " + com);
		    	  		            System.out.println(" 정답!");
		    	  	                break;}
		             }
	}
}
