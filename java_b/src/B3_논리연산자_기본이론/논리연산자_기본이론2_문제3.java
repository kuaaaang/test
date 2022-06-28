package B3_논리연산자_기본이론;

public class 논리연산자_기본이론2_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
				int a = 1;
				int b = 2;
				int c = 3;
				int d = 4;
				
				a = 2;
				b = 1;
				c = 1;
				d = 1;

				System.out.println(a * d == c + b && a > b);
				
				// 문제2) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
				a = 1;
				b = 2;
				c = 3;
				d = 4;
				
				a = 2;
				b = 1;
				c = 6;
				d = 1;
				
				System.out.println(a / d + 3 == c - b && a > b);
				
				// 문제3) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
				a = 1;
				b = 2;
				c = 3;
				d = 4;
				
				a = 2;
				b = 1;
				c = 1;
				d = 2;
				
				System.out.println(a % d == c % b && a > b);
				
				// 문제4) 아래 값이 전부 true 가 나오도록 수를 변경해보세요.
				a = 1;
				b = 2;
				c = 3;
				d = 4;
				
				a = 3;
				b = 2;
				c = 3;
				d = 2;
				
				System.out.println((a - d) * 3 == c / 3 + b && a > b);
	}
}
