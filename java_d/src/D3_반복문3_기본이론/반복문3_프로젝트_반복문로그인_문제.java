package D3_�ݺ���3_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���3_������Ʈ_�ݺ����α���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 
		  2. �α׾ƿ� . �α��� �� �̿밡��
		  3. �α���,�α׾ƿ� ������ log �� ������ �̿��Ѵ�.
		   [��] -1(�α׾ƿ�), 1111(id1), 2222(id2)
		*/
		Scanner scan = new Scanner(System.in);
		
		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(�α׾ƿ�), 1111(id1), 2222(id2)
		
		while(true) {System.out.println("1.�α���");
		             System.out.println("2.�α׾ƿ�");
		             System.out.println("0.����");
		             System.out.print("�޴� ���� : ");
		             int n = scan.nextInt();
			
		             if(n==1) {if(log == -1) {System.out.println("�α���");
			                                  System.out.println("���̵� �Է��ϼ���.");
			                                  int ID = scan.nextInt();
			                                  System.out.println("��й�ȣ�� �Է��ϼ���.");
			                                  int PW = scan.nextInt();
		                                       
			                                  if(ID == id1 && PW == pw1){log = id1;
			                                                             System.out.println(log + "�� �α��� ����!");
			                                                             } 
			                                  else if(ID == id2 && PW == pw2){log = id2;
			                                                                  System.out.println(log + "�� �α��� ����!");
			                                                                  }
			                                  else {System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���.");}
		                                      } 
			                   else {System.out.println("�α׾ƿ� �� �̿��� �����մϴ�.");}
			                   }
	                 else if(n==2) {if(log != -1) {log = -1;
	                                               System.out.println("�α׾ƿ�");
	                                               }
	                                else {System.out.println("�α��� �� �̿� �����մϴ�.");}  
	                                }
	                 else if(n==0) {System.out.println("����");
	                                break;
	                                }   
	                 else {System.out.println("����! �ٽ� �����ϼ���.");}
		             }
		scan.close();
	}
}
