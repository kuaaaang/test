package D_�ݺ���_����;

import java.util.Scanner;
import java.util.Random;

public class ������_�ּ� {
	public static void main(String[] args) {
		//�Է��� ���� ��ĳ�ʿ� Ȯ�� ������ ���� ����
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//��í�� ����
		int gacha1 = 0; //R, SR, UR ����
		int gacha2 = 0; //+ ���� ����
		int urPercent = 5; //UR�� ���� Ȯ��
		int srPercent = 20; //SR�� ���� Ȯ��
		final int CHANCE = 5; //Ư�� ��í ���ý� Ȯ�� ������
		final int URPLUS = 10; //UR��� �� +�� ���� Ȯ��
		final int SRPLUS = 20; //R, SR��� �� +�� ���� Ȯ��
		
		//�ڱ�, ��� ����� ����
		long money = 0; //��í�� ���� �� �ִ� �ڱ�
		int lgacha = 1000; //�Ϲ� ��í 1ȸ ����
		int hgacha = 3000; //Ư�� ��í 1ȸ ����
		int chance = 0, charge = 0; //Ư�� ��í ���� ���θ� �ݿ��ϱ� ���� ����
		
		//�׸��� ������ ����
		int input = -1;
		
		System.out.println("������ ����, ��í��!");
		//���� ����� ���� �ݺ���
		while(true) {
			System.out.println("1)�̾ƺ���! 2)��������! 3)��ǰ����! 0)�׸��ҷ�!");
			System.out.print("�� �Ұž�?: ");
			input = scan.nextInt();
			
			if(input == 0) {
				break;
			} else if(input == 1) {
				System.out.println("Ȯ���� ���� �Ϲ� ��í�� " + lgacha + "��, Ȯ���� ���� Ư�� ��í�� " + hgacha +"���̾�!");
				while(true) {
					System.out.println("���� " + money + "�� �־�!");
					
					int input2 = -1;
					do {
						System.out.print("���� �ҷ�? (1:�Ϲ�, 2:Ư��, 0:���ư���): ");
						input2 = scan.nextInt(); //��í ���� ����
					}while(input2 < 0 || input2 > 2); //���� ������ ���ڸ� �Է��� ������ �ݺ�
					
					if(input2 == 0) break; //���ư��⸦ �Է��ߴٸ� ���⼭ �״�� ������
					
					if(input2 == 1) { //�Ϲ� ��í�� �������� ���
						chance = 0; //Ȯ�� ���� ����
						charge = lgacha; //�Ϲ� ��í�� ��� ����
					} else { //Ư�� ��í�� �������� ���
						chance = CHANCE; //Ȯ�� ���� ����
						charge = hgacha; //Ư�� ��í�� ��� ����
					}
					
					int input3 = -1;
					do {
						System.out.print("10�� �ϸ� SR 1���� Ȯ���ε� �ҷ�?(1: ��, 2:�ƴ�): ");
						input3 = scan.nextInt(); //10���� ���� ����
					}while(input3 < 1 || input3 > 2); //���� ������ ����(�ķ�)
					
					if(input3 == 1) charge *= 10; //10������ �����ߴٸ� ��� 10�� ����
					
					if(money < charge) { //���������� �ʿ��� ����� ������ ���
						System.out.println("���� �����Ѱ�! ���� �� �ϰ� ��!");
						break; //���⼭ ó������ ���ư���
					}
					
					money -= charge; //�����ݿ��� ��í ��� ����
					
					if(input3 == 1) { //10������ �������� ����� ��í ����
						boolean check = true; //Ȯ�� ������ üũ�ϱ� ���� ����. ��í�� �� ������ SR �̻��� �������� üũ�ؼ� �� ���̶� ���� ��� �� ������ false�� �����
						for(int i = 0; i < 10; i++) { //10�����̹Ƿ� 10�� �ݺ�
							gacha1 = ran.nextInt(100); //�� �ܰԴ� 0~99 ���� // ���
							gacha2 = ran.nextInt(100); //�� �ܰԴ� 0~99 ���� // +
							if(i == 9 && check == true) { //������ ��í�ε� �� ������ �� ���� SR �̻��� ������ �ʾ��� ��� ������ SR �̻��� ������ �� �ܶ����� ���´�
								double temp = 100.0 / (urPercent + srPercent + 5 * chance); //R Ȯ���� ���ֱ� ���� UR, SR Ȯ���� ��ü���� �󸶳� �����ϴ��� ���� ��
								if(gacha1 < (urPercent + chance) * temp) { //������ ���� ������ UR Ȯ���� ���ؼ� R�� Ȯ���� �����Ѵ�
									if(gacha2 < URPLUS) { //0���� 10(URPLUS�� ��) ������ 9������ UR+�� ���� Ȯ���� ����
										System.out.println("UR+ �ְ��� ������Ʈ ���̸�");
									} else if(gacha2 < (100 - URPLUS) / 3 + URPLUS) { //UR�� ��ü Ȯ���� 100���� ���, �� �߿��� UR+�� Ȯ���� �� ���� UR ��ä���� ������ Ȯ���� �����ϰ� ����� 
										System.out.println("UR �ŷ��� ���� ���̵�"); //10���� 39����
									} else if(gacha2 < (100 - URPLUS) / 3 * 2 + URPLUS) {
										System.out.println("UR ��ǳ�� ���� ī����"); //40���� 69����
									} else {
										System.out.println("UR �ݾ��� ��� �뿤"); //70���� 99����
									}
								} else {
									if(gacha2 < SRPLUS) { //0���� 20(SRPLUS�� ��) ������ 19������ SR+�� Ȯ��
										System.out.println("SR+ ������ Ž���� �˺���");
									} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) { //UR���� ����������, SR+�� Ȯ���� �� ���� SR ��ü���� 2�� ������ Ȯ���� �����ϰ� �����
										System.out.println("SR õ���� ȭ�� �ٹٶ�"); //20���� 59����
									} else {
										System.out.println("SR ���ǵ� ���� ����"); //60���� 99����
									}
								} //���� ������ ��í�� �ƴϰų�, ������ ��í���� �̹� SR �̻��� ���Դٸ� ������ ���� ���� ��í�� ����ȴ�
							} else if(gacha1 < urPercent + chance) { //�Ϲ� ��í�� �����ߴٸ� chance�� 0�� �������Ƿ� urPercent�� ���� 5% Ȯ���� UR�� ���´�. Ư�� ��í�� �����ߴٸ� chance�� 5�� �� �հ� 10% Ȯ���� �ȴ�
								check = false;
								if(gacha2 < URPLUS) {
									System.out.println("UR+ �ְ��� ������Ʈ ���̸�");
								} else if(gacha2 < (100 - URPLUS) / 3 + URPLUS) {
									System.out.println("UR �ŷ��� ���� ���̵�");
								} else if(gacha2 < (100 - URPLUS) / 3 * 2 + URPLUS) {
									System.out.println("UR ��ǳ�� ���� ī����");
								} else {
									System.out.println("UR �ݾ��� ��� �뿤");
								}
							} else if(gacha1 < urPercent + srPercent + 5 * chance) { //UR Ȯ���� urPercent�� SR Ȯ���� srPercent�� �ջ�Ǿ�������, UR Ȯ���� ���� if������ �Ÿ� ���� else if�� �̾��⿡ ���⼭ �ɸ��� �� UR Ȯ�� ������ ������ SR Ȯ�� �κл�
								check = false;
								if(gacha2 < SRPLUS) {
									System.out.println("SR+ ������ Ž���� �˺���");
								} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
									System.out.println("SR õ���� ȭ�� �ٹٶ�");
								} else {
									System.out.println("SR ���ǵ� ���� ����");
								}
							} else { //UR Ȯ���� SR Ȯ���� ���� �񲸳��� ������ �κ�
								if(gacha2 < SRPLUS) {
									System.out.println("R+ ���ư��� �� ��̳�");
								} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
									System.out.println("R ������ ���� ����");
								} else {
									System.out.println("R ������ ���� ���̷�ũ");
								}
							}
						}
						System.out.println("�� ���Ծ�!");
					} else { //10���� �������� �ʾҴٸ� ���⼭ ��í 1ȸ�� ����ȴ�.
						gacha1 = ran.nextInt(100);
						gacha2 = ran.nextInt(100);
						if(gacha1 >= 100 - urPercent - chance) {
							if(gacha2 < URPLUS) {
								System.out.println("�Ϳ�!!!! UR+ '�ְ��� ������Ʈ ���̸�'�� ���Ծ�!!");
							} else if(gacha2 < (100 - URPLUS) / 3 + URPLUS) {
								System.out.println("�Ϳ�!!! UR '�ŷ��� ���� ���̵�'�� ���Ծ�!");
							} else if(gacha2 < (100 - URPLUS) / 3 * 2 + URPLUS) {
								System.out.println("�Ϳ�!! UR '��ǳ�� ���� ī����'�� ���Ծ�!");
							} else {
								System.out.println("�Ϳ�! UR '�ݾ��� ��� �뿤'�� ���Ծ�!");
							}
						} else if(gacha1 >= 100 - urPercent - srPercent - 5 * chance) {
							if(gacha2 < SRPLUS) {
								System.out.println("����!!! SR+ '������ Ž���� �˺���'�� ���Ծ�!");
							} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
								System.out.println("����!! SR 'õ���� ȭ�� �ٹٶ�'�� ���Ծ�!");
							} else {
								System.out.println("����! SR '���ǵ� ���� ����'�� ���Ծ�!");
							}
						} else {
							if(gacha2 < SRPLUS) {
								System.out.println("��!!! R+ '���ư��� �� ��̳�'�� ���Ծ�!");
							} else if(gacha2 < (100 - SRPLUS) / 2 + SRPLUS) {
								System.out.println("��!! R '������ ���� ����'�� ���Ծ�!");
							} else {
								System.out.println("��! R '������ ���� ���̷�ũ'�� ���Ծ�!");
							}
						}
					}

