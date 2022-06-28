package B1_변수_기본이론;

public class 변수_기본이론6_변수의크기와종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; // 4칸
		double b; // 8칸
		char c; // 1칸
		
		// 변수의 크기 와 종류
				System.out.println("[정수]");
				// 1. 정수 : int  , long 
				
				// int 는 -21억 에서  21억의 값만 저장 가능하다. (java 변수의 크기 검색해보기!)
				// 더큰값을 저장하고 싶으면 long 을 사용한다. 
				// int a =  3000000000; (주석을 풀면 에러발생)
				long d = 3000000000L; // long 을 사용할때는 long 의 약자인 L을 숫자 뒤에 붙여준다. (int 와 구분)
				System.out.println(d);
				
				
				System.out.println("[실수]");
				// 2. 실수 : float , double 		
				// float  ==> 작은 실수
				// double ==> 큰 실수 
				
				// 소수점은 최대한 정확히 표현하는게 좋기때문에 float 보단 double 을 사용한다. 		
				float e = 1.1234567891234f; // float 도 double 과 구분을 위해 f를 뒤에 붙여준다. 
				double f = 1.1234567891234; // double 도 한계가 있지만 float 보단 큰수저장가능 
				System.out.println(e);
				System.out.println(f);
	}
}
