package C1_조건문1_기본이론;

import java.util.Scanner;

public class 조건문1_알고리즘_회원가입_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  	[회원가입 과 로그인] 
		  1. 먼저 아이디와 비밀번호를 입력해서 회원가입한다. 
		  2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
		  3. 가입된 아이디와 비밀번호와 로그인시 입력한 아이디와 비밀번호를 비교한다.
		  4. "로그인" 또는 "로그인실패" 를 출력하세요.  
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("회원가입 ID를 입력하세요.");
		int 회원가입ID = scan.nextInt();
		System.out.println("회원가입 PW를 입력하세요.");
		int 회원가입PW = scan.nextInt();
		System.out.println("로그인 ID를 입력하세요.");
		int 로그인ID = scan.nextInt();
		System.out.println("로그인 PW를 입력하세요.");
		int 로그인PW = scan.nextInt();
		
		if(회원가입ID == 로그인ID && 회원가입PW == 로그인PW) {System.out.println("로그인");}
		if(회원가입ID != 로그인ID || 회원가입PW != 로그인PW) {System.out.println("로그인 실패");}
				
		scan.close();
		
	}
}
