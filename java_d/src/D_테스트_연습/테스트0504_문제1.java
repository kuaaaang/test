package D_�׽�Ʈ_����;

public class �׽�Ʈ0504_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
		ö���� ���ε��� ��鿩 ������ �Ǿ���.
		ö���� ��� �������� �Ⱦ��ؼ� ��7���� ��6�Ϸ� �ٲٰ� �������� �����ߴ�.
		5��1���� �Ͽ������ϰ��Ҷ�, 
		5��1�Ϻ��� 5��31�ϱ��� ��¥�� ������ ���� ����غ���.
		
		 
		 [����]
		 	1 => ��
		 	2 => ȭ
		 	3 => ��
		 	4 => ��
		 	5 => ��
		 	6 => ��
		 	7 => ��
		 	8 => ȭ
		 	.......
	    */

		int i = 1;
		while(i<=31) {
			if(i%6 == 1) {System.out.println("5�� " + i + "�� : �Ͽ���");}
			else if(i%6 == 2) {System.out.println("5�� " + i + "�� : ȭ����");}
			else if(i%6 == 3) {System.out.println("5�� " + i + "�� : ������");}
			else if(i%6 == 4) {System.out.println("5�� " + i + "�� : �����");}
			else if(i%6 == 5) {System.out.println("5�� " + i + "�� : �ݿ���");}
			else if(i%6 == 0) {System.out.println("5�� " + i + "�� : �����");}
			
			i+=1;
		}
		
	}
}
