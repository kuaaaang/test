package E3_배열3_기본이론;

import java.util.Scanner;
import java.util.Arrays;

public class 배열3_프로젝트_max게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [max게임]
		  
		  1. 가장 큰 값을 찾아 입력한다.
		  2. 정답이면 해당 값을 0으로 변경한다.
		  3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		  예)
		  11, 87, 42, 100, 24
		  입력 : 100
		  
		  11, 87, 42, 0, 24
		  입력 : 87
		  
		  11, 0, 42, 0, 24
		  입력 : 24 ==> 최대값이 아니므로 아무일안생김
		*/
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int i = 0;
		int count = arr.length;
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("가장 큰 값을 입력하세요.");
			int n = scan.nextInt();
			
			int max = 0;
			for(int j = 0; j<arr.length; j+=1) {
				if(max<=arr[j]) {
					max = arr[j];
					i = j;
				}
			}	
			if(n==max) {
				System.out.println("정답");
				arr[i] = 0;
				count -= 1;
			}else {System.out.println("오답");
			}
			i+=1;
			if(count == 0) {
				System.out.println(Arrays.toString(arr));
				System.out.println("종료!");
				break;
			}
		}	
		scan.close();
	}
}
