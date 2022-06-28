package E5_배열5_기본이론;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_2차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		// 문제1) 인덱스 2개를 입력받아 값 출력
		// 예1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
				
		// 문제2) 값을 입력받아 인덱스 2개 출력
		// 예2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
				
		// 문제3) 가장 큰 값의 인덱스 2개 출력
		// 정답3) 2 2
				
		// 문제4) 값 2개를 입력받아 값 교체
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for(int i = 0; i<arr.length; i+= 1) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		
		//문제1
		
		System.out.print("인덱스 1 입력 : ");
		int n1 = scan.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int n2 = scan.nextInt();
		System.out.println(arr[n1][n2]);
		System.out.println("--------------------------------");
		
		//문제2
		
		System.out.print("값 입력 : ");
		int value = scan.nextInt();
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(value == arr[i][j]) {
					System.out.println("인덱스 1 : " + i + " , 인덱스 2 : " + j);
				}
			}
		}
		System.out.println("--------------------------------");
		
		//문제3
		
		int max = 0;
		int a = 0;
		int b = 0;
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(max<arr[i][j]) {
					max = arr[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.print("가장 큰 값의 인덱스 : ");
		System.out.println(a + "  " + b);
		System.out.println("--------------------------------");
		
		//문제4
		
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		System.out.print("교체값 1 입력 : ");
		int value1 = scan.nextInt();
		System.out.print("교체값 2 입력 : ");
		int value2 = scan.nextInt();
		
		for(int i = 0; i<arr.length; i+=1) {
			for(int j = 0; j<arr[i].length; j+=1) {
				if(value1 == arr[i][j]) {
					temp1 = i;
					temp2 = j;
				}
				if(value2 == arr[i][j]) {
					temp3 = i;
					temp4 = j;
				}
			}
		}
		int temp = arr[temp1][temp2];
		arr[temp1][temp2] = arr[temp3][temp4];
		arr[temp3][temp4] = temp;
		
		for(int r = 0; r<arr.length; r+=1) {
			System.out.println(Arrays.toString(arr[r]));
		}
		
		
		scan.close();
	}
}
