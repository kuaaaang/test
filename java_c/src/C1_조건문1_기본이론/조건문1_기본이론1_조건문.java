package C1_조건문1_기본이론;

public class 조건문1_기본이론1_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [조건문] if
		  
		  1) if ==> 키워드
		  2) (조건식) ==> 조건이 사실인지 판별한다.
		  3) {기능}  ==> 위조건을 기반으로 기능을 실행한다.
		  
		  ----------------------------------------------
		  
		  if(조건식){
		  		조건식이 참(true)일 때 실행할 문장;
		  }
	 
		  ----------------------------------------------
		*/		
			int a = 10;
			int b = 10;
			if(a == b) {
				System.out.println("실행 O");
			}
			
			if(a != b) {
				System.out.println("실행 X");  // 이부분은 실행이 안된다. 
			}		
			// 예) 홀짝
			int num = 8;	
			if(num % 2 == 0) {
				System.out.println("짝수");
			}
			if(num % 2 != 0) {
				System.out.println("홀수");  // 이부분은 실행이 안된다. 
			}
	}
}
