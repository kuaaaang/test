package C_테스트_연습;

import java.util.Scanner;

public class 테스트0301_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제]
			택시기본요금은 10000원이다.		
			기본요금으로는  10km 까지 이동할수있다. 		
			10km이상 이동시 추가요금이 발생한다.		
			추가요금은 3km이동 할때마다 2300원씩 요금이 추가된다.			
			이동거리를 입력받고 요금을 출력하시오.	
			이동거리가 0이하일경우 "오류" 출력하시오.
	   */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("거리를 입력하세요.");
		int km = scan.nextInt();
		
		if(km<10) {
			System.out.println("이동거리 : " + km + " , 요금 : 10000원");
		}
		else if(km>=10) {
			int a = (km-10)/3;
			if((km-10)%3 > 0) {a = a + 1;}
			System.out.println("이동거리 : " + km + " , 요금 : " + (10000 + (a*2300)) + "원");
		}
		
	}

}
