package A4_몫과나머지_알고리즘;

public class 몫과나머지_알고리즘_시간분초_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [문제] 
		 	123123초 는 몇시간 몇분 몇초인가 ?			
	    */
		/*
		 1시간 = 60분 = 3600초
	   */
		System.out.print((123123/3600) + "시간 ");
		System.out.print(((123123%3600)/60) + "분 ");
		System.out.print(((123123%3600)%60) + "초 ");
	}
}
