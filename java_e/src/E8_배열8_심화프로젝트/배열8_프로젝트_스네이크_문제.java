package E8_�迭8_��ȭ������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �迭8_������Ʈ_������ũ_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [������ũ����]
		  1. 10x10 �迭�� 0���� ä���.
		  2. ������ũ�� 1234�� ǥ���Ѵ�.
		  3. �Ӹ� �����¿�� �̵��� �����ϸ�, ������ ����´�.
		  4. �ڱ���ϰ� �ε�����, ����Ѵ�.
		  5. �������� �������� ������
		     �������� ������ ���� 1���� �ڶ���.
		  6. ������ �ִ� 8������ ������ �� �ִ�.
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = new int [10][10];
		arr[0][3] = 1;
		arr[0][2] = 2;
		arr[0][1] = 3;
		arr[0][0] = 4;
		
		int count = 0;
		while(count<4) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			if(arr[r1][r2] == 0) {
				arr[r1][r2] = 9;
				count += 1;
			}
			else {continue;}
		}
		
		int dir = 0; // ��: 0 ��: 1 ��: 2 ��: 3 
		int y = 0;
		int x = 0;
		
		while(true) {
			for(int i = 0; i<arr.length; i+=1) {
				for(int j = 0; j<arr.length; j+=1) {
					if(arr[i][j] == 0) {System.out.print("[ ]");}
					else if(arr[i][j] == 1) {
						System.out.print("[��]");
						y = i;
						x = j;
					}
					else if(arr[i][j] == 9) {System.out.print("[��]");}
					else {System.out.print("[��]");}
				}
				System.out.println();
			}
			System.out.println("1. ��  2. ��  3. ��  4. ��");
			int n = scan.nextInt();
			
			if(n == 1) {
				if(y == 0) {continue;}
				else {
					int temp = arr[y][x];
					arr[y][x] = arr[y-1][x];
					arr[y-1][x] = temp;
					
//					if() {}
//					else if() {}
//					else if() {}
//					else if() {}
				}
			}
			else if(n == 2) {}
			else if(n == 3) {}
			else if(n == 4) {}
			else {System.out.println("�ٽ� �Է��ϼ���.");}
		}
		
	}
}
