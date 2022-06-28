package B3_논리연산자_기본이론;

public class 논리연산자_기본이론2_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 ) 숫자1 이 3의 배수이면서, 짝수입니까?
				int num1 = 12;
				int a = num1%3;
				int b = num1%2;
				System.out.println(a==0 && b==0);
				
		// 문제) 숫자2가 홀수이거나 5의 배수입니까?
				int num2 = 50;
				int c = num2%2;
				int d = num2%5;
				System.out.println(c==1 && d==0);				
	}
}
