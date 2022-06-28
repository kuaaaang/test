package A1_기본이론;


public class 기본이론8_문자와숫자출력 {
	public static void main(String[] args) {
		// 1. 덧셈 연산자
		// + 연산자는 같은 자료형끼리만 가능하다.
		System.out.println(10 + 3);
		System.out.println(10.3 + 3.3);
		// 정수 + 실수 ==> 정수가 실수로 바뀐다.
		System.out.println("김" + "철수");
		System.out.println("-----------------------");
		// 2. 연결 연산자 ==> 문자와 숫자를 같이 출력하기 	
		// 1) "문자" + "문자" = "문자"
		System.out.println("안녕" + "하세요");
		// 2) 숫자 + "문자" = "문자"
		System.out.println("10" + 3);
		
		// 3) "문자" + 숫자 = "문자"
		// 정수 + 문자 ==> 정수가 문자로 바뀐다.
		System.out.println(3 + "10");
		System.out.println("------------------------------------------------------------------");
		System.out.println("덧셈연산자 = " + 10 + 3); // 숫자 "10" 이 "더하기 =" 이랑 먼저 계산되어서 글자로 변함
		System.out.println("더하기 = " + (10 + 3)); // 숫자를 먼저 () 를 이용해서 더한후 글자랑 같이 출력 해야한다.
		System.out.println("빼기 = " + (10 - 3)); // 숫자를 먼저 () 를 이용해서 더한후 글자랑 같이 출력 해야한다.
		System.out.println("곱하기 = " + 10 * 3);   // 곱하기나 나누기는 + 보다 우선순위가 높기때문에 필요없다.
		System.out.println("나누기(몫) = " + 10 / 3);
		System.out.println("나누기(나머지) = " + 10 % 3);
		System.out.println("나누기(소수점) = " + 10.0 / 3);
	}
}
