package F2_���ڿ�2_�˰���;

import java.util.Scanner;

public class ���ڿ�2_������Ʈ_���ڰ˻�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # ���ڿ� �� ���ڰ˻�
		  ��) adklajsiod
		  	 ���ڸ� �ִ�.
		  ��) 123123
		     ���ڸ� �ִ�.
		  ��) dasd12312asd
		     ���ڿ� ���ڰ� �����ִ�.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		
		int count = 0;
		for(int i = 0; i<text.length(); i+=1) {
			if(text.charAt(i) <= 57 && text.charAt(i) >= 48) {
				count += 1;
			}
		}
		if(count == text.length()) {System.out.println("���ڸ� �ִ�.");}
		else if(count == 0) {System.out.println("���ڸ� �ִ�.");}
		else {System.out.println("���ڿ� ���ڰ� �����ִ�.");}
	}
}
