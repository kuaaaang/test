package B1_����_�⺻�̷�;

public class ����_�⺻�̷�6_������ũ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; // 4ĭ
		double b; // 8ĭ
		char c; // 1ĭ
		
		// ������ ũ�� �� ����
				System.out.println("[����]");
				// 1. ���� : int  , long 
				
				// int �� -21�� ����  21���� ���� ���� �����ϴ�. (java ������ ũ�� �˻��غ���!)
				// ��ū���� �����ϰ� ������ long �� ����Ѵ�. 
				// int a =  3000000000; (�ּ��� Ǯ�� �����߻�)
				long d = 3000000000L; // long �� ����Ҷ��� long �� ������ L�� ���� �ڿ� �ٿ��ش�. (int �� ����)
				System.out.println(d);
				
				
				System.out.println("[�Ǽ�]");
				// 2. �Ǽ� : float , double 		
				// float  ==> ���� �Ǽ�
				// double ==> ū �Ǽ� 
				
				// �Ҽ����� �ִ��� ��Ȯ�� ǥ���ϴ°� ���⶧���� float ���� double �� ����Ѵ�. 		
				float e = 1.1234567891234f; // float �� double �� ������ ���� f�� �ڿ� �ٿ��ش�. 
				double f = 1.1234567891234; // double �� �Ѱ谡 ������ float ���� ū�����尡�� 
				System.out.println(e);
				System.out.println(f);
	}
}
