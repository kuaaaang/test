package C2_���ǹ�2_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�2_�⺻�̷�3_��ø���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����] 
			[��ø ���ǹ�]
				�α����� ��øif �� �ٽ� ǥ���ϱ�. 
				���� id �� �Է¹ް� , id �� ��ġ�ϸ� �׶� pw �� �Է¹ޱ�.
		
		  1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
		  2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		  3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		  4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
		  
		  �Ʒ��������� ������ũǥ�����̴�.	 
		*/	
			Scanner scan = new Scanner(System.in);

			int join_id = 1234;
			int join_pw = 1111; // ȸ�������� ����

			System.out.print("ID �Է� : "); // �ȳ� �α��� ���̵�
			int log_id = scan.nextInt(); // �Է� �α��� ���̵�
			
			// �н������ ���̵� ��ġ�ϸ� �Է¹޴´�.
            // 1. ���̵� �񱳽� ���ٸ�, 
			if (join_id == log_id) { 
				System.out.print("Pw �Է� : "); // �ȳ� �α��� �н�����
				int log_pw = scan.nextInt();  // �Է� �α��� �н�����    //log_pw �� ���� �Ҹ��ϴ°�
                // 1-1 �н����尡 ���ٸ�
				if (join_pw == log_pw) {
					System.out.println("�α��� ����!");
				}
				// 1-2 �н����尡 Ʋ���ٸ�
				if (join_pw != log_pw) {
					System.out.println("Pw�� Ȯ�����ּ���.");
				}
			} // log_pw �Ҹ�
			// 2. ���̵� �񱳽� Ʋ���ٸ�
			if (join_id != log_id) {
				System.out.println("Id�� Ȯ�����ּ���.");
			}
		scan.close();
	}
}
