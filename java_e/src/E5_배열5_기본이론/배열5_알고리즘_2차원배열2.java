package E5_�迭5_�⺻�̷�;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_2�����迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		// ����1) �ε��� 2���� �Է¹޾� �� ���
		// ��1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
				
		// ����2) ���� �Է¹޾� �ε��� 2�� ���
		// ��2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
				
		// ����3) ���� ū ���� �ε��� 2�� ���
		// ����3) 2 2
				
		// ����4) �� 2���� �Է¹޾� �� ��ü
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for(int i = 0; i<arr.length; i+= 1) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		
		//����1
		
		System.out.print("�ε��� 1 �Է� : ");
		int n1 = scan.nextInt();
		System.out.print("�ε��� 2 �Է� : ");
		int n2 = scan.nextInt();
		System.out.println(arr[n1][n2]);
		System.out.println("--------------------------------");
		
		//����2
		
		System.out.print("�� �Է� : ");
		int value = scan.nextInt();
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(value == arr[i][j]) {
					System.out.println("�ε��� 1 : " + i + " , �ε��� 2 : " + j);
				}
			}
		}
		System.out.println("--------------------------------");
		
		//����3
		
		int max = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.print("���� ū ���� �ε��� : ");
		System.out.println(a + "  " + b);
		System.out.println("--------------------------------");
		
		//����4
		
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		System.out.print("��ü�� 1 �Է� : ");
		int value1 = scan.nextInt();
		System.out.print("��ü�� 2 �Է� : ");
		int value2 = scan.nextInt();
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(value1 == arr[i][j]) {
					temp1 = i;
					temp2 = j;
				}
				if(value2 == arr[i][j]) {
					temp3 = i;
					temp4 = j;
				}
			}
		}
		int temp = arr[temp1][temp2];
		arr[temp1][temp2] = arr[temp3][temp4];
		arr[temp3][temp4] = temp;
		
		for(int r = 0; r<arr.length; r+=1) {
			System.out.println(Arrays.toString(arr[r]));
		}
		
		
		scan.close();
	}
}
