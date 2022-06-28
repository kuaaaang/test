package C3_조건문3_기본이론;

import java.util.Random;

public class 조건문3_알고리즘_랜덤369_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  	[369게임]
		  
		  1. 1~50 사이의 랜덤 숫자를 저장한다.
		  2. 위 수에 369의 개수가
		  	1) 2개이면, 짝짝을 출력한다.
		    2) 1개이면, 짝을 출력한다.
		    3) 0개이면, 해당 숫자를 출력한다.
		  예)
		  		33	 : 짝짝
		  		16	 : 짝
		  		 7	 : 7       
		*/
		Random ran = new Random();
		int n = ran.nextInt(50);
		n = n+1;
		System.out.println(n);
		
		int a = n/10;
		int b = n%10;
		int count = 0;
		
		if (a==3 || a==6 || a==9) {count = count + 1;}
		if (b==3 || b==6 || b==9) {count = count + 1;}
		
		if(count == 2) {System.out.println("짝짝");}
		else if(count == 1) {System.out.println("짝");}
		else {System.out.println(n);}
	}
}
