package C4_���ǹ�4_�˰���;

import java.util.Scanner;

public class ���ǹ�4_�˰���_ATM_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  
		  [ATM]
		   
		    [��������]
		    cash ==> �������ִ� ������ ǥ���Ѵ�.
		    balance ==> ������ ǥ���Ѵ�.
		    joinId ==> �̹� ������ ���̵�
		    joinPw ==> �̹� ������ �н�����
		   
		    [Ư�̻���] ==>  �α��� ���Ŀ� ���ο� �޴��� �������� �Ѵ�.
		    
		    	[1.�α���] 
		   	    [1-1. �α��μ���] ==> ���ο�Ŵ����� ==> [1.�Ա�] [2.���] 	
		               [1-1-1.�Ա�] ==> ������ �پ��� ������ �þ��.
		               [1-1-2.���] ==> ������ �پ��� ������ �þ��.
		   		[1-2. �α��ν���] ==> ����
		   	[0.����]
		   
		    [��������� ����Ͻÿ�]
		*/
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;    
		int balance = 30000; 
		int joinId = 11111; 
		int joinPw = 1234;  
	
		System.out.println("===MEGA ATM===");
		System.out.println("[1.�α���] [0.����]");
		int select = scan.nextInt();
		if (select == 1) {System.out.println("�α���");
		                  System.out.println("ID�� �Է��ϼ���.");
		                  int ID = scan.nextInt();
		                  System.out.println("PW�� �Է��ϼ���.");
		                  int PW = scan.nextInt();
		                  
		                  if(joinId == ID && joinPw == PW) {
		                	         System.out.println("�α��μ���");
		                	         System.out.println("[1.�Ա�] [2.���]");
		                	         int n = scan.nextInt();
		                	                   if(n == 1) {System.out.println("�Ա�");
		                	                               System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
		                	                               int n1 = scan.nextInt();
		                	                               int ����1 = cash - n1;
		                	                               int ����1 = balance + n1;
		                	                               if(����1 >= 0) {System.out.println("���� : " + ����1 + "�� , " + "���� : " + ����1 + "��");}
		                	                               else{System.out.println("�Ա� �ݾ��� ���ڶ��ϴ�.");} 
		                 	                               }  
		                	                   else if(n == 2) {System.out.println("���");
		                                                        System.out.println("����� �ݾ��� �Է����ּ���.");
		                                                        int n2 = scan.nextInt();
		                                                        int ����2 = cash + n2;
				                	                            int ����2 = balance - n2;
				                	                            if(����2 >= 0) {System.out.println("���� : " + ����2 + "�� , " + "���� : " + ����2 + "��");}
				                	                            else {System.out.println("��� ������ �ݾ��� �ƴմϴ�.");}
		                                                        }
		                	                   else {System.out.println("����");
		                	                         System.out.println("�����մϴ�.");}
		                  }
		                  else {System.out.println("�α��ν���");
		                        System.out.println("�����մϴ�.");}
		                  }
		else if (select == 0) {System.out.println("����");}
		else {System.out.println("����");
              System.out.println("�����մϴ�.");}
			
		scan.close();
	}
}
