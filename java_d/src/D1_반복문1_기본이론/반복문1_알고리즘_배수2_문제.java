package D1_반복문1_기본이론;

public class 반복문1_알고리즘_배수2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		   8의 배수를 작은수부터 4개 출력하시오. 
		   답 : 0,8,16,24
		*/
		int i = 0;
		int count = 1;
		while(count <= 4) {count = count +1;
		                   System.out.println(i);
		                   i = i+8;}
	}
}
