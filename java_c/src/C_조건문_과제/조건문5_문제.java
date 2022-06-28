package C_조건문_과제;

import java.util.Random;

public class 조건문5_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*	
		[문제]
		[가위바위보 하나빼기]
		[1] 룰은 직접 정하고 게임을 최대한 비슷하게 만들어보시오.
	  */
		Random ran = new Random();
		
		int 바위 = 0;
		int 보 = 1;
		int 가위 = 2;
		
		int p1n1 = ran.nextInt(3);
		int p1n2 = ran.nextInt(3);
		int p2n1 = ran.nextInt(3);
		int p2n2 = ran.nextInt(3);
		
		System.out.println("Player1 : " + p1n1 + " , " + p1n2);
		System.out.println("Player2 : " + p2n1 + " , " + p2n2);
		
		int n1 = ran.nextInt(2)+1;
		int n2 = ran.nextInt(2)+1;
		int player1 = 0;
		int player2 = 0;
		
		if(n1==1) {player1 = p1n1;}
		else if(n1==2) {player1 = p1n2;}

		if(n2==1) {player2 = p2n1;}
		else if(n2==2) {player2 = p2n2;}
		
		System.out.println();
		System.out.println("하나빼기");
		System.out.println("Player1 : " + player1);
		System.out.println("Player2 : " + player2);
		
		if(player1==player2) {System.out.println("비김");}
		else if(player1==0 && player2 == 1) {System.out.println("player2 win!");}
		else if(player1==0 && player2 == 2) {System.out.println("player1 win!");}
		else if(player1==1 && player2 == 0) {System.out.println("player1 win!");}
		else if(player1==1 && player2 == 2) {System.out.println("player2 win!");}
		else if(player1==2 && player2 == 0) {System.out.println("player2 win!");}
		else if(player1==2 && player2 == 1) {System.out.println("player1 win!");}
	}
}
