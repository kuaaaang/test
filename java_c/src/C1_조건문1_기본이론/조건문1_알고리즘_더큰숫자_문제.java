package C1_���ǹ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�1_�˰���_��ū����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]   
		  ���� 2���� �Է¹ް� ��ū������ ���� ����Ͻÿ�.
		  
		   (1) ����1�� �Է� : 
		   (2) ����2�� �Է� : 
		   (3) ��ū���ڴ� ? �Դϴ�.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1�� �Է� : ");
		int ����1 = scan.nextInt();
		
		System.out.print("����2�� �Է� : ");
		int ����2 = scan.nextInt();
		
	if(����1>����2) {System.out.println("�� ū ���ڴ�" +  ����1  + "�Դϴ�.");}
	if(����1<����2) {System.out.println("�� ū ���ڴ�" +  ����2  + "�Դϴ�.");}

		scan.close();

	}
}
