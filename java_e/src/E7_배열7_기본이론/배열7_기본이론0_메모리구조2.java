package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_기본이론0_메모리구조2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  ram ==> stack , heap , data(static)
		  
		  stack ==> 일반변수 (왼쪽에있는변수)
		  
		  heap ==> new 로 만든 변수 (오른쪽에 있는변수)
		  --------------------------
		  STACK ==> 지역변수 
		  HEAP  ==> 객체 (NEW)
		  DATA  ==> 전역변수 
		  --------------------------
		  []가 붙은 변수는 => new 로만든 변수의 주소를저장.
		*/
		int [] arr = new int[3];  //  arr    [0] [1] [2]
		int a = 10;	              //  ___    ___ ___ ___
		int b = 20;               // |___|  |___|___|___| 
		System.out.println(arr);  	
		int [] temp = arr;	
		temp[1] = 100;	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		arr[0] = 200;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}
}
//
//  int a = 10; 그림으로 표현
//   __a__         _____ _____a_____ _____
//  |  10 |  ==>  |     |     |     |  11 | -> int = 4byte
//  |_____|       |_____|_____|_____|_____| -> a의 주소는 1을 대표주소로 쓴다.
//                   1     2     3     4
// 
//  만약 int b를 추가로 만든다면 
//   __b__         _____ _____b_____ _____
//  |     |       |     |     |     |     |
//  |_____|       |_____|_____|_____|_____| -> b의 주소는 5을 대표주소로 쓴다.
//                   5     6     7     8
