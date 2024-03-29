package D1_반복문1_기본이론;

public class 반복문1_기본이론2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [반복문 while]
		 구조
			1) while ==> 키워드 
			2) (조건식) ==> 조건의 사실여부 판변한다.
			3) {기능}   ==> 조건이 사실이면 기능실행한다. 
					   단,반복문은 if 와 다르게  기능종료후 다시 while 실행한다.
			4) 중요 ==> 반복문은 반드시 종료 조건을 만들어야한다. (무한반복 방지)
		*/
			// 예) 1~5까지 출력하시오(반복문사용)
			int i = 1; // 초기식
			while (i <= 5) { // 조건식 , 무한반복 방지
				System.out.println(i);
				i = i + 1; 
			}	
	}
}
