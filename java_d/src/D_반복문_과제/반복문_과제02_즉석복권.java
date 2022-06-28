package D_반복문_과제;

import java.util.Random;

public class 반복문_과제02_즉석복권 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[즉석복권]
			랜덤으로 1또는 7 을 10번출력한다. 
			7이 연속으로 3번이상이면 "당첨" 아니면 "꽝" 출력하시오.
		[예시]
			7 7 1 1 1 7 1 : 꽝
			1 7 7 7 1 1 7 : 당첨
		*/
		Random ran = new Random();
		
		int count = 0;
		int count7 = 0;
		int win = 0;
		
		while(true) {
			int r = ran.nextInt(2);
			
			if(r==0) {
				System.out.print(1 + "  ");
				count += 1;
				count7 = 0;
			}
			else if(r==1) {
				System.out.print(7 + "  ");
				count += 1;
				count7 += 1;
			}
			if(count7 >= 3) {win += 1;}
			if(count == 10) {break;}
		}
		System.out.println();
		if(win > 0) {System.out.println("당첨!");}
		else if(win == 0) {System.out.println("꽝!");}
	}
}
