package C3_���ǹ�3_�⺻�̷�;

import java.util.Random;

public class ���ǹ�3_������Ʈ_������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����]
		  
		   [���� ���߱�]
		    �̹��� 1���� �������̶�� �Ҷ�, 
		    �������� 1~31�� �����ϰ� �ش� ���� ����Ѵ�. 
		   
		   ��) 3�� ==> �ݿ���
		 */
		Random ran = new Random();
		int day = ran.nextInt(31) + 1;
			
		if(day == 1 || day == 8 || day == 15 || day == 22 || day == 29) {System.out.println(day + "��" + " ������");}
		if(day == 2 || day == 9 || day == 16 || day == 23 || day == 30) {System.out.println(day + "��" + " �����");}
		if(day == 3 || day == 10 || day == 17 || day == 24 || day == 31) {System.out.println(day + "��" + " �ݿ���");}
		if(day == 4 || day == 11 || day == 18 || day == 25) {System.out.println(day + "��" + " �����");}
		if(day == 5 || day == 12 || day == 19 || day == 26 ) {System.out.println(day + "��" + " �Ͽ���");}
		if(day == 6 || day == 13 || day == 20 || day == 27) {System.out.println(day + "��" + " ������");}
		if(day == 7 || day == 14 || day == 21 || day == 28) {System.out.println(day + "��" + " ȭ����");}
		
		/*
		int week = day % 7;
		System.out.println(day);
		if(week == 1) {
			System.out.println("������");
		}
		if(week == 2) {
			System.out.println("�����");
		}
		if(week == 3) {
			System.out.println("�ݿ���");
		}
		if(week == 4) {
			System.out.println("�����");
		}
		if(week == 5) {
			System.out.println("�Ͽ���");
		}
		if(week == 6) {
			System.out.println("������");
		}
		if(week == 0) {
			System.out.println("ȭ����");
		}
		long a = System.currentTimeMillis(); // 1970�� 1�� 1�� 0�ʺ��� ���ݱ����� ��
		System.out.println(a);
	    */		
	}
}
