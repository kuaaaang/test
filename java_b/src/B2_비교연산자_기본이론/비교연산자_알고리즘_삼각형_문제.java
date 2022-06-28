package B2_비교연산자_기본이론;

public class 비교연산자_알고리즘_삼각형_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제]
		 	가로가 3이고 세로가 6인 삼각형 넓이가 홀수인가요?
		*/
		int 가로 = 3;
		int 세로 = 6;
		int 넓이 = 가로*세로/2;
		
		System.out.println(넓이%2 != 0);
	}
}
