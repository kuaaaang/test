package E5_�迭5_�⺻�̷�;

import java.util.Scanner;

public class �迭5_�˰���_�����Ҽ�ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [���� �Ҽ� ã��]
		  1. ���ڸ� �� �� �Է¹޴´�.
		  2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
		  
		  ��) Enter Number ? 1000
		     1000���� ū ù���� �Ҽ��� 1009
		  ��) Enter Number ? 500
		     500���� ū ù��° �Ҽ��� 503
		*/
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Number ? ");
			int number = scan.nextInt();
			
			for(int i = number+1; i>number; i+=1) { // i = number�� �� ���, number�� �Ҽ��� number�� ����
				int count = 0;
				for(int j = 1; j<=i; j+=1) { //j<=1; '=' �߿�!
					if(i%j == 0) {count += 1;}
				}
				if(count == 2) {
					System.out.println(i);
					break;}
			}
			
		scan.close();	
	}
}
