package E_�迭_����;

import java.util.Arrays;

public class _1�׷�_��ŷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[][] = {
				{1001, 20, 43, 54 , 0},
				{1002, 21, 73, 44 , 0},
				{1003, 65, 13, 55 , 0},
				{1004, 76, 63, 4 , 0},
		};		
		// �� �����ʹ� �л� 4���� �������̴�.
		// ������� [��ȣ] , [����] , [����] , [����] , [���] �� �������̴�. 		
		// ���� ����� �־���Ѵ�. �� ���� ������� ������ �ű�� ������ �������� �л��� 1���̴�. 
		/*
		 	1���л��� ���� 4�� , ����3�� , ����2�� ���� ������ 9���̴�. 
		 	2���л��� ���� 3�� , ����1�� , ����3�� ���� ������ 7���̴�.
		 	3���л��� ���� 2�� , ����4�� , ����1�� ���� ������ 7���̴�.
		 	4���л��� ���� 1�� , ����2�� , ����4�� ���� ������ 7���̴�.
		*/
		
		// 1���� 3�� , 4���� 1���̴�. �Ʒ��� ���� ����ϸ�ȴ�. 
		/*
				{1001, 20, 43, 54 , 4},
				{1002, 21, 73, 44 , 1},
				{1003, 65, 13, 55 , 1},
				{1004, 76, 63, 4 , 1},
		*/
		
		int rank[][] = new int[4][4];
		
		for(int i = 1; i<score.length; i+=1) {
			for(int j = 0; j<score.length; j+=1) {
				int count = 4;
				for(int k = 0; k<score.length; k+=1) {
					if(score[j][i]>score[k][i]) {
						count -=1;
					}
				}
				rank[j][i-1] = count;
			}
		}
		
		for(int i = 0; i<rank.length; i+=1) {
			int total = 0;
			for(int j = 0; j<rank.length-1; j+=1) {
				total += rank[i][j];
			}
			rank[i][3] = total;
//			System.out.println(Arrays.toString(rank[i]));
		}
		
		for(int i = 0; i<rank.length; i+=1) {
			int count = 1;
			for(int j = 0; j<rank.length; j+=1) {
				if(rank[i][3] > rank[j][3]) {
					count += 1;
				}
			} 
			score[i][4] = count;
		}
		
		for(int i = 0; i<score.length; i+=1) {
			System.out.println(Arrays.toString(score[i]));
		}
	}
}
