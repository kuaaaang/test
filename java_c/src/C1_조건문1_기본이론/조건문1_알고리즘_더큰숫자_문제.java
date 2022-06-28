package C1_조건문1_기본이론;

import java.util.Scanner;

public class 조건문1_알고리즘_더큰숫자_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제]   
		  숫자 2개를 입력받고 더큰숫자의 값을 출력하시오.
		  
		   (1) 숫자1을 입력 : 
		   (2) 숫자2를 입력 : 
		   (3) 더큰숫자는 ? 입니다.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1을 입력 : ");
		int 숫자1 = scan.nextInt();
		
		System.out.print("숫자2를 입력 : ");
		int 숫자2 = scan.nextInt();
		
	if(숫자1>숫자2) {System.out.println("더 큰 숫자는" +  숫자1  + "입니다.");}
	if(숫자1<숫자2) {System.out.println("더 큰 숫자는" +  숫자2  + "입니다.");}

		scan.close();

	}
}
