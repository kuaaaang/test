package E_�׽�Ʈ_����;

import java.util.Arrays;
import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  �Ǳ����� ���� �ڵ����� 
		  ���ڸ� �Է¹ް� �ش���ڸ�ŭ ������ �о�ÿ�(40��)
		  [����] 3 �̸� ��ĭ�о
		  0 ==> {1,2,3,4,5};
		  1 ==> {2,3,4,5,1};
		  2 ==> {3,4,5,1,2};
		  3 ==> {4,5,1,2,3};
		*/
		Scanner scan = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		
		int n = scan.nextInt();
		
		for(int i = 0; i<(n%5); i+=1) {
			for(int j = 0; j<arr.length-1; j+=1) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
