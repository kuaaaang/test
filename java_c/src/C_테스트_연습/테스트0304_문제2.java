package C_�׽�Ʈ_����;

public class �׽�Ʈ0304_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
	    [����]
			�Ʒ������� ������ �ۼ��ϰ�, �������Ͻÿ�.
		[����]
			ö���� �ѰŸ��� 8km�� ��å�θ� �ȴµ� 
			ó������ �ü� 6km�� �޸��ٰ� ���߿� ���̵��
			�����Ÿ��� �ü� 3km�� �ɾ 2�ð� ���� ��å�� ���ƴ�. 
			�ü� 6km�� �޸��Ÿ��� �ü� 3km�� �����Ÿ��� ���� ���Ͻÿ�.
			�ּ����� ǥ���Ͻÿ�.
		[��Ʈ]
			�м����� �ٲٸ� ����� ����.
	    */
		/*
		  a = �ü� 6km�� �� �Ÿ�
		  b = �ü� 3km�� �� �Ÿ�
		  a2 = �ü� 6km�� �� �ð�(��) = a/6*60 = 10a
		  b2 = �ü� 3km�� �� �ð�(��) = b/3*60 = 20b
		  
		  a+b = 8
		  10a + 20b = 120
		  a + 2b = 12
		*/
		int a = 4;
		int b = 4;
		
		System.out.println(a+b);
		System.out.println(a + 2*b);
		System.out.println("�ü� 6km�� " + a + "km"); 
		System.out.println("�ü� 3km�� " + b + "km"); 
	}
}
