package C3_조건문3_기본이론;

import java.util.Random;

public class 조건문3_기본이론1_랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [랜덤]  
		   1) import java.util.Random; 추가
		   2) Random ran = new Random(); 추가 
		   3) 이후 main 매소드안에서  int r = ran.netInt(랜덤범위); 
		   4) ( 0 ~ 랜덤범위-1 )  사이값이 나온다. 
		*/		
	
			Random ran = new Random();
			// 예) 0 ~ 2 사이의 랜덤
			int rNum = ran.nextInt(3); // 0부터 3개 ==> 0,1,2
			System.out.println(rNum);

			// 문제 1) 1 ~ 6 사이의 랜덤
			rNum = ran.nextInt(6) + 1; // [0 ~ 5] + 1
			System.out.println(rNum);

			// 문제 2) -3 ~ 3 사이의 랜덤
			rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
			System.out.println(rNum);
	}
}
