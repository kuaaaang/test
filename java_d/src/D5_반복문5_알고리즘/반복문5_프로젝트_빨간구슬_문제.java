package D5_�ݺ���5_�˰���;

public class �ݺ���5_������Ʈ_��������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		    �Ķ����� 50���� ���� ���� 70���� �ִ��� ���� �л��鿡�� �Ȱ��� �������ٷ����Ѵ�.
			�Ķ������� 5�������� 
			���������� 2���� �����Ҷ�, ���������� ���Ͽ���.
			1) �л����� ���ΰ���?
			2) �л��� �ްԵǴ� ���������� ������ ���Ͽ��� .
		*/
		int a = 50-5;
		int b = 70+2;
		int num1 = a;
		int num2 = b;
		int i = 1;
		int max = 0;
		
		while(i<=b) {if(num1%i == 0 && num2%i == 0) {max = i;
			                                         System.out.println("�����" + max);
			                                         }
		             i += 1; 
		             }
		System.out.println("�л��� : " + max + "��");
		System.out.println("�л��� ���������� " + (70/max) + "�� �޾Ҵ�.");
	}
}
