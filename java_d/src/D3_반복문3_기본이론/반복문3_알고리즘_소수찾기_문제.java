package D3_�ݺ���3_�⺻�̷�;

import java.util.Scanner;

public class �ݺ���3_�˰���_�Ҽ�ã��_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [�Ҽ�ã��]
		   ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
		   �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
		   ��) 2, 3, 5, 7, 11, 13, ..
		 	
		  (1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
		  (2) �������� 0�� ������ ī��Ʈ�� ����.
		  (3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
		  (4) 6/1 6/2 6/3 6/4 6/5 6/6	==> count=4	==> (�Ҽ�x)
		  (4) 2/1 2/2 	==> count=2	==>(�Ҽ�)
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i<=n; i+=1) {if (n%i == 0) {count = count + 1;}} 
			                       
		System.out.println("���� : " + n);
		if(count == 2) {System.out.println("�Ҽ�");}
		else {System.out.println("�Ҽ��� �ƴ�");}
		
		scan.close();
	}
}
