package D6_반복문6_기본이론;

import java.util.Scanner;

public class 반복문6_알고리즘_ATM종합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 [ATM]
		   [뒤로가기] 를 활용해 단계별로 기능을 구현한다. 
		   [회원가입] 은 추후 배열에서 가능하다.
		 
		  메인화면기능         ==> [1.로그인 0.종료 ]
		  1번 로그인 선택시     ==> [1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]  
		  2번 종료 선택시       ==> [종료] 
		  -------------------------------------------------
		  [추가조건] 
		  [1] 5.정보수정 선택시 ==> 비밀번호를 바꿀수있다.
		  [2] 0.로그아웃 선택시 ==> 뒤로 돌아가서 [1.로그인 0.종료] 화면이 다시나온다.         
		  [3] 로그인 3번실패시 강제 종료한다. 
		*/
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1; // -1(로그아웃), 1111(dbAcc1로그인), 2222(dbAcc2로그인)
		int r = 1;
		
		while(r == 1) {System.out.println("[1.로그인 0.종료 ]");
		               int n1 = scan.nextInt();
		               if(n1==1) {if(log == -1) {int count = 0;
		            	                        while(true) {System.out.println("아이디를 입력하세요.");
                                                             int id = scan.nextInt();
                                                             System.out.println("비밀번호를 입력하세요.");
                                                             int pw = scan.nextInt();
                                                             if(id==dbAcc1 && pw==dbPw1) {log=id;
                                                        	                              System.out.println("로그인 성공!");
                                                        	                              break;
                                                                                          }
                                                             else if(id==dbAcc2 && pw==dbPw2) {log=id;
                                                                                               System.out.println("로그인 성공!");
                                                                                               break;
                                                                                               }
                                                             else {count = count + 1;
                                                                   System.out.println("로그인 실패");
                                                                   System.out.println(count + "번 실패, 3번 실패시 종료됩니다.");}
                                                             if(count == 3) {System.out.println("3번 실패! 종료합니다!");
                                                                             r = 0;
                                                                             break;
                                                                             }
                                                             }
                                                }
		                         if(log != -1) {while(true) {System.out.println("[1.입금 2.출금 3.이체 4.조회 5.정보수정 0.로그아웃]");
		                                                     int n2 = scan.nextInt();
		                                                     if(n2 == 1) {System.out.println("입금");
		                                                                  System.out.println("입금할 금액을 입력해주세요.");
		                                                                  int pmoney = scan.nextInt();
		                                                                  if(log==dbAcc1) {dbMoney1 += pmoney;}
		                                                                  else if(log==dbAcc2) {dbMoney2 += pmoney;}
		                                                                  System.out.println("입금완료");
		                                                                  }
		                                                     else if(n2 == 2) {System.out.println("출금");
		                                                                       System.out.println("출금할 금액을 입력해주세요.");
		                                                                       int mmoney = scan.nextInt();
		                                                                       if(log==dbAcc1) {if(dbMoney1 < mmoney || mmoney<0) {System.out.println("출금 가능한 금액이 아닙니다.");}
		                                                                                        else if(dbMoney1 >= mmoney && mmoney>=0){dbMoney1 -= mmoney;
		                                                                                        	                                     System.out.println("출금완료");}
		                                                                                                                                 }
                                                                               else if(log==dbAcc2) {dbMoney2 -= mmoney;
                                                                                                     if(dbMoney2 < mmoney || mmoney<0) {System.out.println("출금 가능한 금액이 아닙니다.");}
                                                                                                     else if(dbMoney2 >= mmoney && mmoney>=0){dbMoney2 -= mmoney;
                                                            	                                                                              System.out.println("출금완료");}
                                                                                                                                              }
		                                                                       }
		                                                     else if(n2 == 3) {System.out.println("이체");
		                                                                       System.out.println("이체할 계좌번호를 입력해주세요.");
		                                                                       int 계좌 = scan.nextInt();
		                                           							   System.out.println("이체할 금액입력 : ");
		                                           							   int money = scan.nextInt();
		                                           							   if(계좌 == dbAcc1 && log == dbAcc2 ) {dbMoney2 -= money;
		                                        							                                        dbMoney1 += money;}
		                                           							   else if(계좌 == dbAcc2 && log == dbAcc1) {dbMoney1 -= money;
		                                        								                                        dbMoney2 += money;}
		                                        							System.out.println("이체완료.");
		                                        			
		                                                     
		                                                                       }
		                                                     else if(n2 == 4) {System.out.println("조회");
		                                                                       if(log==dbAcc1) {System.out.println("잔액 : " + dbMoney1);}
                                                                               else if(log==dbAcc2) {System.out.println("잔액 : " + dbMoney2);}
		                                                                       }
		                                                     else if(n2 == 5) {System.out.println("정보수정");
		                                                                       System.out.println("변경할 비밀번호를 입력해주세요.");
		                                                                       int newpw = scan.nextInt();
		                                                                       if(log==dbAcc1) {dbPw1 = newpw;}
                                                                               else if(log==dbAcc2) {dbPw2 = newpw;}
		                                                                       }
		                                                     else if(n2 == 0) {System.out.println("로그아웃되었습니다.");
		                                                                       log = -1;
		                                                                       break;
		                                                                       }
		                                                     else {System.out.println("오류! 번호를 다시 선택하세요.");}
		                                                     }
		                    	                }
		                       }
		             else if(n1==0) {System.out.println("종료!");
		            	             r = 0;
		                             }
		             else {System.out.println("오류! 다시 선택하세요.");}   
		             }
		scan.close();
	}
}
