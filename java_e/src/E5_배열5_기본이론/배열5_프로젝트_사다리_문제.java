package E5_�迭5_�⺻�̷�;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class �迭5_������Ʈ_��ٸ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # ��ٸ� ����
		  1. �ε��� 0~4�� �ϳ������Ѵ�. (���ΰ����� 5��) ���� ���� ���� ��������.
		  2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
		  3. ���� 1 �� ������ ���������� �̵��� ��������.
		  4. ���� 2 �� ������ �������� �̵��� ��������.
		  5. ������ �޴� ��� 
		  [��ȭ] ���� 0���� ����ä���� ��ٸ��� �������� ��ġ�غ���.
		*/
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
			
			int ladder[][]= {
					{0,0,0,0,0},
					{1,2,0,1,2},
					{0,1,2,0,0},
					{0,0,1,2,0},
					{1,2,0,1,2},
					{0,1,2,0,0},
					{0,1,2,0,0},
					{0,0,1,2,0},
					{0,0,0,0,0}};
			
			System.out.println("��ȣ�� �Է��ϼ���.[0~4]");
			int n = scan.nextInt();
			
			for(int i = 0; i< ladder.length; i+=1) {
				if(ladder[i][n] == 1) {
					n += 1;
				}
				else if(ladder[i][n] == 2) {
					n -= 1;
				}
			}
			System.out.println(menu[n]);

			System.out.println("-----------------------------");
			
			int ��ٸ�Ÿ��[][]= {
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0}};
			
			for(int i = 0; i<100; i+=1) { // �׳� �������� �� ��� ��ΰ� ��ġ�� ��. // 2���� �Ѿ�� ��ΰ� �Ȱ�ġ�� �ؾ� ��
				int r1 = ran.nextInt(7)+1; // ����
				int r2 = ran.nextInt(5);   // ����
				int r3 = ran.nextInt(3);   // �� ����(0,1,2)
				
				if(r3==0) {
					��ٸ�Ÿ��[r1][r2] = 0;
				}
				else if(r3==1 && r2 != 4) {
					��ٸ�Ÿ��[r1][r2] = 1;				
				}
				else if(r3==2 && r2 != 0) {
					��ٸ�Ÿ��[r1][r2] = 2;
				}
			}
			
			for(int i = 0; i<7; i+=1) {
				for(int j = 0; j<5; j+=1) {
					if(��ٸ�Ÿ��[i][j] == 1 && j<=3) {
//						int r4 = ran.nextInt(2);
						��ٸ�Ÿ��[i+1][j+1] = 0;
//						else if(r4 == 1) {��ٸ�Ÿ��[i+1][j+1] = 1;}
					}
					else if(��ٸ�Ÿ��[i][j] == 2 && j>=1) {
//						int r4 = ran.nextInt(2);
						��ٸ�Ÿ��[i+1][j-1] = 0;
//						else if(r4 == 1) {��ٸ�Ÿ��[i+1][j-1] = 2;}	
					}
				}
			}	
	
			for(int i = 0; i<��ٸ�Ÿ��.length; i+=1) {
				System.out.println(Arrays.toString(��ٸ�Ÿ��[i]));
			}
			
			scan.close();
	}
}
