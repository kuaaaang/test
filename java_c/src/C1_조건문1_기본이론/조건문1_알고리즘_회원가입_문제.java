package C1_���ǹ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�1_�˰���_ȸ������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
		  	[ȸ������ �� �α���] 
		  1. ���� ���̵�� ��й�ȣ�� �Է��ؼ� ȸ�������Ѵ�. 
		  2. ���� �α����� ���� �ٽ� ���̵�� ��й�ȣ�� �Է¹޴´�.
		  3. ���Ե� ���̵�� ��й�ȣ�� �α��ν� �Է��� ���̵�� ��й�ȣ�� ���Ѵ�.
		  4. "�α���" �Ǵ� "�α��ν���" �� ����ϼ���.  
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ȸ������ ID�� �Է��ϼ���.");
		int ȸ������ID = scan.nextInt();
		System.out.println("ȸ������ PW�� �Է��ϼ���.");
		int ȸ������PW = scan.nextInt();
		System.out.println("�α��� ID�� �Է��ϼ���.");
		int �α���ID = scan.nextInt();
		System.out.println("�α��� PW�� �Է��ϼ���.");
		int �α���PW = scan.nextInt();
		
		if(ȸ������ID == �α���ID && ȸ������PW == �α���PW) {System.out.println("�α���");}
		if(ȸ������ID != �α���ID || ȸ������PW != �α���PW) {System.out.println("�α��� ����");}
				
		scan.close();
		
	}
}
