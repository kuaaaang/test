package E7_�迭7_�⺻�̷�;

import java.util.Arrays;
import java.util.Scanner;

public class �迭7_������Ʈ_�ı����Ǳ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [�ı� ���Ǳ� ���α׷�]		
			1) ������   2) ����� 
			������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
			����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
		    	     2)�ڷΰ���
			 ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7��Ž����ش�. 
			ȭ�� 
			 �ı� ���� : 3200�� 
			 �ı� 	  : ??��  (������ ����) 
			 50000��   : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
			 1000��    : ?? ��   //  500��  : ?? ��	//  100�� : ?? �� 
	    */
		Scanner scan = new Scanner(System.in);
	
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;	// �ı� ����
		int price = 3200;	// �ı� ����
		int temp = 0;
			
		while(true) {
			System.out.println("1) ������   2) ����� ");
			System.out.print("�޴� ���� : ");
			int n = scan.nextInt();
			
			if(n == 1) {
				while(true) {
					System.out.println("������");
					System.out.println("1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int n1 = scan.nextInt();
					if(n1 == 1) {
						System.out.println("���� �ı� ���� : " + tickets + "��");
						System.out.println("������ �ı� ������ �Է��ϼ���.");
						int a = scan.nextInt();
						tickets += a;
					}
					else if(n1 == 2) {
						for(int i = 0; i<money.length; i+=1) {
							System.out.printf("%5d�� : %3d��" , money[i] , charges[i]);
							System.out.println();
						}
						System.out.println("������ �ܵ��� �Է��ϼ���.");
						int b = scan.nextInt();
						
						if(b == 50000 || b == 10000 || b == 5000 || b == 1000 || b == 500 || b == 100) {
							for(int i = 0; i<money.length; i+=1) {
								if(money[i] == b){
									temp = i;
								}
							}
						}
						else {
							System.out.println("����! �ݾ��� �ٽ� �Է��ϼ���.");
							break;
						}
						
						System.out.println("������ �ܵ� ������ �Է��ϼ���.");
						int c = scan.nextInt();
						charges[temp] += c;
					}
					else if(n1 == 3) {break;}
					else {System.out.println("����! �ٽ� �Է��ϼ���.");}
				}
			}
			
			else if(n == 2) {
				while(true) {
					System.out.println("�����");
					System.out.println("1) ����   2)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int n2 = scan.nextInt();
					if(n2 == 1) {
						System.out.println("�Աݱݾ��� �Է��ϼ���.");
						int d = scan.nextInt();
						System.out.println("������ �ı� ������ �Է��ϼ���.");
						int e = scan.nextInt();
						if(e*3200>d) {
							System.out.println("�ܾ��� �����մϴ�.");
						    break;
						}
						else if(e*3200<=d) {
							System.out.println("������ �ı� : " + e + "��");
							System.out.println("�Ա� �޾� : " + d);
							System.out.println("�� ���� �ݾ� : " + (e*3200));
							System.out.println("�Ž����� : " + (d-(e*3200)));
							int f = d-(e*3200);
							
							for(int i = 0; i<money.length; i+=1) {
								
								System.out.println(f);
								System.out.println(f/money[i]);
								
								if(f>=money[i]) {
									if(charges[i]<(f/money[i])) {
										System.out.println(money[i] + "�� : " + charges[i] + "��");
										f = f - (charges[i]*money[i]);
										charges[i] = 0;
									}
									else if(charges[i]>=(f/money[i])) {
										System.out.println(money[i] + "�� : " + (f/money[i]) + "��");
										charges[i] -= (f/money[i]);
										f = f - (money[i]*(f/money[i]));
									}
								}
								else if(f<money[i]) {
									continue;
								}
							}
							
						}
					}
					else if(n2 == 2) {break;}
					else {System.out.println("����! �ٽ� �Է��ϼ���.");}			
				}
			}
			else {System.out.println("����! �ٽ� �Է��ϼ���.");}
		}
//		scan.close();
	}
}
