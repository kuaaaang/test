package D_�׽�Ʈ_����;

import java.util.Random;
import java.util.Scanner;

public class �׽�Ʈ0505_����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[Ȧ¦����]		  
			[1] 1~10������ ���ڸ� �������� �����Ѵ�.
		  	[2] �Է��� "Ȧ"�̸� 1  , "¦"�̸�2 �� �Է��Ѵ�.  �������ڸ� ���纸����. [1.Ȧ] [2.¦] 
		  	[3] Ȧ¦�� ���ߴ°����̴�. 
		  	[4] �⺻���� 3000���� ����������Ѵ�. ������ ���߸� 500�� �̵��� ����,Ʋ���� 1000�� ���ظ� ����.
		  	[5] �Ű����� ���������� ������ ������� �������� �����Ѵ�.  
		  	[6] ���������� �����ڱ��� ����Ͻÿ�.
	        [7] ���̾����� ��������ȴ�. 
	        [8] ġƮŰ�� -100�� �Է��ϸ� ������ �����ش�. 
	    */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int money = 3000;
		
		while(true) {
			int r = ran.nextInt(10)+1;
			System.out.println("   [Ȧ¦ ����]   ");
			System.out.println(" [1.Ȧ] [2.¦] ");
			int n = scan.nextInt();
			
			if(n == 1) {
				System.out.println("Ȧ!");
				if(r%2 == 0) {
					System.out.println("���� : " + r);
					System.out.println("����!");
					money -= 1000;
				}
				else if(r%2 == 1) {
					System.out.println("���� : " + r);
					System.out.println("����!");
					money += 500;
				}
			}
			else if(n == 2) {
				System.out.println("¦!");
				if(r%2 == 0) {
					System.out.println("���� : " + r);
					System.out.println("����!");
					money += 500;
				}
				else if(r%2 == 1) {
					System.out.println("���� : " + r);
					System.out.println("����!");
					money -= 1000;
				}
			}
			else if(n == -100) {
				System.out.println("ġƮ!");
				System.out.println("���� : " + r);
			}
			
			System.out.println("���� �ݾ� : " + money);
			System.out.println();
			System.out.println("[1.���] [2.����]");
			int n2 = scan.nextInt();
			if(n2 == 1) {
				continue;
			}
			else if(n2 ==2) {
				System.out.println("����");
				break;
			}

			if(money<0) {
				System.out.println("�Ļ�");
				break;
			}
		}
    	scan.close();
	}
}
