package E7_�迭7_�⺻�̷�;

import java.util.Scanner;

public class �迭7_�˰���_ȸ��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  ����)  �Ʒ� ��ɾ �Է¹��������� block�迭�� 90�� ȸ���غ�����.
		  [1.left_turn] [2.right_turn]
		  
		  ��) [1.left_turn] (�������� 90�� ȸ��)     [2.right_turn]
		   
		  4 8 12 16                              13  9  5  1
		  3 7 11 15                              14 10  6  2
		  2 6 10 14                              15 11  7  3
		  1 5 9  13                              16 12  8  4
	    */
		   Scanner scan = new Scanner(System.in);
		
		   int block[][] = {
				   { 1, 2, 3, 4},
				   { 5, 6, 7, 8},
				   { 9,10,11,12},
				   {13,14,15,16},
			};

			while(true) {
				for(int i = 0; i<block.length; i+=1) {
					for(int j = 0; j<block.length; j+=1) {
						System.out.printf("[%2d]" , block[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("[1.left_turn] [2.right_turn] [3.finish]");
				int n = scan.nextInt();
				
				if(n == 1) {
					int temp[][] = new int[4][4]; 
					for(int i = 0; i<block.length; i+=1) {
						int y = block.length-1;
						for(int j = 0; j<block.length; j+=1) {
							temp[y][i] = block[i][j];
							y -= 1;
						}
					}
					block = temp;
				}
				else if(n == 2) {
					int temp[][] = new int[4][4];
					int x = 3;
					for(int i = 0; i<block.length; i+=1) {
						for(int j = 0; j<block.length; j+=1) {
							temp[j][x] = block[i][j];
						}
						x-=1;
					}
					block = temp;
				}
				else if(n == 3) {break;}
				else{System.out.println("����! �ٽ� �Է��ϼ���.");}
			}
	}
}
