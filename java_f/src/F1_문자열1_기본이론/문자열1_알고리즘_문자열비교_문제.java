package F1_���ڿ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ڿ�1_�˰���_���ڿ���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # ���ڿ� ��
		  . equals() �޼��� ������ equals �������� ������ ��ġ���� ��
		  ��)
		  �ڳ���
		  �Է� = Ƽ�����罺
		  ��� = false
		*/
		Scanner scan = new Scanner(System.in);
			
		String name = "�ڳ���";
			
		System.out.print("���� �̸��� �Է��ϼ��� : ");	// ex) Ƽ�����罺
		String myName = scan.next();
		
		if(name.length() == myName.length()) {
			int count = 0;
			for(int i = 0; i<name.length(); i+=1){
				if(name.charAt(i) == myName.charAt(i)) {
					count += 1;
				}
			}
			if(count == name.length()) {System.out.println("��ġ");}
			else {System.out.println("����ġ");}
		}
		else {System.out.println("����ġ");}
		
//		if(name.length() == myName.length()) {
//			boolean check = false;
//			for(int i = 0; i < name.length(); i++) {
//				if(name.charAt(i) != myName.charAt(i)) {
//					check = true;
//					break;
//				}
//			}
//			if(check == true) {
//				System.out.println("��");
//			}else {
//				System.out.println("����");
//			}
//	
//		}else {
//			System.out.println("��");
//		}
			
	}
}
