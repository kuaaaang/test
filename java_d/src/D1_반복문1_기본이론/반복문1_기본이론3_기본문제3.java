package D1_반복문1_기본이론;

public class 반복문1_기본이론3_기본문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제1] 1~10까지 중에서 3미만 7이상의 합을 출력하시오.
		       1 + 2 + 7 + 8 + 9 + 10
		 [정답1] 37

		 [문제2] 1~10까지 중에서 3미만 7이상의 개수를 출력하시오. 
				 1,2,7,8,9,10 ==> 6개 
		 [정답2] 6
	   */
		int i = 1;
		int total = 0;
		int count = 0;
		
		while(i<=10) {if(i<3 || i>=7) {total = total + i;
		                               count = count + 1;
		                               System.out.println(total);
		                               }
		              i +=1;
		              }
		System.out.println("합 : " + total);
		System.out.println("개수 : " + count);
	}
}
