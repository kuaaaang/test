package E5_�迭5_�⺻�̷�;

import java.util.Arrays;

public class �迭5_�˰���_�迭�ΰ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [����]
		     �� �迭�� �ϳ��� ��ġ�� �����������������Ͻÿ�.	
			 ��) 1,2,3,5,7,8,9,10,12,15,19,20
		*/
			int[] arr1 = {9,10,3,2,20,19};
			int[] arr2 = {15,12,1,5,7,8};
			
			int[] temp = null;
			
			temp = new int[arr1.length + arr2.length];
			
			for(int i = 0; i<temp.length; i+=1) {
				if(i<arr1.length) {
					temp[i] = arr1[i];
				}
				else if(i>=arr1.length) {
					temp[i] = arr2[i-arr1.length];
				}
			}
			System.out.println(Arrays.toString(temp));
			
			for(int i = 0; i<temp.length; i+=1) {
				for(int j = 0; j<i; j+=1) {
					if(temp[i]<temp[j]) {
						int n = temp[i];
						temp[i] = temp[j];
						temp[j] = n;
					}
				}
			}
			System.out.println(Arrays.toString(temp));
			
		/*
		 arr1 �� arr2 ������ �����Ѵ�. 
		 �տ������� ���ؼ� ���ϰ����������� temp������
		 �ڽ�1�� ���� 
		 {9,10,3,2,20,19};
		 {15,12,1,5,7,8};	
		 2,3,9,10,19,20
		 1,5,7,8,12,15
		 temp =>1.2.3.5.7.
	   */
		for(int i = 0; i<arr1.length; i+=1) {
			for(int j = 0; j<i; j+=1) {
				if(arr1[i]<arr1[j]) {
					int n1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = n1;
				}
			}
		}	
		System.out.println(Arrays.toString(arr1));	
			
		for(int i = 0; i<arr2.length; i+=1) {
			for(int j = 0; j<i; j+=1) {
				if(arr2[i]<arr2[j]) {
					int n2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = n2;
				}
			}
		}	
		System.out.println(Arrays.toString(arr2));
			
		int num[] = new int[arr1.length + arr2.length];
		
		int i1 = 0;
		int i2 = 0;
		for(int i = 0; i<num.length; i+=1) {
			if(i1 == arr1.length) {
				num[i] = arr2[i2];
				i2 += 1;
			}
			else if(i2== arr2.length) {
				num[i] = arr1[i1];
				i1 += 1;
			}
			else {
				if(arr1[i1]<arr2[i2]) {
					num[i] = arr1[i1];
					i1 += 1;
				}
				else if(arr1[i1]>arr2[i2]) {
					num[i] = arr2[i2];
					i2 += 1;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
