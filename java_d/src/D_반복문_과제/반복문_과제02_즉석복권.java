package D_�ݺ���_����;

import java.util.Random;

public class �ݺ���_����02_�Ｎ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[�Ｎ����]
			�������� 1�Ǵ� 7 �� 10������Ѵ�. 
			7�� �������� 3���̻��̸� "��÷" �ƴϸ� "��" ����Ͻÿ�.
		[����]
			7 7 1 1 1 7 1 : ��
			1 7 7 7 1 1 7 : ��÷
		*/
		Random ran = new Random();
		
		int count = 0;
		int count7 = 0;
		int win = 0;
		
		while(true) {
			int r = ran.nextInt(2);
			
			if(r==0) {
				System.out.print(1 + "  ");
				count += 1;
				count7 = 0;
			}
			else if(r==1) {
				System.out.print(7 + "  ");
				count += 1;
				count7 += 1;
			}
			if(count7 >= 3) {win += 1;}
			if(count == 10) {break;}
		}
		System.out.println();
		if(win > 0) {System.out.println("��÷!");}
		else if(win == 0) {System.out.println("��!");}
	}
}
