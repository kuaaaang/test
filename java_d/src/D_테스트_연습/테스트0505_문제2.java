package D_테스트_연습;

import java.util.Random;

public class 테스트0505_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		[철수의마블]
			철수는 마블게임을 하고있다. 	
			0~20까지의 지점이 있고 철수는 0의 위치에 있다. 
			20이 넘어가면 게임종료이다. 
			주사위는 1~6사이의 숫자가 나온다.	
			3의 배수의 자리는 함정이다.(3,6,9,12,15,18) 
			함정에서는 한번더 주사위를 던지고 4이상의 숫자가 나오면 함정탈출이되며 한칸 앞으로 전진한다.
			함정에 실패하면 뒤로 한칸 물러나게된다. 	
			철수가 게임을 끝날때까지 철수의 이동경로를 전부 출력하시오. 	
	    */
		Random ran = new Random();
		int a = 0;
		int count = 1;
		
		System.out.println("[마블 게임]");
		System.out.println("현재위치 : " + a);
		System.out.println();
		
		while(true) {
			int r = ran.nextInt(6)+1;
			
			if(a%3 != 0 && a<20 || a == 0) {
				System.out.println("주사위 : " + r);
				a += r;
				System.out.println("현재위치 : " + a);
			}
			
			else if(a%3 == 0 && a<20 && a != 0) {
				System.out.println("함정!");
				int n = ran.nextInt(6)+1;
				System.out.println("주사위를 던집니다.[4이상이 나오면 탈출!]    주사위 : "  + n);
				if(n>=4) {
					System.out.println("함정 탈출!");
					a += 1;
					System.out.println("현재위치 : " + a);
				}
				else if(n<4) {
					System.out.println("탈출 실패");
					a -= 1;
					System.out.println("현재위치 : " + a);
				}
			}
			
			if(a>=20) {
				System.out.println("종료!");
				break;
			}
			System.out.println();
			count += 1;
		}
	}
}
