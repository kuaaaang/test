package D_�ݺ���_����;

import java.util.Scanner;
import java.util.Random;

public class ������_��í��_��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//��í�� ����
		int gacha = 0; //+ ���� ����
		int URPLUS = 10; //UR��� �� +�� ���� Ȯ��
		
		//�ڱ�, ��� ����� ����
		long money = 0; // �ڱ�
		int price = 1000; //��í 1ȸ ����
		int charge = 0; // �� ����
		
		//�׸��� ������ ����
		int input = -1;
		int input3 = 0;
		
		System.out.println("������ ����, ��í��!");
		
		while(true) {
			System.out.println("1)�̾ƺ���! 2)��������! 3)��ǰ����! 0)�׸��ҷ�!");
			System.out.print("�� �Ұž�?: ");
			input = scan.nextInt();
			
			if(input == 0) {
				System.out.println("������ ����˴ϴ�.");
				break;
			}else if(input == 1) {
				System.out.println("���� " + money + "�� �־�!");
				
				int input2 = -1;
				do {
					System.out.print("��í �ҷ�? (1:�ҷ�, 0:����): ");
					input2 = scan.nextInt();
				}while(input2 < 0 || input2 > 1);
				
				if(input2 == 0) break;
				else {
					System.out.println("(1. �ѹ��̱�)(2. 10ȸ �̱�)");
					input3= scan.nextInt();
					charge = price;
					if(input3==2) {
						charge=price*10; // 10ȸ �̱⸦ ������ ��� ���� ����
					}
				}
				
				if(money < charge) {
					System.out.println("���� �����Ѱ�! ���� �� �ϰ� ��!");
					continue;
				}
				
				if(input3==1) {
					money -= charge;
					gacha = ran.nextInt(100); // Ȯ�� 100% �߿���
					if(gacha < URPLUS) { // URPLUS == 10
						System.out.println("�Ϳ�!!!! UR+ '�ְ��� ������Ʈ ���̸�'�� ���Ծ�!!");//0���� 9����
					} else if(gacha < (100 - URPLUS) / 3 + URPLUS) { // (100-10)/3 + 10 = 30+10 = 40
						System.out.println("�Ϳ�!!! UR '�ŷ��� ���� ���̵�'�� ���Ծ�!"); //10���� 39����
					} else if(gacha < (100 - URPLUS) / 3 * 2 + URPLUS) { // ((100-10)/3)*2 + 10 = 60+10 = 70
						System.out.println("�Ϳ�!! UR '��ǳ�� ���� ī����'�� ���Ծ�!"); //40���� 69����
					} else {
						System.out.println("�Ϳ�! UR '�ݾ��� ��� �뿤'�� ���Ծ�!"); //70���� 99����
					}
				}
				if(input3==2) {
					money -= charge;
					for(int r=1; r<=10; r+=1) {
						gacha = ran.nextInt(100);
						if(gacha < URPLUS) {
							System.out.println("�Ϳ�!!!! UR+ '�ְ��� ������Ʈ ���̸�'�� ���Ծ�!!");//0���� 9����
						} else if(gacha < (100 - URPLUS) / 3 + URPLUS) {
							System.out.println("�Ϳ�!!! UR '�ŷ��� ���� ���̵�'�� ���Ծ�!"); //10���� 39����
						} else if(gacha < (100 - URPLUS) / 3 * 2 + URPLUS) {
							System.out.println("�Ϳ�!! UR '��ǳ�� ���� ī����'�� ���Ծ�!"); //40���� 69����
						} else {
							System.out.println("�Ϳ�! UR '�ݾ��� ��� �뿤'�� ���Ծ�!"); //70���� 99����
						}	
					}
				}
				
			} else if(input == 2) { //�� ���� ���ý�
				long temp = 0; //������ �׼��� �޴� ����
				System.out.print("�󸶳� �����ҷ�?: ");
				temp = scan.nextLong(); //�Է��ϴ� �׼��� �޾Ƶ��δ�
				if(temp <= 0) { //����� �ƴ� ���� �Է��� ��� ������ ���� �ʴ´�
					System.out.println("���� ������ �� �� ��!");
				} else { //���������� �ݾ��� �Է��� ���
					money += temp; //�Է¹��� �׼��� ������ ��
					System.out.println("�����ƾ�! " + money + "�� �־�!"); //���� ������ �׼��� �˷��ش�
				}
			} else if(input == 3) {
				System.out.println("���� �������� ��í������ ������ ģ������ �Ʒ��� ����!");
				double temp = (100 - URPLUS) / 3.0;  // (100-10)/3.0 = 30.0
				System.out.println(" +�ְ��� ������Ʈ ���̸� (" + (double)URPLUS + "%)");
				System.out.println(" �ŷ��� ���� ���̵� (" + temp + "%)");
				System.out.println(" ��ǳ�� ���� ī���� (" + temp + "%)");
				System.out.println(" �ݾ��� ��� �뿤 (" + temp + "%)");
			}
	}
		scan.close();
	}
}