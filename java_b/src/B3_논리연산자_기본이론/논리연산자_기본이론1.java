package B3_��������_�⺻�̷�;

public class ��������_�⺻�̷�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 4. �� ������ (�񱳿����ڸ� ������ ���)
		  
		  1. ����
		  1) &&(and) : ���� ��� ���̾��, �� 
		  2) ||(or)  : ������ ��� �����̶� ���̸�, ��  // ||�� Ű������ġ��  ����Ʈ + �ѱ� ��(��) ǥ���̴�.
		  3) ! (not) : ���̸� �������� ��ȯ , �����̸� ������ ��ȯ (���� ���ȴ�.) 
		  
		  2. ����
		  1) �� �����ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�.
		  2) �� �����ڸ� ���� ���� ������ �����ϴ�. 
		 */	
				
				System.out.println(10 == 10 && 3 == 3);
				System.out.println(10 != 10 && 3 == 3);
				System.out.println(10 == 10 && 3 != 3);
				System.out.println(10 != 10 && 3 != 3);
				
				System.out.println("--------------------");
				
				int a = 10;
				int b = 3;
				
				System.out.println(a == a || b == b);
				System.out.println(a != a || b == b);
				System.out.println(a == a || b != b);
				System.out.println(a != a || b != b);
		        
				System.out.println("--------------------");
				
				System.out.println(!true);
				System.out.println(!false);
	}

}
