package C1_���ǹ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_�հ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		   [���� ��ȿ�� �˻�]
		  1. ����2���� �Է¹޾� ����� ���Ѵ�.
		  2. �����  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
		  3. ����1)  �Է¹��� ������ 
		     �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
		     ��) ������  �߸� �Է��߽��ϴ�.
		  4. ����2) ����� 60 �̻��̶� , �Ѱ����̶� 50�̸��̸� ���հ��� ����Ѵ�.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է��ϼ���.");
		int ����1 = scan.nextInt();
		
		System.out.println("�ι�° ������ �Է��ϼ���.");
		int ����2 = scan.nextInt();
		
		int ��� = (����1 + ����2)/2;
			
		if(����1>=0 && ����2>=0 && ����1<=100 && ����2<=100) {
			if(���>=60 && ����1>=50 && ����2 >=50) {System.out.println("�հ�");}
		    if(���<60 || ����1<50 || ����2<50) {System.out.println("���հ�");}
		}
		if(����1<0 || ����2<0 || ����1>100 || ����2>100) {System.out.println("������ �߸� �Է��߽��ϴ�.");}
		
		scan.close();
	}
}
