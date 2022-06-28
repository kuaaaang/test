package E5_배열5_기본이론;

import java.util.Random;
import java.util.Arrays;

public class 배열5_알고리즘_2차원정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int darr[][] = new int[3][3];
		
		Random ran = new Random();
		
		int arr[] = new int[9];
		
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = ran.nextInt(100);
			}
		}
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]);
	                        	// 한자리수가 나와도 2자리 크기로 나온다.(찌그러 지는것을 막아줌)
			                    // ex) [12][1][34] - X    [12][ 1][34] - O
			}
			System.out.println();
		}
		
		int k = 0;
		for(int i = 0; i < 3; i ++) { // 2차원을 1차원으로
			for(int j = 0; j < 3; j++) {
				arr[k] = darr[i][j];
				k += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------");
	
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				        // j<arr.length 가 아닌 이유는 81번이나 돌릴 필요가 없기 때문! 41번만 필요
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("------------------------");
		}
		
		 k = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = arr[k];
				k += 1;
			}
		}
		System.out.println("-----------------");
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%2d]" , darr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
 arr.length * arr.length
   _____9_____
  |_________9_|
9 |_________9_|
  |_________9_|
  |_________9_|  사각형
       ...
 
 arr.length * i
  |\
  |1\
  |_2\
  |__3\
  |___4\
  |____5\  삼각형
   ... 
*/
