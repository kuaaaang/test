package C4_���ǹ�4_�˰���;

import java.util.Scanner;
import java.util.Random;

public class ���ǹ�4_�˰���_Ȧ¦����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]		  
		  	[Ȧ¦ ����]  
		  1. 1~10���� ������ �������� �Ѱ��� ���ڸ� �����Ѵ�.
		  2. ������ ���ڰ� [1.Ȧ��][2.¦��] ���� ���ߴ°����̴�.
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int R1 = ran.nextInt(10) + 1;
		
		System.out.println("[1.Ȧ��][2.¦��]");
		int S1 = scan.nextInt();
		
		if(S1 == 1) {if(R1%2 > 0) {System.out.println("���� : " + R1 + " ����!");}
		             if(R1%2 == 0) {System.out.println("���� : " + R1 + " ��!");}
		             }
		else if(S1 == 2) {if(R1%2 == 0) {System.out.println("���� : " + R1 + " ����!");}
                          if(R1%2 > 0) {System.out.println("���� : " + R1 + " ��!");}
		                  }
		else {System.out.println("����");}
		scan.close();
	}
}
