package D5_반복문5_알고리즘;

public class 반복문5_프로젝트_빨간구슬_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]
		    파란구술 50개와 빨간 구술 70개를 최대한 많은 학생들에게 똑같이 나누어줄려고한다.
			파란구슬은 5개가남고 
			빨간구슬은 2개가 부족할때, 다음물음에 답하여라.
			1) 학생수는 얼마인가요?
			2) 학생당 받게되는 빨간구슬의 개수를 구하여라 .
		*/
		int a = 50-5;
		int b = 70+2;
		int num1 = a;
		int num2 = b;
		int i = 1;
		int max = 0;
		
		while(i<=b) {if(num1%i == 0 && num2%i == 0) {max = i;
			                                         System.out.println("공약수" + max);
			                                         }
		             i += 1; 
		             }
		System.out.println("학생수 : " + max + "명");
		System.out.println("학생당 빨간구슬을 " + (70/max) + "개 받았다.");
	}
}
