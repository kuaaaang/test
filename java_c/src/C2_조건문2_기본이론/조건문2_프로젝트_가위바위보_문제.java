package C2_���ǹ�2_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�2_������Ʈ_����������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����]
		  	[����(0) ����(1) ��(2) ����]
		  1. player1 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
		  2. player2 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
		  3. ����,����,���� �������ڷδ� ǥ���Ҽ������Ƿ�  0,1,2 ���ڷ� ���ǥ���Ѵ�.
		  4. player1�� player2�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("player1 ���ڸ� �Է��ϼ���.");
		int n1 = scan.nextInt();
		
		System.out.println("player2 ���ڸ� �Է��ϼ���.");
		int n2 = scan.nextInt();
		
		if(n1 == n2) {System.out.println("����.");}
		if(n1 == 0 && n2 == 1) {System.out.println("player1 lose , player2 win!");}
		if(n1 == 0 && n2 == 2) {System.out.println("player1 win! , player2 lose");}
		if(n1 == 1 && n2 == 0) {System.out.println("player1 win! , player2 lose");}
		if(n1 == 1 && n2 == 2) {System.out.println("player1 lose , player2 win!");}
		if(n1 == 2 && n2 == 0) {System.out.println("player1 lose , player2 win!");}
		if(n1 == 2 && n2 == 1) {System.out.println("player1 win! , player2 lose");}
		
		scan.close();
	}
}
