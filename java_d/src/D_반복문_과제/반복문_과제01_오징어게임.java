package D_반복문_과제;

import java.util.Random;

public class 반복문_과제01_오징어게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[오징어게임]
			철수는 오징어게임에 참가하였다.
			첫번째 게임은 "무궁화꽃이 피었습니다" 이다.
			규칙은 아래와같다.	
		[규칙]	
			[1] 전체 거리는 0 ~ 25까지 거리가 있다.
			[2] 철수는 현재 0의 자리에 있다.
			[3] 철수는 매턴 1 ~ 4의 랜덤숫자를뽑는다. 숫자만큼 이동한다. 
			[4]	이동거리를 누적하며, 합이 25이상이되면 승리이며 종료한다.
			[5] 인형은 매턴 3 ~ 5의 랜덤숫자를뽑는다. 
			[6] 인형보다 큰 숫자가나오면 움직인것으로 간주되어 패배하며 종료한다.
			[7] 10턴안에 도착못하면 시간초과로 패배하며 종료한다.
			[8] 철수의 이동경로를 전부 출력하시오.
		*/
		Random ran = new Random();
		
		int 현재위치 = 0;
		int count = 0; 
		
		while(true) {
			
			System.out.println("현재위치 : " + 현재위치);
			int 철수 = ran.nextInt(4)+1;
			int 인형 = ran.nextInt(3)+3;
			System.out.println("철수 : " + 철수);
			System.out.println("인형 : " + 인형);
			
			if(철수>인형) {
				System.out.println("움직였습니다.");
				break;
			}
			else {
				현재위치 = 현재위치 + 철수;
				count += 1;
			}
			
			if(count >10) {
				System.out.println("시간초과!");
				break;
			}

			if(현재위치 >= 25){
				System.out.println("현재위치 : " + 현재위치);
				System.out.println("승리!");
				break;
			}
		}
	}
}
