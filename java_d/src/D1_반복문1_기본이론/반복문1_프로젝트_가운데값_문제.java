package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_������Ʈ_�����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  		1~1000 ������ ������ �������ǿ� ���� �ش��ϴ� ���� ����Ͻÿ�.
		  		[����1] 28 ����� ���� ����Ѵ�.
		    	[����2] ���� �����ġ�� ���� ����Ѵ�. 
		    	
		    	[��] 2�� ������ ����������,  { 2, 4, 6, 8, 10 } ��°��� �̷��� 6�� ����Ѵ�.
		    	[��] 2�� ������ ����������,  { 2, 4, 6, 8, 10, 12 } �̷������� ¦���� 6������Ѵ�.
		*/
		int i = 1;
		int count = 0;
		while(i<=1000) {if(i%28 == 0) {System.out.println(i);
		                               count = count + 1;}
		                i +=1;
		                }
		System.out.println("--------------------------------");
		System.out.println(count + "��");
		System.out.println("��� : " + (count/2+1) + "��°");
		
		System.out.println("��� �� : " + (count/2+1)*28);
	}
}
