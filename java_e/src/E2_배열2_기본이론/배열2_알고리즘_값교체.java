package E2_�迭2_�⺻�̷�;

import java.util.Scanner;

public class �迭2_�˰���_����ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		Scanner scan = new Scanner(System.in);
		
    	int[] arr = { 10, 20, 30, 40, 50 };

    	System.out.print("�ε���1 �Է� : ");
    	int n1 = scan.nextInt();
    	System.out.print("�ε���2 �Է� : ");
		int n2 = scan.nextInt();
		
		int t1 = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = t1;
		
		for(int i = 0; i<5; i+=1) {
			System.out.print(arr[i] + "   ");
		}
		
		System.out.println();
		
		System.out.print("��1 �Է� : ");
    	int n3 = scan.nextInt();
    	System.out.print("��2 �Է� : ");
		int n4 = scan.nextInt();
		
		for(int i = 0; i<5; i+=1) {
			if(n3 == arr[i]) {
				n1 = i;
			}
			if(n4 == arr[i]) {
				n2 = i;
			}
		}
		int t2 = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = t2;
		
		for(int i = 0; i<5; i+=1) {
			System.out.print(arr[i] + "   ");
		}
		
		scan.close();
	}
}
