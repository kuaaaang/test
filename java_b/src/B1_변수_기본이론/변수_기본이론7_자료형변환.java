package B1_����_�⺻�̷�;

public class ����_�⺻�̷�7_�ڷ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[�ڷ�����ȯ] 	
				//�ڹٴ� ����Ÿ�Գ����� ������ �Ҽ��ִ�.
				// ���� + ����
				// �Ǽ� + �Ǽ�
		        // ���� + ����
				
				
				// 1) �ڵ�����ȯ 
				// ���࿡ �Ǽ� + ���� �� �ϸ� ���������� ������ �Ǽ��� ����ȯ�� �Ѵ�.
		        // �켱���� : �Ǽ�  >>  ���� , (10.3 * 2) ==> (10.3 * 2.0)������ �ٲ�
				// ��) 10 + 3.0 ==> 10.0 + 3.0 , "10" + 3 ==> "10" + "3"
				System.out.println("[�ڵ� ����ȯ]");
				System.out.println(10 + 3);
				System.out.println(10 + 3.0);
				
				
				// 2) ��������ȯ (�������� �����Ҷ� �ʿ�)
				// �ڷ����� �ٸ� �������� ������ �ʿ��Ҷ��� ���� ����ȯ�� �ؾ��Ѵ�.  
				// ��� ==> (����ȯŸ��)����;	
				System.out.println("[���� ����ȯ]");
				int a = 10;
				System.out.println(a);
				double b = (double)a ; // ���� ����ȯ 
				System.out.println(b);
				int c = (int) b; // ���� ����ȯ 
				System.out.println(c);
				
				
				// int c = a + b; // ����������.
				int d = 10;
				double e = 143.23;
				int f = d + (int)e; // double��  int�� �ٲ���ٰ� �ٽ� double�� �ٲ㵵 ������� ������ ����
				                    // 143.23 ==>  143  ==> 143.0 (143.23 X)
				System.out.println(f);
	}
}
