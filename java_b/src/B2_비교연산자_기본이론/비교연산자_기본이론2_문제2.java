package B2_비교연산자_기본이론;

public class 비교연산자_기본이론2_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제1) 아래 연산의 결과가 모두 true가 출력되도록 변수의 값을 변경 		
        
				int a = 3;
				int b = 1;
				int c = 1;
				System.out.println(a + b - 3  == c);
				
				a = 1;
				b = 1;
				c = 1;	
				b = -1;
				System.out.println(a * -b  == c);
				
				a = 1;
				b = 1;
				c = 1;
				c = -2;
				System.out.println(a + -b * 3 == c);
						
				a = 1;
				b = 1;
				c = 1;
				c = 0;
				System.out.println(a % b  == c);
				
				a = 1;
				b = 1;
				c = 1;
				a = 8;
				b = 5;
				c = 3;
				System.out.println(a % b + 3  == c * 2);
	}

}
