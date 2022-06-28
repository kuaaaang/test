package A4_몫과나머지_알고리즘;

public class 몫과나머지_프로젝트_화폐매수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [문제]  
		 	 거스름돈 (174900원)을 거슬러줄려고한다.
		     단, 일천원짜리는 매진 되어 500원짜리로 거슬러준다면,
		     각단위별로 몇장씩 나눠줘야하는가?
	
			 오만원  : 3 , 일만원  : 2 , 오천원 : 0 , 
			 일천원  : 0 , 오백원  : 9 , 일백원 : 4
		*/
		System.out.println("오만원 " + (174900/50000) + "장");
		System.out.println("일만원 " + ((174900%50000)/10000) + "장");
		System.out.println("오백원 " + (((174900%50000)%10000)/500) + "개");
		System.out.println("일백원 " + ((((174900%50000)%10000)%500)/100) + "개");
	}
}
