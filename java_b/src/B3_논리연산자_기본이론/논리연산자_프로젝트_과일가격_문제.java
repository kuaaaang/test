package B3_논리연산자_기본이론;

public class 논리연산자_프로젝트_과일가격_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		  사과1개와 바나나3개의 값은 5500원이고,
		  사과1개와 바나나5개의 값은 8500원이다.
		  각각의 과일가격을 구하시오.
		*/
		int 사과1바나나3 = 5500;
		int 사과1바나나5 = 8500;
		int 바나나2 = 사과1바나나5 - 사과1바나나3;
		int 바나나 = 바나나2/2;
		int 사과 = 사과1바나나3 - 바나나*3;
		
		System.out.print("사과 : ");
		System.out.println(사과 + "원");
		System.out.print("바나나 : ");
		System.out.println(바나나 + "원");	
	}
}
