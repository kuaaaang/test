package C4_조건문4_알고리즘;

import java.util.Scanner;

public class 조건문4_알고리즘_ATM_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [문제] 
		  
		  [ATM]
		   
		    [변수설명]
		    cash ==> 가지고있는 현금을 표현한다.
		    balance ==> 예금을 표현한다.
		    joinId ==> 이미 가입한 아이디
		    joinPw ==> 이미 가입한 패스워드
		   
		    [특이사항] ==>  로그인 이후에 새로운 메뉴가 나오도록 한다.
		    
		    	[1.로그인] 
		   	    [1-1. 로그인성공] ==> 새로운매뉴등장 ==> [1.입금] [2.출금] 	
		               [1-1-1.입금] ==> 현금이 줄어들고 예금이 늘어난다.
		               [1-1-2.출금] ==> 예금이 줄어들고 현금이 늘어난다.
		   		[1-2. 로그인실패] ==> 종료
		   	[0.종료]
		   
		    [최종결과를 출력하시오]
		*/
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;    
		int balance = 30000; 
		int joinId = 11111; 
		int joinPw = 1234;  
	
		System.out.println("===MEGA ATM===");
		System.out.println("[1.로그인] [0.종료]");
		int select = scan.nextInt();
		if (select == 1) {System.out.println("로그인");
		                  System.out.println("ID를 입력하세요.");
		                  int ID = scan.nextInt();
		                  System.out.println("PW를 입력하세요.");
		                  int PW = scan.nextInt();
		                  
		                  if(joinId == ID && joinPw == PW) {
		                	         System.out.println("로그인성공");
		                	         System.out.println("[1.입금] [2.출금]");
		                	         int n = scan.nextInt();
		                	                   if(n == 1) {System.out.println("입금");
		                	                               System.out.println("입금할 금액을 입력해주세요.");
		                	                               int n1 = scan.nextInt();
		                	                               int 현금1 = cash - n1;
		                	                               int 예금1 = balance + n1;
		                	                               if(현금1 >= 0) {System.out.println("현금 : " + 현금1 + "원 , " + "예금 : " + 예금1 + "원");}
		                	                               else{System.out.println("입금 금액이 모자랍니다.");} 
		                 	                               }  
		                	                   else if(n == 2) {System.out.println("출금");
		                                                        System.out.println("출금할 금액을 입력해주세요.");
		                                                        int n2 = scan.nextInt();
		                                                        int 현금2 = cash + n2;
				                	                            int 예금2 = balance - n2;
				                	                            if(예금2 >= 0) {System.out.println("현금 : " + 현금2 + "원 , " + "예금 : " + 예금2 + "원");}
				                	                            else {System.out.println("출금 가능한 금액이 아닙니다.");}
		                                                        }
		                	                   else {System.out.println("오류");
		                	                         System.out.println("종료합니다.");}
		                  }
		                  else {System.out.println("로그인실패");
		                        System.out.println("종료합니다.");}
		                  }
		else if (select == 0) {System.out.println("종료");}
		else {System.out.println("오류");
              System.out.println("종료합니다.");}
			
		scan.close();
	}
}
