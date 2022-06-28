package D3_반복문3_기본이론;

public class 반복문3_기본이론1_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [반복문 for]
		  1. 반복문의 조건 3가지
		  1) 초기식
		  2) 조건식
		  3) 증감식
		  2. for문의 구조
		  for(초기식;조건식;증감식){
		  		조건식이 참일 동안 실행할 문장;
		  }
		  3. for문의 실행순서
		  초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 ...
		*/
					
			// 1~5까지 출력
			int x = 1;       // 1. 초기식
			while (x <= 5) { // 2. 조건식
				System.out.println(x);
				x = x + 1;   // 3. 증감식
			}
			// int x = 10;
			System.out.println();
			
			/*
			     초기식 , 조건식 , 증감식이 한줄에 있다.
		    	 다만 while 과 세미콜론 위치가 다르다.
				 세미콜론; 이 앞에서부터 2개만있다. 
			*/
			for (int y = 1; y <= 5; y+=1) { 
				System.out.println(y);
			}

			int y = 0; // for 의 특징; 초기식의 변수는 for와 함께 소멸된다. for 안에서만!
	}
}
