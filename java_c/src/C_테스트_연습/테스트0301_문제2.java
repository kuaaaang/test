package C_�׽�Ʈ_����;

import java.util.Scanner;

public class �׽�Ʈ0301_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[����]
			�ýñ⺻����� 10000���̴�.		
			�⺻������δ�  10km ���� �̵��Ҽ��ִ�. 		
			10km�̻� �̵��� �߰������ �߻��Ѵ�.		
			�߰������ 3km�̵� �Ҷ����� 2300���� ����� �߰��ȴ�.			
			�̵��Ÿ��� �Է¹ް� ����� ����Ͻÿ�.	
			�̵��Ÿ��� 0�����ϰ�� "����" ����Ͻÿ�.
	   */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�Ÿ��� �Է��ϼ���.");
		int km = scan.nextInt();
		
		if(km<10) {
			System.out.println("�̵��Ÿ� : " + km + " , ��� : 10000��");
		}
		else if(km>=10) {
			int a = (km-10)/3;
			if((km-10)%3 > 0) {a = a + 1;}
			System.out.println("�̵��Ÿ� : " + km + " , ��� : " + (10000 + (a*2300)) + "��");
		}
		
	}

}
