package D2_�ݺ���2_�˰���;

import java.util.Random;

public class �ݺ���2_������Ʈ_�ڸ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
			 [1] 1~99999 ������ �������ڸ� �����ϰ� �ڸ����� ���ڸ����� ����ϰ�,
			 [2] ���߿� 9�� ������ ���.
			 
			 ��) 8 ==> 1 , 0
			 ��) 102 ==> 3 , 0
			 ��) 88 ==> 2 , 0
			 ��) 919 ==> 3, 2
		 */
		Random ran = new Random();
		int n = ran.nextInt(99999) + 1;	
		int count = 0;
		int count9 = 0;
		int �ӽ� = n;
		
		int run = 1;
		while(run == 1) {int temp = �ӽ�%10;  // B1 �⺻�̷�2
			             System.out.println(temp);
			             if(temp == 9) {count9 = count9 + 1;}
			             �ӽ� = �ӽ�/10;
                         if (�ӽ� == 0) {run = 0;}
                         count = count + 1; 
                         }
		
		System.out.println("���� : " + n + " , �ڸ��� : " + count);
		System.out.println("--------------------------");
		System.out.println("9�� ���� : " + count9 + "��");
	}
}
