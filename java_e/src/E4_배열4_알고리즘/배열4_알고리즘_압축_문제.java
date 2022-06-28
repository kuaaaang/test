package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_압축_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};	
		   arr1의 중에서 연속으로 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서 
		   b에 저장하려고 한다.
		   [예] b[] = {1,3,2,3,4,5}
		*/
		 int arr1[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		 int b [] = new int[arr1.length];
		 int index = 0;
		 
		/*
		  1) b[0]에 arr1의 첫번째값을 저장한다.
		  2) arr1[1]부터 순차적으로 b[0]과 비교해서 다른 값이 나올때마다 index를 증가하고
		     b[index]에 arr1[i]를 저장한다.
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
