package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  	 array = { 87, 11, 45, 98, 23 };
		  
			 [����1] �ε����� �Է¹޾� ���� ���
			 [����1] �ε��� �Է� : 1 ���� : 11��
		
			 [����2] ������ �Է¹޾� �ε��� ���
			 [����2] ���� �Է� : 11 �ε��� : 1
		*/
		Scanner scan = new Scanner(System.in);
		
		int array[] = {87 , 11 , 45 , 98 , 23};
		
		System.out.println("�ε��� �Է� : ");
		int n1 = scan.nextInt();
		
		System.out.println("���� : " + array[n1]);
		
		System.out.println("----------------------------");
		
		System.out.println("���� �Է� : ");
		int n2 = scan.nextInt();
		int count = 0;
		for(int i = 0; i<5; i+=1) {if(array[i] == n2) {count = i;}}
		System.out.println(count);
		
		scan.close();
	}
}
