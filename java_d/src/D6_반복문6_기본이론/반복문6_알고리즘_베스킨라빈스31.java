package D6_�ݺ���6_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���6_�˰���_����Ų���31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [����Ų���31]
		    ����Ų��� �����̶�, �÷��̾� 2���� �����ư��鼭
		    1~3������ ���ڸ� �����Ҽ��ְ�, �׼��ڵ��� ��� ���ؼ� 
		    �״������� 31�� �������������� ���°����̴�. 
		  
		  1) �� �÷��̾�� �����ư��鼭 1~3�� �����Ѵ�.
		  2) ���࿡ �̻��Ѽ��ڸ� �Է��ϸ� 1~3�� �Է��Ҷ����� ����ڱ� �����̴�.
		  3) �� �÷��̾ �����Ѽ��ڴ�  total  ������ ��� �����ؼ� ���Ѵ�.
		  4) total �� 31�̻� �����ϸ� �¸��ڸ� ����Ѵ�.
		*/
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int turn = 1;
		while(true) {System.out.println("����Ų��� : " + total);
			         if(turn%2 == 1) {System.out.println("Player1 [1~3]�� �Է��ϼ���.");
			                          int p1 = scan.nextInt();
			                          if(p1!=1 && p1!=2 && p1!=3) {System.out.println("���ڸ� �ٽ� �Է��ϼ���.");}
			                          else if(p1==1 || p1==2 || p1==3) {total = total + p1;
			                                                            turn = turn + 1;}
			                          }
			         else if(turn%2 == 0) {System.out.println("Player2 [1~3]�� �Է��ϼ���.");
			                               int p2 = scan.nextInt();
			                               if(p2!=1 && p2!=2 && p2!=3) {System.out.println("���ڸ� �ٽ� �Է��ϼ���.");}
					                       else if(p2==1 || p2==2 || p2==3) {total = total + p2;
					                                                         turn = turn + 1;}
			                               }
			          
			         if(total>=31) {System.out.println("����!");
			                        break;}
			         }
		if(turn%2==1) {System.out.println("Player1 �¸�!");}
		else if(turn%2==0) {System.out.println("Player2 �¸�!");}
		
		scan.close();
	}
}
