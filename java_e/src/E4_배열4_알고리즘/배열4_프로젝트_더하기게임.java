package E4_�迭4_�˰���;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class �迭4_������Ʈ_���ϱ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [���ϱ����]	
			1) 1~10 ������ ���ڸ� �������� 7�������ش�. (�ߺ�����)
			2) �׾ȿ��� 3���� �ε����� �����ְ����ش�. (�ߺ�����)
			3) ���ڸ� ���� ���� �ϳ� �����ϴµ�  �ε���3���� ���� ����
			   ���õ� ���ڶ� ������ ����. 
			   ��, ������ ������ �ϼ��ִ�. 
			4) �ݵ�� ������ ����� ���� �־���Ѵ�.	 
			   ��! �ߺ����� ���� ��������. 
			 [��]
			    ����  = {1,5,8,6,4,2,9};
			    ���þ� = 13	
			    ����) �ε��� ==> 0,2,4  ==>  1 + 8 + 4	
			 
			    �߸��ȿ�) �ε��� ==> 5,5,6 ==> 2 + 2 + 9
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[7];
		for(int i = 0; i<a.length; i+=1) {
			a[i] += i + 1;
		}
		for(int i = 0; i<1000; i+=1) {
			int r1 = ran.nextInt(a.length);
			int r2 = ran.nextInt(a.length);
			int temp = a[r1];
			a[r1] = a[r2];
			a[r2] = temp;
		}
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<7; i+=1) {
			b[i] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
		int c[] = new int[3];	
		for(int i = 0; i<c.length;) {
			int r = ran.nextInt(7);
			boolean check = false;
			for(int j = 0; j<i; j+=1) {
				if(c[j] == r) {
					check = true;
				}
				
			}
			if(check == false) {
				c[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(c));
		int total = 0;
		for(int i = 0; i<c.length; i+=1) {
			total += b[c[i]];
		}
		System.out.println(total);
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		while(true) {
			int me[] = new int[3];
			System.out.println(Arrays.toString(b));
			System.out.println(total);
			System.out.println("[����] �ε����� 3�� ������.");
			
			int count = 0;
			for(int i = 0; i<me.length;) {		
				int n  = scan.nextInt();
				boolean check = false;
				
				for(int j = 0; j<me.length; j+=1) {
					if(n == me[j]) {
						check = true;
						System.out.println("�̹� ������ �����Դϴ�.");}
				}
				if(check == false) {
					me[i] = n;
					i += 1;
					check = true;
				}	
			}
			int metotal = 0;
			for(int i = 0; i<me.length; i+=1) {
				metotal += b[me[i]];
			}
			if(metotal == total) {
				System.out.println("����");
				break;
			}else {System.out.println("����");}
		}
	}
}
