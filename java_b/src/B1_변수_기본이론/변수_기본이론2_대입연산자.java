package B1_����_�⺻�̷�;

public class ����_�⺻�̷�2_���Կ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [���� ������] " = " (���� ����, ���� ����)
		 ������ ���� ���� �����ڸ� ���ؼ�����
		 ���� ������ �����ϴ�.
		*/
		
		// int num;
        // num = 8; (2���� ��� : int num = 8;)
		
		int num = 8; 
		
		// ����) num �� 1��  ���غ���.
		System.out.println(num + 1);		//	9
		
		// �� ���� ��������ó���������� ���� num �� ���� 8�� ������ ����. 
		System.out.println(num);			//	8
		
		
		int temp = num;     // temp : �ӽ�
		num = (temp + 1); 	// ���� �����ڸ� ���ؼ��� ���� ����ȴ�. 		
		
		System.out.println(num);			//	9
			
	
		// ������ �켱������  ���Կ����� ����  ���ϱ� �����ڰ� �켱����ȴ�
		int b = 10;
		b = b + 1; // () �� ���ڟݾƵ� b + 1 �� ���� ������� �ٽ� b �� ����ȴ�.
		           // �켱���� :  ()   >>     X,/,%,+,-    >>    =
		System.out.println(b);
	}
}
