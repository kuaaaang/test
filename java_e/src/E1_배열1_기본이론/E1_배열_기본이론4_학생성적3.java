package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		     numberList = { 1001, 1002, 1003, 1004, 1005 };
			 scoreList = { 87, 11, 45, 98, 23 };
			 [����] �й��� �Է¹޾� ���� ���
			 [����] �й� �Է� : 1003 ���� : 45��
		*/
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = { 1001, 1002, 1003, 1004, 1005 };
		int scoreList[] = { 87, 11, 45, 98, 23 };
		
		System.out.println("�й��� �Է��ϼ���.");
		int n = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i<5; i+=1) {if (n == numberList[i]) {count = i;}}
		System.out.println("���� : " + scoreList[count]);
		
		scan.close();
	}
}
