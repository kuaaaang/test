package D6_반복문6_기본이론;

import java.util.Scanner;

public class 반복문6_알고리즘_베스킨라빈스31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [베스킨라빈스31]
		    베스킨라빈스 게임이란, 플레이어 2명이 번갈아가면서
		    1~3사이의 숫자를 선택할수있고, 그숫자들을 계속 더해서 
		    그누적합이 31에 먼저도달한쪽이 지는게임이다. 
		  
		  1) 각 플레이어는 번갈아가면서 1~3을 선택한다.
		  2) 만약에 이상한숫자를 입력하면 1~3을 입력할때까지 계속자기 차례이다.
		  3) 각 플레이어가 선택한숫자는  total  변수에 계속 누적해서 더한다.
		  4) total 이 31이상에 도달하면 승리자를 출력한다.
		*/
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int turn = 1;
		while(true) {System.out.println("베스킨라빈스 : " + total);
			         if(turn%2 == 1) {System.out.println("Player1 [1~3]을 입력하세요.");
			                          int p1 = scan.nextInt();
			                          if(p1!=1 && p1!=2 && p1!=3) {System.out.println("숫자를 다시 입력하세요.");}
			                          else if(p1==1 || p1==2 || p1==3) {total = total + p1;
			                                                            turn = turn + 1;}
			                          }
			         else if(turn%2 == 0) {System.out.println("Player2 [1~3]을 입력하세요.");
			                               int p2 = scan.nextInt();
			                               if(p2!=1 && p2!=2 && p2!=3) {System.out.println("숫자를 다시 입력하세요.");}
					                       else if(p2==1 || p2==2 || p2==3) {total = total + p2;
					                                                         turn = turn + 1;}
			                               }
			          
			         if(total>=31) {System.out.println("종료!");
			                        break;}
			         }
		if(turn%2==1) {System.out.println("Player1 승리!");}
		else if(turn%2==0) {System.out.println("Player2 승리!");}
		
		scan.close();
	}
}
