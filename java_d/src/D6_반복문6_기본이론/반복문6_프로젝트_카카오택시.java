package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;
import java.util.Random;

public class �ݺ���6_������Ʈ_īī���ý� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [īī�� �ý�]
		  1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		  2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		  3. �޴��� �Ʒ��� ����.
		  		1) �ӵ����� : 1~3������ ����
		  		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		  		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		  4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		  5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
		*/
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int EWSN = 0;
		int x = 0;
		int y = 0;
		int dx = 0;
		int dy = 0;
		int speed = 0;
		int money = 0;
		int total = 0;
		dx = ran.nextInt(21) - 10;
		dy = ran.nextInt(21) - 10; 
		
		while(true) {System.out.println("[������] : x : " + dx + " , y : " + dy);
		             System.out.println("[������ġ] : x : " + x + " , y : " + y);
		             System.out.println("[����] : " + EWSN + " , [�ӵ�] : " + speed);
			         System.out.println("[������] : " + money + " , [��ü����] : " + total);
			         System.out.println("[1.�ӵ�] [2.����] [3.�̵�] [0.����]");
			         int n = scan.nextInt();
			         if(n==0) {System.out.println("����");
			                   break;}
			         else if(n==1) {System.out.println("�ӵ��� �����ϼ���.[1~3]");
			                        speed = scan.nextInt();
			                        if(speed > 3 || speed < 1) {System.out.println("����! ó������ ���ư��ϴ�.");}
			                        }
			         else if(n==2) {System.out.println("������ �����ϼ���.[1.��][2.��][3.��][4.��]");
			                        EWSN = scan.nextInt();
			                        if(speed > 4 || speed < 1) {System.out.println("����! ó������ ���ư��ϴ�.");}
			                        }
			         else if(n==3) {if(EWSN == 1) {x+=speed;}
			                        if(EWSN == 2) {x-=speed;}
			                        if(EWSN == 3) {y-=speed;}
			                        if(EWSN == 4) {y+=speed;}
			                        money += speed;
			                        }
			         else {System.out.println("����! ó������ ���ư��ϴ�.");}
			         
			         if(dx == x && dy == y) {total +=money;
			        		                 money = 0;
			        		                 System.out.println("����");
			        		                 System.out.println("�ýÿ�� : " + (total*50) + "��");
			        		                 break;}
	             	}
	}
}
