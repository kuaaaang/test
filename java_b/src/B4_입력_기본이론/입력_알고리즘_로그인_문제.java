package B4_�Է�_�⺻�̷�;

import java.util.Scanner;

public class �Է�_�˰���_�α���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*		 
		 [����] 
		 	ö���� �α����� �Ϸ��� �Ѵ�. 
		 	���̵�� ��й�ȣ�� �Է¹޴´�. 
		 	���̵�� ��й�ȣ �����ϳ���Ʋ���� �α����� �����մϴ�.
		 	ö���� �α����� �����ұ��?
		 	joinId �� joinPw �� ö���� �̹̰����� ���̵�� ��й�ȣ�Դϴ�.
		 */	
		Scanner scan = new Scanner(System.in);
			int joinId = 1234;
			int joinPw = 4321;
			
			System.out.println("ID�� �Է��ϼ���");
			int ID = scan.nextInt();
			System.out.println("PW�� �Է��ϼ���");
			int PW = scan.nextInt();
			
			System.out.println(joinId == ID && joinPw == PW);
			scan.close();
	}
}
