package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_같은수삭제_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   /*
	 	 input[] = {1,3,3,2,1,1,4};
	 
		 [1] input 의 데이터를 a 에 순차적으로 저장한다.
		 [2] 단, 저장할려는 숫자의 앞의 숫자가 지금 저장할려는 수와 값이 같다면,
		  	 둘다 삭제한다.		
		 예) input = {1,3,3,2,1,1,4}		
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
