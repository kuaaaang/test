package E3_�迭3_�⺻�̷�;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�˰���_���ʿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [���ʿ�����]
		  
		    �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �� �ƴѼ��ڸ� �����ÿ�.
		    1)left 2)right 	
			��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
			��) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
		*/
		Scanner scan = new Scanner(System.in);
		
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		
		System.out.println("[1] left    [2]right");
		int n = scan.nextInt();
		
		int index1 = 0;
		int index2 = 0;
		
		if(n==1) {
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[index1] != 0) {
					int temp = arr[index1];
					arr[index1] = arr[index2];
					arr[index2] = temp;		
					index2 += 1;
				}
				index1 += 1;
			}	
			System.out.println(Arrays.toString(arr));
		}
	
		int index3 = arr.length - 1;
		int index4 = index3;
		
		if(n==2) {
			for(int i = 0; i<arr.length; i+=1) {
				if(arr[index3] != 0) {
					int temp = arr[index3];
					arr[index3] = arr[index4];
					arr[index4] = temp;
					index4 -= 1;
				}
				index3 -= 1;
			}	
			System.out.println(Arrays.toString(arr));
		}

		scan.close();
	}
}
