package E5_�迭5_�⺻�̷�;

import java.util.Random;
import java.util.Arrays;

public class �迭5_�˰���_2�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int darr[][] = new int[3][3];
		
		Random ran = new Random();
		
		int arr[] = new int[9];
		
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = ran.nextInt(100);
			}
		}
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]);
	                        	// ���ڸ����� ���͵� 2�ڸ� ũ��� ���´�.(��׷� ���°��� ������)
			                    // ex) [12][1][34] - X    [12][ 1][34] - O
			}
			System.out.println();
		}
		
		int k = 0;
		for(int i = 0; i < 3; i ++) { // 2������ 1��������
			for(int j = 0; j < 3; j++) {
				arr[k] = darr[i][j];
				k += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------");
	
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				        // j<arr.length �� �ƴ� ������ 81���̳� ���� �ʿ䰡 ���� ����! 41���� �ʿ�
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("------------------------");
		}
		
		 k = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = arr[k];
				k += 1;
			}
		}
		System.out.println("-----------------");
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
 arr.length * arr.length
   _____9_____
  |_________9_|
9 |_________9_|
  |_________9_|
  |_________9_|  �簢��
       ...
 
 arr.length * i
  |\
  |1\
  |_2\
  |__3\
  |___4\
  |____5\  �ﰢ��
   ... 
*/
