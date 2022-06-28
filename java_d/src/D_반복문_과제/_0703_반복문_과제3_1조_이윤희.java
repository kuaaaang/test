package D_반복문_과제;

import java.util.Arrays;
import java.util.Random;

public class _0703_반복문_과제3_1조_이윤희 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        랜덤숫자 (1~9) 사이의 숫자  8개를 출력한다. 
        단 아래의 조건을 참고한다. 
        
        예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면
        아래와 같이 출력한다. 
        
        [출력]
           4 5 6
           5 6 1
           6 1 2
           1 2 3
           2 3 4
           3 4 5 
        */
		Random ran = new Random();
		int arr[] = new int[8];
		
		for(int i = 0; i<8; i+=1) {
			int r = ran.nextInt(9)+1;
			arr[i] = r;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		for(int i = 0; i<arr.length-2; i+=1) {
			System.out.println(arr[i] + " " + arr[i+1] + " " + arr[i+2]);
		}
	}
}
