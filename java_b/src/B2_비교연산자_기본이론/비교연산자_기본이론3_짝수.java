package B2_비교연산자_기본이론;

public class 비교연산자_기본이론3_짝수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 11;
		/*
		  비교연산자를 활용해 짝수 , 홀수 판별법 
		  
		  짝수 ==> 2의 배수이면 짝수 
		  홀수 ==> 2의 배수가 아니면 홀수 
		  
		  2의 배수 ==> 어떤수를 2로나눴을때 나머지가 0이면 2의배수 
		  3의 배수 ==> 어떤수를 3으로나눴을때 나머지가 0이면 3의 배수 
		*/
		
		System.out.println(a%2 == 0);
		System.out.println(b%2 == 0);
	}
}
