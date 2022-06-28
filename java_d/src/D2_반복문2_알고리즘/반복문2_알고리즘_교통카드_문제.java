package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_교통카드_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    /*
	    문제)
	    
	     선호네 반 학생 25명이 체험학습을 하러 가기위해
	     버스를 탔는데 , 총요금이 19400원이였다.

	     교통카드를 사용하면 720원이고 , 
	     현금으로 지불하면 1000원일때, 

	     교통카드를 사용한 학생수와 현금을 사용한 학생수는 
	     각각 얼마인가?
	    */
		int 총요금 = 19400;
		int 학생 = 25;
		
		int 교통카드 = 720;
		int 현금 = 1000;
		
		int 학생1 = 25;
		int 학생2 = 0;
		
		while (학생1>=0 && 학생1<=25) {
			if (학생1*720 + 학생2*1000 == 19400) {
				System.out.println("교통카드 : " + 학생1 + " 명");
                System.out.println("현금 : " + 학생2 + " 명");}
		                 학생1 = 학생1 - 1;
				         학생2 = 학생2 + 1;
				        }
	}
}
