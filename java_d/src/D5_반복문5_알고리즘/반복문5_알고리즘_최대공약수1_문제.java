package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ִ�����1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����] 	
		   6�� 8�� ������� ��� ���
		
		   ������� ���μ��� �����ξ���� ���Ѵ�.
			 ��)   
			 	6 �Ǿ���� 1, 2, 3, 6 �̴�.
			    8 �Ǿ���� 1, 2, 4, 8 �̴�.
			    
			 6�� 8�� �������  1, 2 �̴�.
			 6�� 8�� �ִ������� 2 �̴�.
	    */
		
		int i = 1;
		int a = 0;
		while(i<=8) {if(6%i == 0 && 8%i == 0) {a = i;
			                                   System.out.println("����� : " + a);}
		             i +=1;
		             }
		System.out.println("�ִ����� : " + a);
	}
}
