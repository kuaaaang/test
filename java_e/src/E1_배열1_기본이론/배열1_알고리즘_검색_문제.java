package E1_배열1_기본이론;

import java.util.Scanner;

public class 배열1_알고리즘_검색_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   array = {1001, 20, 1002, 45, 1003, 54};
		   
		   학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		   [문제] 학번을 입력하면 점수 출력한다.
		   [예] 1001==>20 , 1003 ==> 54
		   
		   [문제] 점수를 입력하면 학번 출력한다. 
		   [예] 20 ==> 1001 , 45 ==> 1002
		*/
		Scanner scan = new Scanner(System.in);
		
		int array[] = {1001 , 20 , 1002 , 45 , 1003 , 54};
		
		int number = 0;
		int score = 0;
		System.out.println("학번 입력");
		int n = scan.nextInt();
		for(int i = 0; i < 6; i+=1) {
			if(n == array[i]) {score = array[i+1];}
		}
		System.out.println(score);
		
		System.out.println("점수 입력");
		int s = scan.nextInt();
		for(int i = 0; i < 6; i+=1) {
			if(s == array[i]) {number = array[i-1];}
		}
		System.out.println(number);
		
		scan.close();
	}
}
