package C1_���ǹ�1_�⺻�̷�;

public class ���ǹ�1_�⺻�̷�1_���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [���ǹ�] if
		  
		  1) if ==> Ű����
		  2) (���ǽ�) ==> ������ ������� �Ǻ��Ѵ�.
		  3) {���}  ==> �������� ������� ����� �����Ѵ�.
		  
		  ----------------------------------------------
		  
		  if(���ǽ�){
		  		���ǽ��� ��(true)�� �� ������ ����;
		  }
	 
		  ----------------------------------------------
		*/		
			int a = 10;
			int b = 10;
			if(a == b) {
				System.out.println("���� O");
			}
			
			if(a != b) {
				System.out.println("���� X");  // �̺κ��� ������ �ȵȴ�. 
			}		
			// ��) Ȧ¦
			int num = 8;	
			if(num % 2 == 0) {
				System.out.println("¦��");
			}
			if(num % 2 != 0) {
				System.out.println("Ȧ��");  // �̺κ��� ������ �ȵȴ�. 
			}
	}
}
