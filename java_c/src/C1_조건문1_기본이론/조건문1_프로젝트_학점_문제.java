package C1_���ǹ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]  
		  	[����]
		  	���������� �Է¹޴´�. 
		  	���������� �ش��ϴ� ������ ����Ͻÿ�.
		  	�Ʒ��� ����ǥ�̴�.
		  		100~91 �̸� A����,
		  		90~81  �̸� B����,
		  		80���ϴ� "�����"
		  		
		  		��, �����̰ų�, A������ B������ ���� �ڸ��� 7���̻��̸� + �߰��Ͻÿ�.
		  		A������ B������ ���� �ڸ��� 3�������̸� - �߰��Ͻÿ�.
		  	��) 
		  		100 => A+
		      	87 ==> B+
		      	82 ==> B-
		      	23 ==> �����
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������� �Է��ϼ���.");
		int test = scan.nextInt();
		
		if(test >= 97) {System.out.println("A+");}
		if(93 < test && test < 97) {System.out.println("A");}
		if(90 < test && test <= 93) {System.out.println("A-");}
		if(87 <= test && test <= 90) {System.out.println("B+");}
		if(83 < test && test < 87) {System.out.println("B");}
		if(80 < test && test <= 83) {System.out.println("B-");}
		if(test <= 80) {System.out.println("�����");}
		
		scan.close();
	}
}
