package D3_반복문3_기본이론;

public class 반복문3_기본이론2_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 for 를 사용해서 풀어보자 		
		 문제 1) 1부터 5까지 출력하시오.
		 정답 1) 1, 2, 3, 4, 5
		 
		 문제 2) 1부터 10까지 반복해, 5~9까지 출력하시오.
		 정답 2) 5, 6, 7, 8, 9
		 
		 문제 3) 1부터 10까지 반복해 6~3까지 출력하시오.
		 정답 3) 6, 5, 4, 3
		 
		 문제 4) 1부터 10까지 반복해 3미만 7이상 출력하시오.
		 정답 4) 1, 2, 7, 8, 9, 10
	   */
		for(int i = 1; i <=5; i += 1) {System.out.println(i);}
		System.out.println("--------------------------------");
		
		for(int i = 1; i<=10; i += 1) {if(i>=5 && i<=9) {System.out.println(i);}}
		System.out.println("--------------------------------");
		
		for(int i = 10; i>=1; i -= 1) {if(i>=3 && i<=6) {System.out.println(i);}}
		System.out.println("--------------------------------");
		
		for(int i = 1; i<=10; i += 1) {if(i<3 || i>=7) {System.out.println(i);}}
		
		
		
	}
}
