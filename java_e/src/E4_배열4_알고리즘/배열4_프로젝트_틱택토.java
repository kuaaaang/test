package E4_배열4_알고리즘;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class 배열4_프로젝트_틱택토 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  [틱택토]
		   
		   조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 
		  	          아래와같이 만들어보기.
		   조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
		   조건3) 먼저 한줄을 완성하면 승리
		   [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
		  =============
		  [처음화면]
		  0,0,0
		  0,0,0
		  0,0,0
		  [p1]인덱스 입력 : 6
		  =============
		  [1턴]
		  0,0,0
		  0,0,0
		  1,0,0
		  [p2]인덱스 입력 : 1
		  =============
		  [2턴]
		  0,2,0
		  0,0,0
		  1,0,0
		  [p1]인덱스 입력 : 3
		  =============
		  [3턴]
		  0,2,0
		  1,0,0
		  1,0,0
		  [p2]인덱스 입력 : 2
		  =============
		  [4턴]
		  0,2,2
		  1,0,0
		  1,0,0
		  [p1]인덱스 입력 : 0
		  =============
		  [5턴]
		  1,2,2
		  1,0,0
		  1,0,0
		  [p1] 승리 
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
			int[] tic = new int[9];
			
			for(int i = 0; i<tic.length; i+=1) {
				if(tic[i] == 0) {System.out.print("□");}
				else if(tic[i] == 1) {System.out.print("O");}
				else if(tic[i] == 2) {System.out.print("X");}
				if(i%3 == 2) {System.out.println();}
			}
			
			int r = ran.nextInt(2);
			while(true) {
				
				if(r == 0) {
					System.out.println("com 차례입니다.");
					int com = ran.nextInt(9);
					if(tic[com] == 0) {
						tic[com] = 2;
						r = 1;
					}
					else if(tic[com] != 0) {
						System.out.println("중복");
					}
				}
				else if(r == 1) {
					System.out.println("player 차례입니다.");
					int me = scan.nextInt();
					if(tic[me] == 0) {
						tic[me] = 1;
						r = 0;
					}
					else if(tic[me] != 0) {
						System.out.println("이미 선택된 자리입니다.");
					}
				}
				
				for(int i = 0; i<tic.length; i+=1) {
					if(tic[i] == 0) {System.out.print("□");}
					else if(tic[i] == 1) {System.out.print("O");}
					else if(tic[i] == 2) {System.out.print("X");}
					if(i%3 == 2) {System.out.println();}
				}
				
				if(tic[0] != 0 && tic[0] == tic[1] && tic[1] == tic[2]) {
					if(tic[0] == 1) {System.out.println("player win!");}
					else if(tic[0] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[3] != 0 && tic[3] == tic[4] && tic[4] == tic[5]) {
					if(tic[3] == 1) {System.out.println("player win!");}
					else if(tic[3] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[6] != 0 && tic[6] == tic[7] && tic[7] == tic[8]) {
					if(tic[6] == 1) {System.out.println("player win!");}
					else if(tic[6] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[0] != 0 && tic[0] == tic[3] && tic[3] == tic[6]) {
					if(tic[6] == 1) {System.out.println("player win!");}
					else if(tic[6] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[1] != 0 && tic[1] == tic[4] && tic[4] == tic[7]) {
					if(tic[6] == 1) {System.out.println("player win!");}
					else if(tic[6] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[2] != 0 && tic[2] == tic[5] && tic[5] == tic[8]) {
					if(tic[6] == 1) {System.out.println("player win!");}
					else if(tic[6] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[0] != 0 && tic[0] == tic[4] && tic[4] == tic[7]) {
					if(tic[6] == 1) {System.out.println("player win!");}
					else if(tic[6] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[2] != 0 && tic[2] == tic[4] && tic[4] == tic[6]) {
					if(tic[6] == 1) {System.out.println("player win!");}
					else if(tic[6] == 2) {System.out.println("com win!");}
					break;
				}
				else if(tic[0] != 0 && tic[1] != 0 && tic[2] != 0 && tic[3] != 0 && tic[4] != 0 && tic[5] != 0 && tic[6] != 0 && tic[7] != 0 && tic[8] != 0) {
					System.out.println("종료!");
					break;
				}
			}
	}
}
