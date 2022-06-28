package D3_반복문3_기본이론;

import java.util.Scanner;

public class 반복문3_알고리즘_최대값_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  	[최대값 구하기]
		  1. 반복문안에서 계속해서 값을 입력받는다. ( -1000 보다큰수만입력받는다.)
		  2. 입력받은숫자중 가장큰숫자를 출력한다.
		  3. -1000 보다 이하를  입력하면 종료한다.
		*/
		Scanner scan = new Scanner(System.in);
		int max = -1000;
		
		while(true) {System.out.println("숫자를 입력하세요.[-1000 보다 큰 수]");
		             int n = scan.nextInt(); 
		             if (n<=-1000) {System.out.println("종료");
		            	            break;} 
		             else {if(max < n) {max = n;
		                                System.out.println("가장 큰수 : " + n);
		                                }
		                   }
		            }
	}
}
