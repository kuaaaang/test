package D4_반본문4_알고리즘;

import java.util.Random;

public class 반복문4_프로젝트_최대값개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  랜덤으로 1~10 를 10번출력하고 , 
		  가장큰수가 여러번 나온경우 중복출력된 횟수출력하시오.
		*/
		Random ran = new Random();
		
		int count = 1;
		int maxcount = 0;
		int max = 0;
		while(count <=10) {int n = ran.nextInt(10) + 1;
		                   System.out.println(n);
        
		                   if(max<n) {max = n;
		                              maxcount = 1;
		                              }
		                   else if(max == n) {maxcount = maxcount + 1;}
		
		                   count = count + 1;
             	           }
		System.out.println("최대값 : " + max + " , 중복 : " + maxcount + "번");
	}	
}
