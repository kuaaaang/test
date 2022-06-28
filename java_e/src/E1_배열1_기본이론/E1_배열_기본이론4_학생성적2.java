package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  	 array = { 87, 11, 45, 98, 23 };
		  
			 [문제1] 인덱스를 입력받아 성적 출력
			 [정답1] 인덱스 입력 : 1 성적 : 11점
		
			 [문제2] 성적을 입력받아 인덱스 출력
			 [정답2] 성적 입력 : 11 인덱스 : 1
		*/
		Scanner scan = new Scanner(System.in);
		
		int array[] = {87 , 11 , 45 , 98 , 23};
		
		System.out.println("인덱스 입력 : ");
		int n1 = scan.nextInt();
		
		System.out.println("성적 : " + array[n1]);
		
		System.out.println("----------------------------");
		
		System.out.println("성적 입력 : ");
		int n2 = scan.nextInt();
		int count = 0;
		for(int i = 0; i<5; i+=1) {if(array[i] == n2) {count = i;}}
		System.out.println(count);
		
		scan.close();
	}
}
