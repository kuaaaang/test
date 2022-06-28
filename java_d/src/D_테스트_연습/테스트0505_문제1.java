package D_테스트_연습;

import java.util.Random;

public class 테스트0505_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		[문제]
		[반복가위바위보]	 	
			철수와 민수는 계단에서 가위바위보를 한다. 	 	
			철수와 민수는 각각 0 ~ 2 의 랜덤값을 저장한다.
			0 : 가위 , 1 : 바위 , 2 : 보를 뜻한다.	 
			철수와 민수는 50번째 계단의 위치에서 시작을 한다.
			룰은 다음과 같다.	
			이기면 3칸올라가기, 비기면 2칸올라가기, 지면 1칸올라가기.	 	
			둘중 아무나 100이상 도착하거나 둘사이의 간격이 10이상이면 게임은 종료된다. 
			게임이 종료될때까지 두사람의 이동경로를 출력하시오.
	    */
		Random ran = new Random();
		int p1p = 50;
		int p2p = 50;
		
		while(true) {
			int p1 = ran.nextInt(3);
			int p2 = ran.nextInt(3);
			System.out.println("철수 위치 : " + p1p);
			System.out.println("민수 위치 : " + p2p);
			System.out.println();
			System.out.println("철수 : " + p1);
			System.out.println("민수 : " + p2);
			
			if((p1==0 && p2==2) || (p1==1 && p2==0) || (p1==2 && p2==1)) {
				p1p += 3;
				p2p -= 1;
				System.out.println("철수 win");
			}
			else if((p2==0 && p1==2) || (p2==1 && p1==0) || (p2==2 && p1==1)) {
				p1p -= 1;
				p2p += 3;
				System.out.println("민수 win");
			}
			else if(p1==p2) {
				p1p += 2;
				p2p += 2;
				System.out.println("draw");
			}
			
			if(p1p >= 100 || p2p >= 100 || (p1p-p2p)>=10 || (p2p-p1p)>=10) {
				System.out.println("게임종료");
				System.out.println("철수 위치 : " + p1p);
				System.out.println("민수 위치 : " + p2p);
				break;
			}
		}
	}
}
