package C2_조건문2_기본이론;

public class 조건문2_알고리즘_오이_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	  	[문제]
	  	 	 마트에서 오이를 3개씩 묶어서 1500원에 판매한다.
		 	 오이가 14개 필요하다. 
		 	 필요한 금액을 출력하시오.
		 	 단, 오이는 묶음으로만 판매한다.
	   */
		int 오이 = 1500;
		int 필요한오이 = 14;
		int 구매할개수 = 필요한오이/3;
				if(필요한오이%3>0) {구매할개수 = 구매할개수 + 1;}
				
		System.out.println(구매할개수*오이 + "원");
	}
}
