package E_테스트_연습;

import java.util.Arrays;
import java.util.Random;

public class _0702피드백3_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[1] 랜덤(1~9사이의숫자) 중 짝수의 값만 다섯개의 합을 배열의 첫번째 자리에 저장한다. 
		[2] 인덱스증가
		 위내용을 5번반복한다.
		 
		 [예시]
		 	[0번인덱스]
			 	2, 6, 4 ,2, 8 => total = 22 
			 	arr = {22, 0,0,0,0};
			[1번인덱스]
			 	6, 4, 4 ,2, 2 => total = 18 
			 	arr = {22, 18, 0, 0, 0};
			...
		*/
		Random ran = new Random();
		int arr[] = new int[5];
		
		int index = 0;
		while(index <= 4) {
			int total = 0;
			for(int i = 0; i<5;) {
				int r = ran.nextInt(9)+1;
				if(r%2 == 0) {
					System.out.print(r + " ");
					total += r;
					i+= 1;
				}
			}
			System.out.println();
			System.out.println(total);
			if(index <= 4) {
				arr[index] = total;
				index += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
