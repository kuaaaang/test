package B4_�Է�_�⺻�̷�;

import java.util.Scanner;

public class �Է�_�򰡹���_����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  	���� 3���� �Է¹޴´�.
		  	�׼����߿� �Ѱ��� ���ڶ� Ȧ���������� �����Դϴ�.
		  	�Ʒ����ڵ��������� �ֳ���?
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int ����1 = scan.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int ����2 = scan.nextInt();
		
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int ����3 = scan.nextInt();

		System.out.println(����1%2 == 0 && ����2%2 == 0 && ����3%2 == 0);
		
		scan.close();
	}
}
