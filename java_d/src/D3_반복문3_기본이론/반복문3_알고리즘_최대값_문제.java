package D3_�ݺ���3_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���3_�˰���_�ִ밪_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  	[�ִ밪 ���ϱ�]
		  1. �ݺ����ȿ��� ����ؼ� ���� �Է¹޴´�. ( -1000 ����ū�����Է¹޴´�.)
		  2. �Է¹��������� ����ū���ڸ� ����Ѵ�.
		  3. -1000 ���� ���ϸ�  �Է��ϸ� �����Ѵ�.
		*/
		Scanner scan = new Scanner(System.in);
		int max = -1000;
		
		while(true) {System.out.println("���ڸ� �Է��ϼ���.[-1000 ���� ū ��]");
		             int n = scan.nextInt(); 
		             if (n<=-1000) {System.out.println("����");
		            	            break;} 
		             else {if(max < n) {max = n;
		                                System.out.println("���� ū�� : " + n);
		                                }
		                   }
		            }
	}
}
