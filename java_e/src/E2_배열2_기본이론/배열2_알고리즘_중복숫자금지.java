package E2_배열2_기본이론;

import java.util.Random;

public class 배열2_알고리즘_중복숫자금지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
		  
		   [중복숫자 금지]
		  1. 0~4 사이의 숫자를 arr1배열에 저장한다.
		  2. 단, 중복되는 숫자는 없어야 한다.
		  힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
		  
		  [예]
		  랜덤숫자 : 1
		  check = {false, true, false, false, false} // 1번 자리가 true로 바뀜, 1번 자리는 계속 true 이므로 1 입력불가
		  arr1   = {1, 0, 0, 0, 0}
		  랜덤숫자 : 3
		  check = {false, true, false, true, false}
		  arr1   = {1, 3, 0, 0, 0}
		  랜덤숫자 : 2
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
