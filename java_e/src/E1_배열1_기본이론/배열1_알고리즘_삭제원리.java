package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class �迭1_�˰���_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		   �Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
		   b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
		   
		   [��] 30 ==> b[] = {10,20,40,50,0};
		   
		   [����] 
		   �Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
		   ��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
		   �׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
		   
		   [��] 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0}; 
		 */
		    Scanner scan = new Scanner(System.in);
			int a[] = { 10, 20, 30, 40, 50 };
			int b[] = { 0, 0, 0, 0, 0 };
					
			int c[] = { 1001, 40, 1002, 65, 1003, 70 };
			int d[] = { 0, 0, 0, 0, 0, 0 };
			
			System.out.println("���� �Է� : [10, 20, 30, 40, 50]");
			int n1 = scan.nextInt();
			int count1 = 0;
			for(int i = 0; i<5; i+=1) {
				if(a[i]!=n1) {
					b[count1] = a[i];
				    count1 +=1;
				}	
			}
			for(int i = 0; i<5; i+=1) {
				System.out.println(b[i]);
			}
			
			System.out.println("---------------------------------");
			
			System.out.println("���� �Է� : [1001, 40, 1002, 65, 1003, 70]");
			int n2 = scan.nextInt();
			int count2 = 0;
			for(int i = 0; i<6; i+=1) {
				if(c[i]!=n2) {
					d[count2] = c[i];
				    count2 +=1;
				}	
			}
			for(int i = 0; i<6; i+=1) {
				System.out.println(d[i]);
			}
			
			
			
			
			scan.close();
	}
}
