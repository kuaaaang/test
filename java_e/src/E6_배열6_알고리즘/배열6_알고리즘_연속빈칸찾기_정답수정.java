package E6_�迭6_�˰���;

import java.util.Scanner;

public class �迭6_�˰���_���Ӻ�ĭã��_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

		 [1] �迭 arr �� 1�� 0���� �Ǿ��ִ�.
		 [2] ����1 �� �̹� ä���� �ڸ��̰� 0�� ����ִ��ڸ��̴�.
		 [3] input ������ ���� �Է¹ް� �Ʒ� ������ ���� 
		  	��) input => 3 ==> �ε��� 2���� �������� 3ĭ�� ��������Ƿ�, 
		 		{0,1,1,1,1,1,0,0};	
		 		
		 	��) input => 4 ==> ��������4ĭ ����ִ��ڸ��� �����Ƿ� "x"
		 		{0,1,0,0,0,1,0,0};
		 		
		 	��) input => 1 ==> �ε��� 0�� �ڸ��� ��������Ƿ� 
		 		{1,1,0,0,0,1,0,0};	
		*/
		    Scanner scan = new Scanner(System.in);
		
		    System.out.println("���ڸ� �Է��ϼ���.");
		    int n = scan.nextInt();
			int arr[] = {0,1,0,0,0,1,0,0};			
			int count = 0;
			int startIndex = -1;
			boolean check = false;
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[i] == 0) {
					if(count == 0) {
						startIndex = i;
					}
					count += 1;
					if(count == n) {
						check = true;
						break;
					}
				}
				else {count = 0;}
			}
			System.out.println();
			if(check == false) {System.out.println("����ִ� �ڸ��� ����.");}
			else {System.out.println("����ִ� �ڸ��� �ִ�.");}
			
			scan.close();
	}
}
