package D4_�ݺ���4_�˰���;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [������ ���]
		  1. 5�� �ֹ��� �޴´�.
		  2. �ֹ��� ���� ��, ���� �Է¹޴´�.
		  3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		  
		  ��)
		  �޴� ���� : 1
		  �޴� ���� : 1
		  �޴� ���� : 2
		  �޴� ���� : 2
		  �޴� ���� : 3
		  �� �ݾ� = 31300��
		  ���� �Է� : 32000
		  === �Ե����� ������ ===
		  1. �Ұ�� ���� : 2��
		  2. ����  ���� : 2��
		  3. ��     �� : 1��
		  4. ��  ��  �� : 31300��
		  5. ��     �� : 700��
		*/
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		System.out.println(" === �Ե����� �޴� ===");
		System.out.println("1. �Ұ�� ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ��  ��");
		
		while(true){System.out.println("�޴��� �����ϼ���.[1~3]");
		            int menu = scan.nextInt();
		            
		            if(menu == 1) {c1 = c1 + 1;}
		            else if(menu == 2) {c2 = c2 + 1;}
		            else if(menu == 3) {c3 = c3 + 1;}
		            else {System.out.println("�޴��� �ٽ� �Է��ϼ���.");}
		            if(c1+c2+c3 == 5) {break;}
		            }
		System.out.println("������ �Է��ϼ���.");
		int money = scan.nextInt();
		if(money < (c1*8700 + c2*6200 + c3*1500)) {System.out.println("������ �����մϴ�.");}
		System.out.println("=== �Ե����� ������ ===");
		System.out.println("1. �Ұ�� ���� : " + c1 + "��");
		System.out.println("2. ���� ���� : " + c2 + "��");
		System.out.println("3. ��  �� : " + c3 + "��");
		System.out.println("4. ��  ��  �� : " + (c1*8700 + c2*6200 + c3*1500)  + "��");
		System.out.println("5. ��     �� : " + (money - (c1*8700 + c2*6200 + c3*1500)) + "��");
		
		scan.close();
	}
}
