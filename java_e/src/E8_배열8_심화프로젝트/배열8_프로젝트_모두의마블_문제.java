package E8_�迭8_��ȭ������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭8_������Ʈ_����Ǹ���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [������ ����]
		   	   
		   �Ʒ� ���� 2������� 2�ο����� �����. 3�������� ���� �¸��Ѵ�.
		   ���� �����ư��鼭 �ֻ����� ���� �̵����ڸ� ���Ѵ�. 
		   [��] �� �̵����ڸ�ŭ �̵� �ϴµ�, �ܰ����θ� �̵��Ѵ�.
		   
		   [����] �Ʒ��׸�����
		*/
		
	     /*
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� ��
		*/
		
		/*
		  �ֻ��� ==> 3 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� ��
		*/
		
		/*
		  �ֻ��� ==> 3 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� �� 
		  �� �� �� �� ��
		*/
		Random ran = new Random();
		
		int Player1 [][] = {
				  {7, 0, 0, 0, 0},
				  {0, 1, 1, 1, 0},
				  {0, 1, 1, 1, 0},
				  {0, 1, 1, 1, 0},
				  {0, 0, 0, 0, 0}
		};
		int Player2 [][] = {
				  {7, 0, 0, 0, 0},
				  {0, 1, 1, 1, 0},
				  {0, 1, 1, 1, 0},
				  {0, 1, 1, 1, 0},
				  {0, 0, 0, 0, 0}
		};

		int p1 = 0;
		int p2 = 0;
		int count = 0;
		
		while(true) {
			int r = ran.nextInt(3)+1;
			int a = 0;
			int b = 0;
			
			if (count % 2 == 0) {
				System.out.println("Player1 �ֻ��� : " + r);
				p1 += r;
				
				for(int i = 0; i<Player1.length; i+=1) {
					for(int j = 0; j<Player1[i].length; j+=1) {
						if(Player1[i][j] == 7) {
							a = i;
							b = j;
						}
					}
				}
				
				if(p1 <= 4) {
					int temp = Player1[a][b];
					Player1[a][b] = Player1[0][p1];
					Player1[0][p1] = temp;
				}
				else if(p1 <= 8) {
					int temp = Player1[a][b];
					Player1[a][b] = Player1[p1-4][4];
					Player1[p1-4][4] = temp;
				}
				else if(p1 <= 12) {
					int temp = Player1[a][b];
					Player1[a][b] = Player1[4][4-(p1-8)];
					Player1[4][4-(p1-8)] = temp;
				}
				else if(p1 <= 16) {
					int temp = Player1[a][b];
					Player1[a][b] = Player1[4-(p1-12)][0];
					Player1[4-(p1-12)][0] = temp;
				}
				
				for(int i = 0; i<Player1.length; i+=1) {
					for(int j = 0; j<Player1[i].length; j+=1) {
						if(Player1[i][j] == 0) {
							System.out.print("��  ");
						}
						else if(Player1[i][j] == 1) {
							System.out.print("��  ");
						}
						else if(Player1[i][j] == 7) {
							System.out.print("��  ");
						}
					}
					System.out.println();
				}
			}
			else if (count % 2 == 1){
				System.out.println("Player2 �ֻ��� : " + r);
				p2 += r;
				
				for(int i = 0; i<Player2.length; i+=1) {
					for(int j = 0; j<Player2[i].length; j+=1) {
						if(Player2[i][j] == 7) {
							a = i;
							b = j;
						}
					}
				}
				
				if(p2 <= 4) {
					int temp = Player2[a][b];
					Player2[a][b] = Player2[a][p2];
					Player2[a][p2] = temp;
				}
				else if(p2 <= 8) {
					int temp = Player2[a][b];
					Player2[a][b] = Player2[p2-4][4];
					Player2[p2-4][4] = temp;
				}
				else if(p2 <= 12) {
					int temp = Player2[a][b];
					Player2[a][b] = Player2[4][4-(p2-8)];
					Player2[4][4-(p2-8)] = temp;
				}
				else if(p2 <= 16) {
					int temp = Player2[a][b];
					Player2[a][b] = Player2[4-(p2-12)][0];
					Player2[4-(p2-12)][0] = temp;
				}
				
				for(int i = 0; i<Player2.length; i+=1) {
					for(int j = 0; j<Player2[i].length; j+=1) {
						if(Player2[i][j] == 0) {
							System.out.print("��  ");
						}
						else if(Player2[i][j] == 1) {
							System.out.print("��  ");
						}
						else if(Player2[i][j] == 7) {
							System.out.print("��  ");
						}
					}
					System.out.println();
				}
			}
			if(p1 >= 16) {
				System.out.println("Player1 win!");
				break;
			}
			else if(p2 >= 16) {
				System.out.println("Player2 win!");
				break;
			}
			count += 1;
		}
		
	}
}
