package E4_�迭4_�˰���;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class �迭4_������Ʈ_ƽ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  [ƽ����]
		   
		   ����1) ���� ũ�ҿ� "ƽ����" �˻��� ������ �ѹ��ϰ� 
		  	          �Ʒ��Ͱ��� ������.
		   ����2) P1 , P2 �� �÷��̾ �����ư��鼭 �÷���.
		   ����3) ���� ������ �ϼ��ϸ� �¸�
		   [��õ����] P2 �� com���� ��ü�غ���.(com�� �������� �÷���)
		  =============
		  [ó��ȭ��]
		  0,0,0
		  0,0,0
		  0,0,0
		  [p1]�ε��� �Է� : 6
		  =============
		  [1��]
		  0,0,0
		  0,0,0
		  1,0,0
		  [p2]�ε��� �Է� : 1
		  =============
		  [2��]
		  0,2,0
		  0,0,0
		  1,0,0
		  [p1]�ε��� �Է� : 3
		  =============
		  [3��]
		  0,2,0
		  1,0,0
		  1,0,0
		  [p2]�ε��� �Է� : 2
		  =============
		  [4��]
		  0,2,2
		  1,0,0
		  1,0,0
		  [p1]�ε��� �Է� : 0
		  =============
		  [5��]
		  1,2,2
		  1,0,0
		  1,0,0
		  [p1] �¸� 
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
			int[] tic = new int[9];
			
			for(int i = 0; i<tic.length; i+=1) {
				if(tic[i] == 0) {System.out.print("��");}
				else if(tic[i] == 1) {System.out.print("O");}
				else if(tic[i] == 2) {System.out.print("X");}
				if(i%3 == 2) {System.out.println();}
			}
			
			int r = ran.nextInt(2);
			while(true) {
				
				if(r == 0) {
					System.out.println("com �����Դϴ�.");
					int com = ran.nextInt(9);
					if(tic[com] == 0) {
						tic[com] = 2;
						r = 1;
					}
					else if(tic[com] != 0) {
						System.out.println("�ߺ�");
					}
				}
				else if(r == 1) {
					System.out.println("player �����Դϴ�.");
					int me = scan.nextInt();
					if(tic[me] == 0) {
						tic[me] = 1;
						r = 0;
					}
					else if(tic[me] != 0) {
						System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
					}
				}
				
				for(int i = 0; i<tic.length; i+=1) {
					if(tic[i] == 0) {System.out.print("��");}
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
					System.out.println("����!");
					break;
				}
			}
	}
}
