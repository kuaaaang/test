package E4_�迭4_�˰���;

import java.util.Scanner;

public class �迭4_������Ʈ_�����̵� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [�����̵�]
	      0. �Ʒ� �迭�� �簢������ ����Ѵ�.
		  1. �����ڴ� ����� �ִ�. 
		  	 [1] ����8�� �÷��̾��̴�. 
		     [2] ����0�� �̵��Ҽ��ִ� ���̴�. 
		     [3] ����1�� �̵��Ұ����� ���̴�. 
		     [4] ����3�� ���������̴�.
		  2. System.out.println("1.left  2.right 3.up 4.down");
		  	  	��ȣ�� �Է¹ް� �� �������� ��ĭ�� �̵� ���� 
		  
		  3. left 
		  		{1,1,1,1,1,
				 1,0,0,0,1,
				 1,8,0,0,1,
			     1,0,0,0,3,
				 1,1,1,1,1};
		 	 
		  4.��� �̵��ϴٰ� 3�� �����ϸ� ����.
		*/
		Scanner scan = new Scanner(System.in);
		
			int[] game = {1,1,1,1,1,
						  1,0,0,0,1,
						  1,0,8,0,1,
						  1,0,0,0,3,
						  1,1,1,1,1};
			
			int player = 12; // ���� �÷��̾���ġ 
			int goal = 19;
			
			while(true) {
				for(int i = 0; i<game.length; i+=1) {
					if(game[i] == 1) {System.out.print("[��]");}
					else if(game[i] == 0) {System.out.print("[��]");}
					else if(game[i] == 8) {System.out.print("[��]");}
					else if(game[i] == 3) {System.out.print("[��]");}
					
					if(i % 5 == 4) {System.out.println();}
				}
				if(player == goal) {
					System.out.println("����!");
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
				else {System.out.println("�ٽ� �Է��ϼ���.");}
		}
		scan.close();	
	}
}
