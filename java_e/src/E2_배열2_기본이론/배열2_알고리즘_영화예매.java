package E2_�迭2_�⺻�̷�;

import java.util.Scanner;

public class �迭2_�˰���_��ȭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # ��ȭ�� �¼�����
		  1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		  2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		  3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		  4. �� �¼��� ���� ������ 12000���̴�.
		  5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
		  ��)
		  seat = 0 0 0 0 0 0 0
		  
		  �¼����� : 1
		  seat = 0 1 0 0 0 0 0
		  
		  �¼����� : 3
		  seat = 0 1 0 1 0 0 0
		  
		  �¼����� : 3
		  seat = 0 1 0 1 0 0 0
		  �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		  ----------------------
		  �ѱݾ� : 24000��
		*/
		Scanner scan = new Scanner(System.in);
		
		int seat[] = { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
		
		int count = 0;
		while(true) {
			System.out.println();
			System.out.println("===�ް� ��ȭ��===");				
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			int n1 = scan.nextInt();
			
			if(n1==1) {
				System.out.println("�¼�����");
				System.out.println("�¼��� �����ϼ���.[0 ~ 6]");
				for(int i = 0; i < 7; i+=1) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();
				int n2 = scan.nextInt();
				if(n2>=0 && n2<=6 && seat[n2]==0) {
					seat[n2] = 1;
					count = count + 1;
					
					for(int i = 0; i < 7; i+=1) {
						System.out.print(seat[i] + " ");
					}
				}
				else if(n2>=0 && n2<=6 && seat[n2]==1) {
					System.out.println("�̹� ���õ� �¼��Դϴ�.");
				}
				else if(n2<0 || n2>6){
					System.out.println("����! �ùٸ� �¼� ��ȣ�� �Է��ϼ���.");
				}
			}
			
			else if(n1==2) {
				int total = 12000*count;
				System.out.println("�ѱݾ� : " + total + "��");
				break;
			}
			
			else {System.out.println("����! �ٽ� �Է��ϼ���.");}
		}
	    scan.close();
	}
}
