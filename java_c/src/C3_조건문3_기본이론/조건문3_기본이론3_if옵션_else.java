package C3_조건문3_기본이론;

public class 조건문3_기본이론3_if옵션_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	  	[if 문의 옵션 2종류] 
	  	
	  	- else 
	  	- else if 	  			
		조건이 2가지인경우 else 를 이용해서 2번째 조건을 생략할수있다. 			
	   */
		int num = 11;
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		if (num % 2 == 1) {
			System.out.println("홀수");
		}

		System.out.println("-------------------------");

		if (num % 2 == 0) {
			System.out.println("짝수");
		} 
		else { // if의 조건이 아니면 무조건실행한다. 
			System.out.println("홀수");
		}
	}
}