					do {
						System.out.print("�� �ҷ�?(1: ��, 2:�ƴ�): "); //��í�� ���� ���� �ٽ� ���� ����� �ܶ�
						input2 = scan.nextInt();
					}while(input2 < 1 || input2 > 2);
					
					if(input2 == 2) break; //�� �ϴ� �� �����ߴٸ� ��í�� ������.
				} //while(true) �ݺ����̹Ƿ�, �߰��� break�� ������ �ʾҴٸ� ��í�� �簳�Ѵ�
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
			} else if(input == 3) { //��ǰ�� ���� ���� ������ ���
				System.out.println("���� �������� ��í������ ������ ģ������ �Ʒ��� ����!"); //��ǰ ��ϰ� ������ Ȯ���� ǥ���Ѵ�. ������(/)�� �������� ������ �Ϲ� ��í�� Ȯ��, �������� Ư�� ��í�� Ȯ��.
				System.out.println("UR: " + urPercent + "%/"+ (urPercent + CHANCE) +"%"); //UR��� Ȯ���� urPercent��, Ư�� ��í ���ý��� �������� CHANCE�� �̿��� ������ Ȯ���� ǥ��
				double temp1 = urPercent / (100.0 / URPLUS); //UR+ Ȯ���� UR ����� Ȯ������ �����ϴ� ������ ����� �� UR Ȯ���� ���ؼ� UR+�� ��ü���� �����ϴ� ������ ���
				double temp2 = (urPercent + CHANCE) / (100.0 / URPLUS); //��� ����� Ư�� ��í�� �������� ���
				double temp3 = (urPercent - temp1) / 3; //UR ��� ��ü Ȯ������ UR+���� Ȯ���� ������ ���� UR ��� ��ü�� ���� 3���� ���� ������ Ȯ���� ���
				double temp4 = (urPercent + CHANCE - temp2) / 3; //��� ����� Ư�� ��í�� �������� ���
				System.out.println(" +�ְ��� ������Ʈ ���̸� (" + temp1 + "%/" + temp2 + "%)");
				System.out.println(" �ŷ��� ���� ���̵� (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" ��ǳ�� ���� ī���� (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" �ݾ��� ��� �뿤 (" + temp3 + "%/" + temp4 + "%)");
				System.out.println("SR: " + srPercent + "%/"+ (srPercent + CHANCE * 4) +"%");
				temp1 = srPercent / (100.0 / SRPLUS); //UR+ ���� ���������� ��ü ���̺��� SR+�� �����ϴ� ������ ���
				temp2 = (srPercent + 4 * CHANCE) / (100.0 / SRPLUS);
				temp3 = (srPercent - temp1) / 2; //�Ϲ� SR ��ü ������ Ȯ�� ���
				temp4 = (srPercent + 4 * CHANCE - temp2) / 2;
				System.out.println(" +������ Ž���� �˺��� (" + temp1 + "%/" + temp2 + "%)");
				System.out.println(" õ���� ȭ�� �ٹٶ� (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" ���ǵ� ���� ���� (" + temp3 + "%/" + temp4 + "%)");
				System.out.println("R: " + ( 100 - urPercent - srPercent ) +"%/" + ( 100 - urPercent - srPercent - CHANCE * 5 ) +"%");
				temp1 = (100 - urPercent - srPercent) / (100.0 / SRPLUS);
				temp2 = (100 - urPercent - srPercent - CHANCE * 5) / (100.0 / SRPLUS);
				temp3 = (100 - urPercent - srPercent - temp1) / 2;
				temp4 = (100 - urPercent - srPercent - 5 * CHANCE - temp2) / 2;
				System.out.println(" +���ư��� �� ��̳� (" + temp1 + "%/" + temp2 + "%)");
				System.out.println(" ������ ���� ���� (" + temp3 + "%/" + temp4 + "%)");
				System.out.println(" ������ ���� ���̷�ũ (" + temp3 + "%/" + temp4 + "%)");
			} else {
				System.out.println("����� �Է�����!");
			}
		}
		
		//��ĳ�� ���� ����
		scan.close();
	}
}
