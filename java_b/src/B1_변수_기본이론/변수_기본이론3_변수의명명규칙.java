package B1_����_�⺻�̷�;

public class ����_�⺻�̷�3_�����Ǹ���Ģ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # ������ ����Ģ
		  1. ���ڷ� ������ �� ����.  ==> int 1a; (X)
		  2. Ư�����ڴ� _ , $���� ����Ѵ�. ==> int _1; (O) , int $1; (O) , int *1;(X)
		  3. �����(Ű����)�� ����� �� ����. ex) public, class, static, void...  ==> int int; (X)
		  4. �ڹٴ� ���ĺ��� ��ҹ��ڸ� �����Ѵ�. 
		  --------------------------------------
		  1. ��Ű����� �������� �ҹ��ڷ� �����Ѵ�.
		  2. Ŭ�������� �빮�ڷ� �����Ѵ�. (�����)
		*/

				int a;
				a = 10;
				int A;
				A = 20;
				System.out.println(a);
				System.out.println(A);
		
		        int test = 1; // ������ ��ҹ��ڸ� �����Ѵ�.(���� �ٸ������̴�.)
		        int Test = 2;
		        System.out.println(test);
		        System.out.println(Test);
		        
		             
		        int $money = 1000;  // Ư������ $ ��밡��
		        int _money = 2000;  // Ư������ _ ��밡�� 
		        System.out.println($money);
		        System.out.println(_money);
		        
		        // �Ʒ��Ͱ��� ��������� ����Ѱ���̴�. (�Ű澲���ʾƵ��ȴ�)
		        // ����� ������� ������� ==>  ������ ����� ��������ʾƼ� ����°�.
		        int math_score = 35; // Ư������ _ ��밡��  ==> �ι�° �ܾ _ �� �����ϴ°�(������ũǥ���)
		        int koreanScore = 87; // ù��° �ܾ�� �ҹ��� , �ι�° �ܾ� ù���ڸ� �빮�ڷ� �ϴ°� (ī��ǥ���)
		                              // java�� ī��ǥ��� ���
		        
		        // int 1num = 10;  // �����̸��� ���ڷ� �����Ҽ�����.
		        // int #test = 10;  // Ư����ȣ ��κ� ���Ұ� 
		        // int void = 20; // ����� ���Ұ�
	}
}
