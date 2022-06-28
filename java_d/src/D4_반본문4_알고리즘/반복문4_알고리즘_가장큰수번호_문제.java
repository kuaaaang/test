package D4_반본문4_알고리즘;

import java.util.Random;

public class 반복문4_알고리즘_가장큰수번호_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [문제1] 반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
		       1) 랜덤숫자중 가장큰수와 번호를 출력
	             (번호는 출력순서이다.)
		       2) 가장큰수가 여러개있다면 가장첫번째 번호를 출력 
		      예) 
		      		1, 7, 4, 7, 5 ==>   가장큰수 : 7 ,  번호 : 2  
		         	가장큰수가 2개지만 첫번째번호를 출력

		  [문제2] 반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
		       1) 랜덤숫자중  가장큰수와 번호를 출력
	             (번호는 출력순서이다.)
		       2) 가장큰수가 여러개있다면 가장마지막 번호를 출력 
		      예) 
		      		1, 7, 4, 7, 5 ==>   가장큰수 : 7 , 번호 : 4  
		      		가장큰수가 2개지만 마지막 번호를 출력
	   */
		Random ran = new Random();
		
		int count1 = 1;
		int max1 = 0;
		while(count1 <= 5 ) {int n1 = ran.nextInt(9)+1;
			                 System.out.println(n1);
		                     if(max1<n1) {max1=n1;
		                                 System.out.println("가장큰수 : " + max1 + " , 번호 : " + count1);}
		                    count1 = count1 + 1;
		                    }
		
		System.out.println("-----------------------------");

		int count2 = 1;
		int max2 = 0;
		while(count2 <= 5) {int n2 = ran.nextInt(9)+1;
                            System.out.println(n2);
                            if(max2<=n2) {max2=n2;
                                          System.out.println("가장큰수 : " + max2 + " , 번호 : " + count2);}
                            count2 = count2 + 1;
                            }
	}
}
