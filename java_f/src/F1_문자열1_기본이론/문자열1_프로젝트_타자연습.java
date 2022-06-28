package F1_문자열1_기본이론;

import java.util.Random;
import java.util.Scanner;

public class 문자열1_프로젝트_타자연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  # 타자연습 게임[1단계]
		  1. 문제를 섞는다.(shuffle)
		  2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		  예)
		  문제 : mysql
		  입력 : mydb
		  문제 : mysql
		  입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		  문제 : jsp
	    */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
			
		for(int i = 0; i<100; i+=1) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		
//		for(int i = 0; i<words.length; i+=1) {
//			String str = words[i];
//			
//			System.out.println(str);
//		}
//      ==>  for(String str : words) {System.out.println(str);}
//      ==>  축약 가능!!
		
		for(String str : words) {
			while(true) {
				System.out.println("문제 : " + str);
				System.out.print("입력 : ");
				String n = scan.next();
				
				if(str.equals(n)) {break;}
				else {continue;}
			}
		}	
	}
}
