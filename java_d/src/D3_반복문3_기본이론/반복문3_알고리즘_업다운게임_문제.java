package D3_�ݺ���3_�⺻�̷�;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_�˰���_���ٿ����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [Up & Down ����]
		  1. com �� �������� 1~100���̸� �����Ѵ�.
		  2. me �� 1~100���̸� �Է��Ѵ�. 	 
		  3. com �� me �� ���ؼ� com ũ�� "ũ��" , 
		  	 com �������� "�۴�" ��Ʈ���� 
		  4. ������ ���߸� ������ ����ȴ�.
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(100) + 1;
		
		while(true) {System.out.println("=======���ٿ� ����========");
		             System.out.println("���ڸ� �Է��ϼ���.[1~100]");
		             int me = scan.nextInt();
		             if(me<=0) {System.out.println("���ڸ� �ٽ� �Է��ϼ���.");}
		             else if(com>me) {System.out.println("up");}
		             else if(com<me) {System.out.println("down");}
		    		 if(com == me) {System.out.print("���� : " + com);
		    	  		            System.out.println(" ����!");
		    	  	                break;}
		             }
	}
}
