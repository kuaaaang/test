package E7_배열7_기본이론;

import java.util.Random;

public class 배열7_기본이론7_주소개념4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[];   // 1차원의 위치를 저장
		int b[][]; // 2차원의 위치를 저장
		int c;     // 값을 저장
		c = 10; 
		
		
		int darr[][] = new int[3][];  // 변수 4개
	  //int darr[][] = new int[3][3]; // 변수 13개	
		int arr[] = {10,20,30};			
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		// 8개 ==> darr(1개)   arr(1개)   new int[3][](3개)   {10,20,30}(3개)
		
		arr[1] = 100;
		//---------------------------------		
		int darr2[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		int temp[][] = new int[3][];
		temp[0] = darr2[1];
		temp[1] = darr2[2];
		temp[2] = darr2[0];
	}
}
