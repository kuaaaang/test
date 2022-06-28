package D_반복문_과제;

import java.util.Random;

public class 반복문_과제_묵찌빠 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 과제 묵찌빠  ( 최대한 비슷하게 알아서 만드시오 ) 
		// 0 = 바위  1 = 보  2 = 가위
		
		Random ran = new Random();	
		
		int count = 0;
		while(true) {
			
			System.out.println("묵.찌.빠!");
			int p1 = ran.nextInt(3);
			int p2 = ran.nextInt(3);
			
			System.out.println("Player1 : " + p1);
			System.out.println("Player2 : " + p2);
			
			if(count == 0 && p1 == p2) {count = 0;}
			
			if((p1 == 0 && p2 == 2) || (p1 == 1 && p2 == 0) || (p1 == 2 && p2 == 1)) {
				count = 1;
			}
			else if((p2 == 0 && p1 == 2) || (p2 == 1 && p1 == 0) || (p2 == 2 && p1 == 1)) {
				count = 2;
			}
			
			if(count>0 && p1 == p2) {
				System.out.println();
				if(count == 1) {System.out.println("Player1 승리!");}
				else if(count == 2) {System.out.println("Player2 승리!");}
				break;
			}
		}
	}
}
