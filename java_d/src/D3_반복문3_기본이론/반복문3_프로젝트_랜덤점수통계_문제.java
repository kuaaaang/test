package D3_�ݺ���3_�⺻�̷�;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [�����������]
		  
		  1. 10ȸ �ݺ��� �Ѵ�.
		  2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		  3. ������ 60�� �̻��̸� �հݻ��̴�.
		  ---------------------------------------
		  . [1] ������(10��)�� ������ ����� ����Ѵ�.
		  . [2] �հ��� ���� ����Ѵ�.
		  . [3] 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		*/
		Random ran = new Random();
		int count = 0;
		int counto = 0;
		int a = 0;
		int b = 0;
		
		while(true) {int n = ran.nextInt(100)+1;
		  	         System.out.println(n);
		             count = count + 1;
		             a = a + n;
		     
		             if(n>=60) {counto = counto + 1;}
		             
		             if(n>b) {b=n;}
		             
		             if(count == 10) {System.out.println("��� : " + a/10.0 + " ��");
		                              break;}

		              }
		System.out.println("�հ��ڼ� : " + counto + " ��");
		System.out.println("1�� ���� : " + b + " ��");
	}
}
