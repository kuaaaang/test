package C2_���ǹ�2_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�2_�˰���_�ִ밪_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		 	�ִ밪 ���ϱ�
		  1. ���� 3���� �Է¹޴´�.
		  2. �Է¹��� 3���� ���� ���Ѵ�.
		  3. ���� ū ��(MAX)�� ����Ѵ�.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int a = scan.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b = scan.nextInt();
				
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int c = scan.nextInt();
		
		if(a>b && a>c) {System.out.println("���� ū ����" + a + "�Դϴ�.");}
		if(b>a && b>c) {System.out.println("���� ū ����" + b + "�Դϴ�.");}
		if(c>a && c>b) {System.out.println("���� ū ����" + c + "�Դϴ�.");}
		if(a == b && b == c) {System.out.println("���� ū ����" + a + "�Դϴ�.");}
	scan.close();
	}
}
