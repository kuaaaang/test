package E7_�迭7_�⺻�̷�;

import java.util.Scanner;

public class �迭7_������Ʈ_�޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	 	[�޷¸����]
	  	�⵵�� ���� �Է¹ް� �޷��� ����ÿ�.
	  	
	  	[�������] �Ʒ��� ���� ���� �̴�. 
	  	
	  	1. ��(year)�� 4�� �������� ����.
	  	2. 1�� ������ �´��� 100���� �������� ������ �ƴϴ�.  
		3. 2�� ������ �´��� 400���� �������� �����̴�.
	  	
	  	[���ϰ���]
	  	1��1��1�� �� �������̴�. 
	 */
		Scanner scan = new Scanner(System.in);
		
		int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("������ �Է��ϼ���.[1 �̻�]");
		int year = scan.nextInt();
		System.out.println("���� �Է��ϼ���[1~12]");
		int month = scan.nextInt();
		
		int total1 = (year-1)*365;
		
		int add = 0; 
		for(int i = 1; i<year; i+=1) {
			if(i % 400 == 0 || (i % 100 != 0 && i%4 == 0)) {
				add += 1;
			}
		}
		System.out.println("total 1 : " + (add + total1));

//      * ������ ��� ��� *
		int total2=(year-1)*365
                +(year-1)/4
                -(year-1)/100
                +(year-1)/400;			
		System.out.println("total 2 : " + total2);// 2020��12��31�ϱ��� (��������)	
		
		for(int i = 0; i <month-1; i++) {
			if(i == 1) {
				if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ) {
					total2 += 1;
				}
			}
			total2 += monthList[i];
		}
		
		System.out.println("======================�� ��========================");
		String week = "�Ͽ�ȭ�������";
		int weekIndex = total2%7;
//		System.out.println(week.charAt(weekIndex + 1));
//		System.out.println("-------------------------------------------------");
		for(int i = 0; i<week.length(); i+=1) {
			System.out.print(week.charAt(i) + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		for(int i = 0; i<=monthList[month-1] + weekIndex; i+=1) {
			if(i>weekIndex) {
				System.out.print((i - weekIndex + "\t"));
			}
			else {System.out.print("\t");}
			if(i % 7 == 6) {System.out.println();}
		}
	}
}
