package E2_배열2_기본이론;

import java.util.Scanner;

public class 배열2_알고리즘_값교체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		Scanner scan = new Scanner(System.in);
		
    	int[] arr = { 10, 20, 30, 40, 50 };

    	System.out.print("인덱스1 입력 : ");
    	int n1 = scan.nextInt();
    	System.out.print("인덱스2 입력 : ");
		int n2 = scan.nextInt();
		
		int t1 = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = t1;
		
		for(int i = 0; i<5; i+=1) {
			System.out.print(arr[i] + "   ");
		}
		
		System.out.println();
		
		System.out.print("값1 입력 : ");
    	int n3 = scan.nextInt();
    	System.out.print("값2 입력 : ");
		int n4 = scan.nextInt();
		
		for(int i = 0; i<5; i+=1) {
			if(n3 == arr[i]) {
				n1 = i;
			}
			if(n4 == arr[i]) {
				n2 = i;
			}
		}
		int t2 = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = t2;
		
		for(int i = 0; i<5; i+=1) {
			System.out.print(arr[i] + "   ");
		}
		
		scan.close();
	}
}
