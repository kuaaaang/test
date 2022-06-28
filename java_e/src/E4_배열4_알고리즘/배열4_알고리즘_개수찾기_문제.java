package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_개수찾기_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		     [개수찾기]
		 
		  	 가장많이 들어있는 숫자개수와
			 가장 적개 들어있는 숫자의 개수의 합을 구하시요.	
			 100 : 1개
			 3   : 5개 	
			 답 : 6		
		*/
		//[1] 새로운 배열을 만들어서 중첩되지않는 값만 저장한다.
		//temp = {1,2,3,100}
		
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
		int temp[] = new int[arr.length];
		int tcount = 0;
		
		for(int i = 0; i<arr.length; i+=1) {
			boolean check = false;
			
			for(int j = 0; j<tcount; j+=1) { // 중복이 될 경우엔
				if(temp[j] == arr[i]) {
					check = true;
					break;
				}
			}
			if(check == false) { // 중복이 되지 않을 경우엔
				temp[tcount] = arr[i];
				tcount +=1;
			}
			
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(tcount);

		int count[] = new int[tcount];
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr.length; j+=1) {
				if(arr[i] == temp[j]) {
					count[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(count));	
		
		for(int i = 0; i<count.length; i+=1) {
			System.out.println(temp[i] + " : " + count[i] + "개");
		}
		
		int max = 0;
		int min = 5;
		int a = 0;
		int b = 0;
		
		for(int i = 0; i<count.length; i+=1){
			if(max<count[i]) {max = count[i];
			                  a = i;}
			if(min>count[i]) {min = count[i];
			                  b = i;}
		}
		
		System.out.println();
		System.out.println("가장 많은 수 : " + temp[a] + " , " + max + "개");
		System.out.println("가장 적은 수 : " + temp[b] + " , " + min + "개");
		System.out.println(max + min);
		
		
	}
}
