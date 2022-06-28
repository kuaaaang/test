package E8_�迭8_��ȭ������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class �迭8_������Ʈ_�����̵��ǰ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [�����̵��ǰ���]
		    	     
			[1) left 2)right 3)up 4)down 5)�ǰ���]
			 
			0 �� �÷��̾��̴� .
			��ȣ�� �Է¹ް� �ش���ġ�� �̵� ==> 
			�̵��Ҷ� ���� ���� ��ȯ�Ѵ�. 

			��) 1 ==>  left
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		

		  
		    ��) 1 ==>  left
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,0,14,15}		

			��ĭ��ĭ�̵��Ҷ����� yx �� �迭�� �̵��Ѱ�θ� �����ߴٰ�,
			5���Է½� ==> �Դ���� �ǵ��ư��� �Ѵ�. 
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
			System.out.println("[1) left 2)right 3)up 4)down 5)�ǰ���]");
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
