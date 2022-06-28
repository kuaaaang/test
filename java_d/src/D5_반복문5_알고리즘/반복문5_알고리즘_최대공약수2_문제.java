package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최대공약수2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[문제] 
			연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이
	  	  	똑같이 나누어 주려고합니다. 몇명까지 나누어 줄수있는지 출력하시오.
	   */
		int i = 1;
		int a = 0;
		
		while(i<=42) {if(42%i == 0 && 28%i == 0) {a = i;
		                                          System.out.println("공약수 : " + a);}
			          i +=1;
                      }
		System.out.println("최대 : " + a + "명");
	}
}
