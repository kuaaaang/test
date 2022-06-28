package D3_반복문3_기본이론;

import java.util.Scanner;

public class 반복문3_프로젝트_반복문로그인_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 
		  2. 로그아웃 . 로그인 후 이용가능
		  3. 로그인,로그아웃 관리는 log 는 변수를 이용한다.
		   [예] -1(로그아웃), 1111(id1), 2222(id2)
		*/
		Scanner scan = new Scanner(System.in);
		
		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)
		
		while(true) {System.out.println("1.로그인");
		             System.out.println("2.로그아웃");
		             System.out.println("0.종료");
		             System.out.print("메뉴 선택 : ");
		             int n = scan.nextInt();
			
		             if(n==1) {if(log == -1) {System.out.println("로그인");
			                                  System.out.println("아이디를 입력하세요.");
			                                  int ID = scan.nextInt();
			                                  System.out.println("비밀번호를 입력하세요.");
			                                  int PW = scan.nextInt();
		                                       
			                                  if(ID == id1 && PW == pw1){log = id1;
			                                                             System.out.println(log + "님 로그인 성공!");
			                                                             } 
			                                  else if(ID == id2 && PW == pw2){log = id2;
			                                                                  System.out.println(log + "님 로그인 성공!");
			                                                                  }
			                                  else {System.out.println("아이디와 비밀번호를 확인하세요.");}
		                                      } 
			                   else {System.out.println("로그아웃 후 이용이 가능합니다.");}
			                   }
	                 else if(n==2) {if(log != -1) {log = -1;
	                                               System.out.println("로그아웃");
	                                               }
	                                else {System.out.println("로그인 후 이용 가능합니다.");}  
	                                }
	                 else if(n==0) {System.out.println("종료");
	                                break;
	                                }   
	                 else {System.out.println("오류! 다시 선택하세요.");}
		             }
		scan.close();
	}
}
