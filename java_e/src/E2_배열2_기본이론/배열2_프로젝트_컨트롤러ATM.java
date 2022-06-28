package E2_�迭2_�⺻�̷�;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_������Ʈ_��Ʈ�ѷ�ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [ATM] 
		  	-��ü ��ɱ���
		  1. ȸ������
		  . id�� pw�� �Է¹޾� ����
		  . ���� �� �� 1000�� �ο�
		  . id �ߺ�üũ
		  2. ȸ��Ż��
		  . �α��νÿ��� �̿밡��
		  3. �α���
		  . id�� pw�� �Է¹޾� �α���
		  . �α׾ƿ� ���¿����� �̿밡��
		  4. �α׾ƿ�
		  . �α��νÿ��� �̿밡��
		  5. �Ա�
		  . �α��νÿ��� �̿밡��
		  6. ��ü
		  . �α��νÿ��� �̿밡��
		  7. �ܾ���ȸ
		  . �α��νÿ��� �̿밡��
		*/
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] idList = new int[MAX];
		int[] pwList = new int[MAX];
		int[] moneyList = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		//1.ȸ������ 2.ȸ��Ż�� 3.�α��� 4.�α׾ƿ�
		//5.�Ա� 6.�۱� 7.��ȸ 8.��üȸ����� 0.����.
		while(true) {	
			if(log == -1) {
				System.out.println("�α����ϼ���.");
			}else {
				System.out.println("[" + log + "]");
			}
			System.out.println("1.ȸ������ 2.ȸ��Ż�� 3.�α��� 4.�α׾ƿ�");
			System.out.println("5.�Ա� 6.�۱� 7.��ȸ 8.��üȸ����� 0.����");
			int sel = scan.nextInt();		
			if(sel == 1) {
				if(count == MAX) {
					System.out.println("���ԺҰ�");
					continue;
				}
				System.out.println("[ȸ������] ���̵� �Է� : ");
				int id = scan.nextInt();
				boolean check = false;
				for(int i = 0; i<count; i+=1) {
					if(id == idList[i]) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("�ߺ�");
				}else {
					System.out.println("[ȸ������] ��й�ȣ �Է� : ");
					int pw = scan.nextInt();
					idList [count] = id;
					pwList [count] = pw;
					moneyList [count] = 1000;
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
					count = count + 1;	
				}
			}
			
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("�α����ϼ���.");
				}else{
					System.out.println("[ȸ��Ż��] ���̵� �Է� : ");
					int id = scan.nextInt();
					System.out.println("[ȸ��Ż��] ��й�ȣ �Է� : ");
					int pw = scan.nextInt();
					
					int index = -1;
					for(int i = 0; i <count; i+=1) {
						if(id == idList[i] && pw == pwList[i]) {
							index = i;
							break;
						}
					}
					if(index == -1) {
						System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���.");
					}else {
						for(int i = index; i < count-1; i+=1) {
							idList[i] = idList[i+1];
							pwList[i] = pwList[i+1];
							moneyList [i] = moneyList [i+1];
						}
						idList[count] = 0;
						pwList[count] = 0;
						moneyList[count] = 0;
						count -=1;
						log = -1;
						System.out.println("[ȸ��Ż��]�� �Ϸ�Ǿ����ϴ�.");
					}
				}
			}
			
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[�α���] ���̵� �Է� : ");
					int id = scan.nextInt();
					System.out.println("[�α���] ��й�ȣ �Է� : ");
					int pw = scan.nextInt();
					for(int i = 0; i<count; i+=1) {
						if(id == idList[i] && pw == pwList[i]) {
							log = id;
							break;
						}
					}
				}
				if(log == -1) {
					System.out.println("�α��� ����! ���̵�� ��й�ȣ�� Ȯ���ϼ���.");
				}else {
					System.out.println(log + "�� �α��� �Ǿ����ϴ�.");}
			}
			
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("�α��� �� �̿����ּ���.");
				}else {
					log = -1;
					System.out.println("�α׾ƿ� �Ϸ�");
				}
			}
			
			else if(sel == 5) {
				if(log != -1) {
					int index = 0;
					for(int i = index; i<count; i+=1) {
						if(idList[i] == log) {
							index = i;
							break;
						}
					}
					System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
					int money = scan.nextInt();
					moneyList[index] += money;
					System.out.println("�ԱݿϷ�.");
				}else {
					System.out.println("�α��� �� �̿����ּ���.");
				}
			}	
			
			else if(sel == 6) {
				if(log != -1){
					int index = 0;
					for(int i = index; i<count; i+=1) {
						if(idList[i] == log) {
							index = i;
							break;
						}
					}
					
					System.out.println("�۱��� ���¸� �Է��ϼ���.");
				    int sendId = scan.nextInt();
				    int sendIndex = -1;
				    for(int i = 0; i<count; i+=1) {
					    if(idList[i] == sendId) {
						   sendIndex = i;
						   break;
				       	}
				    }
				    if(sendIndex == -1) {
				    	System.out.println("���¹�ȣ�� �ٽ� Ȯ�����ּ���.");
				    }else {
				    	System.out.println("�۱��� �ݾ��� �Է����ּ���.");
				    	int money = scan.nextInt();
				    	moneyList[index] -= money;
				    	moneyList[sendIndex] += money;
				    	System.out.println("�۱ݿϷ�");
				    }
					
			    }else {
					System.out.println("�α��� �� �̿����ּ���.");
				}
			}	
			
			else if(sel == 7) {
				if(log != -1) {
					int index = 0;
					for(int i = 0; i<count; i+=1) {
						if(idList[i] == log) {
							index = i;
							break;
						}
					}
					System.out.println(log + "�� �ܾ� : " + moneyList[index] + "��");
				}else {
					System.out.println("�α��� �� �̿����ּ���.");
				}
			}
			
			else if(sel == 8) {
				System.out.println(Arrays.toString(idList));
				System.out.println(Arrays.toString(pwList));
				System.out.println(Arrays.toString(moneyList));
			}
			
			else if(sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}
