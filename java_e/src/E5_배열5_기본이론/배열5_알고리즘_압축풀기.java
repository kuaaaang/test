package E5_�迭5_�⺻�̷�;

import java.util.Arrays;

public class �迭5_�˰���_����Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  /*
	    array[][] = {3,2},{5,6},{2,1},{4,3}
		 �� �����ʹ� ������ �������̴�.
		 ���������� ��Ģ�� 2���� ¦�� �̷��.
		  1) ���� ���� ==> ������ 
		  2) ���� ���� ==> �����̴�.
		 ��) {3,2} ==> 33
		 ��) {5,6} ==> 555555
		 ��) {2,1} ==> 2
		 ��) {4,3} ==> 444
			 ���� �����ʹ� 335555552444 �ΰ��̴�. 
		 ����) �������ͻ����ŭ �迭�� ����� ������ ���� ������ ��� 
		 ��) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
	   */	
		int array[][] = {
				{3,2},{5,6},{2,1},{4,3}
			};
		
		int a[] = new int[8];
		int data[] = new int[4];
		int num[] = new int[4];
		int count = 0;
		
		for(int i = 0; i<array.length; i+=1) {
			for(int j = 0; j<array[i].length; j+=1) {
				a[count] = array[i][j];
				count += 1;
			}
		}
		System.out.println(Arrays.toString(a));
		
		int n = 0;
		for(int i = 0; i<(a.length/2); i+=1) {
			data[i] = a[n];
			n += 1;
			num[i] = a[n];
			n += 1;		
		}
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(num));
		
		int total = 0;
		for(int i = 0; i<num.length; i+=1) {
			total += num[i];
		}
		System.out.println(total);
		
		int [] temp = new int[total];	
		
		int index = 0;
		for(int i = 0; i<data.length; i+=1) {
			for(int j = 0; j<num[i]; j+=1) {
				temp[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
