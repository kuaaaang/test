package C2_조건문2_기본이론;

public class 조건문2_기본이론1_변수의생명주기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  변수의 생명주기(Scope)
		  변수는 선언당시의 {}중괄호 안에서 밖에 사용못한다. } 닫힌 중괄호를 만날때 소멸한다.
		*/
	
			int x = 10;
			if (true) {
				int y = 20;
				System.out.println("x = " + x);
				System.out.println("y = " + y);
           } // y 가 소멸하는 시기

			System.out.println("x = " + x); // x는 사용가능하지만 y는 사용할수없다.
			// System.out.println("y = " + y);
			
	      } // x가 소멸하는 시기
}
