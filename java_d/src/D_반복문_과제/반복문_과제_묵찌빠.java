package D_�ݺ���_����;

import java.util.Random;

public class �ݺ���_����_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ݺ��� ���� �����  ( �ִ��� ����ϰ� �˾Ƽ� ����ÿ� ) 
		// 0 = ����  1 = ��  2 = ����
		
		Random ran = new Random();	
		
		int count = 0;
		while(true) {
			
			System.out.println("��.��.��!");
			int p1 = ran.nextInt(3);
			int p2 = ran.nextInt(3);
			
			System.out.println("Player1 : " + p1);
			System.out.println("Player2 : " + p2);
			
			if(count == 0 && p1 == p2) {count = 0;}
			
			if((p1 == 0 && p2 == 2) || (p1 == 1 && p2 == 0) || (p1 == 2 && p2 == 1)) {
				count = 1;
			}
			else if((p2 == 0 && p1 == 2) || (p2 == 1 && p1 == 0) || (p2 == 2 && p1 == 1)) {
				count = 2;
			}
			
			if(count>0 && p1 == p2) {
				System.out.println();
				if(count == 1) {System.out.println("Player1 �¸�!");}
				else if(count == 2) {System.out.println("Player2 �¸�!");}
				break;
			}
		}
	}
}
