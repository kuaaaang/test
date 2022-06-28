package C3_조건문3_기본이론;

import java.util.Random;

public class 조건문3_프로젝트_일주일_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		  
		   [요일 맞추기]
		    이번달 1일이 수요일이라고 할때, 
		    랜덤으로 1~31을 저장하고 해당 요일 출력한다. 
		   
		   예) 3일 ==> 금요일
		 */
		Random ran = new Random();
		int day = ran.nextInt(31) + 1;
			
		if(day == 1 || day == 8 || day == 15 || day == 22 || day == 29) {System.out.println(day + "일" + " 수요일");}
		if(day == 2 || day == 9 || day == 16 || day == 23 || day == 30) {System.out.println(day + "일" + " 목요일");}
		if(day == 3 || day == 10 || day == 17 || day == 24 || day == 31) {System.out.println(day + "일" + " 금요일");}
		if(day == 4 || day == 11 || day == 18 || day == 25) {System.out.println(day + "일" + " 토요일");}
		if(day == 5 || day == 12 || day == 19 || day == 26 ) {System.out.println(day + "일" + " 일요일");}
		if(day == 6 || day == 13 || day == 20 || day == 27) {System.out.println(day + "일" + " 월요일");}
		if(day == 7 || day == 14 || day == 21 || day == 28) {System.out.println(day + "일" + " 화요일");}
		
		/*
		int week = day % 7;
		System.out.println(day);
		if(week == 1) {
			System.out.println("수요일");
		}
		if(week == 2) {
			System.out.println("목요일");
		}
		if(week == 3) {
			System.out.println("금요일");
		}
		if(week == 4) {
			System.out.println("토요일");
		}
		if(week == 5) {
			System.out.println("일요일");
		}
		if(week == 6) {
			System.out.println("월요일");
		}
		if(week == 0) {
			System.out.println("화요일");
		}
		long a = System.currentTimeMillis(); // 1970년 1월 1일 0초부터 지금까지의 초
		System.out.println(a);
	    */		
	}
}
