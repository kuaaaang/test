package C2_���ǹ�2_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�2_������Ʈ_�ýÿ��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
			�ýñ⺻����� 10000���Դϴ�.
			
			�⺻������δ� 10km ���� �̵� �����մϴ�. 
			
			10km�̻� �̵��� �߰������ �߻��մϴ�. 
			
			�߰������ 3km�̵��Ҷ����� 2300���� ����� �߰��˴ϴ�.
				
			�̵��Ÿ��� �Է¹ް� �������Ͻÿ�.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̵��Ÿ��� �Է��ϼ���.");
		int km = scan.nextInt();
		
		if(km<=10) {System.out.println("����� 10000�� �Դϴ�.");}
		if(km>10) { int a = (km-10)/3*2300;
		            if (((km-10)%3)>0) {a = a+2300;} 
			System.out.println("�����" + (10000 + a) + "�Դϴ�.");}
		
		scan.close();
	}
}
