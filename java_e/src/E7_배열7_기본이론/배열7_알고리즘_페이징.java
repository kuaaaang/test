package E7_배열7_기본이론;

import java.util.Scanner;

public class 배열7_알고리즘_페이징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
		   1~1000 사이의 숫자를 입력받고 다음과 같이 출력하시오.

		   입력받은값이 
		  	1~10 사이 값이면  ==> 1
		   11~20 사이 값이면 ==> 11 
		   21~30 사이 값이면 ==> 21 
		   ......
		   
		   예) 
		   	5 ==> 1
		   	24 ==> 21
		   	154 ==> 151 
		   	10 ==> 1
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[1~1000]");
		int n = scan.nextInt();
		
		if(n<1 || n>1000) {System.out.println("오류!");}
		else {
			if(n%10 != 0) {System.out.println(1 + (n/10*10));}
			else if(n%10 == 0) {System.out.println(1 + (((n/10)-1)*10));}
		}
	}
}
