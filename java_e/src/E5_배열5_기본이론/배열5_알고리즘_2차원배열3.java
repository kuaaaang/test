package E5_�迭5_�⺻�̷�;

import java.util.Arrays;

public class �迭5_�˰���_2�����迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 1) ���� �� ���
		// ���� 1) 410, 810, 1210
					
		// ���� 2) ���� �� ���
		// ���� 2) 603, 606, 609, 612
		
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
			for(int i = 0; i<arr.length; i+=1) {
				int total = 0;
				for(int j = 0; j<arr[i].length; j+=1) {
					total += arr[i][j];
				}
				garo[i] = total;
			}
			System.out.println(Arrays.toString(garo));
			System.out.println();
			
			for(int i = 0; i<arr.length; i+=1) {
				for(int j = 0; j<arr[i].length; j+=1) {
					sero[j] += arr[i][j];
				}
			}
			System.out.println(Arrays.toString(sero));
	}
}
