package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_����������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*
	 	 input[] = {1,3,3,2,1,1,4};
	 
		 [1] input �� �����͸� a �� ���������� �����Ѵ�.
		 [2] ��, �����ҷ��� ������ ���� ���ڰ� ���� �����ҷ��� ���� ���� ���ٸ�,
		  	 �Ѵ� �����Ѵ�.		
		 ��) input = {1,3,3,2,1,1,4}		
		 1  ==> a[] = {1}
		 3  ==> a[] = {1,3}
		 3  ==> a[] = {1,3,3} ==> {1}
		 2  ==> a[] = {1,2}
		 1  ==> a[] = {1,2,1}
		 1  ==> a[] = {1,2,1,1} ==> {1,2}
		 4  ==> a[] = {1,2,4}
	  */
		int input[] = {1,3,3,2,1,1,4};
		int a [] = new int[input.length];	
		
		int count = 0;
		
		for(int i = 0; i<input.length; i+=1) {
			if(count == 0) {
				a[count] = input[i];
				count += 1;
			}
			else if(input[i] == a[count-1]) {
				a[count-1] = 0;
				count -= 1;
			}
			else {
				a[count] = input[i];
				count += 1;
			}
			System.out.println(Arrays.toString(a));
		}
		//System.out.println(Arrays.toString(a));
	}
}
