package F3_���ڿ�3_�˰���;

import java.util.Scanner;

public class ���ڿ�3_�˰���_��ٱ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   # ���θ� [��ٱ���]
		  1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
		  	 (1) ��� (2) �ٳ��� (3) ���� 
		  2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
		  3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�.
		  4. �ش� ȸ���� ������ ��ǰ��  �� ���� �ι�° ���� �����Ѵ�.
		  ��)
		  {
		  		{qwer, ���},				
		  		{javaking, �ٳ���},				
		  		{abcd, ���},				
		  		{qwer, ����},		
		  		{qwer, ���},			
		  		...
		  }
		  5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�.
		  ��)  qwer ==> ��� , ���� , ���
		*/
		Scanner scan = new Scanner(System.in);
			
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;

		while(true) {
			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��   ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��   ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է��ϼ���.");
					String id = scan.next();
					System.out.println("��й�ȣ�� �Է��ϼ���.");
					String pw = scan.next();
					
					for(int i = 0; i<idList.length; i+=1) {
						if(id.equals(idList[i]) == true) {
							if(pw.equals(pwList[i]) == true) {
								log = i;
								System.out.println("�α��� ����!");
							}
						}
					}
					if(log == -1) {System.out.println("�α��� ����");}
				}
				else if(log != -1) {
					System.out.println("�α׾ƿ� �� �̿����ּ���.");
				}
			}
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("�α��� �� �̿����ּ���.");		
				}
				else if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ� �Ϸ�");
				}
			}
			else if(sel == 3) {
				System.out.println("(1) ��� (2) �ٳ��� (3) ����");
				System.out.println("������ ��ǰ�� ����ּ���.");
				int num = scan.nextInt();
				if(log != -1) {
					if(num == 1 || num == 2 || num == 3) {
						cartList[count][0] = idList[log];
						cartList[count][1] = items[num-1];
						count += 1;
					}
					else {System.out.println("�ش� ��ȣ�� ��ǰ�� �������� �ʽ��ϴ�.");}
				}
				else {System.out.println("�α��� �� �̿����ּ���.");}
			}
			else if(sel == 4) {
				for(int i = 0; i<count; i+=1) {
					if(cartList[i][0].equals(idList[log]) == true) {
						System.out.println(cartList[i][0] + " , " + cartList[i][1]);
					}
				}
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}		
		}	
	}
}
