package E_�迭_����;

import java.util.Arrays;
import java.util.Random;

public class _0803_����_4��_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 �������� ���� 5���� �����Ѵ�. (1~9������ ����)
		 �������ڰ� Ȧ���̸� arr�迭�� �տ������� ���� (��, ���Ȧ������ �ڷ� �о��.)
		 �������ڰ� ¦���̸� arr�迭�� �ڿ������� ����(��, ��� ¦������ ������ �о��.)
		 �Ʒ� �߰� ������ �����Ѵ�. 
		 [����]
			3 ==> arr = {3,0,0,0,0}; // Ȧ���� �Ǿտ� 3����
		 	1 ==> arr = {1,3,0,0,0}; // ���� ��(3)�� �ڷ� �о�� Ȧ���� �Ǿտ� 1����
		  	2 ==> arr = {1,3,0,0,2}; // ¦���� �ǵڿ� 2����
		  	6 ==> arr = {1,3,0,2,6}; // ���� ��(2)�� ������ �о�� ¦���� �ǵڿ� 6����
		  	7 ==> arr = {7,1,3,2,6}; // ���� ��(1, 3)�� �ڷ� �о�� �Ǿտ� 7���� 
		*/
		Random ran = new Random();
		int arr[] =new int[5];
		
		int a = 0;
		int b = arr.length-1;
		
		for(int i = 0; i<5; i+=1) {
			int r = ran.nextInt(9)+1;
			
			System.out.println(r);
			
			if(r%2 == 1) {
				arr[a] = r;
				for(int j = a; j>0; j-=1) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					}
				a += 1;
			}
			else if(r%2 == 0) {
				arr[b] = r;
				for(int j = b; j<arr.length-1; j+=1) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				b -= 1;
			}
			System.out.println(Arrays.toString(arr));	
		}
	}
}
