package C2_���ǹ�2_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�2_�˰���_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		   ������ ����
		  1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
		  2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
		  ��)	3 x 7 = ?
		  3. ������ �ش��ϴ� ������ �Է¹޴´�.
		  4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int n1 = scan.nextInt();
		
		System.out.println("�ι��� ���ڸ� �Է��ϼ���.");
		int n2 = scan.nextInt();
		
		System.out.println(n1 + " X " + n2 + " = ?");
		int ���� = scan.nextInt();
		
		if(���� == n1*n2) {System.out.println("����!");}
		if(���� != n1*n2) {System.out.println("��!");}
		
		
		
		scan.close();
	}
}
