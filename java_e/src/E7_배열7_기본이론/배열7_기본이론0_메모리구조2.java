package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�0_�޸𸮱���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  ram ==> stack , heap , data(static)
		  
		  stack ==> �Ϲݺ��� (���ʿ��ִº���)
		  
		  heap ==> new �� ���� ���� (�����ʿ� �ִº���)
		  --------------------------
		  STACK ==> �������� 
		  HEAP  ==> ��ü (NEW)
		  DATA  ==> �������� 
		  --------------------------
		  []�� ���� ������ => new �θ��� ������ �ּҸ�����.
		*/
		int [] arr = new int[3];  //  arr    [0] [1] [2]
		int a = 10;	              //  ___    ___ ___ ___
		int b = 20;               // |___|  |___|___|___| 
		System.out.println(arr);  	
		int [] temp = arr;	
		temp[1] = 100;	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		arr[0] = 200;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}
}
//
//  int a = 10; �׸����� ǥ��
//   __a__         _____ _____a_____ _____
//  |  10 |  ==>  |     |     |     |  11 | -> int = 4byte
//  |_____|       |_____|_____|_____|_____| -> a�� �ּҴ� 1�� ��ǥ�ּҷ� ����.
//                   1     2     3     4
// 
//  ���� int b�� �߰��� ����ٸ� 
//   __b__         _____ _____b_____ _____
//  |     |       |     |     |     |     |
//  |_____|       |_____|_____|_____|_____| -> b�� �ּҴ� 5�� ��ǥ�ּҷ� ����.
//                   5     6     7     8
