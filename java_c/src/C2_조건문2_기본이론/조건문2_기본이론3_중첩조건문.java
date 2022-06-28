package C2_조건문2_기본이론;

import java.util.Scanner;

public class 조건문2_기본이론3_중첩조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
			[중첩 조건문]
				로그인을 중첩if 로 다시 표현하기. 
				먼저 id 를 입력받고 , id 가 일치하면 그때 pw 를 입력받기.
		
		  1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
		  2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
		  3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
		  4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
		  
		  아래변수들은 스네이크표현법이다.	 
		*/	
			Scanner scan = new Scanner(System.in);

			int join_id = 1234;
			int join_pw = 1111; // 회원가입한 변수

			System.out.print("ID 입력 : "); // 안내 로그인 아이디
			int log_id = scan.nextInt(); // 입력 로그인 아이디
			
			// 패스워드는 아이디가 일치하면 입력받는다.
            // 1. 아이디 비교시 같다면, 
			if (join_id == log_id) { 
				System.out.print("Pw 입력 : "); // 안내 로그인 패스워드
				int log_pw = scan.nextInt();  // 입력 로그인 패스워드    //log_pw 는 언제 소멸하는가
                // 1-1 패스워드가 같다면
				if (join_pw == log_pw) {
					System.out.println("로그인 성공!");
				}
				// 1-2 패스워드가 틀리다면
				if (join_pw != log_pw) {
					System.out.println("Pw를 확인해주세요.");
				}
			} // log_pw 소멸
			// 2. 아이디 비교시 틀리다면
			if (join_id != log_id) {
				System.out.println("Id를 확인해주세요.");
			}
		scan.close();
	}
}
