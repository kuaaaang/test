package E2_�迭2_�⺻�̷�;

import java.util.Random;

public class �迭2_�˰���_�ߺ����ڱ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		  
		   [�ߺ����� ����]
		  1. 0~4 ������ ���ڸ� arr1�迭�� �����Ѵ�.
		  2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		  ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		  
		  [��]
		  �������� : 1
		  check = {false, true, false, false, false} // 1�� �ڸ��� true�� �ٲ�, 1�� �ڸ��� ��� true �̹Ƿ� 1 �ԷºҰ�
		  arr1   = {1, 0, 0, 0, 0}
		  �������� : 3
		  check = {false, true, false, true, false}
		  arr1   = {1, 3, 0, 0, 0}
		  �������� : 2
		  check = {false, true, true, true, false}
		  arr1   = {1, 3, 2, 0, 0}
		*/
		 Random ran = new Random();
		
         boolean[] check = new boolean[5];
		 int[] arr = new int[5];
		 
		 int i = 0;
		 while(true) {
			 int n = ran.nextInt(5);
			 if(check[n] == false) {
				 check[n] = true;
				 arr[i] = n;
				 i+=1;
			 }
			 if(i == 5) {break;}
		 } 
		 for(int i1 = 0; i1<5; i1+=1) {
			 System.out.print(arr[i1] + "  ");
		 }
	}
}
