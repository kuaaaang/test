package E4_배열4_알고리즘;

import java.util.Scanner;

public class 배열4_프로젝트_숫자이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [숫자이동]
	      0. 아래 배열을 사각형으로 출력한다.
		  1. 각숫자는 기능이 있다. 
		  	 [1] 숫자8는 플레이어이다. 
		     [2] 숫자0은 이동할수있는 길이다. 
		     [3] 숫자1은 이동불가능한 벽이다. 
		     [4] 숫자3은 골인지점이다.
		  2. System.out.println("1.left  2.right 3.up 4.down");
		  	  	번호를 입력받고 각 방향으로 한칸씩 이동 가능 
		  
		  3. left 
		  		{1,1,1,1,1,
				 1,0,0,0,1,
				 1,8,0,0,1,
			     1,0,0,0,3,
				 1,1,1,1,1};
		 	 
		  4.계속 이동하다가 3에 도착하면 종료.
		*/
		Scanner scan = new Scanner(System.in);
		
			int[] game = {1,1,1,1,1,
						  1,0,0,0,1,
						  1,0,8,0,1,
						  1,0,0,0,3,
						  1,1,1,1,1};
			
			int player = 12; // 현재 플레이어위치 
			int goal = 19;
			
			while(true) {
				for(int i = 0; i<game.length; i+=1) {
					if(game[i] == 1) {System.out.print("[■]");}
					else if(game[i] == 0) {System.out.print("[□]");}
					else if(game[i] == 8) {System.out.print("[▶]");}
					else if(game[i] == 3) {System.out.print("[★]");}
					
					if(i % 5 == 4) {System.out.println();}
				}
				if(player == goal) {
					System.out.println("종료!");
					break;
				}
				
				System.out.println("1.left  2.right 3.up 4.down");
				int n = scan.nextInt();

				if(n == 1) {
					if(game[player-1] == 0 || game[player-1] == 3){
						game[player-1] = 8;
						game[player] = 0; 
						player -= 1;
					}
				}
				else if(n == 2){
					if(game[player+1] == 0 || game[player+1] == 3){
						game[player+1] = 8;
						game[player] = 0; 
						player += 1;
					}	
				}
				else if(n == 3){
					if(game[player-5] == 0 || game[player-5] == 3){
						game[player-5] = 8;
						game[player] = 0; 
						player -= 5;
					}
				}
				else if(n == 4){
					if(game[player+5] == 0 || game[player+5] == 3){
						game[player+5] = 8;
						game[player] = 0; 
						player += 5;
					}
				}
				else {System.out.println("다시 입력하세요.");}
		}
		scan.close();	
	}
}
