package B1_변수_기본이론;

public class 변수_기본이론3_변수의명명규칙 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # 변수의 명명규칙
		  1. 숫자로 시작할 수 없다.  ==> int 1a; (X)
		  2. 특수문자는 _ , $만을 허용한다. ==> int _1; (O) , int $1; (O) , int *1;(X)
		  3. 예약어(키워드)는 사용할 수 없다. ex) public, class, static, void...  ==> int int; (X)
		  4. 자바는 알파벳의 대소문자를 구분한다. 
		  --------------------------------------
		  1. 패키지명과 변수명은 소문자로 시작한다.
		  2. 클래스명은 대문자로 시작한다. (영어로)
		*/

				int a;
				a = 10;
				int A;
				A = 20;
				System.out.println(a);
				System.out.println(A);
		
		        int test = 1; // 변수는 대소문자를 구분한다.(서로 다른변수이다.)
		        int Test = 2;
		        System.out.println(test);
		        System.out.println(Test);
		        
		             
		        int $money = 1000;  // 특수문자 $ 사용가능
		        int _money = 2000;  // 특수문자 _ 사용가능 
		        System.out.println($money);
		        System.out.println(_money);
		        
		        // 아래와같이 노락색경고는 사소한경고이다. (신경쓰지않아도된다)
		        // 노란색 경고줄이 생긴원인 ==>  변수만 만들고 사용하지않아서 생기는것.
		        int math_score = 35; // 특수문자 _ 사용가능  ==> 두번째 단어를 _ 로 구분하는것(스네이크표기법)
		        int koreanScore = 87; // 첫번째 단어는 소문자 , 두번째 단어 첫글자를 대문자로 하는것 (카멜표기법)
		                              // java는 카멜표기법 사용
		        
		        // int 1num = 10;  // 변수이름은 숫자로 시작할수없다.
		        // int #test = 10;  // 특수기호 대부분 사용불가 
		        // int void = 20; // 예약어 사용불가
	}
}
