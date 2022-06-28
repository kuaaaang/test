package D3_반복문3_기본이론;

public class 반복문3_기본이론3_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [보조제어문 2종류] 
		  
		 	[1. break] 
		  		break가 속해있는 반복문 1개를 즉시 종료한다. (굉장히 편리하다)
		*/

	  	   for (int i = 0; i < 15; i++) {
				if (i > 3) {
					break;
				            }
				System.out.println(i);
			                             }
			System.out.println("종료");
			
//			int run = 1;
//			while(run == 1) {if(a == 10) {
//				                          run = 0;} ==> "run = 0;" 대신에 "break" 사용
//			                 }
	}
}
