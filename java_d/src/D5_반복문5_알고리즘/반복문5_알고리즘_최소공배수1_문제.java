package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����]
		  8 �� 12 �� �ּ� ������� ���Ͻÿ�
			 �ּ� ������� �� ���� ����� �����Ѵ��� ó������ �������ڸ� ���Ѵ�.
			 ��) 8 16 24... 
			 ��) 12 24....
			 ���⼭ 24�� �ּҰ�����̴�.
	    */
		
		int a = 8;
		int b = 12;
		int num1 = a;
		int num2 = b;
		
		while(true) {if(num1>num2) {num2 = num2 + 12;}
		             else if(num2>num1) {num1 = num1 + 8;}
		             else if(num1==num2) {System.out.println("�ּҰ���� : " + num1);
		                                  break;}
		             }
	}
}
