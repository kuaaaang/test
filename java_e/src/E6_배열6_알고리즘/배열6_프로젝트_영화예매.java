package E6_�迭6_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭6_������Ʈ_��ȭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  [��ȭ���¼�����]
		  (1)ȸ������ (2)�α���  (0) ����
		  
		  [ȸ������] ==> id �� ���� ==> �ߺ�ó�� 
		  [�α�����] ==> (1) �α׾ƿ� (2) ���� (3) ����Ȯ��(���ΰ͸� �¼���ȣ��� ) 
		               (4) �������(���ΰ͸�) (5) ��üȮ�� (0) �ڷΰ��� 
		 
		  1) ȸ�������� 10����� �����ϴ�.
		  2) idList ���� ȸ������ id�� ���� 
		  3) �α������� �¼��� �����ϸ� seatList �� �����ѻ���� id ������ 
		  4) �ʿ��Ѻ����� �߰��Ҽ��ִ�.
		*/
		Scanner scan = new Scanner(System.in);
		
		    final int MAX = 10;
			final int ROW = 3;
			final int COL = 4;
			int idList[] = new int[MAX];
			int pwList[] = new int[MAX];
			int seatList[][]= new int[ROW][COL]; 
			int temp[][] = new int[ROW][COL];
			
			int count = 0;
			int log = -1;
			while(true) {
				System.out.println("(1)ȸ������ (2)�α���  (0) ����");
				int n = scan.nextInt();
				if(n == 1) {// ȸ������
					if(count == 10) {System.out.println("������ �����ϴ�.");}
					else {
						System.out.println("ȸ������ ���̵� �Է��ϼ���.");
						int id = scan.nextInt();
						System.out.println("ȸ������ ��й�ȣ�� �Է��ϼ���.");
						int pw = scan.nextInt();
						
						boolean check = false;
						for(int i = 0; i<count; i+=1) {
							if(id == idList[i] || pw == pwList[i]) {
								check = true;
								break;
							}
						}
						if (check == true) {System.out.println("�ߺ�! �ٽ� �Է����ּ���.");}
						else {
							idList[count] = id;
							pwList[count] = pw;
							count += 1;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						}
					}
				}
				
				else if(n == 2) {
					if(log == -1){ // �α���
						System.out.println("���̵� �Է��ϼ���.");
						int logid = scan.nextInt();
						System.out.println("��й�ȣ�� �Է��ϼ���.");
						int logpw = scan.nextInt();
						for(int i = 0; i<MAX; i+=1) {
							if(logid == idList[i] && logpw == pwList[i]) {
								System.out.println(idList[i] + "�� �α��� ����!");
								log = idList[i];
							}
								
							if(log != -1) {
								System.out.println("(1) �α׾ƿ� (2) ����    (3) ����Ȯ��");
								System.out.println("(4) ������� (5) ��üȮ�� (0) �ڷΰ���");
								int s = scan.nextInt();
								
								if(s == 1) {
									System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
									log = -1;
									break;
								}
								else if(s == 2) {
									System.out.println("   0  1  2  3");
									for(int j = 0; j<seatList.length; j+=1) {
										System.out.println(j + " " + Arrays.toString(seatList[j]));
									}
									System.out.println("������ �¼��� �������ּ���.");
									System.out.print("��[0~3] : ");
									int seatg = scan.nextInt();
									System.out.print("��[0~2] : ");
									int seats = scan.nextInt();
								
									if(seatList[seats][seatg] == 0) {
										System.out.println("���� �Ϸ�");
										seatList[seats][seatg] = 1;
										temp[seats][seatg] = log;
									}
									else {System.out.println("�̹� ���õ� �¼��Դϴ�.");}
								}
								else if(s == 3) {
									for(int j = 0; j<seatList.length; j+=1) {
										for(int k = 0; k<seatList.length; k+=1) {
											if(temp[j][k] == log) {
												System.out.println(k + "�� " + j + "�� �¼��� ���ŵǾ��ֽ��ϴ�.");
											}else {continue;}
										}
									}
								}
								else if(s == 4) {
									for(int j = 0; j<seatList.length; j+=1) {
										for(int k = 0; k<seatList.length; k+=1) {
											if(temp[j][k] == log) {
												System.out.println(k + "�� " + j + "�� �¼��� ������� �Ǿ����ϴ�.");
												temp[j][k] = 0;
												seatList[j][k] = 0;
											}
										}
									}
									
								}
								else if(s == 5) {
									System.out.println("�¼� ��ü Ȯ��");
									for(int j = 0; j<seatList.length; j+=1) {
										System.out.println(Arrays.toString(seatList[j]));
									}
								}
								else if(s == 0) {
									break;
								}
								else {System.out.println("����! �ٽ� �Է��ϼ���.");}
							}	
							else {
								System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
							}
						}
					}
					else if(log != -1) {
						System.out.println("�α׾ƿ� �� �̿����ּ���.");
					}
				}
				
				else if(n == 0) {
					System.out.println("����");
					break;}
				
				else {System.out.println("����! �ٽ� �Է��ϼ���.");}
			}
			
			scan.close();
	}
}
