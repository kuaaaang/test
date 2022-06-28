package D1_반복문1_기본이론;

import java.util.Scanner;

public class 반복문1_기본이론4_종료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   [반복문 종료]
		  1. 무한 반복을 하면서 숫자를 입력받는다.
		  2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		  예)
		  숫자 입력[EXIT:-100] : 1
		  숫자 입력[EXIT:-100] : 3
		  숫자 입력[EXIT:-100] : 4
		  숫자 입력[EXIT:-100] : -100
		  프로그램 종료
	    */
	Scanner scan = new Scanner(System.in);
		
	int i = 1;
	while(i == 1) {System.out.println("숫자 입력[EXIT : -100] : ");
		           int input = scan.nextInt();
		           if(input == -100) {System.out.println("종료");
		        	                  i = 0;}
	               }
	scan.close();
	}
}
