package F1_���ڿ�1_�⺻�̷�;

import java.util.Random;
import java.util.Scanner;

public class ���ڿ�1_������Ʈ_Ÿ�ڿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # Ÿ�ڿ��� ����[1�ܰ�]
		  1. ������ ���´�.(shuffle)
		  2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		  ��)
		  ���� : mysql
		  �Է� : mydb
		  ���� : mysql
		  �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		  ���� : jsp
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
			
		for(int i = 0; i<100; i+=1) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		
//		for(int i = 0; i<words.length; i+=1) {
//			String str = words[i];
//			
//			System.out.println(str);
//		}
//      ==>  for(String str : words) {System.out.println(str);}
//      ==>  ��� ����!!
		
		for(String str : words) {
			while(true) {
				System.out.println("���� : " + str);
				System.out.print("�Է� : ");
				String n = scan.next();
				
				if(str.equals(n)) {break;}
				else {continue;}
			}
		}	
	}
}
