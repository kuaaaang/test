package E3_�迭3_�⺻�̷�;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭3_������Ʈ_�̴ϸ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [�̴ϸ���]
		 
		  1. �÷��̾�� [p1]�� [p2] 2���̴�. �ѹ��� ������ ���鼭 �ൿ�Ѵ�. 
		  2. [1.�ֻ���][2.�н�] �� �����Ҽ��ִ�. �ֻ����� (1~4)�� �������� ������. 
		  3. �ֻ������ڸ�ŭ ������ġ���� ������ �̵��Ѵ�. 
		  4. �̵����ڸ��� �ٸ� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
		     ��� �÷��̾�� ������ �Ǿ� �Ǿ�(�ε��� 0) ���� ���� �̵��ȴ�.
		  5. ��븦 ���� ��ġ�� �Ǿ�(�ε��� 0)�� ��ġ�� �������� ���������̴�.(�������ʴ´�.)
		  6. �̵��Ÿ��� �迭�� ��������ġ�� �ʰ��ϸ�,
		     �Ǿ�(�ε��� 0)���� �̵��ϰ� �ʰ��Ѽ��ڸ�ŭ �߰��̵��Ѵ�.
		  7. ���� 3������ ���� �̱��.
		    
		   [p1] �ֻ��� : 1
		   1 0 0 0 0 0 0 0 0 0
		   2 0 0 0 0 0 0 0 0 0
		   
		   [p2] �ֻ��� : 3
		   0 1 0 0 0 0 0 0 0 0
		   0 0 0 2 0 0 0 0 0 0
		   
		   [p1] �ֻ��� : 2
		   [p1]�� [p2]�� ��Ҵ�!
		   0 0 0 0 1 0 0 0 0 0
		   2 0 0 0 0 0 0 0 0 0 
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] map1   = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] map2   = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int p1 = 0;
		int p2 = 0;
		int p1Count = 0;
		int p2Count = 0;
		int turn = 1;
		
		while(true) {
			System.out.println("Player1 : " + p1Count + "����");
			System.out.println("Player2 : " + p2Count + "����");
			System.out.println(Arrays.toString(map1));
			System.out.println(Arrays.toString(map2));
			
			if(turn%2 == 1) {
				System.out.println("Player1 ����");
				System.out.println("[1]�ֻ��� [2]�н� ");
				int n1 = scan.nextInt();
				if(n1 == 1) {
					int r1 = ran.nextInt(4)+1;
					System.out.println("player1 �ֻ��� : " + r1);
					
					p1 = p1 + r1;
					if(p1<=9 ) {
						int temp = map1[p1 - r1];
						map1[p1 - r1] = map1[p1];
						map1[p1] = temp;
						
						if(p1 == 9) {p1Count += 1;}
						
						turn += 1;
					}
					else if(p1>9) {
						p1 = p1 - 10;
						p1Count += 1;
						int temp = map1[p1+10-r1];
						map1[p1+10-r1] = map1[p1];
						map1[p1] = temp;
						
						turn += 1;
						}
				}
				else if(n1 == 2) {
					System.out.println("Player1 �н�");
					turn += 1;
				}
				else{System.out.println("�ٽ� �Է��ϼ���.");}
			}
			
			else if(turn%2 == 0) {
				System.out.println("Player2 ����");
				System.out.println("[1]�ֻ��� [2]�н� ");
				int n2 = scan.nextInt();
				if(n2 == 1) {
				
					if(p2>=9) {
						p2 = p2 - 9;
						p2Count += 1;
						}
					
					int r2 = ran.nextInt(4)+1;
					System.out.println("player2 �ֻ��� : " + r2);
					p2 = p2 + r2;
					if(p2<=9 ) {
						int temp = map2[p2 - r2];
						map2[p2 - r2] = map2[p2];
						map2[p2] = temp;
						
						if(p2 == 9) {p2Count += 1;}
						
						turn += 1;
					}
					else if(p2>9) {
						p2 = p2 - 10;
						p2Count += 1;
						int temp = map2[p2+10-r2];
						map2[p2+10-r2] = map2[p2];
						map2[p2] = temp;
						
						turn += 1;
						}
				}
				else if(n2 == 2) {
					System.out.println("Player2 �н�");
					turn += 1;
				}
				else{System.out.println("�ٽ� �Է��ϼ���.");}
			}
			
			if(p1Count == 3 || p2Count == 3) {
				if(p1Count == 3) {System.out.println("Player1 3���� ����! �¸�!");}
				else if(p2Count == 3) {System.out.println("Player2 3���� ����! �¸�!");}
				System.out.println("��������!");
				break;			
			}
			if(p1==p2 && p1!=0 && p2!=0) {
				if(turn%2 == 1) {
					System.out.println("Player1 ������.");
					map1[p1] = 0;
					p1 = 0;
					map1[p1] = 1;
				}
				else if(turn%2 == 0){
					System.out.println("Player2 ������.");
					map2[p2] = 0;
					p2 = 0;
					map2[p2] = 2;
				}
			}	
		}
		
		scan.close();
	}
}
