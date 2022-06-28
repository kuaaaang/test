package E6_배열6_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열6_프로젝트_영화예매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  [영화관좌석예매]
		  (1)회원가입 (2)로그인  (0) 종료
		  
		  [회원가입] ==> id 만 가입 ==> 중복처리 
		  [로그인후] ==> (1) 로그아웃 (2) 예매 (3) 예매확인(본인것만 좌석번호출력 ) 
		               (4) 예매취소(본인것만) (5) 전체확인 (0) 뒤로가기 
		 
		  1) 회원가입은 10명까지 가능하다.
		  2) idList 에는 회원들의 id를 저장 
		  3) 로그인이후 좌석을 구매하면 seatList 는 구매한사람의 id 를저장 
		  4) 필요한변수는 추가할수있다.
		*/
		Scanner scan = new Scanner(System.in);
		
		    final int MAX = 10;
			final int ROW = 3;
			final int COL = 4;
			int idList[] = new int[MAX];
			int pwList[] = new int[MAX];
			int seatList[][]= new int[ROW][COL]; 
			int temp[][] = new int[ROW][COL];
			
			int count = 0;
			int log = -1;
			while(true) {
				System.out.println("(1)회원가입 (2)로그인  (0) 종료");
				int n = scan.nextInt();
				if(n == 1) {// 회원가입
					if(count == 10) {System.out.println("공간이 없습니다.");}
					else {
						System.out.println("회원가입 아이디를 입력하세요.");
						int id = scan.nextInt();
						System.out.println("회원가입 비밀번호를 입력하세요.");
						int pw = scan.nextInt();
						
						boolean check = false;
						for(int i = 0; i<count; i+=1) {
							if(id == idList[i] || pw == pwList[i]) {
								check = true;
								break;
							}
						}
						if (check == true) {System.out.println("중복! 다시 입력해주세요.");}
						else {
							idList[count] = id;
							pwList[count] = pw;
							count += 1;
							System.out.println("회원가입이 완료되었습니다.");
						}
					}
				}
				
				else if(n == 2) {
					if(log == -1){ // 로그인
						System.out.println("아이디를 입력하세요.");
						int logid = scan.nextInt();
						System.out.println("비밀번호를 입력하세요.");
						int logpw = scan.nextInt();
						for(int i = 0; i<MAX; i+=1) {
							if(logid == idList[i] && logpw == pwList[i]) {
								System.out.println(idList[i] + "님 로그인 성공!");
								log = idList[i];
							}
								
							if(log != -1) {
								System.out.println("(1) 로그아웃 (2) 예매    (3) 예매확인");
								System.out.println("(4) 예매취소 (5) 전체확인 (0) 뒤로가기");
								int s = scan.nextInt();
								
								if(s == 1) {
									System.out.println("로그아웃 되었습니다.");
									log = -1;
									break;
								}
								else if(s == 2) {
									System.out.println("   0  1  2  3");
									for(int j = 0; j<seatList.length; j+=1) {
										System.out.println(j + " " + Arrays.toString(seatList[j]));
									}
									System.out.println("예매할 좌석을 선택해주세요.");
									System.out.print("행[0~3] : ");
									int seatg = scan.nextInt();
									System.out.print("열[0~2] : ");
									int seats = scan.nextInt();
								
									if(seatList[seats][seatg] == 0) {
										System.out.println("예매 완료");
										seatList[seats][seatg] = 1;
										temp[seats][seatg] = log;
									}
									else {System.out.println("이미 선택된 좌석입니다.");}
								}
								else if(s == 3) {
									for(int j = 0; j<seatList.length; j+=1) {
										for(int k = 0; k<seatList.length; k+=1) {
											if(temp[j][k] == log) {
												System.out.println(k + "행 " + j + "열 좌석이 예매되어있습니다.");
											}else {continue;}
										}
									}
								}
								else if(s == 4) {
									for(int j = 0; j<seatList.length; j+=1) {
										for(int k = 0; k<seatList.length; k+=1) {
											if(temp[j][k] == log) {
												System.out.println(k + "행 " + j + "열 좌석이 예매취소 되었습니다.");
												temp[j][k] = 0;
												seatList[j][k] = 0;
											}
										}
									}
									
								}
								else if(s == 5) {
									System.out.println("좌석 전체 확인");
									for(int j = 0; j<seatList.length; j+=1) {
										System.out.println(Arrays.toString(seatList[j]));
									}
								}
								else if(s == 0) {
									break;
								}
								else {System.out.println("오류! 다시 입력하세요.");}
							}	
							else {
								System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
							}
						}
					}
					else if(log != -1) {
						System.out.println("로그아웃 후 이용해주세요.");
					}
				}
				
				else if(n == 0) {
					System.out.println("종료");
					break;}
				
				else {System.out.println("오류! 다시 입력하세요.");}
			}
			
			scan.close();
	}
}
