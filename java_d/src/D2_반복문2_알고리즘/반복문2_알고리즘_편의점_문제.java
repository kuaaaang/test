package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
			ö���� �������� �Ѱ��� 1000���� ������� �Ѱ��� 1200���� ���ڿ����� � �缭 
			�� 15���� ������ ���.
			20000���� ���� 4200���� �Ž����޾����� ö������ ������� ��ΰ���??
		*/
		int white = 1000;
		int choco = 1200;
		
		int money = 15800;
		
		int a = 15;
		int b= 0;
		
		while(b>=0 && b<=15) {
			if(a*white + b*choco == money) {
				System.out.println("����� : " + a + "�� , ���ڿ��� : " + b + "��");
			}			
			a = a - 1;
			b = b + 1;
		}
	}
}
