package D2_반복문2_알고리즘;

import java.util.Random;

public class 반복문2_프로젝트_각자리수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		 1~999 사이의 랜덤숫자를 저장하고 각 자리수의 합을 출력하시오.
		 예) 8 ==> 8
		 예) 28 ==> 2 + 8
		 예) 999 ==> 9 + 9 + 9
		*/
		Random ran = new Random();
		int n = ran.nextInt(999) + 1;
		int _100 = n/100;
		int _10 = (n%100)/10;
		int _1 = (n%100)%10;
		
		System.out.println(n);
		System.out.println(_100 + _10 + _1);
	}
}
