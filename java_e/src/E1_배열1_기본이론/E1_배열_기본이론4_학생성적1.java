package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
		 ��)    87, 11, 92, 14, 47
		
		 [����2] �������� ������ ��� ���
		 ��)    ����(251) ���(50.2)
		
		 [����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		 ��)   2��
	   */
		Random ran = new Random();
		int[] array =  new int[5];
		
		int total = 0;
		int count = 0;
		for(int i = 0; i<5; i+=1) {int n = ran.nextInt(100)+1;
		                           array[i] = n;
		                           total += array[i];
		                           if(n>=60) {count +=1;}
		                           System.out.println(array[i]);}
		System.out.println("���� : " + total + " , ��� : " + (total/5.0));
		
		System.out.println("�հ��� : " + count + "��");
	}
}
