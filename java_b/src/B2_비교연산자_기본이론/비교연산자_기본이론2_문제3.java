package B2_비교연산자_기본이론;

public class 비교연산자_기본이론2_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[예시]
		int a = 0;
		2 * a - 7 == 0   이 사실이 되도록 a의 값을 구해보자			
	    */
	
	int a = 0;
	a = 17;
	System.out.println(7 * 2 - a == 3 * -2 - -3);
	
	
	int b = 0;
	b = 5;
	System.out.println(b * b - 25 == 0);
	
	
	int c = 0;
	c = -2;
	System.out.println(3 * c + 2 == c - 2);
	
	int d = 0;
	d = 5;
	System.out.println(5 * d - 4 == 2 * d + 11);
	}
}
