package E7_�迭7_�⺻�̷�;

import java.util.Random;

public class �迭7_�⺻�̷�7_�ּҰ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[];   // 1������ ��ġ�� ����
		int b[][]; // 2������ ��ġ�� ����
		int c;     // ���� ����
		c = 10; 
		
		
		int darr[][] = new int[3][];  // ���� 4��
	  //int darr[][] = new int[3][3]; // ���� 13��	
		int arr[] = {10,20,30};			
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		// 8�� ==> darr(1��)   arr(1��)   new int[3][](3��)   {10,20,30}(3��)
		
		arr[1] = 100;
		//---------------------------------		
		int darr2[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		int temp[][] = new int[3][];
		temp[0] = darr2[1];
		temp[1] = darr2[2];
		temp[2] = darr2[0];
	}
}
