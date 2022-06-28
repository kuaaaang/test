package E8_배열8_심화프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 배열8_프로젝트_숫자이동되감기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [숫자이동되감기]
		    	     
			[1) left 2)right 3)up 4)down 5)되감기]
			 
			0 이 플레이어이다 .
			번호를 입력받고 해당위치로 이동 ==> 
			이동할때 값을 서로 교환한다. 

			예) 1 ==>  left
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		

		  
		    예) 1 ==>  left
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,0,14,15}		

			한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가,
			5번입력시 ==> 왔던길로 되돌아가기 한다. 
		*/
		Scanner scan = new Scanner(System.in);
		int game[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,0}
			};
		int yx [][] = new int[10000][2];
				
		int y = 0;
		int x = 0;
		int count = 0;
				
		while(true) {
			for(int i = 0; i<game.length; i+=1) {
				System.out.println(Arrays.toString(game[i]));
			}
			System.out.println("[1) left 2)right 3)up 4)down 5)되감기]");
			int n = scan.nextInt();
			
			for(int i = 0; i<game.length; i+=1) {
				for(int j = 0; j<game[i].length; j+=1) {
					if(game[i][j] == 0) {
						y = i;
						x = j;
						yx[count][0] = y;
						yx[count][1] = x;
						count += 1;
					}
				}
			}
			
			if(n == 1 && x!=0) {
				int temp = game[y][x];
				game[y][x] = game [y][x-1];
				game [y][x-1] = temp;
			}
			else if(n == 2 && x!=3) {
				int temp = game[y][x];
				game[y][x] = game [y][x+1];
				game [y][x+1] = temp;
			}
			else if(n == 3 && y!=0) {
				int temp = game[y][x];
				game[y][x] = game [y-1][x];
				game [y-1][x] = temp;
			}
			else if(n == 4 && y!=3) {
				int temp = game[y][x];
				game[y][x] = game [y+1][x];
				game [y+1][x] = temp;
			}
			else if(n == 5) {
				int temp = game[y][x];
				game[y][x] = game [yx[count-2][0]][yx[count-2][1]];
				game [yx[count-2][0]][yx[count-2][1]] = temp;
			}
			else {
				count -= 1;
				continue;
			}
		}		
	}
}
