package B3_논리연산자_기본이론;

public class 논리연산자_알고리즘_삼각형_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제] 
		 가로가 15이고 세로가 24인 삼각형 넓이가 짝수이거나, 5의 배수입니까?
		*/
		int 가로 = 15;
		int 세로 = 24;
		int 삼각형넓이 = 가로*세로/2;
		int a = 삼각형넓이%2;
		int b = 삼각형넓이%5;
		
		System.out.println( a==0 || b==0 );
	}
}
