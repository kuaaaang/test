package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class �迭1_�˰���_�˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   array = {1001, 20, 1002, 45, 1003, 54};
		   
		   �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		   [����] �й��� �Է��ϸ� ���� ����Ѵ�.
		   [��] 1001==>20 , 1003 ==> 54
		   
		   [����] ������ �Է��ϸ� �й� ����Ѵ�. 
		   [��] 20 ==> 1001 , 45 ==> 1002
		*/
		Scanner scan = new Scanner(System.in);
		
		int array[] = {1001 , 20 , 1002 , 45 , 1003 , 54};
		
		int number = 0;
		int score = 0;
		System.out.println("�й� �Է�");
		int n = scan.nextInt();
		for(int i = 0; i < 6; i+=1) {
			if(n == array[i]) {score = array[i+1];}
		}
		System.out.println(score);
		
		System.out.println("���� �Է�");
		int s = scan.nextInt();
		for(int i = 0; i < 6; i+=1) {
			if(s == array[i]) {number = array[i-1];}
		}
		System.out.println(number);
		
		scan.close();
	}
}
