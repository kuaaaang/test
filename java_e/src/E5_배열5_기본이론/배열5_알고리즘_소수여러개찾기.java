package E5_�迭5_�⺻�̷�;

import java.util.Scanner;

public class �迭5_�˰���_�Ҽ�������ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [�Ҽ�������ã��]
		  ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
		  ��)
		  �Է� : 20
		  2, 3, 5, 7, 11, 13, 17, 19
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i+=1) {
			int count = 0;
			for(int j = 1; j<=n; j+=1) {
				if(i%j == 0) {count += 1;}
			}
			if(count == 2) {System.out.println(i);}
		}
		
		scan.close();
	}
}
