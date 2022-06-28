package B4_입력_기본이론;

import java.util.Scanner;

public class 입력_기본이론1 {
		public static void main(String[] args) {
			
			/*
			  # 입력받기
			  1. import java.util.Scanner;  // main 위에 그리고 package 아래 적어준다.(필수)
			  	
			  2. Sanner scan = new Scanner(System.in); // main안에 적어야한다.(필수)
			                                           // 암기하기 or scann 입력 후 ctrl + space
			 
			  3. 안내문 작성
			     System.out.print("나이를 입력하세요 : "); 
			     
			  4. 입력받기
			     int age = scan.nextInt(); //콘솔창에 숫자를 누르고 엔터를 누를때까지 대기한다.
			     
			  5. 결과출력 
			  	  System.out.println("당신의 나이는 " + age + "세 이군요!");
			  
			  6. 닫기
			  	  scan.close();   // Scanner 같은경우는 닫아줘야한다. (이유는 추후에 나온다.)
			  					  // scan.close(); 를 생략한경우 노란색경고가 뜬다. 신경쓰이지않으면 생략해도된다.
			  					  // main의 마지막라인에 써주면된다.
			*/
		
		Scanner scan = new Scanner(System.in);
		// Scanner : 자료형 , scan : 변수형(바꿀 수 있음)
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt(); // 실행 후 밑에 숫자 입력 + enter
		
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); // 실행 후 밑에 숫자 입력 + enter
		
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
	
		scan.close(); 
		
	}
}