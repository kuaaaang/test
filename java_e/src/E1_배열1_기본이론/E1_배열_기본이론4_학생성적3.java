package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		     numberList = { 1001, 1002, 1003, 1004, 1005 };
			 scoreList = { 87, 11, 45, 98, 23 };
			 [문제] 학번을 입력받아 성적 출력
			 [정답] 학번 입력 : 1003 성적 : 45점
		*/
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = { 1001, 1002, 1003, 1004, 1005 };
		int scoreList[] = { 87, 11, 45, 98, 23 };
		
		System.out.println("학번을 입력하세요.");
		int n = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i<5; i+=1) {if (n == numberList[i]) {count = i;}}
		System.out.println("성적 : " + scoreList[count]);
		
		scan.close();
	}
}
