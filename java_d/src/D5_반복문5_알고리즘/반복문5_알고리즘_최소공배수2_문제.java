package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		   	ö���� �μ��� ���� �����忡 �ٴѴ�
		   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
		   	
		   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
		   	
		*/
		int a = 4;
		int b = 5;
		int num1 = a;
		int num2 = b;
		
		while(true) {if(num1>num2) {num2 = num2 + 5;}
		             else if(num2>num1) {num1 = num1 + 4;}
		             else if(num1==num2) {System.out.println("�ּҰ���� : " + num1);
		                                  break;}
		             }
		System.out.println("ö���� �μ��� 2�� " + (3+num1) + "�Ͽ� ������.");
	}
}
