package E2_배열2_기본이론;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_프로젝트_컨트롤러ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  [ATM] 
		  	-전체 기능구현
		  1. 회원가입
		  . id와 pw를 입력받아 가입
		  . 가입 시 돈 1000원 부여
		  . id 중복체크
		  2. 회원탈퇴
		  . 로그인시에만 이용가능
		  3. 로그인
		  . id와 pw를 입력받아 로그인
		  . 로그아웃 상태에서만 이용가능
		  4. 로그아웃
		  . 로그인시에만 이용가능
		  5. 입금
		  . 로그인시에만 이용가능
		  6. 이체
		  . 로그인시에만 이용가능
		  7. 잔액조회
		  . 로그인시에만 이용가능
		*/
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] idList = new int[MAX];
		int[] pwList = new int[MAX];
		int[] moneyList = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		//1.회원가입 2.회원탈퇴 3.로그인 4.로그아웃
		//5.입금 6.송금 7.조회 8.전체회원목록 0.종료.
		while(true) {	
			if(log == -1) {
				System.out.println("로그인하세요.");
			}else {
				System.out.println("[" + log + "]");
			}
			System.out.println("1.회원가입 2.회원탈퇴 3.로그인 4.로그아웃");
			System.out.println("5.입금 6.송금 7.조회 8.전체회원목록 0.종료");
			int sel = scan.nextInt();		
			if(sel == 1) {
				if(count == MAX) {
					System.out.println("가입불가");
					continue;
				}
				System.out.println("[회원가입] 아이디 입력 : ");
				int id = scan.nextInt();
				boolean check = false;
				for(int i = 0; i<count; i+=1) {
					if(id == idList[i]) {
						check = true;
					}
				}
				if(check == true) {
					System.out.println("중복");
				}else {
					System.out.println("[회원가입] 비밀번호 입력 : ");
					int pw = scan.nextInt();
					idList [count] = id;
					pwList [count] = pw;
					moneyList [count] = 1000;
					System.out.println("회원가입이 완료되었습니다.");
					count = count + 1;	
				}
			}
			
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("로그인하세요.");
				}else{
					System.out.println("[회원탈퇴] 아이디 입력 : ");
					int id = scan.nextInt();
					System.out.println("[회원탈퇴] 비밀번호 입력 : ");
					int pw = scan.nextInt();
					
					int index = -1;
					for(int i = 0; i <count; i+=1) {
						if(id == idList[i] && pw == pwList[i]) {
							index = i;
							break;
						}
					}
					if(index == -1) {
						System.out.println("아이디와 비밀번호를 확인하세요.");
					}else {
						for(int i = index; i < count-1; i+=1) {
							idList[i] = idList[i+1];
							pwList[i] = pwList[i+1];
							moneyList [i] = moneyList [i+1];
						}
						idList[count] = 0;
						pwList[count] = 0;
						moneyList[count] = 0;
						count -=1;
						log = -1;
						System.out.println("[회원탈퇴]가 완료되었습니다.");
					}
				}
			}
			
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("[로그인] 아이디 입력 : ");
					int id = scan.nextInt();
					System.out.println("[로그인] 비밀번호 입력 : ");
					int pw = scan.nextInt();
					for(int i = 0; i<count; i+=1) {
						if(id == idList[i] && pw == pwList[i]) {
							log = id;
							break;
						}
					}
				}
				if(log == -1) {
					System.out.println("로그인 실패! 아이디랑 비밀번호를 확인하세요.");
				}else {
					System.out.println(log + "님 로그인 되었습니다.");}
			}
			
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}else {
					log = -1;
					System.out.println("로그아웃 완료");
				}
			}
			
			else if(sel == 5) {
				if(log != -1) {
					int index = 0;
					for(int i = index; i<count; i+=1) {
						if(idList[i] == log) {
							index = i;
							break;
						}
					}
					System.out.println("입금할 금액을 입력해주세요.");
					int money = scan.nextInt();
					moneyList[index] += money;
					System.out.println("입금완료.");
				}else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}	
			
			else if(sel == 6) {
				if(log != -1){
					int index = 0;
					for(int i = index; i<count; i+=1) {
						if(idList[i] == log) {
							index = i;
							break;
						}
					}
					
					System.out.println("송금할 계좌를 입력하세요.");
				    int sendId = scan.nextInt();
				    int sendIndex = -1;
				    for(int i = 0; i<count; i+=1) {
					    if(idList[i] == sendId) {
						   sendIndex = i;
						   break;
				       	}
				    }
				    if(sendIndex == -1) {
				    	System.out.println("계좌번호를 다시 확인해주세요.");
				    }else {
				    	System.out.println("송금할 금액을 입력해주세요.");
				    	int money = scan.nextInt();
				    	moneyList[index] -= money;
				    	moneyList[sendIndex] += money;
				    	System.out.println("송금완료");
				    }
					
			    }else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}	
			
			else if(sel == 7) {
				if(log != -1) {
					int index = 0;
					for(int i = 0; i<count; i+=1) {
						if(idList[i] == log) {
							index = i;
							break;
						}
					}
					System.out.println(log + "님 잔액 : " + moneyList[index] + "원");
				}else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}
			
			else if(sel == 8) {
				System.out.println(Arrays.toString(idList));
				System.out.println(Arrays.toString(pwList));
				System.out.println(Arrays.toString(moneyList));
			}
			
			else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
