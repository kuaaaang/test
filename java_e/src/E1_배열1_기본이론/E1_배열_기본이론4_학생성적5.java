package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  
		   numberList = {1001, 1002, 1003, 1004, 1005};
		   scoreList  = { 87 ,  11 ,  45 ,  98 ,  23 };
		 
		   [����] �й��� �Է¹޾� ���� ����Ѵ�. 
			 	 ��, �����й� �Է� �� ����ó�� �Ͻÿ�.
			 ��)
			 �й� �Է� : 1002		���� : 11��
			 �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�. 
		*/
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = {1001, 1002, 1003, 1004, 1005};
		int scoreList[]  = { 87 ,  11 ,  45 ,  98 ,  23 };
		
		System.out.println("�й��� �Է��ϼ���.");
		int n = scan.nextInt();
		
		int count = -1;
		for(int i = 0; i<5; i+=1) {
			if(n == numberList[i]) {count = i;
			}
		}
			
		if(count == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println("�й� " + numberList[count] + " , ���� : " + scoreList[count] + "��");
		}
			
		
		
		scan.close();
	}
}
