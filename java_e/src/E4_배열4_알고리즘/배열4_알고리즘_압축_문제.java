package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};	
		   arr1�� �߿��� �������� �ߺ��Ǵ� ���ڴ� �����ϰ� ���� 1������ �����ؼ� 
		   b�� �����Ϸ��� �Ѵ�.
		   [��] b[] = {1,3,2,3,4,5}
		*/
		 int arr1[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		 int b [] = new int[arr1.length];
		 int index = 0;
		 
		/*
		  1) b[0]�� arr1�� ù��°���� �����Ѵ�.
		  2) arr1[1]���� ���������� b[0]�� ���ؼ� �ٸ� ���� ���ö����� index�� �����ϰ�
		     b[index]�� arr1[i]�� �����Ѵ�.
		*/
		 
		b[0] = arr1[0];
		for(int i = 0; i<arr1.length; i+=1) {
			if(b[index] != arr1[i]) {
				index += 1;
				b[index] = arr1[i];
			}
		}
		 System.out.println(Arrays.toString(b));
	}
}
