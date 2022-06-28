package E_테스트_연습;

import java.util.Arrays;
import java.util.Scanner;

public class 면접문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  판교에서 나온 코딩문제 
		  숫자를 입력받고 해당숫자만큼 앞으로 밀어내시오(40분)
		  [예시] 3 이면 세칸밀어냄
		  0 ==> {1,2,3,4,5};
		  1 ==> {2,3,4,5,1};
		  2 ==> {3,4,5,1,2};
		  3 ==> {4,5,1,2,3};
		*/
		Scanner scan = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		
		int n = scan.nextInt();
		
		for(int i = 0; i<(n%5); i+=1) {
			for(int j = 0; j<arr.length-1; j+=1) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
