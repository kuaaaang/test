package F3_���ڿ�3_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class ���ڿ�3_������Ʈ_�л����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int max = 100;
		String[][] dataList = new String[max][5];

        // ��ȣ , ���̵� , ��й�ȣ  , �̸� , ���� 
		String sample[][] = { 
				{ "1001", "qwer", "1234", "��ö��", "10" }, 
				{ "1002", "asdf", "2345", "�̿���", "30" }, };

		// ������ �迭�� �̿��ؼ� crud ����
		int size = 0;
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				dataList[i][j] = sample[i][j];
			}
			size += 1;
		}

		while (true) {
			System.out.println(" [0]���� [1]���� [2]Ż�� [3]���� [4]�˻� [5] ��ü���");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) { // ����
				System.out.println("���̵� �Է��ϼ���.");
				String id = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				String pw = scan.next();
				System.out.println("�̸��� �Է��ϼ���.");
				String name = scan.next();
				System.out.println("������ �Է��ϼ���.");
				String score = scan.next();
				
				int count = 0;
				
				for(int i = 0; i<size; i++) {
					if(id.equals(dataList[i][1])) {
						count += 1;
					}
				}
				if(count == 0) {
					dataList[size][0] = (1000+size+1) + "";
					dataList[size][1] = id;
					dataList[size][2] = pw;
					dataList[size][3] = name;
					dataList[size][4] = score;
					size += 1;
				}
				else {System.out.println("�ߺ�! �ٽ� �Է��ϼ���.");}

			}else if (sel == 2) { // Ż��
				System.out.println("���̵� �Է��ϼ���.");
				String id = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				String pw = scan.next();
				
				int count = 0;
				for(int i = 0; i<size; i++) {
					if(id.equals(dataList[i][1])) {
						if(pw.equals(dataList[i][2])) {
							System.out.println(Arrays.toString(dataList[i]));
							System.out.println("�����͸� �����մϴ�.");
							dataList[i][1] = "";
							dataList[i][2] = "";
							dataList[i][3] = "";
							dataList[i][4] = "";
								
							for(int j = i; j<size-1; j++) { // �߰� ���� ��, ����
								String temp[] = dataList[j];
								dataList[j] = dataList[j+1];
								dataList[j+1] = temp;
							}
							size -= 1;
						}
					}
					else {count += 1;}
				}
				if(count == size) {System.out.println("�������� �ʴ� ���̵� �Դϴ�.");}

				for(int i = 0; i<size; i++) {
					dataList[i][0] = (1000+i+1) + "";
				}

			}else if (sel == 3) { // ����
				System.out.println("���̵� �Է��ϼ���.");
				String id = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				String pw = scan.next();
				
				int count = 0;
				for(int i = 0; i<size; i++) {
					if(id.equals(dataList[i][1])) {
						if(pw.equals(dataList[i][2])) {
							System.out.println(Arrays.toString(dataList[i]));
							while(true) {
								System.out.println("������ �����͸� ����ּ���.");
								System.out.println("[1]���̵�  [2]��й�ȣ  [3]�̸�  [4]����");
								int n = scan.nextInt();
								if(n==1) {
									System.out.println("������ ���̵� �Է��ϼ���.");
									String newid = scan.next();
									
									int c = 0;
									
									for(int j = 0; j<size; j++) {
										if(dataList[j][1].equals(newid)) {
											c += 1;
										}
										else {continue;}
									}
									if(c > 0) {
										System.out.println("�ߺ�");
										System.out.println("�ٽ��ϼ���.");
									}
									else if(c == 0) {
										dataList[i][1] = newid;
										System.out.println("����Ϸ�");
										break;
									}
								}
								else if(n==2) {
									System.out.println("������ ��й�ȣ�� �Է��ϼ���.");
									String newpw = scan.next();
									dataList[i][2] = newpw;
									System.out.println("����Ϸ�");
									break;
								}
								else if(n==3) {
									System.out.println("������ �̸��� �Է��ϼ���.");
									String newname = scan.next();
									dataList[i][3] = newname;
									System.out.println("����Ϸ�");
									break;
								}
								else if(n==4) {
									System.out.println("������ ������ �Է��ϼ���.");
									String newscore = scan.next();
									dataList[i][4] = newscore;
									System.out.println("����Ϸ�");
									break;
								}
								else {System.out.println("�ٽ� �Է����ּ���.");}
							}
						}
					}
					else {count += 1;}
				}
				if(count == size) {System.out.println("�������� �ʴ� ���̵� �Դϴ�.");}

			}else if (sel == 4) { // �˻�
				System.out.println("���̵� �Է��ϼ���.");
				String id = scan.next();
				int count = 0;
				for (int i = 0; i<size; i++) {
					if(dataList[i][1].equals(id)) {
						System.out.println(Arrays.toString(dataList[i]));
					}
					else {count += 1;}
				}
				if(count == size) {System.out.println("�������� �ʴ� ���̵� �Դϴ�.");}

			} else if (sel == 5) {
				for (int i = 0; i<size; i++) {
					for (int j = 0; j<dataList[i].length; j++) {
						System.out.print(dataList[i][j]+ " ");
					}
					System.out.println();
				}
			}
		}
		
		scan.close(); 
	}
}
