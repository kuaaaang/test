package E2_�迭2_�⺻�̷�;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class �迭2_������Ʈ_1to4���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		  
		  [1to4 ����]
		  
		  [1] arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		  [2] ����ڴ� ����������1���� ������� �ش� ���ȣ(�ε���)�� �Է��Ѵ�.
		  [3] ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		  
		  [��]
		  
		  ���� : { 4 2 3 1 }
		  
		  �ε��� �Է� : 3  ==> { 4 2 3 9 } ==> 1�� �����������̹Ƿ� 9�� �����Ѵ�.
		  
		  �ε��� �Է� : 0 ==>  { 4 2 3 9 }  ==> 4�� �������������ƴϹǷ� ��ȭ������.
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean check[] = new boolean[4];
		int arr[] = new int[4];
		
		int i = 0;
		while(true) {
			int r = ran.nextInt(4);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r;
				i+=1;
			}
			if(i == 4) {break;}
		}
		for(int i1 = 0; i1 < 4; i1+=1) {
			arr[i1] += 1;
		}
		
		int count = 1;
		while(true) {
			System.out.println(Arrays.toString(arr));
			if(count > 4) {break;}
			
			System.out.println("���� ���� ������ ��ġ�� �����ϼ���.[0 ~ 3]");
			int n = scan.nextInt();
			if(arr[n] == count) {
				count = count + 1;
				arr[n] = 9;
			}
		}
	scan.close();	
	}
}
