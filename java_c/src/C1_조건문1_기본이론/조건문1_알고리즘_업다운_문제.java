package C1_���ǹ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�1_�˰���_���ٿ�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		  	[Up & Down ����]
		  
		   com�� 8�̴�.
		   me�� ���ڸ� �ϳ��Է¹޴´�.
		   com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
		    [1] me < com	: Up!
		    [2] me == com : Bingo!
		    [3] me > com  : Down!
		    
		    ��)
		    (1) ���ڸ� �Է� : 
		    (2) Up! 
		*/
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int ����1 = scan.nextInt();
		
		if(com > ����1) {System.out.println("Up!");}
		if(com == ����1) {System.out.println("Bingo!");}
		if(com < ����1) {System.out.println("Down!");}
		
		scan.close();
    }
}
