package C3_조건문3_기본이론;

import java.util.Scanner;
import java.util.Random;

public class 조건문3_알고리즘_랜덤가운데숫자_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  	[가운데 숫자 맞추기 게임]
		  
		  1. 150~250 사이의 랜덤 숫자 저장한다.
		  2. 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다.
		  예)
		 		249		: 4
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n2 = scan.nextInt();
		scan.close();
		
		Random ran = new Random();
		int n1 = ran.nextInt(101)+150;
		int a = (n1%100)/10;
		
		System.out.println(n1);
		
		if (a==n2) {System.out.println("정답!");}
		else {System.out.println("땡!");}
	}
}
