package B2_비교연산자_기본이론;

public class 비교연산자_알고리즘_시분초_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		   321321초를  "시간" , "분" , "초" 로 표현햇을때 ,
		   "분" 이  홀수인가요?
	    */
		int 초 = 321321;
		int 시간 = 321321/3600; 
		int 분 = (321321%3600)/60;
		
		System.out.println(분);
		System.out.println(분%2 != 0);
	}
}
