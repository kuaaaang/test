package C3_���ǹ�3_�⺻�̷�;

import java.util.Scanner;
import java.util.Random;

public class ���ǹ�3_�˰���_�����������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  	[��� ���� ���߱� ����]
		  
		  1. 150~250 ������ ���� ���� �����Ѵ�.
		  2. ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�.
		  ��)
		 		249		: 4
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n2 = scan.nextInt();
		scan.close();
		
		Random ran = new Random();
		int n1 = ran.nextInt(101)+150;
		int a = (n1%100)/10;
		
		System.out.println(n1);
		
		if (a==n2) {System.out.println("����!");}
		else {System.out.println("��!");}
	}
}
