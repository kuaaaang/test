package B3_논리연산자_기본이론;

public class 논리연산자_알고리즘_과일무게_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
		 귤5개의 무게가 4의 배수이고,  사과 4개의 무게가 5의 배수입니까?
		*/
		int 귤6 = 840;
		int 귤 = 귤6/6;
		int 귤5 = 귤*5;
		int 사과3 = 840;
		int 사과 = 사과3/3;
		int 사과4 = 사과*4;
		int a = 귤5%4;
		int b = 사과4%5;
		
		System.out.println(a==0 && b==0);
	}
}
