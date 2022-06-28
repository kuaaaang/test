package D2_반복문2_알고리즘;

import java.util.Random;

public class 반복문2_프로젝트_자리수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
			 [1] 1~99999 사이의 랜덤숫자를 저장하고 자리수가 몇자리인지 출력하고,
			 [2] 그중에 9의 개수를 출력.
			 
			 예) 8 ==> 1 , 0
			 예) 102 ==> 3 , 0
			 예) 88 ==> 2 , 0
			 예) 919 ==> 3, 2
		 */
		Random ran = new Random();
		int n = ran.nextInt(99999) + 1;	
		int count = 0;
		int count9 = 0;
		int 임시 = n;
		
		int run = 1;
		while(run == 1) {int temp = 임시%10;  // B1 기본이론2
			             System.out.println(temp);
			             if(temp == 9) {count9 = count9 + 1;}
			             임시 = 임시/10;
                         if (임시 == 0) {run = 0;}
                         count = count + 1; 
                         }
		
		System.out.println("숫자 : " + n + " , 자리수 : " + count);
		System.out.println("--------------------------");
		System.out.println("9의 개수 : " + count9 + "개");
	}
}
